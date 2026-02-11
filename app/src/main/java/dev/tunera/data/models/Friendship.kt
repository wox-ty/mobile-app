package dev.tunera.data.models

import java.time.LocalDateTime

data class Friendship (
    val userIdA: String,
    val userIdB: String,
    val status: FriendshipStatus,
    val createdAt: LocalDateTime
) {
    init {
        require(userIdA != userIdB) {"UserIds must be different"}
    }
}