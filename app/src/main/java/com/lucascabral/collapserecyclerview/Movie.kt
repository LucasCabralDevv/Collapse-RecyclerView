package com.lucascabral.collapserecyclerview

data class Movie(
    val title: String,
    val rating: String,
    val year: String,
    val plot: String,
    var expanded: Boolean = false
)
