package dev.tunera.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.tunera.domain.UseCases

@Composable
fun FeedScreen(nav: NavController, useCases: UseCases) {
    val feed = useCases.loadFeed()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Сейчас слушают", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(12.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(feed) { item ->
                Card(
                    modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.background,
                    )
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(
                            item.name,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.surface
                        )
                        val track = item.nowPlaying ?: item.lastPlayed
                        val status =
                            if (item.nowPlaying != null) "сейчас слушает" else "слушал недавно"
                        Text("$status: ${track?.title} — ${track?.artist}")
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Button(onClick = { nav.navigate("track") }) {
                                Text("Открыть")
                            }
                            OutlinedButton(onClick = { nav.navigate("share") }) {
                                Text("Поделиться")
                            }
                        }
                    }
                }
            }
        }
    }
}

