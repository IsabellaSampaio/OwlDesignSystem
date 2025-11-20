package isa.dev.designsystem.component.search

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import isa.dev.designsystem.theme.DarkNavyBlue
import isa.dev.designsystem.theme.NavyBlue
import isa.dev.designsystem.theme.OwlTheme
import isa.dev.designsystem.theme.typography.TextType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OwlSearchBar(
    modifier: Modifier = Modifier,
    searchQuery: String = "",
    shouldExpand: Boolean = false,
    shape: Shape = SearchBarDefaults.inputFieldShape,
    colors: SearchBarColors = SearchBarDefaults.colors(),
    tonalElevation: Dp = SearchBarDefaults.TonalElevation,
    shadowElevation: Dp = SearchBarDefaults.ShadowElevation,
    onSearch: (String) -> Unit,
    onClear: () -> Unit,
) {
    SearchBar(
        modifier = modifier,
        expanded = shouldExpand,
        colors = colors,
        shape = shape,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation,
        onExpandedChange = {},
        inputField = {
            TextField(
                value = searchQuery,
                textStyle = TextType.Body.Medium.toTextStyle(),
                onValueChange = onSearch,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search icon",
                        tint = NavyBlue
                    )
                },
                trailingIcon = {
                    Icon(
                        modifier = Modifier.clickable { onClear.invoke() },
                        imageVector = Icons.Default.Clear,
                        tint = DarkNavyBlue,
                        contentDescription = "Clear icon"
                    )
                }
            )
        }
    ) {}
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Light Mode"
)
@Composable
private fun OwlSearchBarLightPreview() {
    OwlTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            OwlSearchBar(
                searchQuery = "Search",
                onSearch = {},
                onClear = {}
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Night Mode"
)
@Composable
private fun OwlSearchBarNightPreview() {
    OwlTheme {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            OwlSearchBar(
                onSearch = {},
                onClear = {}
            )
        }
    }
}