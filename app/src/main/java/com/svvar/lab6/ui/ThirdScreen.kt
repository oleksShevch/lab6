package com.svvar.lab6.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.svvar.lab6.R
import kotlin.math.pow
import kotlin.math.sqrt


@Preview
@Composable
fun ThirdScreen() {
    var v1_1 by remember { mutableStateOf("") }
    var v1_2 by remember { mutableStateOf("") }
    var v2_1 by remember { mutableStateOf("") }
    var v2_2 by remember { mutableStateOf("") }
    var v3_1 by remember { mutableStateOf("") }
    var v3_2 by remember { mutableStateOf("") }
    var v4_1 by remember { mutableStateOf("") }
    var v4_2 by remember { mutableStateOf("") }
    var v5_1 by remember { mutableStateOf("") }
    var v5_2 by remember { mutableStateOf("") }
    var v6_1 by remember { mutableStateOf("") }
    var v6_2 by remember { mutableStateOf("") }

    var r1 by remember { mutableStateOf("?") }
    var r2 by remember { mutableStateOf("?") }
    var r3 by remember { mutableStateOf("?") }
    var r4 by remember { mutableStateOf("?") }
    var r5 by remember { mutableStateOf("?") }
    var r6 by remember { mutableStateOf("?") }



    fun calculate() {
        try {
            val res1 = v1_1.toDouble() / v1_2.toDouble()
            val res2 = v2_1.toDouble().pow(2) / v2_2.toDouble()
            val res3 = v3_1.toDouble() * v3_2.toDouble()
            val res4 = v4_1.toDouble() * v4_2.toDouble()
            val res5 = sqrt(v5_1.toDouble().pow(2) + v5_2.toDouble().pow(2))
            val res6 = v6_1.toDouble() /  v6_2.toDouble()

            r1 = "%.2f".format(res1)
            r2 = "%.2f".format(res2)
            r3 = "%.2f кВт".format(res3)
            r4 = "%.2f кВт".format(res4)
            r5 = "%.2f кВ*А".format(res5)
            r6 = "%.2f А".format(res6)

        }
        catch (e: Exception) {
            return
        }

    }

    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.TopCenter


    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Розрахункові навантаження цеху", fontSize = 24.sp, color = Color.Black, textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f7),
                    contentDescription = "equation1",
                    modifier = Modifier
                        .width(110.dp)
                        .height(70.dp)
                        .padding(0.dp),

                    )
                Text(text = "  =", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(10.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v1_1,
                    onValueChange = { v1_1 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.01f, 0.84f))
                )
                Text(text = "  /  ", fontSize = 18.sp, color = Color.Black)
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v1_2,
                    onValueChange = { v1_2 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  =  ", fontSize = 18.sp, color = Color.Black)
                Text(text = r1, fontSize = 18.sp, color = Color.Black)
            }

            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f8),
                    contentDescription = "equation1",
                    modifier = Modifier
                        .width(110.dp)
                        .height(70.dp)
                        .padding(0.dp),

                    )
                Text(text = "  =", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(10.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v2_1,
                    onValueChange = { v2_1 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  /  ", fontSize = 18.sp, color = Color.Black)
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v2_2,
                    onValueChange = { v2_2 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  =  ", fontSize = 18.sp, color = Color.Black)
                Text(text = r2, fontSize = 18.sp, color = Color.Black)
            }


            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f5),
                    contentDescription = "equation1",
                    modifier = Modifier
                        .width(110.dp)
                        .height(70.dp)
                        .padding(0.dp),

                    )
                Text(text = "  =", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(10.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v3_1,
                    onValueChange = { v3_1 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  *  ", fontSize = 18.sp, color = Color.Black)
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v3_2,
                    onValueChange = { v3_2 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  =  ", fontSize = 18.sp, color = Color.Black)
                Text(text = r3, fontSize = 18.sp, color = Color.Black)
            }

            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f9),
                    contentDescription = "equation1",
                    modifier = Modifier
                        .width(110.dp)
                        .height(70.dp)
                        .padding(0.dp),

                    )
                Text(text = "  =", fontSize = 18.sp, color = Color.Black)

                Spacer(modifier = Modifier.width(10.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v4_1,
                    onValueChange = { v4_1 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  *  ", fontSize = 18.sp, color = Color.Black)
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v4_2,
                    onValueChange = { v4_2 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  =  ", fontSize = 18.sp, color = Color.Black)
                Text(text = r4, fontSize = 18.sp, color = Color.Black)
            }

            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f3),
                    contentDescription = "equation1",
                    modifier = Modifier
                        .width(110.dp)
                        .height(70.dp)
                        .padding(0.dp),

                    )
                Text(text = "  =  ", fontSize = 18.sp, color = Color.Black)
                Text(text = r5, fontSize = 18.sp, color = Color.Black)

                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row {
                        Text(text = "Pp =   ", fontSize = 18.sp, color = Color.Black)
                        BasicTextField(
                            textStyle = TextStyle(fontSize = 17.sp),
                            value = v5_1,
                            onValueChange = { v5_1 = it },
                            modifier = Modifier
                                .width(60.dp)
                                .height(30.dp)
                                .background(Color.hsv(132f, 0.02f, 0.84f))
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Text(text = "Qp =   ", fontSize = 18.sp, color = Color.Black)
                        BasicTextField(
                            textStyle = TextStyle(fontSize = 17.sp),
                            value = v5_2,
                            onValueChange = { v5_2 = it },
                            modifier = Modifier
                                .width(60.dp)
                                .height(30.dp)
                                .background(Color.hsv(132f, 0.02f, 0.84f))
                        )
                    }

                }

            }




            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.f4),
                    contentDescription = "equation1",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .padding(0.dp),

                    )
                Text(text = "  =", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(10.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v6_1,
                    onValueChange = { v6_1 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  /  ", fontSize = 18.sp, color = Color.Black)
                BasicTextField(
                    textStyle = TextStyle(fontSize = 17.sp),
                    value = v6_2,
                    onValueChange = { v6_2 = it },
                    modifier = Modifier
                        .width(60.dp)
                        .height(30.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
                Text(text = "  =  ", fontSize = 18.sp, color = Color.Black)
                Text(text = r6, fontSize = 18.sp, color = Color.Black)
            }


            Spacer(modifier = Modifier.height(45.dp))
            Button  (onClick = { calculate() }) {

                Text("Розрахувати")
            }
            Spacer(modifier = Modifier.height(24.dp))


        }
    }
}