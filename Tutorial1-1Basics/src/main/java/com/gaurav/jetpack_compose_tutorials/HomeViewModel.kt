package com.gaurav.jetpack_compose_tutorials

import androidx.lifecycle.ViewModel
import com.gaurav.jetpack_compose_tutorials.model.SuggestionModel
import com.gaurav.jetpack_compose_tutorials.model.TutorialSectionModel

class HomeViewModel : ViewModel() {

    val tutorialList = mutableListOf<List<TutorialSectionModel>>()

    fun getTutorials(query: String): List<TutorialSectionModel> {
        val filteredList = linkedSetOf<TutorialSectionModel>()

        tutorialList.forEach { list: List<TutorialSectionModel> ->

            list.forEach { tutorialSectionModel ->

                if (tutorialSectionModel.title.contains(query, ignoreCase = true)) {
                    filteredList.add(tutorialSectionModel)
                }

                if (tutorialSectionModel.description.contains(query, ignoreCase = true)) {
                    filteredList.add(tutorialSectionModel)
                }

                tutorialSectionModel.tags.forEach {
                    if (it.contains(query, ignoreCase = true)) {
                        filteredList.add(tutorialSectionModel)
                    }
                }
            }

        }
        return filteredList.toList()
    }
}

val suggestionList = listOf(
    SuggestionModel("Modifier"),
    SuggestionModel("Row"),
    SuggestionModel("Column"),
    SuggestionModel("BottomSheet"),
    SuggestionModel("Dialog"),
    SuggestionModel("Checkbox"),
    SuggestionModel("Layout"),
    SuggestionModel("Modifier"),
    SuggestionModel("SubcomposeLayout"),
    SuggestionModel("Recomposition"),
    SuggestionModel("SideEffect"),
    SuggestionModel("PointerInput"),
    SuggestionModel("AwaitPointerEventScope"),
    SuggestionModel("Gesture"),
    SuggestionModel("Drag"),
    SuggestionModel("Transform"),
    SuggestionModel("Canvas"),
    SuggestionModel("DrawScope"),
    SuggestionModel("Path"),
    SuggestionModel("PathEffect"),
    SuggestionModel("PathOperation"),
    SuggestionModel("Blend Mode"),
)