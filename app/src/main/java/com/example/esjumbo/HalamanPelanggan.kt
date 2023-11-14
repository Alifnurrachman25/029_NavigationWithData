package com.example.esjumbo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanPelanggan(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit,
) {
    var nama by rememberSaveable {
        mutableStateOf("")
    }

    var noHP by remember {
        mutableStateOf("")
    }

    var alamat by remember {
        mutableStateOf("")
    }

    var listData: MutableList<String> = mutableListOf(nama, noHP, alamat)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = stringResource(id = R.string.datapelanggan))
        Spacer(modifier = Modifier.padding(vertical = dimensionResource(id = R.dimen.padding_large)))
        OutlinedTextField(
            value = nama,
            onValueChange = {nama = it},
            label = { Text(text = stringResource(id = R.string.nama))}
        )
        Spacer(modifier = Modifier.padding(vertical = dimensionResource(id = R.dimen.padding_small)))
        OutlinedTextField(
            value = noHP,
            onValueChange = {noHP = it},
            label = { Text(text = stringResource(id = R.string.no_hp))}
        )
        Spacer(modifier = Modifier.padding(vertical = dimensionResource(id = R.dimen.padding_small)))
        OutlinedTextField(
            value = alamat,
            onValueChange = {alamat = it},
            label = { Text(text = stringResource(id = R.string.alamat))}
        )
        Spacer(modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)))
        Row {

            Button(onClick = onBackButtonClicked) {
                Text(text = stringResource(id = R.string.cancel))
            }
            Spacer(modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.padding_large)))
            Button(onClick = {onSubmitButtonClicked(listData)}) {
                Text(text = stringResource(id = R.string.selanjutnya))
            }
        }
    }
}