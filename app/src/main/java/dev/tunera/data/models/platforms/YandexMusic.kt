package dev.tunera.data.models.platforms

import dev.tunera.data.models.Platform

class YandexMusic(id: String, displayName: String, priority: Int) :
    Platform(id = id, displayName = displayName, priority = priority) {

    override fun buildTrackUrl(externalId: String): String {
        val id = requireExternalId(externalId)
        require(YANDEX_ID_REGEX.matches(id)) { "externalId has invalid Yandex Music format" }
        return "https://music.yandex.com/track/$id"
    }

    private companion object {
        val YANDEX_ID_REGEX = Regex("^\\d+$")
    }
}