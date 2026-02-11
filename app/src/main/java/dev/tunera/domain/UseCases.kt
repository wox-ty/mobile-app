package dev.tunera.domain

import dev.tunera.data.models.FriendStatus
import dev.tunera.data.models.ServiceAvailability
import dev.tunera.data.models.Track
import dev.tunera.data.repo.FakeRepo

class UseCases(private val repo: FakeRepo) {
    fun loadFeed(): List<FriendStatus> = repo.getFeed()

    fun loadTrack(): Track = repo.getTrack()

    fun loadAvailability(): List<ServiceAvailability> = repo.getAvailability()
}

