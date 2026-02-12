package dev.tunera.domain.repo

import dev.tunera.data.models.UnifiedTrack

interface UnifiedTracksRepository {
    fun save(track: UnifiedTrack): UnifiedTrack
    fun findByKey(key: String): UnifiedTrack?
    fun listAll(): List<UnifiedTrack>
    fun deleteByKey(key: String)
}