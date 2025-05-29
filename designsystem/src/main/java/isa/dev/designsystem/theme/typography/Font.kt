package isa.dev.designsystem.theme.typography

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import isa.dev.designsystem.R

/* This font is the default for the DesignSystem,
therefore, if the project doesn't override it
these are the fontFamily that will take place instead
 */

val Inter = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_bold, FontWeight.Bold)
)