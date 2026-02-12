package dev.tunera.data.models

import java.time.LocalDateTime

data class UnifiedTrack(
    val id: String,
    val title: String,
    val artist: String,
    val album: String,
    val playlist: String,
    val sources: List<Platform>,
    val coverUrl: String,
    val addedAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
