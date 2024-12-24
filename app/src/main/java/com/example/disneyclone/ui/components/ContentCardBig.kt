package com.example.disneyclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.disneyclone.R
import com.example.disneyclone.ui.theme.DisneyBackground

@Composable
fun ContentCardBig(resourceId: Int) {
    Card(
        modifier = Modifier
            .width(240.dp)
            .height(360.dp),
        colors = CardDefaults.cardColors(containerColor = DisneyBackground)
    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "Content Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}