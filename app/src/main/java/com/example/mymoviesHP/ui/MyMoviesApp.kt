package com.example.mymoviesHP

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mymoviesHP.ui.theme.MyMoviesHPTheme

@Composable
 fun MyMoviesApp(content: @Composable () -> Unit) {
    MyMoviesHPTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ){
            content(
            )
        }
    }
}