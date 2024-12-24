package com.example.disneyclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.disneyclone.ui.theme.DisneySecondary

@Composable
fun BrandLogo(resourceId: Int) {
    Box(
        modifier = Modifier
            .size(width = 65.dp, height = 45.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(DisneySecondary),
        contentAlignment = Alignment.Center

    ) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "Brand Logo",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Fit
        )
    }
}