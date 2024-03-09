package com.gaurav.jetpack_compose_tutorials.chapter3_layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import com.gaurav.jetpack_compose_tutorials.R
import com.gaurav.jetpack_compose_tutorials.ui.theme.backgroundColor
import com.smarttoolfactory.tutorial1_1basics.chapter3_layout.SlotsEnum


@Preview
@Composable
private fun PopupTest() {

    var showPopup by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize().background(backgroundColor)
    ) {

        Box(modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.DarkGray))


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text("Info1")

            Spacer(Modifier.width(8.dp))

            ToolTip(
                modifier = Modifier,
                showToolTip = showPopup,
                onDismissRequest = {
                    showPopup = false
                },
                toolTipContent = {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Some ToolTip Message",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
            ) {
                // This is content
                IconButton(
                    modifier = Modifier.border(1.dp, Color.Green),
                    onClick = {
                        showPopup = showPopup.not()
                    }
                ) {
                    Icon(
                        modifier = Modifier.size(60.dp),
                        imageVector = Icons.Default.Info,
                        contentDescription = null,
                        tint = Color.Red
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(80.dp))

//        Row(
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//
//            Text("This is Text before Info 2")
//
//            Spacer(Modifier.width(8.dp))
//
//            ToolTip(
//                showToolTip = showPopup,
////                modifier = Modifier.padding(horizontal = 16.dp),
//                onDismissRequest = {
//                    showPopup = false
//                },
//                toolTipContent = {
//                    Box(
//                        modifier = Modifier
//                            .padding(8.dp)
//                    ) {
//                        Text(
//                            text = "Some ToolTip Message",
//                            fontSize = 16.sp,
//                            color = Color.White
//                        )
//                    }
//                }
//            ) {
//                // This is content
//                IconButton(
//                    modifier = Modifier.border(1.dp, Color.Green).size(20.dp),
//                    onClick = {
//                        showPopup = showPopup.not()
//                    }
//                ) {
//                    Icon(
////                        modifier = Modifier.size(60.dp),
//                        imageVector = Icons.Default.Info,
//                        contentDescription = null,
//                        tint = Color.Red
//                    )
//                }
//            }
//        }

//        Row(
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//
//            Text("Info ")
//
//            ToolTip2(
//                showToolTip = showPopup,
//                onDismissRequest = {
//                    showPopup = false
//                },
//                toolTipContent = {
//                    Box(
//                        modifier = Modifier
//                            .padding(8.dp)
//                    ) {
//                        Text(
//                            text = "Some ToolTip Message",
//                            fontSize = 16.sp,
//                            color = Color.White
//                        )
//                    }
//                }
//            ) {
//                // This is content
//                IconButton(
//                    modifier = Modifier.border(2.dp, Color.Green).size(60.dp),
//                    onClick = {
//                        showPopup = showPopup.not()
//                    }
//                ) {
//                    Icon(imageVector = Icons.Default.Info, contentDescription = null)
//                }
//            }
//        }
        Image(
            modifier = Modifier.fillMaxWidth().aspectRatio(4 / 3f),
            painter = painterResource(R.drawable.landscape6),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }
}

@Composable
fun ToolTip(
    showToolTip: Boolean,
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    toolTipContent: @Composable () -> Unit,
    anchor: @Composable () -> Unit,
) {

    val density = LocalDensity.current

    var arrowTipOffset by remember {
        mutableStateOf(0.dp)
    }

    var anchorRect by remember {
        mutableStateOf(Rect.Zero)
    }

    var toolTipContentRect: Rect by remember {
        mutableStateOf(Rect.Zero)
    }

    val toolTipHalfWidth = toolTipContentRect.width / 2
    val anchorCenterX = anchorRect.center.x
    val tooltipCenterX = toolTipContentRect.center.x



    arrowTipOffset = with(density) {
        (toolTipHalfWidth + (anchorCenterX - tooltipCenterX)).toDp() - 12.dp
    }

//    println(
//        "🥹 anchorCenterX: $anchorCenterX, " +
//                "tooltipCenterX: $tooltipCenterX, " +
//                "toolTipHalfWidth: $toolTipHalfWidth, " +
//                "arrowTipOffset: $arrowTipOffset"
//    )

    Box(
        modifier = Modifier
            .onPlaced {
                anchorRect = it.boundsInWindow()
//                println("1️⃣ anchor rect: $anchorRect, size: ${anchorRect.size}")
            }
    ) {
        anchor()

        val toolTipBox = @Composable {
            Box(
                modifier = modifier
                    .onGloballyPositioned {
                        toolTipContentRect = it.boundsInWindow()
                        println("👻 toolTipContentRect rect: $toolTipContentRect, size: ${toolTipContentRect.size}")

                    }

//                    .border(2.dp, Color.Blue)
//                    .padding(horizontal = 16.dp)
                    .drawBubble(
                        arrowWidth = 24.dp,
                        arrowHeight = 16.dp,
                        arrowOffset = arrowTipOffset,
                        arrowDirection = ArrowDirection.Top,
                        elevation = 4.dp,
                        color = Color.Red
                    )
            ) {
                toolTipContent()
            }
        }

        if (showToolTip) {
            ToolTipPopUp(
                onDismissRequest = onDismissRequest,
                rect = toolTipContentRect,
                toolTipContent = toolTipBox,
            )
        }
    }
}

@Composable
fun ToolTip2(
    showToolTip: Boolean,
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    toolTipContent: @Composable () -> Unit,
    anchor: @Composable () -> Unit,
) {

    var anchorRect by remember {
        mutableStateOf(Rect.Zero)
    }

    var toolTipContentRect: Rect? by remember {
        mutableStateOf(Rect.Zero)
    }

    SideEffect {
        println("🔥anchorRect $anchorRect, toolTipContentRect: $toolTipContentRect")
    }

    Box(
        modifier = Modifier.onPlaced {
            anchorRect = it.boundsInWindow()
        }
    ) {
        anchor()

        val toolTipBox = @Composable {
            Box(
                modifier = modifier
                    .onGloballyPositioned {
                        toolTipContentRect = it.boundsInWindow()

                    }
                    .border(2.dp, Color.Blue)
//                    .padding(horizontal = 16.dp)
                    .drawBubble(
                        arrowWidth = 24.dp,
                        arrowHeight = 16.dp,
                        arrowOffset = 10.dp,
                        arrowDirection = ArrowDirection.Top,
                        elevation = 2.dp,
                        color = Color.Red
                    )
            ) {
                toolTipContent()
            }
        }


        ToolTipSubcomposeLayout(
            mainContent = {
                toolTipBox()
            }
        ) { contentSize: IntSize ->
            if (showToolTip) {
                println("INSIDE contentSize: $contentSize")
                ToolTipPopUp(
                    onDismissRequest = onDismissRequest,
//                    rect = rect,
                    toolTipContent = toolTipBox,
                )
            }
        }
    }
}


@Composable
private fun ToolTipPopUp(
    rect: Rect = Rect.Zero,
    toolTipContent: @Composable () -> Unit,
    onDismissRequest: () -> Unit = {}
) {

    val offset = IntOffset(0, rect.height.toInt())

    Popup(
//        popupPositionProvider = ToolTipPositionProvider(),
//        offset = offset,
//        alignment = Alignment.BottomCenter,
        onDismissRequest = onDismissRequest
    ) {
        Box(
            modifier = Modifier.onGloballyPositioned {
                println("Inside ToolTipPopUp() boundsInWindow:  ${it.boundsInWindow()}")
            }
        ) {
            toolTipContent()
        }
    }
}

class ToolTipPositionProvider(
    val alignment: Alignment = Alignment.TopCenter,
    val offset: IntOffset = IntOffset(0, 0)
) : PopupPositionProvider {

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {

        var popupPosition = IntOffset(0, 0)

        // Get the aligned point inside the parent
        val parentAlignmentPoint = alignment.align(
            IntSize.Zero,
            IntSize(anchorBounds.width, anchorBounds.height),
            layoutDirection
        )
        // Get the aligned point inside the child
        val relativePopupPos = alignment.align(
            IntSize.Zero,
            IntSize(popupContentSize.width, popupContentSize.height),
            layoutDirection
        )

        // Add the position of the parent
        popupPosition += IntOffset(anchorBounds.left, anchorBounds.top)

        // Add the distance between the parent's top left corner and the alignment point
        popupPosition += parentAlignmentPoint

        // Subtract the distance between the children's top left corner and the alignment point
        popupPosition -= IntOffset(relativePopupPos.x, relativePopupPos.y)

        // Add the user offset
        val resolvedOffset = IntOffset(
            offset.x * (if (layoutDirection == LayoutDirection.Ltr) 1 else -1),
            offset.y
        )
        popupPosition += resolvedOffset

        println(
            "🍏 PROVIDER: " +
                    "anchorBounds: $anchorBounds, " +
                    "popupContentSize: $popupContentSize, " +
                    "popupPosition: $popupPosition"
        )

        return popupPosition
    }
}

private fun calculatePopUpPosition(
    alignment: Alignment,
    offset: IntOffset,
    anchorBounds: IntRect,
    layoutDirection: LayoutDirection,
    popupContentSize: IntSize
): IntOffset {
    var popupPosition = IntOffset(0, 0)

    // Get the aligned point inside the parent
    val parentAlignmentPoint = alignment.align(
        IntSize.Zero,
        IntSize(anchorBounds.width, anchorBounds.height),
        layoutDirection
    )
    // Get the aligned point inside the child
    val relativePopupPos = alignment.align(
        IntSize.Zero,
        IntSize(popupContentSize.width, popupContentSize.height),
        layoutDirection
    )

    // Add the position of the parent
    popupPosition += IntOffset(anchorBounds.left, anchorBounds.top)

    // Add the distance between the parent's top left corner and the alignment point
    popupPosition += parentAlignmentPoint

    // Subtract the distance between the children's top left corner and the alignment point
    popupPosition -= IntOffset(relativePopupPos.x, relativePopupPos.y)

    // Add the user offset
    val resolvedOffset = IntOffset(
        offset.x * (if (layoutDirection == LayoutDirection.Ltr) 1 else -1),
        offset.y
    )
    popupPosition += resolvedOffset

    return popupPosition
}

@Composable
private fun ToolTipSubcomposeLayout(
    modifier: Modifier = Modifier,
    mainContent: @Composable () -> Unit,
    dependentContent: @Composable (IntSize) -> Unit
) {

    SubcomposeLayout(modifier = modifier) { constraints ->

        // Subcompose(compose only a section) main content and get Placeable
        val mainPlaceables: List<Placeable> = subcompose(SlotsEnum.Main, mainContent).map {
            it.measure(constraints)
        }

        // Get max width and height of main component
        val maxSize =
            mainPlaceables.fold(IntSize.Zero) { currentMax: IntSize, placeable: Placeable ->
                IntSize(
                    width = maxOf(currentMax.width, placeable.width),
                    height = maxOf(currentMax.height, placeable.height)
                )
            }

        val tooltip = subcompose(SlotsEnum.Dependent) {
            dependentContent(maxSize)
        }.map {
            it.measure(constraints)
        }


//        println("🚗maxSize: $maxSize")

        layout(0, 0) {

            // Get List<Measurable> from subcompose function then get List<Placeable> and place them
//            mainPlaceables.forEach {
//                it.placeRelative(0, 0)
//            }
            tooltip.forEach {
                it.placeRelative(0, 0)
            }
        }
    }
}