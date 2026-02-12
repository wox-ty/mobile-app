package dev.tunera.domain.repo

import dev.tunera.data.models.User

interface UserRepository {
    fun save(user: User): User
    fun findById(id: String): User?
    fun listAll(): List<User>
}
