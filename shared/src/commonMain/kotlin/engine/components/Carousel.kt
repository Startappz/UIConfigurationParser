package engine.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import model.ItemView
import model.UiConfigurationContainerData
import model.UiConfigurationContainerDataItem

object Carousel {
    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun Carousel(
        itemType: ItemView,
        data: UiConfigurationContainerData,
        content: @Composable (itemType: ItemView, page: Int) -> Unit,
    ) {
        HorizontalPager(
            pageCount = data.items.size,
            pageContent = {
                content(itemType, it)
            }
        )
    }


    @Composable
    fun CarouselItem(
        data: UiConfigurationContainerDataItem,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = data.title)
            Text(text = data.description)
        }
    }
}
