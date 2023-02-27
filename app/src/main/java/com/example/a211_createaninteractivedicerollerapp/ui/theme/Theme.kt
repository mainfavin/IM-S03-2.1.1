package com.example.diceroller.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.example.a211_createaninteractivedicerollerapp.ui.theme.Purple200
import com.example.a211_createaninteractivedicerollerapp.ui.theme.Purple500
import com.example.a211_createaninteractivedicerollerapp.ui.theme.Purple700
import com.example.a211_createaninteractivedicerollerapp.ui.theme.Teal200
import kotlin.text.Typography as Typography1

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun DiceRollerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography =  MaterialTheme.typography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}