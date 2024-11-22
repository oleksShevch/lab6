package com.svvar.lab6
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.svvar.lab6.ui.FirstScreen
import com.svvar.lab6.ui.SecondScreen
import com.svvar.lab6.ui.ThirdScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipeableApp()
        }
    }
}

@Composable
fun SwipeableApp() {
    val pagerState = rememberPagerState(pageCount = { 3 })

    Column(modifier = Modifier.fillMaxSize()) {
        // Pager with 2 Pages
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            if (page == 0) {
                FirstScreen()
            } else if (page == 1) {
                SecondScreen()
            }
            else {
                ThirdScreen()
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(2) { index ->
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .padding(horizontal = 4.dp)
                        .background(
                            color = if (pagerState.currentPage == index) Color.Blue else Color.Gray,
                            shape = androidx.compose.foundation.shape.CircleShape
                        )
                )
            }
        }
    }
}