package isa.dev.designsystem.component.text

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import isa.dev.designsystem.theme.OwlTheme
import isa.dev.designsystem.theme.typography.TextType

@Composable
fun OwlText(
    modifier: Modifier = Modifier,
    text: String,
    textType: TextType = TextType.Body.Medium,
    textStyle: TextStyle = textType.toTextStyle(),
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyle,
        color = color,
        textAlign = textAlign,
        maxLines = maxLines,
        overflow = overflow
    )
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Light Mode"
)
@Composable
private fun OwlTextLightPreview() {
    OwlTheme(useDarkTheme = false) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            OwlText(text = "This is a text")
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
private fun OwlTextDarkPreview() {
    OwlTheme(useDarkTheme = true) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            OwlText(text = "This is a text")
        }
    }
}


