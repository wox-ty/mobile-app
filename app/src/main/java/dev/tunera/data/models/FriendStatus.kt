package dev.tunera.data.models

data class FriendStatus(
    val name: String,
    val nowPlaying: UnifiedTrack?,
    val lastPlayed: UnifiedTrack?
)

