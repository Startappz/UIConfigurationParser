package engine

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import engine.components.Carousel
import engine.components.Grid
import model.Container
import model.ContainerTypes
import model.ItemType
import model.ItemView
import model.UiConfigurationContainerData
import model.UiConfigurationContainerDataItem

object DisplayManager {

    @Composable
    fun Display(map: Map<Container, UiConfigurationContainerData>) {
        Column(
            modifier = Modifier
        ) {
            map.forEach { (container, data) ->
                Display(container, data)
            }
        }
    }


    @Composable
    private fun Display(container: Container, data: UiConfigurationContainerData) {
        when (container.type) {
            ContainerTypes.CarouselView.name -> Carousel.Carousel(
                itemType = container.itemView,
                data = data,
                content = { type, page ->
                    ContainerItem(type, data.items[page])
                }
            )

            ContainerTypes.GridView.name -> Grid.Grid(
                itemType = container.itemView,
                itemCountPerRow = container.containerLayout.itemCountPerRow ?: 1,
                data = data,
                content = { type, page -> ContainerItem(type, data.items[page]) }
            )

            ContainerTypes.CardView.name -> {}
            else -> {}
        }
    }

    @Composable
    private fun ContainerItem(
        itemType: ItemView,
        data: UiConfigurationContainerDataItem,
    ) {
        when (itemType.type) {
            ItemType.Card.type -> {}
            ItemType.Carousel.type -> Carousel.CarouselItem(data)
            ItemType.Grid.type -> Grid.GridItem(data)
            else -> {}
        }
    }

}