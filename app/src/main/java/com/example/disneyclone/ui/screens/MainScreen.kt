package com.example.disneyclone.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.disneyclone.Greeting
import com.example.disneyclone.ui.theme.DisneyCloneTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    Scaffold(
        topBar = { CenterAlignedTopAppBar(
            title = { Text("Disney Clone") }
        ) }
    ) {paddingValues ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(paddingValues)
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DisneyCloneTheme {
        MainScreen()
    }
}