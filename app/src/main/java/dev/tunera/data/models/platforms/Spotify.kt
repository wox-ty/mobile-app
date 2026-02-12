package dev.tunera.data.models.platforms

import dev.tunera.data.models.Platform

class Spotify(id: String, displayName: String, priority: Int) :
    Platform(id = id, displayName = displayName, priority = priority) {

    override fun buildTrackUrl(externalId: String): String {
        val id = requireExternalId(externalId)
        require(SPOTIFY_ID_REGEX.matches(id)) { "externalId has invalid Spotify format" }
        return "https://open.spotify.com/track/$id"
    }

    private companion object {
        val SPOTIFY_ID_REGEX = Regex("^[A-Za-z0-9]{22}$")
    }
}
