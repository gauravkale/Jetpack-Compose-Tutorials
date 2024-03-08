package com.gaurav.jetpack_compose_tutorials.chapter2_material_widget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaurav.jetpack_compose_tutorials.model.Snack
import com.gaurav.jetpack_compose_tutorials.model.snacks
import com.gaurav.jetpack_compose_tutorials.ui.components.SnackCard

@Preview(showBackground = true)
@Composable fun Tutorial2_5Screen1(){
    TutorialContent()
}

@Composable
private fun TutorialContent() {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = {
            items(snacks){item: Snack ->
                SnackCard(snack = item)
            }
        }
    )
}
