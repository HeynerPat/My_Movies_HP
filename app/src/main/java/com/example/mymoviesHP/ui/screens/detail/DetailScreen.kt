package com.example.mymoviesHP.ui.screens.detail

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.mymoviesHP.model.getMedia
import com.example.mymoviesHP.ui.screens.common.Thumb

@Composable
//@Preview(showBackground = true, width = 400, height = 400)
fun DetailScreen(mediaId:Int){
    val mediaItem = remember { getMedia().first{ it.id == mediaId } }

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text=mediaItem.title)
            })
        }
    ){
        Thumb(mediaItem)
    }

    /*
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Detail Screen $mediaId",
            style = MaterialTheme.typography.h4
        )
    }*/
}