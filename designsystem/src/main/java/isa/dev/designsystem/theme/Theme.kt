package isa.dev.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import isa.dev.designsystem.theme.typography.OwlTypography

/* This is the default Theme for the DesignSystem,
therefore, if the project doesn't override it
these are the colors that will take place instead
 */

private val LightColorScheme = lightColorScheme(
    primary = NavyBlue,
    onPrimary = White,
    background = LightBackground,
    onBackground = LightOnBackground,
    surface = LightSurface,
    onSurface = LightOnSurface,
    secondary = LightSecondary,
    onSecondary = White,
    error = Error,
    onError = White,
)

private val DarkColorScheme = darkColorScheme(
    primary = DarkNavyBlue,
    onPrimary = White,
    background = DarkBackground,
    onBackground = DarkOnBackground,
    surface = DarkSurface,
    onSurface = DarkOnSurface,
    secondary = DarkSecondary,
    onSecondary = DarkNavyBlue,
    error = Error,
    onError = Black,
)

@Composable
fun OwlTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (useDarkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = OwlTypography,
        content = content
    )
}
