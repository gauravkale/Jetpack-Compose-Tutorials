package com.gaurav.jetpack_compose_tutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.gaurav.jetpack_compose_tutorials.ui.theme.JetpackComposeTutorialsTheme

class MainActivity : AppCompatActivity() {
    @OptIn(ExperimentalMaterialApi::class, ExperimentalAnimationApi::class,
        ExperimentalComposeUiApi::class, ExperimentalFoundationApi::class
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            JetpackComposeTutorialsTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}
