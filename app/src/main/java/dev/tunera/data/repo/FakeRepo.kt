package dev.tunera.data.repo

import dev.tunera.data.models.FriendStatus
import dev.tunera.data.models.ServiceAvailability
import dev.tunera.data.models.Track

class FakeRepo {
    private val sampleTrack = Track(
        id = "track_1",
        title = "Night Drive",
        artist = "Neon Coast",
        coverUrl = ""
    )

    fun getFeed(): List<FriendStatus> {
        return listOf(
            FriendStatus("Аня", nowPlaying = sampleTrack, lastPlayed = null),
            FriendStatus("Игорь", nowPlaying = null, lastPlayed = sampleTrack),
            FriendStatus("Лена", nowPlaying = null, lastPlayed = sampleTrack)
        )
    }

    fun getTrack(): Track = sampleTrack

    fun getAvailability(): List<ServiceAvailability> {
        return listOf(
            ServiceAvailability("Spotify", available = true),
            ServiceAvailability("Apple Music", available = true),
            ServiceAvailability("Yandex Music", available = false)
        )
    }
}

