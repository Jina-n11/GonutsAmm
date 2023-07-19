package com.jinana11.gonutsamm.presentation.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.jinana11.gonutsamm.presentation.theme.BackgroundCard1Light
import com.jinana11.gonutsamm.presentation.theme.Black60
import com.jinana11.gonutsamm.presentation.theme.Black87
import com.jinana11.gonutsamm.presentation.theme.PrimaryLight

@Composable
fun CardOffers(
    imageId: Int,
    backgroundColor: Color = BackgroundCard1Light,
    onClickFavorite: () -> Unit,
    onClickCard: () -> Unit,
    title: String = "Strawberry Wheel",
    description: String = "These Baked Strawberry Donuts are filled with fresh strawberries...",
    price: String = "$16",
    oldPrice: String = "$25",

    ) {

    ConstraintLayout() {

        val (content, image) = createRefs()

        ConstraintLayout(
            modifier = Modifier
                .padding(12.dp)
                .shadow(elevation = 8.dp, shape = RoundedCornerShape(20.dp))
                .background(color = backgroundColor, shape = RoundedCornerShape(20.dp))
                .clickable { onClickCard() }
                .constrainAs(content) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }
                .height(300.dp)
                .width(193.dp)
                .padding(12.dp)

        ) {
            val (favoriteIcon, titleText, descriptionText, priceText, oldPriceText) = createRefs()

            Box(
                modifier = Modifier.constrainAs(favoriteIcon) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
            ) { FavoriteIcon(onClickFavorite) }


            SpacerVertical16()

            Text(text = title,
                maxLines = 1,
                style = MaterialTheme.typography.bodyLarge,
                color = Black87,
                modifier = Modifier.constrainAs(titleText) {
                    start.linkTo(parent.start)
                    bottom.linkTo(descriptionText.top)
                })

            SpacerVertical8()

            Text(text = description,
                maxLines = 3,
                style = MaterialTheme.typography.bodySmall,
                color = Black60,
                modifier = Modifier.constrainAs(descriptionText) {
                    start.linkTo(parent.start)
                    bottom.linkTo(priceText.top)
                })

            SpacerVertical8()

            Text(text = price, style = MaterialTheme.typography.titleLarge, color = Black87,
                modifier = Modifier.constrainAs(priceText) {
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                })



            Text(text = oldPrice, style = MaterialTheme.typography.titleSmall, color = Black60,
                textDecoration = TextDecoration.LineThrough,
                modifier = Modifier.constrainAs(oldPriceText) {
                    end.linkTo(priceText.start)
                    bottom.linkTo(priceText.bottom)

                }
            )
            SpacerHorizontal8()
        }

        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(image) {
                    top.linkTo(parent.top, margin = (80).dp)
                    start.linkTo(parent.end, margin = (-70).dp)
                }
                .scale(2.5f, 2.8f),

            )
    }
}


@Composable
fun CardDonuts(
    imageId: Int,
    backgroundColor: Color = Color.White,
    onClickCard: () -> Unit,
    title: String = "Chocolate Cherry",
    price: String = "$22",

    ) {

    ConstraintLayout(modifier = Modifier.padding(top = 16.dp , end = 16.dp)) {

        val (content, image) = createRefs()


        ConstraintLayout(
            modifier = Modifier
                .shadow(
                    elevation = 7.dp, shape = RoundedCornerShape(
                        topEnd = 20.dp, topStart = 20.dp,
                        bottomEnd = 10.dp, bottomStart = 10.dp
                    )
                )
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(
                        topEnd = 20.dp, topStart = 20.dp,
                        bottomEnd = 10.dp, bottomStart = 10.dp
                    )
                )
                .clickable { onClickCard }
                .padding(horizontal = 12.dp, vertical = 24.dp)
                .constrainAs(content) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }

        ) {
            val (titleText, priceText) = createRefs()

            SpacerVertical32()

            Text(text = title,
                maxLines = 1,
                style = MaterialTheme.typography.bodyMedium,
                color = Black60,
                modifier = Modifier.constrainAs(titleText) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top , margin = 10.dp)
                    bottom.linkTo(parent.bottom )
                })

            SpacerVertical8()

            Text(text = price, style = MaterialTheme.typography.titleSmall, color = PrimaryLight,
                modifier = Modifier.constrainAs(priceText) {
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    top.linkTo(titleText.bottom )
                })
        }

        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(image) {
                    top.linkTo(parent.top, margin = (-20).dp)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }
                .scale(2.5f, 2.5f),
        )

    }
}
