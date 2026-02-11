package dev.tunera.data.models.platforms

import dev.tunera.data.models.Platform

class Spotify : Platform {
    override val id = "spotify"
    override val displayName = "Spotify"
    override val priority = 10

    override fun buildTrackUrl(externalId: String) =
        "https://open.spotify.com/track/$externalId"
}
