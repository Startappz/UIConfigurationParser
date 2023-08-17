package engine.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import model.ItemView
import model.UiConfigurationContainerData
import model.UiConfigurationContainerDataItem

object Card {
    @Composable
    fun CardItem(
        itemType: ItemView,
        data: UiConfigurationContainerData,
        content: @Composable (itemType: ItemView, page: Int) -> Unit,
    ) {
        Card(
            modifier = Modifier,

        ) {

        }
    }

//    @OptIn(ExperimentalLayoutApi::class)
//    @Composable
//    fun ProductItem(
//        modifier: Modifier = Modifier,
//        product: ProductItemUiState,
//        navigateToProductDetails: (String) -> Unit,
//    ) {
//        Card(
//            modifier = modifier
//                .fillMaxWidth()
//                .padding(vertical = 12.dp, horizontal = 16.dp)
//                .clickable {  },
//        ) {
//            Row {
//                Column(
//                    modifier = Modifier
//                        .width(128.dp)
//                        .padding(end = 16.dp),
//
//                    ) {
//                    KamelImage(
//                        modifier = Modifier.size(width = 98.dp, height = 123.dp),
//                        resource = asyncPainterResource(product.thumbnailUrl),
//                        contentDescription = product.name,
//                        onLoading = { CircularProgressIndicator(it) },
//                        onFailure = { Icon(
//                            modifier = Modifier.size(width = 98.dp, height = 123.dp),
//                            imageVector = Icons.Default.Close,
//                            contentDescription = null
//                        ) }
//                    )
//
//                    Spacer(modifier = Modifier.height(18.dp))
//
//                    FlowRow(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.Center,
//                    ) {
//                        product.colors.forEach {
//                            Box(
//                                modifier = Modifier
//                                    .padding(2.dp)
//                                    .size(8.dp)
//                                    .clip(CircleShape)
//                                    .background(it.asColor()),
//                            )
//                        }
//                    }
//                }
//
//                Column {
//                    Text(
//                        text = product.brand,
//                        color = MaterialTheme.colors.secondary,
//                        maxLines = 1,
//                        style = MaterialTheme.typography.body1
//                    )
//
//                    EcTextH3(text = product.name.take(20), maxLines = 1)
//
//                    Spacer(Modifier.height(6.dp))
//
//                    EcTextH6(
//                        text = stringResource(productR.string.ec_1_1_1_lbl_full_price),
//                        color = MaterialTheme.colorScheme.textPrimary,
//                    )
//
//                    EcTextH5(
//                        text = product.price,
//                        color = MaterialTheme.colorScheme.primary,
//                    )
//
//                    Box(
//                        Modifier
//                            .padding(top = 6.dp, bottom = 6.dp, end = 24.dp)
//                            .height(1.dp)
//                            .fillMaxWidth()
//                            .background(
//                                MaterialTheme.colorScheme.textSecondary,
//                                shape = DottedShape(step = 5.dp),
//                            ),
//                    )
//
//                    EcTextH6(
//                        text = stringResource(productR.string.ec_1_1_1_lbl_installment),
//                        color = MaterialTheme.colorScheme.textPrimary,
//                    )
//
//                    Row {
//                        EcTextH5(
//                            text = product.installmentPerMonth,
//                            color = MaterialTheme.colorScheme.primary,
//                            modifier = Modifier.alignByBaseline(),
//                            maxLines = 1,
//                        )
//                        EcTextH7(
//                            text = stringResource(productR.string.ec_1_1_1_lbl_monthly),
//                            modifier = Modifier.alignByBaseline(),
//                            maxLines = 1,
//                        )
//                    }
//
//                    Spacer(modifier = Modifier.size(14.dp))
//
//                    Row(
//                        modifier = Modifier.defaultMinSize(80.dp, 32.dp)
//                            .clip(CircleShape)
//                            .background(
//                                color = MaterialTheme.colors.primary,
//                            ),
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.Center,
//                    ) {
//                        EcTextH6(
//                            modifier = Modifier,
//                            text = stringResource(productR.string.ec_1_1_1_action_select),
//                            color = MaterialTheme.colorScheme.onPrimary,
//                            textAlign = TextAlign.Center,
//                        )
//                    }
//                }
//            }
//        }
//    }
}
