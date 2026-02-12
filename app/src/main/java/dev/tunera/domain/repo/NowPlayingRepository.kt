package dev.tunera.domain.repo

import dev.tunera.data.models.NowPlaying

interface NowPlayingRepository {
    fun get(userId: String): NowPlaying?
    fun save(nowPlaying: NowPlaying)
    fun clear(userId: String)
}
