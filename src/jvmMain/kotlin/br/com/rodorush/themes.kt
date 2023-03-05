package br.com.rodorush

import androidx.compose.material.darkColors
import br.com.rodorush.MyColors

object MyTheme {
    val colors = darkColors(
        primary = MyColors.primary,
        primaryVariant = MyColors.primaryVariant,
        secondary = MyColors.secondary,
        secondaryVariant = MyColors.secondaryVariant,
        background = MyColors.background,
        surface = MyColors.surface,
        onPrimary = MyColors.onPrimary,
        onSecondary = MyColors.onSecondary,
        onBackground = MyColors.onBackground,
        onSurface = MyColors.onSurface
    )
}