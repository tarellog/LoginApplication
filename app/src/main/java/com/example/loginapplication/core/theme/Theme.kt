package com.example.loginapplication.core.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private val dimensions = Dimensions()
private val LocalDimens = staticCompositionLocalOf { dimensions }

@Composable
fun Theme(
    content: @Composable () -> Unit,
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(
        LocalDimens provides dimensionSet,
        content = content
    )
}

object Theme {
    val dimens: Dimensions
    @Composable
    get() = LocalDimens.current
}