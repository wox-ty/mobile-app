package dev.tunera.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.tunera.domain.UseCases

@Composable
fun ProfileScreen(nav: NavController, useCases: UseCases) {
    val onlyFriends = remember { mutableStateOf(true) }
    val onlyRecent = remember { mutableStateOf(false) }
    val hidden = remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Профиль и приватность", style = MaterialTheme.typography.headlineSmall)
        PrivacyRow("Только для друзей", onlyFriends.value) { onlyFriends.value = it }
        PrivacyRow("Показывать только недавно", onlyRecent.value) { onlyRecent.value = it }
        PrivacyRow("Полностью скрыть статус", hidden.value) { hidden.value = it }
    }
}

@Composable
private fun PrivacyRow(label: String, value: Boolean, onChange: (Boolean) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label)
        Switch(checked = value, onCheckedChange = onChange)
    }
}

