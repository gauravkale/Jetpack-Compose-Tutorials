package com.gaurav.jetpack_compose_tutorials.tutorial_list

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.res.stringResource
import com.gaurav.jetpack_compose_tutorials.ComingSoonScreen
import com.gaurav.jetpack_compose_tutorials.model.TutorialSectionModel
import com.gaurav.jetpack_compose_tutorials.R
import com.gaurav.jetpack_compose_tutorials.chapter1_basic.Tutorial1_1Screen
import com.gaurav.jetpack_compose_tutorials.chapter1_basic.Tutorial1_2Screen
import com.gaurav.jetpack_compose_tutorials.ui.theme.GestureListColor
import com.gaurav.jetpack_compose_tutorials.ui.theme.GraphicsListColor
import com.gaurav.jetpack_compose_tutorials.ui.theme.LayoutListColor
import com.gaurav.jetpack_compose_tutorials.ui.theme.StateListColor


/**
 * Create list of tutorials with titles, action that navigates to composable function
 * inside lambda.
 *
 * * Tags are for search purposes if there is a Search Component exists.
 */
@ExperimentalAnimationApi
@OptIn(ExperimentalMaterialApi::class)
@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun createComponentTutorialList(onBack: () -> Unit): List<TutorialSectionModel> {
    val tutorial1_1 = TutorialSectionModel(
        title = stringResource(R.string.title1_1),
        action = {
            Tutorial1_1Screen()
        },
        description = "Create Rows, Columns and Box, how to add modifiers to " +
                "composables. Set padding, margin, alignment other properties of composables.",
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_COLUMN,
            TAG_COMPOSE_ROW,
            TAG_COMPOSE_BOX,
            TAG_COMPOSE_MODIFIER
        )
    )

    val tutorial1_2 = TutorialSectionModel(
        title = stringResource(R.string.title1_2),
        description = "Create and modify Surface to draw background for Composables," +
                " add click action to any composable. Set weight or offset modifiers.",
        action = {
            Tutorial1_2Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSE_SURFACE,
            TAG_COMPOSE_SHAPE,
            TAG_COMPOSE_CLICKABLE
        )
    )


    val tutorial2_1 = TutorialSectionModel(
        title = stringResource(R.string.title2_1),
        description = "Create Text component with different properties such as " +
                "color, background, font weight, family, style, spacing and others.",
        action = {
            ComingSoonScreen()
//            Tutorial2_1Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TEXT,
            TAG_FONT_STYLE,
            TAG_ANNOTATED_STRING,
            TAG_HYPERLINK
        )
    )

    val tutorial2_2 = TutorialSectionModel(
        title = stringResource(R.string.title2_2),
        description = "Create Button with text and/or with image, Floating Action Button " +
                ", or Chips. Modify properties of buttons such as color, text, or state.",
        action = {
            ComingSoonScreen()
//            Tutorial2_2Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BUTTON,
            TAG_ICON_BUTTON,
            TAG_FAB_BUTTON,
            TAG_CHIP
        )
    )

    val tutorial2_3 = TutorialSectionModel(
        title = stringResource(R.string.title2_3),
        description = "Create TextField component with regular style or outlined. Set error," +
                " colors, state, icons, VisualTransformations for phone or " +
                "credit card, and IME actions.",
        action = {
            ComingSoonScreen()
//            Tutorial2_3Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TEXT_FIELD,
            TAG_OUTLINED_TEXT_FIELD,
            TAG_IME,
            TAG_VISUAL_TRANSFORMATION,
            TAG_REGEX
        )
    )

    val tutorial2_4 = TutorialSectionModel(
        title = stringResource(R.string.title2_4),
        description = "Create Image to display images, set image and crop styles. " +
                "Change shape of Image or apply ColorFilter and PorterDuff modes.",
        action = {
            ComingSoonScreen()
//            Tutorial2_4Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_IMAGE,
            TAG_DRAWABLE,
            TAG_VECTOR_DRAWABLE,
            TAG_BITMAP
        )
    )

    val tutorial2_5_1 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_1),
        description = "LazyColumn is counterpart of vertical RecyclerView in Compose",
        action = {
            ComingSoonScreen()
//            Tutorial2_5Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_LAZY_COLUMN_VERTICAL_ARRANGEMENT,
            TAG_LAZY_COLUMN_CONTENT_PADDING
        )
    )

    val tutorial2_5_2 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_2),
        description = "LazyColumn scroll state and modify dynamic list",
        action = {
            ComingSoonScreen()
//            Tutorial2_5Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_LAZY_COLUMN_VERTICAL_ARRANGEMENT,
            TAG_LAZY_COLUMN_CONTENT_PADDING,
            TAG_LAZY_COLUMN_SCROLL,
            TAG_LAZY_COLUMN_DYNAMIC_SIZE
        )
    )

    val tutorial2_5_3 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_3),
        description = "LazyColumn is counterpart of horizontal RecyclerView in Compose",
        action = {
            ComingSoonScreen()
//            Tutorial2_5Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_ROW,
            TAG_LAZY_COLUMN_VERTICAL_ARRANGEMENT,
            TAG_LAZY_COLUMN_CONTENT_PADDING
        )
    )

    val tutorial2_5_4 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_4),
        description = "LazyColumn with StickyHeaders",
        action = {
            ComingSoonScreen()
//            Tutorial2_5Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_LAZY_COLUMN_STICKY_HEADER,
            TAG_LAZY_COLUMN_VERTICAL_ARRANGEMENT,
            TAG_LAZY_COLUMN_CONTENT_PADDING
        )
    )

    val tutorial2_5_5 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_5),
        description = "Grid style item display",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_VERTICAL_GRID,
            TAG_GRID_CELL,
            TAG_LAZY_COLUMN_VERTICAL_ARRANGEMENT,
            TAG_LAZY_COLUMN_CONTENT_PADDING
        )
    )

    val tutorial2_5_6 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_6),
        description = "LazyGridLayout with dynamic height",
        action = {
            ComingSoonScreen()
//            Tutorial2_5Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_VERTICAL_GRID,
            TAG_GRID_CELL,
            TAG_LAZY_COLUMN_VERTICAL_ARRANGEMENT,
            TAG_LAZY_COLUMN_CONTENT_PADDING
        )
    )

    val tutorial2_5_7 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_7),
        description = "Create one-line, two-line, three-line or combine other " +
                "components to build list items using built-in ListItem component",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_LIST_ITEM
        )
    )


    val tutorial2_5_8 = TutorialSectionModel(
        title = stringResource(R.string.title2_5_8),
        description = "Get meta data about LazyRow/Column by using LazyLayoutState's " +
                "LazyListLayoutInfo",
        action = {
            ComingSoonScreen()
//            Tutorial2_5Screen8()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_ROW,
            TAG_LAZY_COLUMN,
            TAG_LAZY_LIST_LAYOUT_INFO,
            TAG_LAZY_LIST_ITEM_INFO
        )
    )

    val tutorial2_6 = TutorialSectionModel(
        title = stringResource(R.string.title2_6),
        description = "The top app bar displays information and actions " +
                "relating to the current screen.",
        action = {
            ComingSoonScreen(onBack)
//            Tutorial2_6Screen(onBack)
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TOP_APP_BAR,
            TAG_TOP_APP_BAR_MENU,
            TAG_TAB_ROW,
            TAG_TAB,
            TAG_TAB_INDICATOR,
            TAG_TAB_SCROLLABLE
        )
    )

    val tutorial2_7 = TutorialSectionModel(
        title = stringResource(R.string.title2_7),
        description = "Material Design bottom navigation.\n" +
                "Bottom navigation bars allow movement between primary destinations in an app.\n" +
                "BottomNavigation should contain multiple BottomNavigationItems, " +
                "each representing a singular destination.",
        action = {
            ComingSoonScreen()
//            Tutorial2_7Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BOTTOM_NAVIGATION,
            TAG_BOTTOM_NAVIGATION_ITEM
        )
    )

    val tutorial2_8 = TutorialSectionModel(
        title = stringResource(R.string.title2_8),
        description = "Material Design bottom app bar.\n" +
                "A bottom app bar displays navigation and key actions at the bottom of screens.",
        action = {
            ComingSoonScreen(onBack)
//            Tutorial2_8Screen(onBack)
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BOTTOM_APP_BAR
        )
    )

    val tutorial2_9_1 = TutorialSectionModel(
        title = stringResource(R.string.title2_9_1),
        description = "Navigate using side navigation. Navigate after popping from stack. " +
                "Open or close drawer with scaffoldState.drawerState",
        action = {
            ComingSoonScreen()
//            Tutorial2_9Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SCAFFOLD,
            TAG_NAVIGATION_DRAWER,
            TAG_DRAWER_STATE
        )
    )

    val tutorial2_9_2 = TutorialSectionModel(
        title = stringResource(R.string.title2_9_2),
        description = "Modal navigation drawers block interaction with the rest of " +
                "an app’s content with a scrim. They are elevated above most of " +
                "the app’s UI and don’t affect the screen’s layout grid.",
        action = {
            ComingSoonScreen()
//            Tutorial2_9Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MODAL_DRAWER,
            TAG_DRAWER_STATE
        )
    )

    val tutorial2_9_3 = TutorialSectionModel(
        title = stringResource(R.string.title2_9_3),
        description = "ModalDrawer sample with Scaffold. ModalDrawer is inside content Scaffold.",
        action = {
            ComingSoonScreen()
//            Tutorial2_9Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SCAFFOLD,
            TAG_MODAL_DRAWER,
            TAG_DRAWER_STATE
        )
    )

    val tutorial2_9_4 = TutorialSectionModel(
        title = stringResource(R.string.title2_9_4),
        description = "Another ModalDrawer sample with Scaffold. Scaffold is " +
                "inside content of ModalDrawer",
        action = {
            ComingSoonScreen()
//            Tutorial2_9Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SCAFFOLD,
            TAG_MODAL_DRAWER,
            TAG_DRAWER_STATE
        )
    )

    val tutorial2_10_1 = TutorialSectionModel(
        title = stringResource(R.string.title2_10_1),
        description = "Create bottom sheet using BottomSheetScaffold and " +
                "rememberBottomSheetScaffoldState",
        action = {
            ComingSoonScreen()
//            Tutorial2_10Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SCAFFOLD_BOTTOM_SHEET,
            TAG_BOTTOM_SHEET,
            TAG_BOTTOM_SHEET_STATE
        )
    )

    val tutorial2_10_2 = TutorialSectionModel(
        title = stringResource(R.string.title2_10_2),
        description = "Create modal bottom sheet using BottomSheetScaffold and " +
                "rememberBottomSheetScaffoldState",
        action = {
            ComingSoonScreen()
//            Tutorial2_10Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MODAL_BOTTOM_SHEET,
            TAG_MODAL_BOTTOM_SHEET_VALUE
        )
    )

    val tutorial2_10_3 = TutorialSectionModel(
        title = stringResource(R.string.title2_10_3),
        description = "Bottom navigation drawers are modal drawers that are " +
                "anchored to the bottom of the screen.",
        action = {
            ComingSoonScreen()
//            Tutorial2_10Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BOTTOM_DRAWER
        )
    )

    val tutorial2_10_4 = TutorialSectionModel(
        title = stringResource(R.string.title2_10_4),
        description = "BottomDrawer with BottomAppBar.",
        action = {
            ComingSoonScreen()
//            Tutorial2_10Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BOTTOM_DRAWER,
            TAG_BOTTOM_APP_BAR,
            TAG_SCAFFOLD
        )
    )
    val tutorial2_10_5 = TutorialSectionModel(
        title = stringResource(R.string.title2_10_5),
        description = "A backdrop appears behind all other surfaces in an app, displaying " +
                "contextual and actionable content.",
        action = {
            ComingSoonScreen()
//            Tutorial2_10Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BACKDROP_SCAFFOLD
        )
    )

    val tutorial2_11 = TutorialSectionModel(
        title = stringResource(R.string.title2_11),
        description = "Samples for Snackbar, ProgressIndicator, Slider, CheckBox, " +
                "TriStateCheckBox, RadioButton with groups, and Switch.",
        action = {
            ComingSoonScreen()
//            Tutorial2_11Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SNACK_BAR,
            TAG_LINEAR_PROGRESS_INDICATOR,
            TAG_CIRCULAR_PROGRESS_INDICATOR,
            TAG_SLIDER,
            TAG_CHECKBOX,
            TAG_RADIO_BUTTON,
            TAG_SWITCH,
            TAG_LIST_ITEM
        )
    )

    val tutorial2_12 = TutorialSectionModel(
        title = stringResource(R.string.title2_12),
        description = "Create Dialog, and AlertDialogs with standard and custom layouts. " +
                "Implement on dismiss logic and get result when dialog is closed.",
        action = {
            ComingSoonScreen()
//            Tutorial2_12Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_DIALOG,
            TAG_ALERT_DIALOG,
            TAG_DIALOG_PROPERTIES
        )
    )

    val tutorial2_13 = TutorialSectionModel(
        title = stringResource(R.string.title2_13),
        description = "Create a composable that can be dismissed by swiping left or right.",
        action = {
            ComingSoonScreen()
//            Tutorial2_13Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SWIPE_TO_DISMISS
        )
    )

    val tutorial2_14 = TutorialSectionModel(
        title = stringResource(R.string.title2_14),
        description = "Lazy column compose that has checkbox where items can be checked and unchecked",
        action = {
            ComingSoonScreen()
//            Tutorial2_14Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN_CHECKBOX
        )
    )

    return listOf(
        tutorial1_1,
        tutorial1_2,
        tutorial2_1,
        tutorial2_2,
        tutorial2_3,
        tutorial2_4,
        tutorial2_5_1,
        tutorial2_5_2,
        tutorial2_5_3,
        tutorial2_5_4,
        tutorial2_5_5,
        tutorial2_5_6,
        tutorial2_5_7,
        tutorial2_5_8,
        tutorial2_6,
        tutorial2_7,
        tutorial2_8,
        tutorial2_9_1,
        tutorial2_9_2,
        tutorial2_9_3,
        tutorial2_9_4,
        tutorial2_10_1,
        tutorial2_10_2,
        tutorial2_10_3,
        tutorial2_10_4,
        tutorial2_10_5,
        tutorial2_11,
        tutorial2_12,
        tutorial2_13,
        tutorial2_14
    )
}

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun createLayoutTutorialList(): List<TutorialSectionModel> {

    val tutorial3_1_1 = TutorialSectionModel(
        title = stringResource(R.string.title3_1_1),
        description = "Create custom modifiers using layout, Measurable, Constraint, Placeable," +
                " and LayoutModifier.",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_MODIFIER,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE,
            TAG_LAYOUT_MODIFIER
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_1_2 = TutorialSectionModel(
        title = stringResource(R.string.title3_1_2),
        description = "Use Modifier.onGloballyPositioned to get position of a Composable" +
                "in parent, root or window.",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSED_MODIFIER
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_1_3 = TutorialSectionModel(
        title = stringResource(R.string.title3_1_3),
        description = "Use Modifier.offset{} and Modifier.graphicsLayer{} to scale, translate or " +
                "change other properties of a Composable",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSE_MODIFIER_GRAPHICS_LAYER,
            TAG_SCALE,
            TAG_TRANSLATE,
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_1_4 = TutorialSectionModel(
        title = stringResource(R.string.title_1_4),
        description = "BoxWithConstraints is a composable that defines its own content " +
                "according to the available space, based on the incoming constraints " +
                "or the current LayoutDirection.",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BOX_WITH_CONSTRAINTS
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_1_5 = TutorialSectionModel(
        title = stringResource(R.string.title_1_5),
        description = "In this example Constraints of different size modifiers are observed",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_MODIFIER_SIZE,
            TAG_MODIFIER_WIDTH,
            TAG_MODIFIER_HEIGHT
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_1_6 = TutorialSectionModel(
        title = stringResource(R.string.title_1_6),
        description = "Observe how chaining Modifier.size.size, Modifier.sizeIn.size or " +
                "Modifier.size.requiredSize or other combination of size modifiers effect final " +
                "Constraints.",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_MODIFIER_SIZE,
            TAG_MODIFIER_WIDTH,
            TAG_MODIFIER_HEIGHT,
            TAG_MODIFIER_REQUIRED
        ),
        tagColor = LayoutListColor
    )


    val tutorial3_1_7 = TutorialSectionModel(
        title = "3-1-7 Modifier.wrapContentSize",
        description = "Use Modifier.wrapContentSize/Width/Height to use content constraints " +
                "instead of Constraints forced by parent.",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen7()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_1_8 = TutorialSectionModel(
        title = stringResource(R.string.title_3_1_8),
        description = "Use Modifier.layout to create LayoutModifier to measure with Constraints " +
                "and place Placeables based on which order Modifier.layout is assigned.",
        action = {
            ComingSoonScreen()
//            Tutorial3_1Screen8()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAYOUT_MODIFIER,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_0 = TutorialSectionModel(
        title = stringResource(R.string.title3_2_0),
        description = "Create custom layout using using layout, " +
                "Measurable, Constraint, Placeable.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_1 = TutorialSectionModel(
        title = stringResource(R.string.title3_2_1),
        description = "Create custom layout using using layout, " +
                "Measurable, Constraint, Placeable.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_2 = TutorialSectionModel(
        title = "3-2-2 Custom Layout2",
        description = "Create custom layout using using MeasurePolicy " +
                "and use intrinsic dimensions.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MEASURE_POLICY,
            TAG_INTRINSIC_WIDTH,
            TAG_INTRINSIC_HEIGHT,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_3 = TutorialSectionModel(
        title = "3-2-3 Constraints",
        description = "Create different Constraints to measure Measurables " +
                "and observe how constraints" +
                "effect dimensions of Placeables and parent Composable.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_4 = TutorialSectionModel(
        title = "3-2-4 Constraints Bounds",
        description = "Update default constraints with or out of bounds of original Constraints" +
                ", and change layout width out of Constraints bounds to observe how a Composable" +
                " is laid out",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_5 = TutorialSectionModel(
        title = "3-2-5 Inner Constraints",
        description = "Update default constraints with or out of bounds of original Constraints" +
                ", and pass Constraints to content to change it's Constraints from size modifier",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_6 = TutorialSectionModel(
        title = "3-2-6 Sibling Constraints",
        description = "Inspect how Constraints and assigned width of a layout effects " +
                "position of a sibling Composable",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_7 = TutorialSectionModel(
        title = "3-2-7 Constraints.Infinity",
        description = "Observe how using infinite constraints incorrectly leads to" +
                "exceptions.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen7()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_8 = TutorialSectionModel(
        title = "3-2-8 Constrain&Offset",
        description = "Use Constraints.offset and/or Constraints.constrainWidth to limit a " +
                "Measurable inside parent bounds by creating padding Modifiers " +
                "with different variations",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen8()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_2_9 = TutorialSectionModel(
        title = "3-2-9 Constrain&Offset2",
        description = "Constraints to measure measurables with Constraints.offset and " +
                "Constraints.constrainWidth to limit maximum width or available.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen9()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )


    val tutorial3_2_10 = TutorialSectionModel(
        title = "3-2-10 Constraints & Modifier.layout",
        description = "Constraints to measure measurables with Constraints.offset and " +
                "Constraints.constrainWidth to limit maximum width or available " +
                "space for Placeable.",
        action = {
            ComingSoonScreen()
//            Tutorial3_2Screen10()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_3_1 = TutorialSectionModel(
        title = stringResource(R.string.title_3_3_1),
        description = "Add custom modifiers to Composable inside a custom layout using it's scope.",
        action = {
            ComingSoonScreen()
//            Tutorial3_3Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_SCOPE,
            TAG_PARENT_DATA_MODIFIER,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )


    val tutorial3_3_3 = TutorialSectionModel(
        title = stringResource(R.string.title_3_3_3),
        description = "Use Modifier.onPlaced invokes after the parent LayoutModifier " +
                "and parent layout has been placed and before child " +
                "LayoutModifier is placed. This allows child LayoutModifier " +
                "to adjust its own placement based on where the parent is.",
        action = {
            ComingSoonScreen()
//            Tutorial3_3Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_ON_PLACED_MODIFIER,
            TAG_CUSTOM_LAYOUT,
            TAG_SCOPE,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_3_4 = TutorialSectionModel(
        title = stringResource(R.string.title_3_3_4),
        description = "Use Modifier.onPlaced to observe alignment changes.",
        action = {
            ComingSoonScreen()
//            Tutorial3_3Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_ON_PLACED_MODIFIER,
            TAG_CUSTOM_LAYOUT,
            TAG_SCOPE,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_3_5 = TutorialSectionModel(
        title = stringResource(R.string.title_3_3_5),
        description = "Use Modifier.onPlaced to observe alignment animation.",
        action = {
            ComingSoonScreen()
//            Tutorial3_3Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_ON_PLACED_MODIFIER,
            TAG_CUSTOM_LAYOUT,
            TAG_SCOPE,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_4 = TutorialSectionModel(
        title = stringResource(R.string.title_3_4),
        description = "Use Modifier.layoutId to get a measurable, and use it to measure another" +
                "measurable to match dimensions.",
        action = {
            ComingSoonScreen()
//            Tutorial3_4Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_SCOPE,
            TAG_LAYOUT_ID_MODIFIER,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_5 = TutorialSectionModel(
        title = stringResource(R.string.title_3_5),
        description = "SubcomposeLayout allows to subcompose the actual content during " +
                "the measuring stage for example to use the values calculated " +
                "during the measurement as " +
                "params for the composition of the children.",
        action = {
            ComingSoonScreen()
//            Tutorial3_5Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SUBCOMPOSE_LAYOUT,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_6_1 = TutorialSectionModel(
        title = stringResource(R.string.title_3_6_1),
        description = "Custom layout like whatsapp chat layout that moves " +
                "time and message read " +
                "status layout right or bottom based on message width.",
        action = {
            ComingSoonScreen()
//            Tutorial3_6Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_6_2 = TutorialSectionModel(
        title = stringResource(R.string.title_3_6_2),
        description = "Custom layout like whatsapp chat. Added quote and " +
                "name tag resized to longest " +
                "sibling using SubcomposeColumn from previous examples to have whole layout.",
        action = {
            ComingSoonScreen()
//            Tutorial3_6Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CUSTOM_LAYOUT,
            TAG_SUBCOMPOSE_LAYOUT,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_PLACEABLE
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_7_1 = TutorialSectionModel(
        title = stringResource(R.string.title_3_7_1),
        description = "Examine how Composition and Layout phases are called on recomposition.",
        action = {
            ComingSoonScreen()
//            Tutorial3_7Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURE_POLICY,
            TAG_PHASE_COMPOSITION,
            TAG_PHASE_LAYOUT
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_7_2 = TutorialSectionModel(
        title = stringResource(R.string.title_3_7_2),
        description = "Examine how Composition and Layout phases are called on recomposition.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MEASURABLE,
            TAG_CONSTRAINTS,
            TAG_CUSTOM_LAYOUT,
            TAG_MEASURE_POLICY,
            TAG_PHASE_COMPOSITION,
            TAG_PHASE_LAYOUT
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_9 = TutorialSectionModel(
        title = stringResource(R.string.title_3_9),
        description = "Detect percentage of visibility of a Composable using Modifier.onPlaced " +
                "inside Column with vertical scroll or LazyColumn.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_LAZY_LIST_STATE,
            TAG_ON_PLACED_MODIFIER
        ),
        tagColor = LayoutListColor
    )

    val tutorial3_10 = TutorialSectionModel(
        title = stringResource(R.string.title_3_10),
        description = "Detect position in parent and center an item while its parent is scrolled.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_ON_PLACED_MODIFIER
        ),
        tagColor = LayoutListColor
    )


    return listOf(
        tutorial3_1_1,
        tutorial3_1_2,
        tutorial3_1_3,
        tutorial3_1_4,
        tutorial3_1_5,
        tutorial3_1_6,
        tutorial3_1_7,
        tutorial3_1_8,
        tutorial3_2_0,
        tutorial3_2_1,
        tutorial3_2_2,
        tutorial3_2_3,
        tutorial3_2_4,
        tutorial3_2_5,
        tutorial3_2_6,
        tutorial3_2_7,
        tutorial3_2_8,
        tutorial3_2_9,
        tutorial3_2_10,
        tutorial3_3_1,
        tutorial3_3_3,
        tutorial3_3_4,
        tutorial3_3_5,
        tutorial3_4,
        tutorial3_5,
        tutorial3_6_1,
        tutorial3_6_2,
        tutorial3_7_1,
        tutorial3_7_2,
        tutorial3_9,
        tutorial3_10
    )
}

@Composable
fun createStateTutorialList(): List<TutorialSectionModel> {

    val tutorial4_1_1 = TutorialSectionModel(
        title = stringResource(R.string.title_4_1_1),
        description = "This tutorial shows how remember and mutableState " +
                "effect recomposition and states.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_RECOMPOSITION,
            TAG_STATE
        ),
        tagColor = StateListColor
    )

    val tutorial4_1_2 = TutorialSectionModel(
        title = stringResource(R.string.title_4_1_2),
        description = "This tutorial shows how SnapshotMutationPolicy effects whether " +
                "recomposition should be triggered or not.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SNAPSHOT_MUTATION_POLICY,
            TAG_REMEMBER,
            TAG_RECOMPOSITION,
            TAG_STATE
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_1 = TutorialSectionModel(
        title = stringResource(R.string.title_4_2_1),
        description = "This tutorial shows how recomposition happens for flat or hierarchical " +
                "designs when Composables are in separate functions or stacked together.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_RECOMPOSITION,
            TAG_STATE
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_2 = TutorialSectionModel(
        title = stringResource(R.string.title_4_2_2),
        description = "This tutorial show how hierarchy of Composables effect Smart Composition",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_RECOMPOSITION,
            TAG_STATE
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_3 = TutorialSectionModel(
        title = stringResource(R.string.title_4_2_3),
        description = "This tutorial shows how scopes(lambda functions) " +
                "or hierarchy of Composables " +
                "effects Smart Composition. " +
                "Uses separate functions for Text, Button, and Columns with random colors are " +
                "applied at (re)composition.",

        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_RECOMPOSITION,
            TAG_STATE
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_4 = TutorialSectionModel(
        title = stringResource(R.string.title_4_2_4),
        description = "This tutorial shows how stable or unstable classes effects recomposition." +
                "Skippable functions when called during recomposition, " +
                "compose is able to skip the function " +
                "if all of the parameters are equal with their previous values.",

        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_STABILITY,
            TAG_SKIPPABLE,
            TAG_RECOMPOSITION,
            TAG_STATE,
            TAG_REMEMBER,
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_5 = TutorialSectionModel(
        title = stringResource(R.string.tittle_4_2_5),
        description = "This tutorial shows an immutable type that contains unstable types can " +
                "be made stable with @Immutable annotation",

        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_STABILITY,
            TAG_SKIPPABLE,
            TAG_IMMUTABLE,
            TAG_RECOMPOSITION,
            TAG_STATE,
            TAG_REMEMBER,
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_6 = TutorialSectionModel(
        title = stringResource(R.string.tittle_4_2_6),
        description = "This tutorial shows an mutable type that contains unstable types can " +
                "be made stable with @Stable annotation",

        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_STABILITY,
            TAG_SKIPPABLE,
            TAG_STABLE,
            TAG_RECOMPOSITION,
            TAG_STATE,
            TAG_REMEMBER,
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_7 = TutorialSectionModel(
        title = stringResource(R.string.tittle_4_2_7),
        description = "This tutorial shows unstable types read in a lambda can trigger " +
                "recomposition even if the value doesn't change",

        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_STABILITY,
            TAG_SKIPPABLE,
            TAG_STABLE,
            TAG_RECOMPOSITION,
            TAG_STATE,
            TAG_REMEMBER,
        ),
        tagColor = StateListColor
    )

    val tutorial4_2_8 = TutorialSectionModel(
        title = stringResource(R.string.title_4_2_8),
        description = "This tutorial shows @NonRestartableComposable effects skippable and " +
                "restartable properties of a Composable",

        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SKIPPABLE,
            TAG_RESTARTABLE,
            TAG_NON_RESTARTABLE_COMPOSABLE,
            TAG_STABILITY,
            TAG_RECOMPOSITION,
            TAG_STATE,
            TAG_REMEMBER,
        ),
        tagColor = StateListColor
    )


    val tutorial4_3 = TutorialSectionModel(
        title = stringResource(R.string.title_4_3),
        description = "Remember produce and remember a new value by calling calculation when " +
                "key(s) are updated. Update calculations with buttons.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_STATE
        ),
        tagColor = StateListColor
    )

    val tutorial4_4 = TutorialSectionModel(
        title = stringResource(R.string.title_4_4),
        description = "Create a custom remember and custom component to have badge that changes " +
                "its shape based on properties set by custom rememberable.",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_STATE,
            TAG_CUSTOM_LAYOUT
        ),
        tagColor = StateListColor
    )

    val tutorial4_5_1 = TutorialSectionModel(
        title = stringResource(R.string.title_4_5_1),
        description = "Use remember functions like rememberCoroutineScope, " +
                "and rememberUpdatedState and side-effect functions such as " +
                "LaunchedEffect and DisposableEffect",
        action = {
            ComingSoonScreen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_COROUTINE_SCOPE,
            TAG_REMEMBER_UPDATED,
            TAG_LAUNCHED_EFFECT,
            TAG_DISPOSABLE_EFFECT
        ),
        tagColor = StateListColor
    )

    val tutorial4_5_2 = TutorialSectionModel(
        title = stringResource(R.string.title_4_5_2),
        description = "Use SideEffect, derivedStateOf, produceState and snapshotFlow.",
        action = {
            ComingSoonScreen()
//            Tutorial4_5_2Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_SIDE_EFFECT,
            TAG_DERIVED_STATE,
            TAG_PRODUCE_STATE,
            TAG_SNAPSHOT_FLOW,
        ),
        tagColor = StateListColor
    )

    val tutorial4_6 = TutorialSectionModel(
        title = stringResource(R.string.title_4_6),
        description = "Recomposition of Modifiers based on states or lambdas they read.",
        action = {
            ComingSoonScreen()
//            Tutorial4_6Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER,
            TAG_COMPOSE_MODIFIER,
            TAG_RECOMPOSITION,
        ),
        tagColor = StateListColor
    )

    val tutorial4_7_1 = TutorialSectionModel(
        title = stringResource(R.string.title_4_7_1),
        description = "This tutorial changes color or/and offset to display frame phases" +
                "Composition->Layout->Draw in one sample.",
        action = {
            ComingSoonScreen()
//            Tutorial4_7_1Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_RECOMPOSITION,
            TAG_PHASE_COMPOSITION,
            TAG_PHASE_LAYOUT,
            TAG_PHASE_DRAW
        ),
        tagColor = StateListColor
    )

    val tutorial4_7_2 = TutorialSectionModel(
        title = stringResource(R.string.title_4_7_2),
        description = "This tutorial shows Compose phases such as Composition, Layout, and Draw" +
                "are set based when a state is read.",
        action = {
            ComingSoonScreen()
//            Tutorial4_7_2Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_RECOMPOSITION,
            TAG_PHASE_COMPOSITION,
            TAG_PHASE_LAYOUT,
            TAG_PHASE_DRAW
        ),
        tagColor = StateListColor
    )

    val tutorial4_7_3 = TutorialSectionModel(
        title = stringResource(R.string.title_4_7_3),
        description = "This tutorial state reads or lambdas are passed to parents.",
        action = {
            ComingSoonScreen()
//            Tutorial4_7_3Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_RECOMPOSITION,
            TAG_PHASE_COMPOSITION,
            TAG_PHASE_LAYOUT,
            TAG_PHASE_DRAW
        ),
        tagColor = StateListColor
    )


    val tutorial4_10_1 = TutorialSectionModel(
        title = stringResource(R.string.title_4_10_1),
        description = "movableContentOf converts a lambda into one that moves the remembered " +
                "state and nodes created in a previous call " +
                "to the new location it is called.",
        action = {
            ComingSoonScreen()
//            Tutorial4_10Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MOVABLE_CONTENT_OF,
            TAG_REMEMBER
        ),
        tagColor = StateListColor
    )

    val tutorial4_10_2 = TutorialSectionModel(
        title = stringResource(R.string.title_4_10_2),
        description = "Use movableContentOf to inspect effects on Composables when items from " +
                "a list while are deleted",
        action = {
            ComingSoonScreen()
//            Tutorial4_10Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MOVABLE_CONTENT_OF,
            TAG_SNAPSHOT_STATE_LIST,
            TAG_REMEMBER
        ),
        tagColor = StateListColor
    )

    val tutorial4_10_3 = TutorialSectionModel(
        title = stringResource(R.string.title_4_10_3),
        description = "Use movableContentOf to inspect state after change in a list",
        action = {
            ComingSoonScreen()
//            Tutorial4_10Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_MOVABLE_CONTENT_OF,
            TAG_SNAPSHOT_STATE_LIST,
            TAG_REMEMBER
        ),
        tagColor = StateListColor
    )

    val tutorial4_11_1 = TutorialSectionModel(
        title = stringResource(R.string.title_4_11_1),
        description = "Use SnapshotStateList to trigger recomposition only for updated item",
        action = {
            ComingSoonScreen()
//            Tutorial4_11Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_SNAPSHOT_STATE_LIST,
            TAG_RECOMPOSITION,
            TAG_REMEMBER,
            TAG_STABILITY

        ),
        tagColor = StateListColor
    )

    val tutorial4_11_2 = TutorialSectionModel(
        title = stringResource(R.string.title_4_11_2),
        description = "Use SnapshotStateList to trigger recomposition only for updated item and " +
                "ViewModel callback to have stable lambda.",
        action = {
            ComingSoonScreen()
//            Tutorial4_11Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_SNAPSHOT_STATE_LIST,
            TAG_RECOMPOSITION,
            TAG_REMEMBER,
            TAG_STABILITY

        ),
        tagColor = StateListColor
    )

    val tutorial4_11_3 = TutorialSectionModel(
        title = stringResource(R.string.title_4_11_3),
        description = "Use SnapshotStateList to trigger recomposition only for updated item and " +
                "ViewModel callback to have stable lambda and SnapshotStateList for stability " +
                "in a scope.",
        action = {
            ComingSoonScreen()
//            Tutorial4_11Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_SNAPSHOT_STATE_LIST,
            TAG_RECOMPOSITION,
            TAG_REMEMBER,
            TAG_STABILITY

        ),
        tagColor = StateListColor
    )


    val tutorial4_11_6 = TutorialSectionModel(
        title = stringResource(R.string.title_4_11_6),
        description = "Detect scroll direction of a LazyColumn using LazyListState",
        action = {
            ComingSoonScreen()
//            Tutorial4_11Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_LAZY_COLUMN,
            TAG_REMEMBER,
            TAG_LAZY_LIST_STATE,
            TAG_DERIVED_STATE,
            TAG_SNAPSHOT_FLOW
        ),
        tagColor = StateListColor
    )

    return listOf(
        tutorial4_1_1,
        tutorial4_1_2,
        tutorial4_2_1,
        tutorial4_2_2,
        tutorial4_2_3,
        tutorial4_2_4,
        tutorial4_2_5,
        tutorial4_2_6,
        tutorial4_2_7,
        tutorial4_2_8,
        tutorial4_3,
        tutorial4_4,
        tutorial4_5_1,
        tutorial4_5_2,
        tutorial4_6,
        tutorial4_7_1,
        tutorial4_7_2,
        tutorial4_7_3,
        tutorial4_10_1,
        tutorial4_10_2,
        tutorial4_10_3,
        tutorial4_11_1,
        tutorial4_11_2,
        tutorial4_11_3,
        tutorial4_11_6
    )
}

@Composable
fun createGestureTutorialList(): List<TutorialSectionModel> {

    val tutorial5_1_1 = TutorialSectionModel(
        title = stringResource(R.string.title_5_1_1),
        description = "Use clickable modifier, Indication and InteractionSource." +
                "Indication to clip ripples, or create custom ripple effects. " +
                "Interaction source to listen for click state" +
                "or set state of other composable.",
        action = {
            ComingSoonScreen()
//            Tutorial5_1Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CLICKABLE,
            TAG_REMEMBER_RIPPLE,
            TAG_INDICATION,
            TAG_INTERACTION_SOURCE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_1_2 = TutorialSectionModel(
        title = stringResource(R.string.title_5_1_2),
        description = "Use Interaction source to collect interactions or change scale " +
                "of Composable's based on interaction state.",
        action = {
            ComingSoonScreen()
//            Tutorial5_1Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CLICKABLE,
            TAG_INTERACTION_SOURCE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_1_3 = TutorialSectionModel(
        title = stringResource(R.string.title_5_1_3),
        description = "Use Interaction source to listen for click state" +
                "or set state of other composable.",
        action = {
            ComingSoonScreen()
//            Tutorial5_1Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CLICKABLE,
            TAG_INTERACTION_SOURCE
        ),
        tagColor = GestureListColor
    )
    val tutorial5_2 = TutorialSectionModel(
        title = "5-2 Tap&Drag Gestures",
        description = "Use PointerInput to listen press, tap, long press, drag gestures. " +
                "detectTapGestures is used for listening for tap, longPress, " +
                "doubleYap, and press gestures.\n" +
                "detectDragGestures, detectDragAfterLongPress, " +
                "detectHorizontalDrag, and detectVerticalDrag" +
                "for listening drag gestures.",
        action = {
            ComingSoonScreen()
//            Tutorial5_2Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_POINTER_INPUT,
            TAG_POINTER_INTEROP_FILTER,
            TAG_DETECT_TAP_GESTURES,
            TAG_DETECT_DRAG_GESTURES,
            TAG_ON_PRESS,
            TAG_ON_DOUBLE_TAP,
            TAG_ON_LONG_PRESS,
            TAG_ON_TAP
        ),
        tagColor = GestureListColor
    )

    val tutorial5_3 = TutorialSectionModel(
        title = "5-3 Transform Gestures",
        description = "Use PointerInput to listen for detectTransformGesture " +
                "to get centroid, pan, zoom and rotate params.",
        action = {
            ComingSoonScreen()
//            Tutorial5_3Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_POINTER_INPUT,
            TAG_DETECT_TRANSFORM_GESTURES,
            TAG_CENTROID,
            TAG_PAN,
            TAG_ZOOM,
            TAG_ROTATE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_4_1 = TutorialSectionModel(
        title = "5-4-1 AwaitPointerEventScope1",
        description = "Use AwaitPointerEventScope to get awaitFirstDown for down events, " +
                "waitForUpOrCancellation for up events, and awaitPointerEvent " +
                "for move events with pointers.\n" +
                "awaitTouchSlopOrCancellation to check whether pointer crosses " +
                "touch slap threshold to start drag motion",
        action = {
            ComingSoonScreen()
//            Tutorial5_4Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_WAIT_UP_OR_CANCELLATION,
            TAG_AWAIT_POINTER_EVENT,
            TAG_AWAIT_TOUCH_SLOP_OR_CANCELLATION,
            TAG_AWAIT_DRAG_OR_CANCELLATION
        ),
        tagColor = GestureListColor
    )

    val tutorial5_4_2 = TutorialSectionModel(
        title = "5-4-2 AwaitPointerEventScope2",
        description = "Use AwaitPointerEventScope to get ",
        action = {
            ComingSoonScreen()
//            Tutorial5_4Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_DRAG,
            TAG_HORIZONTAL_DRAG,
            TAG_VERTICAL_DRAG,
            TAG_AWAIT_HORIZONTAL_TOUCH_SLOP_OR_CANCELLATION,
            TAG_AWAIT_VERTICAL_TOUCH_SLOP_OR_CANCELLATION,
        ),
        tagColor = GestureListColor
    )

    val tutorial5_4_3 = TutorialSectionModel(
        title = "5-4-3 Centroid, Zoom, Pan, Rotation",
        description = "Use AwaitPointerEventScope to calculate centroid " +
                "position and size, zoom, pan, and rotation.",
        action = {
            ComingSoonScreen()
//            Tutorial5_4Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_CENTROID,
            TAG_PAN,
            TAG_ZOOM,
            TAG_ROTATE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_4_4 = TutorialSectionModel(
        title = "5-4-4 Long Press Callbacks",
        description = "Use AwaitPointerEventScope to create press and long press start and end " +
                "callbacks.",
        action = {
            ComingSoonScreen()
//            Tutorial5_4Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
        ),
        tagColor = GestureListColor
    )

    val tutorial5_5_1 = TutorialSectionModel(
        title = "5-5-1 Combined Gesture Events",
        description = "Combine pointerInput function and observe how gestures are performed " +
                "when combined with other pointerInput functions",
        action = {
            ComingSoonScreen()
//            Tutorial5_5Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,

            ),
        tagColor = GestureListColor
    )

    val tutorial5_6_1 = TutorialSectionModel(
        title = "5-6-1 Consume Change",
        description = "Consume different type of touch events such as down, " +
                "position change and check if events are consumed.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_POINTER_EVENT,
            TAG_CONSUME,
            TAG_IS_CONSUMED
        ),
        tagColor = GestureListColor
    )
    val tutorial5_6_2 = TutorialSectionModel(
        title = "5-6-2 Gesture Propagation1",
        description = "Consume different type of touch events in Composable in an hierarchy" +
                "to display gesture propagation between parent and children with MOVE gestures.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_POINTER_EVENT,
            TAG_CONSUME,
            TAG_IS_CONSUMED
        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_3 = TutorialSectionModel(
        title = "5-6-3 Gesture Propagation2",
        description = "Consume different type of touch events in Composable in an hierarchy" +
                "to display gesture propagation between parent and children with DRAG gestures.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_TOUCH_SLOP_OR_CANCELLATION,
            TAG_DRAG,
            TAG_CONSUME,
            TAG_IS_CONSUMED
        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_4 = TutorialSectionModel(
        title = "5-6-4 Transformation Propagation",
        description = "Consume events to rotate, zoom, move or apply drag or " +
                "move events on Composables.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_TOUCH_SLOP_OR_CANCELLATION,
            TAG_CONSUME,
            TAG_IS_CONSUMED
        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_5 = TutorialSectionModel(
        title = "5-6-5 PointerEventPass1",
        description = "Change PointerEventPass to change direction of event propagation with " +
                "child parent relationship.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_POINTER_EVENT_PASS

        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_6 = TutorialSectionModel(
        title = "5-6-6 PointerEventPass2",
        description = "Change PointerEventPass to change direction of event propagation " +
                "with multiple PointerInput.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_POINTER_EVENT_PASS

        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_7 = TutorialSectionModel(
        title = "5-6-7 PointerEventPass3",
        description = "Change PointerEventPass to change direction of" +
                " drag or touch gestures.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen7()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_POINTER_EVENT_PASS

        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_8 = TutorialSectionModel(
        title = "5-6-8 PointerEventPass4",
        description = "Change PointerEventPass to change drag and touch order.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen8()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_POINTER_EVENT_PASS

        ),
        tagColor = GestureListColor
    )

    val tutorial5_6_9 = TutorialSectionModel(
        title = "5-6-9 PointerEventPass5",
        description = "Change PointerEventPass with awaitPointerEvent to get pinch/zoom " +
                "gesture or click/long lick first and consume before click based on pass.",
        action = {
            ComingSoonScreen()
//            Tutorial5_6Screen9()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_POINTER_EVENT,
            TAG_POINTER_EVENT_PASS

        ),
        tagColor = GestureListColor
    )

    val tutorial5_7_1 = TutorialSectionModel(
        title = "5-7-1 Ripple Gesture Events",
        description = "Implement ripple effect on touch position with gestures.",
        action = {
            ComingSoonScreen()
//            Tutorial5_7Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_INDICATION,
            TAG_INTERACTION_SOURCE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_8_1 = TutorialSectionModel(
        title = "5-8-1 Drag Modifier",
        description = "Use drag Modifier, rememberDraggableState",
        action = {
            ComingSoonScreen()
//            Tutorial5_8Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_DRAGGABLE,
            TAG_REMEMBER_DRAGGABLE_STATE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_8_2 = TutorialSectionModel(
        title = "5-8-2 Swipe Modifier",
        description = "Use swipe modifier, rememberSwipeableState, FractionalThreshold to " +
                "create swipeable Composables.",
        action = {
            ComingSoonScreen()
//            Tutorial5_8Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SWIPEABLE,
            TAG_REMEMBER_SWIPEABLE_STATE,
            TAG_FRACTIONAL_THRESHHOLD
        ),
        tagColor = GestureListColor
    )

    val tutorial5_9_1 = TutorialSectionModel(
        title = "5-9-1 Scrollable Modifier",
        description = "Implement scrolling behavior.",
        action = {
            ComingSoonScreen()
//            Tutorial5_9Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_SCROLLABLE,
            TAG_REMEMBER_SCROLL_STATE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_9_2 = TutorialSectionModel(
        title = "5-9-2 Nested Scrolling1",
        description = "Implement nested scrolling using only vertical scrolling " +
                "and rememberScrollState.",
        action = {
            ComingSoonScreen()
//            Tutorial5_9Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_REMEMBER_SCROLL_STATE
        ),
        tagColor = GestureListColor
    )

    val tutorial5_9_3 = TutorialSectionModel(
        title = "5-9-3 Nested Scrolling2",
        description = "This tutorial shows how and when functions, such as onPreScroll, of " +
                "NestedScrollConnection called when Modifier.nestedScroll is used.",
        action = {
            ComingSoonScreen()
//            Tutorial5_9Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_NESTED_SCROLL,
            TAG_NESTED_SCROLL_CONNECTION
        ),
        tagColor = GestureListColor
    )

    val tutorial5_9_5 = TutorialSectionModel(
        title = "5-9-5 Draggable&Nested Scroll",
        description = "Build a Modifier.draggable " +
                "(which doesn't have nested scroll build in by default)" +
                "and add nested scroll support our component that contains draggable",
        action = {
            ComingSoonScreen()
//            Tutorial5_9Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_NESTED_SCROLL,
            TAG_NESTED_SCROLL_CONNECTION,
            TAG_NESTED_SCROLL_DISPATCHER,
            TAG_DRAGGABLE,
        ),
        tagColor = GestureListColor
    )

    val tutorial5_9_6 = TutorialSectionModel(
        title = "5-9-6 Collapsing TopAppBar",
        description = "Create a collapsing TopAppBar using Modifier.nestedScroll " +
                "and NestedScrollConnection",
        action = {
            ComingSoonScreen()
//            Tutorial5_9Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_NESTED_SCROLL,
            TAG_NESTED_SCROLL_CONNECTION
        ),
        tagColor = GestureListColor
    )

    val tutorial5_9_7 = TutorialSectionModel(
        title = "5-9-7 Collapsing TopAppBar2",
        description = "Create a collapsing TopAppBar using Modifier.nestedScroll " +
                "and NestedScrollConnection and change scroll with ScrollState",
        action = {
            ComingSoonScreen()
//            Tutorial5_9Screen7()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_NESTED_SCROLL,
            TAG_NESTED_SCROLL_CONNECTION,

            ),
        tagColor = GestureListColor
    )

    val tutorial5_10_1 = TutorialSectionModel(
        title = "5-10-1 Image Touch Detection",
        description = "Detect touch position on image and get color at touch position.",
        action = {
            ComingSoonScreen()
//            Tutorial5_10_1Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_IMAGE,
        ),
        tagColor = GestureListColor
    )

    val tutorial5_11 = TutorialSectionModel(
        title = "5-11 Zoomable LazyColum",
        description = "Zoom images inside a LazyColum.",
        action = {
            ComingSoonScreen()
//            Tutorial5_11Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_POINTER_EVENT,
            TAG_IMAGE,
            TAG_ZOOM,
            TAG_SCALE,
        ),
        tagColor = GestureListColor
    )



    return listOf(
        tutorial5_1_1,
        tutorial5_1_2,
        tutorial5_1_3,
        tutorial5_2,
        tutorial5_3,
        tutorial5_4_1,
        tutorial5_4_2,
        tutorial5_4_3,
        tutorial5_4_4,
        tutorial5_5_1,
        tutorial5_6_1,
        tutorial5_6_2,
        tutorial5_6_3,
        tutorial5_6_4,
        tutorial5_6_5,
        tutorial5_6_6,
        tutorial5_6_7,
        tutorial5_6_8,
        tutorial5_6_9,
        tutorial5_7_1,
        tutorial5_8_1,
        tutorial5_8_2,
        tutorial5_9_1,
        tutorial5_9_2,
        tutorial5_9_3,
        tutorial5_9_5,
        tutorial5_9_6,
        tutorial5_9_7,
        tutorial5_10_1,
        tutorial5_11
    )
}

@Composable
fun createGraphicsTutorialList(): List<TutorialSectionModel> {

    val tutorial6_1_1 = TutorialSectionModel(
        title = "6-1-1 Canvas Basics",
        description = "Use canvas draw basic shapes like line, circle, rectangle," +
                "and points with different attributes such as style, stroke cap, brush.",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH_EFFECT,
            TAG_BRUSH
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_1_2 = TutorialSectionModel(
        title = "6-1-2 Canvas Basics2",
        description = "Use canvas to draw arc, with PathEffect, StrokeCap, " +
                "StrokeJoin, miter and other attributes and draw images with src, dst attributes",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH_EFFECT,
            TAG_BRUSH
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_1_3 = TutorialSectionModel(
        title = "6-1-3 Canvas Paths",
        description = "Use canvas to draw path using absolute and relative positions, adding " +
                "arc to path, drawing custom paths, progress, polygons, quads, and cubic. ",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_PATH_EFFECT,
            TAG_BRUSH
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_1_4 = TutorialSectionModel(
        title = "6-1-4 Canvas Path Ops",
        description = "Use canvas to clip paths, or canvas using path, or rectangle with " +
                "operations such as Difference, Intersect, Union, Xor, or ReverseDifference.",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen4()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_PATH_EFFECT,
            TAG_BRUSH,
            TAG_PATH_OPERATION,
            TAG_CLIP_PATH
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_1_5 = TutorialSectionModel(
        title = "6-1-5 Canvas Path Segments",
        description = "Use canvas to flatten Android Path to path segments and display " +
                "PathSegment start and/or end points.",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen5()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_PATH_SEGMENT,
            TAG_PATH_OPERATION,
            TAG_CLIP_PATH,
            TAG_PATH_EFFECT
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_1_6 = TutorialSectionModel(
        title = "6-1-6 Canvas PathEffect",
        description = "Use PathEffects such as dashedPathEffect, cornerPathEffect, " +
                "chainPathEffect and  stompedPathEffect" +
                "to draw shapes or add path effects around Composables.",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen6()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_PATH_EFFECT,
            TAG_INFINITE_TRANSITION
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_1_7 = TutorialSectionModel(
        title = "6-1-7 Canvas Stroke Change",
        description = "Draw stroke between edges of Canvas, drawing inwards and outwards direction.",
        action = {
            ComingSoonScreen()
//            Tutorial6_1Screen7()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_2_1 = TutorialSectionModel(
        title = "6-2-1 Blend Modes(Porter-Duff)",
        description = "Use blend(Porter-Duff) modes to change drawing source/destination " +
                "or clip based on blend mode, and manipulate pixels.",
        action = {
            ComingSoonScreen()
//            Tutorial6_2Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_BLEND_MODE,
            TAG_PATH
        ),
        tagColor = GraphicsListColor
    )


    val tutorial6_2_2 = TutorialSectionModel(
        title = "6-2-2 Canvas(ImageBitmap) & Paint",
        description = "Use blend(Porter-Duff) modes with androidx.compose.ui.graphics.Canvas " +
                "to change drawing source/destination " +
                "or clip based on blend mode, and manipulate pixels.",
        action = {
            ComingSoonScreen()
//            Tutorial6_2Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_ACTUAL_CANVAS,
            TAG_PAINT,
            TAG_BLEND_MODE,
            TAG_PATH
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_2_3 = TutorialSectionModel(
        title = "6-2-3 Multi-Color VectorDrawable",
        description = "Use blend(Porter-Duff) to create multi colored VectorDrawables or" +
                " VectorDrawables with fill/empty animations",
        action = {
            ComingSoonScreen()
//            Tutorial6_2Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_BLEND_MODE,
            TAG_VECTOR_DRAWABLE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_4_0 = TutorialSectionModel(
        title = "6-4-0 Canvas Touch Events",
        description = "Test touch down, move and up events and invocations on Canvas",
        action = {
            ComingSoonScreen()
//            Tutorial6_4Screen0()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_TOUCH_SLOP_OR_CANCELLATION,
            TAG_AWAIT_DRAG_OR_CANCELLATION
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_4_1 = TutorialSectionModel(
        title = "6-4-1 Draw with Touch",
        description = "Draw to canvas using touch down, move and up events, or " +
                "drag gestures with properties such as color, stroke width," +
                " or draw on image.",
        action = {
            ComingSoonScreen()
//            Tutorial6_4Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_AWAIT_TOUCH_SLOP_OR_CANCELLATION,
            TAG_AWAIT_DRAG_OR_CANCELLATION,
            TAG_BLEND_MODE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_4_2 = TutorialSectionModel(
        title = "6-4-2 Drawing App",
        description = "Draw to canvas using touch down, move and up events using array of " +
                "paths to have erase, undo, redo actions " +
                "and set properties for each path separately.",
        action = {
            ComingSoonScreen()
//            Tutorial6_4Screen2()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_BLEND_MODE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_4_3 = TutorialSectionModel(
        title = "6-4-3 Canvas Touch Positions",
        description = "Detect touch position on canvas and if it's inside bounds of any " +
                "drawing, circle in this sample, move it",
        action = {
            ComingSoonScreen()
//            Tutorial6_4Screen3()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_PATH,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_5 = TutorialSectionModel(
        title = "6-5 Color Picker",
        description = "Color Picker that calculates angle from center and gets a color " +
                "using hue and returns a color as in HSL or RGB color model.",
        action = {
            ComingSoonScreen()
//            Tutorial6_5Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_DRAW_SCOPE,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_BLEND_MODE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_6 = TutorialSectionModel(
        title = "6-6 Scale/Translation Edit",
        description = "Editable Composable that changes position and scale when touched and dragged" +
                "from handles or changes position when touched inside.",
        action = {
            ComingSoonScreen()
//            Tutorial6_6Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_SCALE,
            TAG_TRANSLATE,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_7 = TutorialSectionModel(
        title = "6-7 Gooey Effect",
        description = "Create basic Gooey Effect with static circles " +
                "and one with moves with touch",
        action = {
            ComingSoonScreen()
//            Tutorial6_7Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_GOOEY,
            TAG_TRANSLATE,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_8_1 = TutorialSectionModel(
        title = "6-8-1 Cutout Arc Shape",
        description = "Use Path.cubicTo, Path.arcTo to draw cutout shape.",
        action = {
            ComingSoonScreen()
//            Tutorial6_8Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_PATH,
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_9_1 = TutorialSectionModel(
        title = "6-9-1 Neon Glow Effect",
        description = "Use paint.asFrameworkPaint() to create blur effect to mimic neon glow " +
                "and infinite animation to dim and glow infinitely",
        action = {
            ComingSoonScreen()
//            Tutorial6_9Screen1()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_NEON_GLOW,
            TAG_INFINITE_TRANSITION
        ),
        tagColor = GraphicsListColor
    )


    val tutorial6_10 = TutorialSectionModel(
        title = "6-10 Ripple on Canvas",
        description = "Create ripple effect when user touches specific area using Animatable and" +
                "keyFrames to create ripple effect",
        action = {
            ComingSoonScreen()
//            Tutorial6_10Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_INDICATION,
            TAG_POINTER_INPUT,
            TAG_AWAIT_POINTER_EVENT_SCOPE,
            TAG_POINTER_INPUT_CHANGE,
            TAG_AWAIT_FIRST_DOWN,
            TAG_WAIT_UP_OR_CANCELLATION
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_11 = TutorialSectionModel(
        title = "6-11 Canvas Erase Percentage",
        description = "Use blend(Porter-Duff) modes with androidx.compose.ui.graphics.Canvas " +
                "to erase and compare pixels with erased Bitmap to find out " +
                "percentage of erased area.",
        action = {
            ComingSoonScreen()
//            Tutorial6_11Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_ACTUAL_CANVAS,
            TAG_PAINT,
            TAG_BLEND_MODE,
            TAG_PATH
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_12 = TutorialSectionModel(
        title = "6-12 Diagonal Price Tag",
        description = "Use Modifier.drawWithContent, Modifier.composed, " +
                "TextMeasurer to draw diagonal price tag with shimmer effect",
        action = {
            ComingSoonScreen()
//            Tutorial6_12Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TEXT_MEASURER,
            TAG_IMAGE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSED_MODIFIER,
            TAG_CANVAS,
            TAG_BRUSH,
            TAG_INFINITE_TRANSITION
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_13 = TutorialSectionModel(
        title = "6-13 Timer with Border",
        description = "Use Path segments to create path with progress to display remaining time",
        action = {
            ComingSoonScreen()
//            Tutorial6_13Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_PATH,
            TAG_PATH_SEGMENT,
            TAG_CANVAS,
            TAG_ANIMATE_FLOAT_AS_STATE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_14 = TutorialSectionModel(
        title = "6-14 Pie Chart with Text",
        description = "Draw pie chart with dividers, and text between angles.",
        action = {
            ComingSoonScreen()
//            Tutorial6_14Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TEXT_MEASURER,
            TAG_CANVAS,
            TAG_ANIMATABLE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_15 = TutorialSectionModel(
        title = "6-15 Pie Chart with Touch Animation",
        description = "Animate Pie Chart on touch and get data of touched section.",
        action = {
            ComingSoonScreen()
//            Tutorial6_15Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TEXT_MEASURER,
            TAG_CANVAS,
            TAG_ANIMATABLE,
            TAG_DETECT_TAP_GESTURES
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_16 = TutorialSectionModel(
        title = "6-16 Segmented Border",
        description = "Draw border that divides Composable into segments.",
        action = {
            ComingSoonScreen()
//            Tutorial6_16Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSED_MODIFIER,
            TAG_CANVAS,
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_17 = TutorialSectionModel(
        title = "6-17 Animated Rainbow Border",
        description = "Draw animated rainbow color border using BlendMode.SrcIn" +
                "and Modifier.drawWithCache",
        action = {
            ComingSoonScreen()
//            Tutorial6_17Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSED_MODIFIER,
            TAG_CANVAS,
            TAG_BRUSH,
            TAG_BLEND_MODE,
            TAG_INFINITE_TRANSITION
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_18 = TutorialSectionModel(
        title = "6-18 Shimmer Effect",
        description = "Draw shimmer Effect using Brush and infinite animation",
        action = {
            ComingSoonScreen()
//            Tutorial6_18Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_MODIFIER,
            TAG_COMPOSED_MODIFIER,
            TAG_CANVAS,
            TAG_BRUSH,
            TAG_INFINITE_TRANSITION
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_19 = TutorialSectionModel(
        title = "6-19 Custom Carousel",
        description = "Custom carousel with gestures",
        action = {
            ComingSoonScreen()
//            Tutorial6_19Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_COMPOSE_CLICKABLE,
            TAG_SCROLLABLE,
            TAG_HORIZONTAL_DRAG,
            TAG_COMPOSE_MODIFIER_GRAPHICS_LAYER
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_20 = TutorialSectionModel(
        title = "6-20 PathParser and PathMeasure",
        description = "Create Path from string and animate segments via PathMeasure",
        action = {
            ComingSoonScreen()
//            Tutorial6_20Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_PATH,
            TAG_PATH_PARSER,
            TAG_PATH_SEGMENT,
            TAG_ANIMATE_FLOAT_AS_STATE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_21 = TutorialSectionModel(
        title = "6-21 Constant Velocity Animation",
        description = "Create constant time animation.",
        action = {
            ComingSoonScreen()
//            Tutorial6_21Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_ANIMATE_OFFSET_AS_STATE,
            TAG_ANIMATE_VALUE_AS_STATE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_22 = TutorialSectionModel(
        title = "6-22 Arc fill clock",
        description = "Create a clock and set time via LaunchedEffect.",
        action = {
            ComingSoonScreen()
//            Tutorial6_22Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_LAUNCHED_EFFECT,
            TAG_REMEMBER_UPDATED

        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_23 = TutorialSectionModel(
        title = "6-23 Tab/Switch Animation",
        description = "Create a Tab/Switch with fluent blending text and shadow.",
        action = {
            ComingSoonScreen()
//            Tutorial6_23Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_BLEND_MODE,
            TAG_ANIMATE_DP_AS_STATE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_24 = TutorialSectionModel(
        title = "6-24 Projection change with Lerp",
        description = "Animate projection of rotating circle between inner and " +
                "outer projection with lerp function.",
        action = {
            ComingSoonScreen()
//            Tutorial6_24Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_CANVAS,
            TAG_INFINITE_TRANSITION,
            TAG_ANIMATE_FLOAT_AS_STATE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_25 = TutorialSectionModel(
        title = "6-25 BeforeAfter Layout",
        description = "Create animatable BeforeAfter layout with Generic or BlendMode.",
        action = {
            ComingSoonScreen()
//            Tutorial6_25Screen()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_BLEND_MODE,
            TAG_COMPOSE_SHAPE,
            TAG_INFINITE_TRANSITION,
            TAG_ANIMATE_FLOAT_AS_STATE
        ),
        tagColor = GraphicsListColor
    )

    val tutorial6_29 = TutorialSectionModel(
        title = "6-29 Pie Chart with Tool tip",
        description = "Animate Pie Chart with tool tip.",
        action = {
            ComingSoonScreen()
//            Tutorial6_29ToolTipPieChart()
        },
        tags = listOf(
            TAG_COMPOSE,
            TAG_TEXT_MEASURER,
            TAG_CANVAS,
            TAG_ANIMATABLE,
            TAG_DETECT_TAP_GESTURES
        ),
        tagColor = GraphicsListColor
    )

    return listOf(
        tutorial6_1_1,
        tutorial6_1_2,
        tutorial6_1_3,
        tutorial6_1_4,
        tutorial6_1_5,
        tutorial6_1_6,
        tutorial6_1_7,
        tutorial6_2_1,
        tutorial6_2_2,
        tutorial6_2_3,
        tutorial6_4_0,
        tutorial6_4_1,
        tutorial6_4_2,
        tutorial6_4_3,
        tutorial6_5,
        tutorial6_6,
        tutorial6_7,
        tutorial6_8_1,
        tutorial6_9_1,
        tutorial6_10,
        tutorial6_11,
        tutorial6_12,
        tutorial6_13,
        tutorial6_14,
        tutorial6_15,
        tutorial6_16,
        tutorial6_17,
        tutorial6_18,
        tutorial6_19,
        tutorial6_20,
        tutorial6_21,
        tutorial6_22,
        tutorial6_23,
        tutorial6_24,
        tutorial6_25,
        tutorial6_29
    )
}