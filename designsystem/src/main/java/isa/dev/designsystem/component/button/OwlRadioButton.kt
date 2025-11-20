package isa.dev.designsystem.component.button

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import isa.dev.designsystem.component.text.OwlText
import isa.dev.designsystem.theme.DarkBackground
import isa.dev.designsystem.theme.DarkNavyBlue
import isa.dev.designsystem.theme.NavyBlue
import isa.dev.designsystem.theme.OwlTheme

@Composable
fun OwlRadioButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    enabled: Boolean = true,
    selected: Boolean,
    colors: RadioButtonColors = RadioButtonColors(
        selectedColor = NavyBlue,
        unselectedColor = DarkNavyBlue,
        disabledSelectedColor = DarkBackground,
        disabledUnselectedColor = DarkBackground
    ),
    interactionSource: MutableInteractionSource? = null,
    onClick: () -> Unit
) {
    if (text != null) {
        Row(modifier = Modifier.fillMaxWidth()) {
            RadioButton(
                modifier = modifier,
                selected = selected,
                onClick = onClick,
                colors = colors,
                enabled = enabled,
                interactionSource = interactionSource
            )

            OwlText(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = text
            )
        }
    } else {
        RadioButton(
            modifier = modifier,
            selected = selected,
            onClick = onClick,
            colors = colors,
            enabled = enabled,
            interactionSource = interactionSource
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Light Mode"
)
@Composable
private fun OwlRadioButtonLightPreview() {
    OwlTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            OwlRadioButton(
                onClick = {},
                selected = false,
            )
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Night Mode"
)
@Composable
private fun OwlRadioButtonNightPreview() {
    OwlTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            LazyColumn {
                item {
                    OwlRadioButton(
                        text = "Button",
                        selected = true,
                        onClick = {},
                    )
                }

                item {
                    OwlRadioButton(
                        text = "Button",
                        selected = true,
                        onClick = {},
                    )
                }

                item {
                    OwlRadioButton(
                        text = "Button",
                        selected = true,
                        onClick = {},
                    )
                }
            }
        }
    }
}
