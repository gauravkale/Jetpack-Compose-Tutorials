package com.gaurav.jetpack_compose_tutorials

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(){
    Scaffold {paddingValues: PaddingValues ->
        TutorialNavGraph(modifier = Modifier.padding(paddingValues))
    }
}