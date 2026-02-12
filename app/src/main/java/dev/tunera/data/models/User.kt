package dev.tunera.data.models

data class User(
    val id: String,
    val name: String,
    val avatarPictureUrl: String? = null,
    val visibility: UserVisibility = UserVisibility.FRIENDS
)