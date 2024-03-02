package com.gaurav.jetpack_compose_tutorials.model

data class SuggestionModel(val tag: String) {
    val id = tag.hashCode()
}
