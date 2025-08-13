package com.example.musicappui.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.example.musicappui.R

@Composable
fun Browse(){
    val categories =  listOf("Hits", "Trending", "Old School", "Vocals", "Orchestra", "Rock and Roll")
    LazyVerticalGrid(GridCells.Fixed(2)){
        items(categories){ cat ->
            BrowserItems(cat = cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}