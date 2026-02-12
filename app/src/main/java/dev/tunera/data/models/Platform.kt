package dev.tunera.data.models

abstract class Platform(
    val id: String,
    val displayName: String,
    val priority: Int
) {
    protected fun requireExternalId(externalId: String): String {
        val trimmed = externalId.trim()
        require(trimmed.isNotEmpty()) { "externalId is empty" }
        return trimmed
    }

    abstract fun buildTrackUrl(externalId: String): String
}
