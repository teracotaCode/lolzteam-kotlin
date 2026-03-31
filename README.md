# Lolzteam API Kotlin

[![CI](https://github.com/teracotaCode/lolzteam-kotlin/actions/workflows/ci.yml/badge.svg)](https://github.com/teracotaCode/lolzteam-kotlin/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Полная Kotlin-обёртка для API [Lolzteam](https://lolz.live) Forum и Market.

- **Кодогенерация** из OpenAPI 3.1 схем — полное покрытие эндпоинтов
- **Корутины** (suspend-функции) с движком Ktor CIO
- **Null-безопасность** — все поля ответов nullable с значениями по умолчанию
- **Типобезопасность** — `@Serializable` модели с маппингом `@SerialName`
- **Отказоустойчивость** — автоматические повторы с экспоненциальной отсрочкой, ограничение частоты запросов, поддержка прокси

## Установка

### Gradle (Kotlin DSL)
```kotlin
dependencies {
    // Клонируйте репозиторий и подключите как локальный проект
// git clone https://github.com/teracotaCode/lolzteam-kotlin.git
}
```

### Gradle (Groovy)
```groovy
dependencies {
    // git clone https://github.com/teracotaCode/lolzteam-kotlin.git
}
```

## Быстрый старт

### Forum API
```kotlin
import com.lolzteam.generated.forum.ForumClient

val forum = ForumClient(token = "your-token-here")

// Получить темы
val threads = forum.threads.list(forumId = 1, limit = 10)
println(threads)

// Получить профиль пользователя
val user = forum.users.get(userId = 1)
println(user)

// Создать пост
val post = forum.posts.create(postBody = "Привет!", threadId = 123)

// Не забудьте закрыть по завершении
forum.close()
```

### Market API
```kotlin
import com.lolzteam.generated.market.MarketClient

val market = MarketClient(token = "your-token-here")

// Поиск Steam-аккаунтов
val items = market.categorySearch.steam(pmin = 10, pmax = 100)
println("Найдено ${items.totalItems} товаров")

// Получить детали аккаунта
val item = market.accountsManaging.get(itemId = 123456)
println(item)

// Получить профиль
val profile = market.profile.get()

market.close()
```

### Использование блока `use` (автоматическое закрытие)
```kotlin
ForumClient(token = "your-token").use { forum ->
    val user = forum.users.get(userId = 1)
    println(user)
}
```

## Конфигурация

### Политика повторных запросов
```kotlin
import com.lolzteam.runtime.RetryConfig

val client = ForumClient(
    token = "your-token",
    retryConfig = RetryConfig(
        maxRetries = 5,
        initialDelayMs = 500,
        maxDelayMs = 30_000,
        backoffMultiplier = 2.0,
        retryableStatusCodes = setOf(429, 502, 503, 504)
    )
)
```

### Ограничение частоты запросов
```kotlin
import com.lolzteam.runtime.RateLimitConfig

val client = ForumClient(
    token = "your-token",
    rateLimitConfig = RateLimitConfig(
        maxTokens = 3,        // Максимальный всплеск
        refillRate = 3.0,     // Токенов в секунду
        refillIntervalMs = 1000
    )
)
```

### Поддержка прокси
```kotlin
import com.lolzteam.runtime.ProxyConfig

// HTTP-прокси
val client = ForumClient(
    token = "your-token",
    proxyConfig = ProxyConfig(
        type = ProxyConfig.ProxyType.HTTP,
        host = "proxy.example.com",
        port = 8080,
        username = "user",
        password = "pass"
    )
)

// Или из URL
val client2 = ForumClient(
    token = "your-token",
    proxyConfig = ProxyConfig.fromUrl("socks5://user:pass@proxy.example.com:1080")
)
```

## Обработка ошибок

Все ошибки наследуются от `LolzteamException` (sealed class):

```kotlin
import com.lolzteam.runtime.LolzteamException

try {
    val user = forum.users.get(userId = 999999)
} catch (e: LolzteamException.AuthError) {
    println("Ошибка авторизации: ${e.statusCode}")
} catch (e: LolzteamException.RateLimitError) {
    println("Превышен лимит, повтор через: ${e.retryAfterMs}мс")
} catch (e: LolzteamException.ServerError) {
    println("Ошибка сервера ${e.statusCode} после ${e.attempts} попыток")
} catch (e: LolzteamException.HttpError) {
    println("HTTP ${e.statusCode}: ${e.body}")
} catch (e: LolzteamException.NetworkError) {
    println("Ошибка сети: ${e.message}")
} catch (e: LolzteamException.TimeoutError) {
    println("Таймаут запроса")
} catch (e: LolzteamException.DeserializationError) {
    println("Ошибка парсинга: ${e.rawBody}")
}
```

## Покрытие API

### Forum API — сервисы
| Сервис | Описание |
|---|---|
| `authentication` | Управление OAuth-токенами |
| `categories` | Категории форума |
| `forums` | Список форумов и управление |
| `threads` | CRUD тем, опросы, подписки |
| `posts` | CRUD постов, лайки, жалобы |
| `postComments` | Комментарии к постам |
| `users` | Профили, аватары, подписчики |
| `profilePosts` | Посты в профиле |
| `profilePostComments` | Комментарии к постам профиля |
| `conversations` | Личные сообщения |
| `notifications` | Уведомления |
| `searching` | Поиск тем, постов, пользователей |
| `contentTagging` | Управление тегами |
| `chatbox` | Чат в реальном времени |
| `forms` | Управление формами |
| `navigation` | Элементы навигации |
| `pages` | Статические страницы |
| `linkForums` | Форумы-ссылки |
| `assets` | CSS-ассеты |
| `batchRequests` | Пакетные запросы |

### Market API — сервисы
| Сервис | Описание |
|---|---|
| `categorySearch` | Поиск по категориям (Steam, Fortnite и др.) |
| `categories` | Список категорий |
| `accountsList` | Аккаунты пользователя, заказы, избранное |
| `accountsManaging` | CRUD аккаунтов, бамп, инвентарь |
| `accountPublishing` | Публикация/продажа аккаунтов |
| `accountPurchasing` | Покупка аккаунтов, скидки |
| `cart` | Корзина |
| `customDiscounts` | Управление скидками |
| `profile` | Профиль пользователя |
| `payments` | Платежи, переводы, баланс |
| `invoices` | Управление счетами |
| `proxy` | Управление прокси |
| `iMAP` | Настройка IMAP-почты |
| `batchRequests` | Пакетные запросы |

## Генерация кода

Модели и клиенты генерируются из OpenAPI-схем:

```bash
# Генерация Forum API
python3 codegen/generate.py \
    --schema schemas/forum.json \
    --output-dir src/main/kotlin/com/lolzteam/generated/forum \
    --package com.lolzteam.generated.forum

# Генерация Market API
python3 codegen/generate.py \
    --schema schemas/market.json \
    --output-dir src/main/kotlin/com/lolzteam/generated/market \
    --package com.lolzteam.generated.market
```

## Сборка

```bash
./gradlew build
```

## Лицензия

MIT — подробности в [LICENSE](LICENSE).
