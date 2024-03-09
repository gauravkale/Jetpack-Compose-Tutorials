package com.gaurav.jetpack_compose_tutorials.chapter3_layout

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset

@SuppressLint("ModifierFactoryUnreferencedReceiver")
fun Modifier.drawBubble(
    arrowWidth: Dp,
    arrowHeight: Dp,
    arrowOffset: Dp,
    arrowDirection: ArrowDirection,
    elevation: Dp = 0.dp,
    color: Color = Color.Unspecified
) = composed {

    val arrowWidthPx: Float
    val arrowHeightPx: Float
    val arrowOffsetPx: Float

    with(LocalDensity.current) {
        arrowWidthPx = arrowWidth.toPx()
        arrowHeightPx = arrowHeight.toPx()
        arrowOffsetPx = arrowOffset.toPx()
    }

    val shape = remember(arrowWidth, arrowHeight, arrowOffset, arrowDirection) {
        createBubbleShape(arrowWidthPx, arrowHeightPx, arrowOffsetPx, arrowDirection)
    }

    Modifier
        .then(
            if (elevation > 0.dp) {
                Modifier.shadow(
                    elevation = elevation,
                    shape = shape,
                    spotColor = Color.Red,
                    ambientColor = Color.Black
                )
            } else Modifier.clip(shape)
        )
        .background(color, shape)
        .layout { measurable, constraints ->

            val isHorizontalArrow =
                arrowDirection == ArrowDirection.Left || arrowDirection == ArrowDirection.Right

            val isVerticalArrow =
                arrowDirection == ArrowDirection.Top || arrowDirection == ArrowDirection.Bottom


            val offsetX = if (isHorizontalArrow) arrowWidthPx.toInt() else 0
            val offsetY = if (isVerticalArrow) arrowHeightPx.toInt() else 0

            // 🔥🔥 Limit min-max Constraints in bounds of min..max even when offset from arrow tip
            // is applied

            //    val placeable = measurable.measure(constraints)

            val placeable = measurable.measure(
                constraints.offset(
                    horizontal = -offsetX,
                    vertical = -offsetY
                )
            )

            // 🔥 Limit layout width to content width - arrow width in
            // bounds of min..max Constraints. When layout is not in constraints bounds it jumps
            // as half of difference. In these example it doesn't do anything because
            // placeable max width is already capped at Constraints.maxWidth - offsetX
            val width = constraints.constrainWidth(placeable.width + offsetX)
            // 🔥 Limit layout height to content height - arrow height in
            // bounds of min..max Constraints
            val height = constraints.constrainHeight(placeable.height + offsetY)

            val posX = when (arrowDirection) {
                ArrowDirection.Left -> arrowWidthPx.toInt()
                else -> 0
            }

            val posY = when (arrowDirection) {
                ArrowDirection.Top -> arrowHeightPx.toInt()
                else -> 0
            }

            layout(width, height) {
                placeable.placeRelative(posX, posY)
            }
        }
    // 🔥 This border is applied after new layout which is area that is reserved after arrow
    // .border(2.dp, Color.Magenta)
}

fun createBubbleShape(
    arrowWidth: Float,
    arrowHeight: Float,
    arrowOffset: Float,
    arrowDirection: ArrowDirection
): GenericShape {

    return GenericShape { size: Size, layoutDirection: LayoutDirection ->

        val width = size.width
        val height = size.height

        when (arrowDirection) {
            ArrowDirection.Left -> {
                moveTo(arrowWidth, arrowOffset)
                lineTo(0f, arrowOffset)
                lineTo(arrowWidth, arrowHeight + arrowOffset)
                addRoundRect(
                    RoundRect(
                        rect = Rect(left = arrowWidth, top = 0f, right = width, bottom = height),
                        cornerRadius = CornerRadius(x = 20f, y = 20f)
                    )
                )
            }

            ArrowDirection.Right -> {
                moveTo(width - arrowWidth, arrowOffset)
                lineTo(width, arrowOffset)
                lineTo(width - arrowWidth, arrowHeight + arrowOffset)
                addRoundRect(
                    RoundRect(
                        rect = Rect(
                            left = 0f,
                            top = 0f,
                            right = width - arrowWidth,
                            bottom = height
                        ),
                        cornerRadius = CornerRadius(x = 20f, y = 20f)
                    )
                )
            }

            ArrowDirection.Top -> {
                moveTo(arrowOffset, arrowHeight)
                lineTo(arrowOffset + arrowWidth / 2, 0f)
                lineTo(arrowOffset + arrowWidth, arrowHeight)

                addRoundRect(
                    RoundRect(
                        rect = Rect(
                            left = 0f,
                            top = arrowHeight,
                            right = width,
                            bottom = height
                        ),
                        cornerRadius = CornerRadius(x = 20f, y = 20f)
                    )
                )
            }

            else -> {
                moveTo(arrowOffset, height - arrowHeight)
                lineTo(arrowOffset + arrowWidth / 2, height)
                lineTo(arrowOffset + arrowWidth, height - arrowHeight)

                addRoundRect(
                    RoundRect(
                        rect = Rect(
                            left = 0f,
                            top = 0f,
                            right = width,
                            bottom = height - arrowHeight
                        ),
                        cornerRadius = CornerRadius(x = 20f, y = 20f)
                    )
                )
            }
        }
    }

}

enum class ArrowDirection {
    Left, Right, Top, Bottom
}
