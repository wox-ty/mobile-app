package dev.tunera.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.tunera.domain.UseCases

@Composable
fun ShareScreen(nav: NavController, useCases: UseCases) {
    val track = useCases.loadTrack()
    val universalLink = "https://tunera.app/t/${track.id}"

    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Экран шаринга")
        Text("Ссылка: $universalLink")
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { }) { Text("Скопировать") }
            OutlinedButton(onClick = { }) { Text("Поделиться") }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("QR-код (плейсхолдер)")
    }
}

