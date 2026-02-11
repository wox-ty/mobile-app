package dev.tunera.data.models

data class Track(
    val id: String,
    val title: String,
    val artist: String,
    val coverUrl: String
)

data class FriendStatus(
    val name: String,
    val nowPlaying: Track?,
    val lastPlayed: Track?
)

data class ServiceAvailability(
    val serviceName: String,
    val available: Boolean
)

