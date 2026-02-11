package dev.tunera.data.models

interface Platform {
    val id: String
    val displayName: String
    val priority: Int

    fun buildTrackUrl(externalId: String): String
}
