package dev.tunera.data.models

import java.time.LocalDateTime

data class NowPlaying(
    val userId: String,
    val trackId: String,
    val updatedAt: LocalDateTime
)
