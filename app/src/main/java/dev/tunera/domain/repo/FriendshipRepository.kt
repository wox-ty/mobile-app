package dev.tunera.domain.repo

import dev.tunera.data.models.Friendship
import dev.tunera.data.models.FriendshipStatus

interface FriendshipRepository {
    fun save(friendship: Friendship): Friendship
    fun find(userIdA: String, userIdB: String): Friendship?
    fun listForUser(userId: String): List<Friendship>

    fun updateStatus(
        userIdA: String,
        userIdB: String,
        status: FriendshipStatus
    ): Friendship?
}
