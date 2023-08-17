package engine.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import model.ItemView
import model.UiConfigurationContainerData
import model.UiConfigurationContainerDataItem

object Grid {
    @Composable
    fun Grid(
        itemType: ItemView,
        data: UiConfigurationContainerData,
        itemCountPerRow: Int = 1,
        content: @Composable (itemType: ItemView, page: Int) -> Unit,
    ) {
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth(),
            columns = GridCells.Fixed(itemCountPerRow),
        ) {
            items(data.items.size) {
                content(itemType, it)
            }
        }
    }


    @Composable
    fun GridItem(
        data: UiConfigurationContainerDataItem,
    ) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .size(width = 100.dp, height = 90.dp)
                .background(color = Color.Gray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = data.title)
        }
    }
}
