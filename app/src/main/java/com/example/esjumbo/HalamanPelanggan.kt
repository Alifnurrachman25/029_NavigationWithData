package com.example.esjumbo

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HalamanPelanggan() {
    var nama by rememberSaveable {
        mutableStateOf("")
    }
    Column {
        OutlinedTextField(
            value = nama,
            onValueChange = {},
            label = { Text(text = "Nama")}
        )
    }
}