package com.example.grid_compose

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class Course(
    @StringRes val name_of_course:Int,
    val available_seats:Int,
    @DrawableRes val Image:Int
    )