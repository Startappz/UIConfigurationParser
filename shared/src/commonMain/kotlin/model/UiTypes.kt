package model

enum class ContainerTypes {
    CarouselView,
    GridView,
    CardView
}

enum class ItemType(val type: String) {
    Carousel("Carousel_Item"),
    Grid("Grid_Item"),
    Card("Card_Item"),
}