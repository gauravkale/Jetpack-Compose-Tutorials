package com.gaurav.jetpack_compose_tutorials

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.platform.LocalInspectionMode

@Stable
val isInPreview @Composable get() = LocalInspectionMode.current