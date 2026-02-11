package dev.tunera.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.tunera.data.repo.FakeRepo
import dev.tunera.domain.UseCases
import dev.tunera.ui.screens.FeedScreen
import dev.tunera.ui.screens.ProfileScreen
import dev.tunera.ui.screens.ShareScreen
import dev.tunera.ui.screens.TrackScreen

@Composable
fun MainNav() {
    val navController = rememberNavController()
    val useCases = remember { UseCases(FakeRepo()) }

    NavHost(navController = navController, startDestination = "feed") {
        composable("feed") { FeedScreen(navController, useCases) }
        composable("track") { TrackScreen(navController, useCases) }
        composable("share") { ShareScreen(navController, useCases) }
        composable("profile") { ProfileScreen(navController, useCases) }
    }
}

