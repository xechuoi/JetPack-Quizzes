package com.compose.jettrivia.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.tooling.preview.Preview
import com.compose.jettrivia.ui.theme.LightGray
import com.compose.jettrivia.util.DimenHeight1

@Composable
fun DrawDottedLine(pathEffect: PathEffect) {
    Canvas(modifier = Modifier
        .fillMaxWidth()
        .height(DimenHeight1)) {
        drawLine(
            color = LightGray, start = Offset.Zero, end = Offset(size.width, 0F),
            pathEffect = pathEffect
        )
    }

}