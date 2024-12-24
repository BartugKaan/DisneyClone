package com.example.disneyclone.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.disneyclone.R
import com.example.disneyclone.ui.components.BrandLogo
import com.example.disneyclone.ui.components.ContentSection
import com.example.disneyclone.ui.theme.DisneyBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = DisneyBackground,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.disneylogo),
                        contentDescription = "Disney+ Logo",
                        modifier = Modifier.height(45.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DisneyBackground
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = "Banner Image",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    getBrandLogos().forEach { logo ->
                        BrandLogo(logo)
                    }
                }
            }
            item {
                ContentSection("Önerilen")
            }
            item {
                ContentSection("Yeni")
            }
            item {
                ContentSection("Trendler")
            }
        }
    }
}

private fun getBrandLogos(): List<Int> {
    return List(5) { R.drawable.ic_launcher_foreground }
}