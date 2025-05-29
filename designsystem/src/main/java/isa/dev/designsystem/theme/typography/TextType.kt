package isa.dev.designsystem.theme.typography

import androidx.compose.ui.text.TextStyle

sealed class TextType {
    sealed class Headline : TextType() {
        data object Large : Headline()
        data object Medium : Headline()
        data object Small : Headline()
    }

    sealed class Body : TextType() {
        data object Large : Body()
        data object Medium : Body()
        data object Small : Body()
    }

    sealed class Label : TextType() {
        data object Large : Label()
        data object Medium : Label()
        data object Small : Label()
    }

    fun toTextStyle(): TextStyle = when (this) {
        is Headline.Large -> OwlTypography.headlineLarge
        is Headline.Medium -> OwlTypography.headlineMedium
        is Headline.Small -> OwlTypography.headlineSmall
        is Body.Large -> OwlTypography.bodyLarge
        is Body.Medium -> OwlTypography.bodyMedium
        is Body.Small -> OwlTypography.bodySmall
        is Label.Large -> OwlTypography.labelLarge
        is Label.Medium -> OwlTypography.labelMedium
        is Label.Small -> OwlTypography.labelSmall
    }
}
