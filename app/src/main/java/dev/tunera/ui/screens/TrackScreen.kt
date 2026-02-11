package dev.tunera.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.tunera.domain.UseCases

@Composable
fun TrackScreen(nav: NavController, useCases: UseCases) {
    val track = useCases.loadTrack()
    val availability = useCases.loadAvailability()

    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Карточка трека", style = MaterialTheme.typography.headlineSmall)
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text(track.title, style = MaterialTheme.typography.titleLarge)
                Text(track.artist, style = MaterialTheme.typography.titleMedium)
            }
        }
        Text("Доступно в сервисах", style = MaterialTheme.typography.titleMedium)
        availability.forEach { service ->
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(service.serviceName)
                val action = if (service.available) "Открыть" else "Искать"
                OutlinedButton(onClick = { }) { Text(action) }
            }
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { }) { Text("Открыть у себя") }
            OutlinedButton(onClick = { nav.navigate("share") }) { Text("Поделиться") }
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(onClick = { }) { Text("Сохранить") }
    }
}

