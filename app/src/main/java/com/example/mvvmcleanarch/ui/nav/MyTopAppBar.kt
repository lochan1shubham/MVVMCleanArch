@file:Suppress("UNCHECKED_CAST", "CAST_NEVER_SUCCEEDS")

package com.example.mvvmcleanarch.ui.nav

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmcleanarch.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(
    title: String = "",
    onBackClick: () -> Unit
) = TopAppBar(
    navigationIcon = {
        IconButton(onClick = onBackClick) {
            Icon(
                painter = painterResource(R.drawable.back),
                contentDescription = "Localized description",
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
        }
    },
    title = { Text(text = title, maxLines = 1, fontSize = 18.sp) }
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MyTopAppBarScaffold(
    title: String = "",
    onBackClick: () -> Unit,
    pageContent: @Composable ((PaddingValues) -> Unit)
) =
    Scaffold(
        modifier = Modifier,
        topBar = { MyTopAppBar (title, onBackClick) },
        content = pageContent
    )