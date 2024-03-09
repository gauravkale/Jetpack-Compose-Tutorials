package com.gaurav.jetpack_compose_tutorials.chapter3_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gaurav.jetpack_compose_tutorials.ui.components.StyleableTutorialText
import com.gaurav.jetpack_compose_tutorials.ui.components.TutorialHeader

@Preview
@Composable
fun Tutorial3_1Screen2() {
    TutorialContent()
}

@Composable
private fun TutorialContent() {

    val textMeasurer = rememberTextMeasurer()

    Column(modifier = Modifier
        .fillMaxSize()
        .drawWithContent {
            drawContent()
            drawHeightMarks(textMeasurer)
        }
    ) {

        Box(modifier = Modifier.height(150.dp)) {
            Column {
                TutorialHeader(text = "onGloballyPositioned Modifier")

                StyleableTutorialText(
                    text = "**onGloballyPositioned** Modifier returns position of the Composable " +
                            "inside parent, root or window. Window adds **StatusBar** height to root.",
                    bullets = false
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Red)
        )
        Column(
            modifier = Modifier.fillMaxWidth()
                .border(width = 4.dp, color = Color.Green, shape = RoundedCornerShape(8.dp))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Yellow)
            )
            MyComposable()
        }
    }
}

@Preview
@Composable
private fun MyComposable() {

    var text by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .padding(horizontal = 20.dp)
        .fillMaxWidth()
        .height(300.dp)
        .verticalScroll(rememberScrollState())
        .border(2.dp, Color.Red)
        .onGloballyPositioned {
            val positionInParent: Offset = it.positionInParent()
            val positionInRoot: Offset = it.positionInRoot()
            val positionInWindow: Offset = it.positionInWindow()
            val boundsInParent: Rect = it.boundsInParent()
            val boundsInRoot: Rect = it.boundsInRoot()
            val boundsInWindow: Rect = it.boundsInWindow()
            val parentCoordinates = it.parentCoordinates
            val parentLayoutCoordinates = it.parentLayoutCoordinates

            text =
                "positionInParent: $positionInParent\n" +
                        "positionInRoot: $positionInRoot\n" +
                        "positionInWindow: $positionInWindow\n" +
                        "boundsInParent: $boundsInParent\n" +
                        "boundsInRoot: $boundsInRoot\n" +
                        "boundsInWindow: $boundsInWindow\n"

            parentCoordinates?.let { parent ->
                text +=
                    "parentCoordinates:\n" +
                            "positionInParent: ${parent.positionInParent()}\n" +
                            "positionInRoot: ${parent.positionInRoot()}\n" +
                            "positionInWindow: ${parent.positionInWindow()}\n\n"
            }

            parentLayoutCoordinates?.let { parent ->
                text +=
                    "parentLayoutCoordinates:\n" +
                            "positionInParent: ${parent.positionInParent()}\n" +
                            "positionInRoot: ${parent.positionInRoot()}\n" +
                            "positionInWindow: ${parent.positionInWindow()}\n"
            }
        }
    ) {
        Text(text = text)
    }
}

@Preview
@Composable
private fun ParentLayoutCoordinatesSample() {


    // This example shows the difference between parentCoordinates and parentLayoutCoordinates
    val positionModifier1 = Modifier.onGloballyPositioned { layoutCoordinates: LayoutCoordinates ->

        val parentCoordinates = layoutCoordinates.parentCoordinates
        val parentLayoutCoordinates = layoutCoordinates.parentLayoutCoordinates

        println(
            "😜 parentCoordinates\n" +
                    "positionInRoot ${parentCoordinates?.positionInRoot()}, " +
                    "positionInParent ${parentCoordinates?.positionInParent()}\n" +
                    "boundsInRoot ${parentCoordinates?.boundsInRoot()}, " +
                    "boundsInParent ${parentCoordinates?.boundsInParent()}\n" +
                    "parentLayoutCoordinates\n" +
                    "positionInRoot ${parentLayoutCoordinates?.positionInRoot()}, " +
                    "positionInParent ${parentLayoutCoordinates?.positionInParent()}\n" +
                    "boundsInRoot ${parentLayoutCoordinates?.boundsInRoot()}, " +
                    "boundsInParent ${parentLayoutCoordinates?.boundsInParent()}\n"
        )

        if (parentCoordinates != null && parentLayoutCoordinates != null) {
            println(
                "✅ parentCoordinates == parentLayoutCoordinates " +
                        "${parentCoordinates == parentLayoutCoordinates}"
            )
        }

        println(
            "🥹 ParentCoordinates ${parentCoordinates?.size}, " +
                    "parentLayoutCoordinates: " +
                    "${parentLayoutCoordinates?.size}\n"
        )
    }
    /*
        prints :
        I  😜 parentCoordinates
        I  positionInRoot Offset(0.0, 200.0), positionInParent Offset(0.0, 200.0)
        I  boundsInRoot Rect.fromLTRB(0.0, 200.0, 1080.0, 1200.0), boundsInParent Rect.fromLTRB(0.0, 200.0, 1080.0, 1200.0)

        I  parentLayoutCoordinates
        I  positionInRoot Offset(0.0, 200.0), positionInParent Offset(0.0, 200.0)
        I  boundsInRoot Rect.fromLTRB(0.0, 200.0, 1080.0, 1200.0), boundsInParent Rect.fromLTRB(0.0, 200.0, 1080.0, 1200.0)

        I  ✅ parentCoordinates == parentLayoutCoordinates true
        I  🥹 ParentCoordinates 1080 x 1000, parentLayoutCoordinates: 1080 x 1000

     */

    // 🔥parentCoordinates returns coordinates after layout modifiers if any available
    // 🔥parentLayoutCoordinates return parent layout coordinates

    /*
        prints:
        🔥🔥Parent coordinates here are the coordinates of Modifier.height(parentHeight)

        before positionModifier2

        I  😜😜 parentCoordinates
        I  positionInRoot Offset(0.0, 440.0), positionInParent Offset(0.0, 240.0)
        I  boundsInRoot Rect.fromLTRB(0.0, 440.0, 394.0, 834.0), boundsInParent Rect.fromLTRB(0.0, 240.0, 394.0, 634.0)

        I  parentLayoutCoordinates
        I  positionInRoot Offset(0.0, 200.0), positionInParent Offset(0.0, 200.0)
        I  boundsInRoot Rect.fromLTRB(0.0, 200.0, 1080.0, 1200.0), boundsInParent Rect.fromLTRB(0.0, 200.0, 1080.0, 1200.0)
        I  ❌ parentCoordinates == parentLayoutCoordinates false
        I  🥹🥹 ParentCoordinates 394 x 394, parentLayoutCoordinates: 1080 x 1000
     */

    val positionModifier2 = Modifier.onGloballyPositioned { layoutCoordinates: LayoutCoordinates ->
        val parentCoordinates = layoutCoordinates.parentCoordinates
        val parentLayoutCoordinates = layoutCoordinates.parentLayoutCoordinates

        println(
            "😜😜 parentCoordinates\n" +
                    "positionInRoot ${parentCoordinates?.positionInRoot()}, " +
                    "positionInParent ${parentCoordinates?.positionInParent()}\n" +
                    "boundsInRoot ${parentCoordinates?.boundsInRoot()}, " +
                    "boundsInParent ${parentCoordinates?.boundsInParent()}\n" +
                    "parentLayoutCoordinates\n" +
                    "positionInRoot ${parentLayoutCoordinates?.positionInRoot()}, " +
                    "positionInParent ${parentLayoutCoordinates?.positionInParent()}\n" +
                    "boundsInRoot ${parentLayoutCoordinates?.boundsInRoot()}, " +
                    "boundsInParent ${parentLayoutCoordinates?.boundsInParent()}\n"
        )

        if (parentCoordinates != null && parentLayoutCoordinates != null) {
            println(
                "❌ parentCoordinates == parentLayoutCoordinates " +
                        "${parentCoordinates == parentLayoutCoordinates}"
            )
        }

        println(
            "🥹🥹 ParentCoordinates ${parentCoordinates?.size}, " +
                    "parentLayoutCoordinates: " +
                    "${parentLayoutCoordinates?.size}"
        )
    }

    val density = LocalDensity.current
    val topSpace = with(density) { 200.toDp() }
    val parentHeight = with(density) { 1000.toDp() }
    val topSpace2 = with(density) { 240.toDp() }
    val contentHeight = with(density) { 394.toDp() }

    val textMeasurer = rememberTextMeasurer()

    Column(
        modifier = Modifier.drawWithContent {
            drawContent()
            drawHeightMarks(textMeasurer)
        }
    ) {
        Box(modifier = Modifier.fillMaxWidth().height(topSpace))

        // 200px below root top
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(parentHeight)
                .border(2.dp, Color.Red)
        ) {
            Box(modifier = Modifier.fillMaxWidth().height(topSpace2))
            // 440px below root top
            Box(
                modifier = Modifier
                    .then(positionModifier1)
                    .size(contentHeight)
                    .then(positionModifier2)
                    .background(Color.Green)
            )
        }
    }
}

@Preview
@Composable
private fun ParentLayoutCoordinatesSample2() {

    val positionModifier = Modifier.onGloballyPositioned { layoutCoordinates: LayoutCoordinates ->

        val parent =
            layoutCoordinates.parentLayoutCoordinates

        val parent2 =
            layoutCoordinates.parentCoordinates

        val parent3 =
            layoutCoordinates.parentCoordinates?.parentCoordinates

        val parent4 =
            layoutCoordinates.parentLayoutCoordinates?.parentLayoutCoordinates

        println(
            "🔥 ParentCoordinates: ${layoutCoordinates.parentCoordinates?.positionInRoot()}, " +
                    "parentLayoutCoordinates: " +
                    "${layoutCoordinates.parentLayoutCoordinates?.positionInRoot()}"
        )

        println(
            "🥹 ParentCoordinates: ${layoutCoordinates.parentCoordinates?.size}, " +
                    "parentLayoutCoordinates: " +
                    "${layoutCoordinates.parentLayoutCoordinates?.size}"
        )

        println(
            "🍇parent boundsInRoot: ${parent?.boundsInRoot()}, " +
                    "boundsInParent: ${parent?.boundsInParent()}\n" +
                    "positionInRoot: ${parent?.positionInRoot()}, " +
                    "positionInParent: ${parent?.positionInParent()}, " +
                    "size: ${parent?.size}\n"
        )

        println(
            "🍊parent2 boundsInRoot: ${parent2?.boundsInRoot()}, " +
                    "boundsInParent: ${parent2?.boundsInParent()}\n " +
                    "positionInRoot: ${parent2?.positionInRoot()}, " +
                    "positionInParent: ${parent2?.positionInParent()}, " +
                    "size: ${parent2?.size}\n"
        )

        println(
            "🍏parent3 boundsInRoot: ${parent3?.boundsInRoot()}, " +
                    "boundsInParent: ${parent3?.boundsInParent()}\n" +
                    "positionInRoot: ${parent3?.positionInRoot()}, " +
                    "positionInParent: ${parent3?.positionInParent()}, " +
                    "size: ${parent3?.size}\n"
        )

        println(
            "🌻parent4 boundsInRoot: ${parent4?.boundsInRoot()}, " +
                    "boundsInParent: ${parent4?.boundsInParent()}\n" +
                    "positionInRoot: ${parent4?.positionInRoot()}, " +
                    "positionInParent: ${parent4?.positionInParent()}, " +
                    "size: ${parent4?.size}\n"
        )
    }

    val density = LocalDensity.current
    val topSpace = with(density) { 200.toDp() }
    val parentHeight = with(density) { 1000.toDp() }
    val topSpace2 = with(density) { 240.toDp() }
    val contentHeight = with(density) { 394.toDp() }

    val textMeasurer = rememberTextMeasurer()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .drawWithContent {
                drawContent()
                drawHeightMarks(textMeasurer)
            }
    ) {

        Box(modifier = Modifier.fillMaxWidth().height(topSpace))

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Box(modifier = Modifier.fillMaxWidth().height(topSpace))

            // This is 400px below root top, 1000px height
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(parentHeight)
                    .padding(horizontal = 16.dp)
                    .border(2.dp, Color.Red)
            ) {

                Box(modifier = Modifier.fillMaxWidth().height(topSpace2))

                // This is 600px below root top, 394px height
                Box(
                    modifier = Modifier
                        .size(contentHeight)
                        .background(Color.Green)
                        .then(positionModifier)
                )

            }
        }
    }
}

@Preview
@Composable
private fun ParentLayoutCoordinatesSample3() {

    val positionModifier = Modifier.onGloballyPositioned { layoutCoordinates: LayoutCoordinates ->

        val parent =
            layoutCoordinates.parentLayoutCoordinates

        val parent2 =
            layoutCoordinates.parentCoordinates

        val parent3 =
            layoutCoordinates.parentCoordinates?.parentCoordinates

        val parent4 =
            layoutCoordinates.parentLayoutCoordinates?.parentLayoutCoordinates

        println(
            "🔥 ParentCoordinates: ${layoutCoordinates.parentCoordinates?.positionInRoot()}, " +
                    "parentLayoutCoordinates: " +
                    "${layoutCoordinates.parentLayoutCoordinates?.positionInRoot()}"
        )

        println(
            "🥹 ParentCoordinates: ${layoutCoordinates.parentCoordinates?.size}, " +
                    "parentLayoutCoordinates: " +
                    "${layoutCoordinates.parentLayoutCoordinates?.size}"
        )

        println(
            "🍇parent boundsInRoot: ${parent?.boundsInRoot()}, " +
                    "boundsInParent: ${parent?.boundsInParent()}\n" +
                    "positionInRoot: ${parent?.positionInRoot()}, " +
                    "positionInParent: ${parent?.positionInParent()}, " +
                    "size: ${parent?.size}\n"
        )

        println(
            "🍊parent2 boundsInRoot: ${parent2?.boundsInRoot()}, " +
                    "boundsInParent: ${parent2?.boundsInParent()}\n " +
                    "positionInRoot: ${parent2?.positionInRoot()}, " +
                    "positionInParent: ${parent2?.positionInParent()}, " +
                    "size: ${parent2?.size}\n"
        )

        println(
            "🍏parent3 boundsInRoot: ${parent3?.boundsInRoot()}, " +
                    "boundsInParent: ${parent3?.boundsInParent()}\n" +
                    "positionInRoot: ${parent3?.positionInRoot()}, " +
                    "positionInParent: ${parent3?.positionInParent()}, " +
                    "size: ${parent3?.size}\n"
        )

        println(
            "🌻parent4 boundsInRoot: ${parent4?.boundsInRoot()}, " +
                    "boundsInParent: ${parent4?.boundsInParent()}\n" +
                    "positionInRoot: ${parent4?.positionInRoot()}, " +
                    "positionInParent: ${parent4?.positionInParent()}, " +
                    "size: ${parent4?.size}\n"
        )
    }

    val density = LocalDensity.current
    val topSpace = with(density) { 200.toDp() }
    val parentHeight = with(density) { 1000.toDp() }
    val topSpace2 = with(density) { 240.toDp() }
    val contentHeight = with(density) { 394.toDp() }

    val textMeasurer = rememberTextMeasurer()

    Column(
        modifier = Modifier.drawWithContent {
            drawContent()
            drawHeightMarks(textMeasurer)
        }
    ) {

        Box(modifier = Modifier.fillMaxWidth().height(topSpace))

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Box(modifier = Modifier.fillMaxWidth().height(topSpace))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(parentHeight)
                    .padding(horizontal = 16.dp)
                    .border(2.dp, Color.Red)
                    .verticalScroll(rememberScrollState())
            ) {
                Box(modifier = Modifier.fillMaxWidth().height(topSpace2))

                repeat(60) { index ->
                    if (index == 15) {
                        Box(
                            modifier = Modifier
                                .size(contentHeight)
                                .background(Color.Green)
                                .then(positionModifier)
                        )

                    } else {
                        Text(
                            text = "Row $index",
                            fontSize = 24.sp,
                            modifier = Modifier.fillMaxWidth().padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

private fun DrawScope.drawHeightMarks(
    textMeasurer: TextMeasurer
) {
    val height = size.height.toInt()

    // This is for marking every 100px on screen
    for (i in 0..height step 100) {
        if (i != 0) {
            drawLine(
                color = Color.Blue,
                start = Offset(0f, i.toFloat()),
                end = Offset(20f, i.toFloat()),
                strokeWidth = 3.dp.toPx()
            )
            drawText(
                textMeasurer = textMeasurer,
                text = "$i",
                topLeft = Offset(20f, i - 30f),
                style = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold)
            )
        }
    }
}