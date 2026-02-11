package dev.tunera.data.models.platforms

import dev.tunera.data.models.Platform

class YandexMusic : Platform {
    override val id = "yandex"
    override val displayName = "Yandex Music"
    override val priority = 20

    override fun buildTrackUrl(externalId: String) =
        "https://music.yandex.ru/track/$externalId"
}