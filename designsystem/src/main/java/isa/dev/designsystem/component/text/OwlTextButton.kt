package isa.dev.designsystem.component.text

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import isa.dev.designsystem.theme.OwlTheme

@Composable
fun OwlTextButton(

) {

}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Light Mode"
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
private fun OwlTextButtonPreview() {
    OwlTheme {
        OwlTextButton()
    }
}