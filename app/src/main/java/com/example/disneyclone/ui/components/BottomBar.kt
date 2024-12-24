package com.example.disneyclone.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.disneyclone.R
import com.example.disneyclone.ui.theme.DisneyBackground
import com.example.disneyclone.ui.theme.DisneyGray
import com.example.disneyclone.ui.theme.DisneyWhite

@Composable
fun BottomBar() {
    NavigationBar(
        containerColor = DisneyBackground,
        modifier = Modifier.height(65.dp)
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(R.drawable.homeicon),
                    contentDescription = "Home",
                    modifier = Modifier.size(28.dp)
                )
            },
            selected = true,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = DisneyWhite,
                selectedTextColor = DisneyWhite,
                unselectedIconColor = DisneyGray,
                unselectedTextColor = DisneyGray,
                indicatorColor = DisneyBackground
            )
        )
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.searchicon),
                    contentDescription = "Search",
                    modifier = Modifier.size(28.dp)
                )
            },
            selected = false,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = DisneyWhite,
                selectedTextColor = DisneyWhite,
                unselectedIconColor = DisneyGray,
                unselectedTextColor = DisneyGray,
                indicatorColor = DisneyBackground
            )
        )
        NavigationBarItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.downloadicon),
                    contentDescription = "Downloads",
                    modifier = Modifier.size(28.dp)
                )
            },
            selected = false,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = DisneyWhite,
                selectedTextColor = DisneyWhite,
                unselectedIconColor = DisneyGray,
                unselectedTextColor = DisneyGray,
                indicatorColor = DisneyBackground
            )
        )
        NavigationBarItem(
            icon = {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .border(
                            width = 2.dp,
                            color = DisneyWhite,
                            shape = RoundedCornerShape(100.dp)
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profileimage),
                        contentDescription = "Profile",
                        modifier = Modifier.fillMaxSize(),
                    )
                }
            },
            selected = false,
            onClick = { },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = DisneyBackground
            )
        )
    }
} 