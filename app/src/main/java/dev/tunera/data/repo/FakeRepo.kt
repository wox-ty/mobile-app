package dev.tunera.data.repo

import dev.tunera.data.models.FriendStatus
import dev.tunera.data.models.ServiceAvailability
import dev.tunera.data.models.UnifiedTrack
import dev.tunera.data.models.platforms.Spotify
import java.time.LocalDateTime

class FakeRepo {
    private val sampleTrack = UnifiedTrack(
        id = "track_1",
        title = "Night Drive",
        artist = "Neon Coast",
        coverUrl = "",
        album = "kkk",
        playlist = "MMM",
        sources = listOf(Spotify("1", "spoty", 1)),
        addedAt = LocalDateTime.now(),
        updatedAt = LocalDateTime.now()
    )

    fun getFeed(): List<FriendStatus> {
        return listOf(
            FriendStatus("Аня", nowPlaying = sampleTrack, lastPlayed = null),
            FriendStatus("Игорь", nowPlaying = null, lastPlayed = sampleTrack),
            FriendStatus("Лена", nowPlaying = null, lastPlayed = sampleTrack)
        )
    }

    fun getTrack(): UnifiedTrack = sampleTrack

    fun getAvailability(): List<ServiceAvailability> {
        return listOf(
            ServiceAvailability("Spotify", available = true),
            ServiceAvailability("Apple Music", available = true),
            ServiceAvailability("Yandex Music", available = false)
        )
    }
}

