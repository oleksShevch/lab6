package com.svvar.lab6.ui

import androidx.compose.foundation.background
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.sqrt


@Preview
@Composable
fun FirstScreen() {
    var KKD by remember { mutableStateOf("") }
    var powerCoef by remember { mutableStateOf("") }
    var voltage by remember { mutableStateOf("") }
    var quantity by remember { mutableStateOf("") }
    var power by remember { mutableStateOf("") }
    var useCoef by remember { mutableStateOf("") }
    var reactiveCoef by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }


    fun calculate() {
        try {
            val _KKD = KKD.toDouble()
            val _powerCoef = powerCoef.toDouble()
            val _voltage = voltage.toDouble()
            val _quantity = quantity.toDouble()
            val _power = power.toDouble()
            val _useCoef = useCoef.toDouble()
            val _reactiveCoef = reactiveCoef.toDouble()

            val nP = _quantity * _power
            val Ip = nP / (sqrt(3.0) * _voltage * _powerCoef * _KKD)


            result ="n*Pн = ${"%.3f".format(nP)} кВт\n" +
                    "Ip = ${"%.3f".format(Ip)} А\n"
        }
        catch (e: Exception) {
            result = "Введіть коректні дані"
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
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            Text(text = "Розрахункові струми ЕП", fontSize = 24.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Ном. значення ККД. ЕП: ", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = KKD,
                    onValueChange = { KKD = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Коефіцієнт потужності\nнавантаження:", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = powerCoef,
                    onValueChange = { powerCoef = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Напруга навантаження:", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = voltage,
                    onValueChange = { voltage = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Кількість ЕП: ", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = quantity,
                    onValueChange = { quantity = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Номінальна потужність ЕП: ", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = power,
                    onValueChange = { power = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Коефіцієнт використання: ", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = useCoef,
                    onValueChange = { useCoef = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Коефіцієнт реактивної\nпотужності:", fontSize = 18.sp, color = Color.Black)
                Spacer(modifier = Modifier.width(16.dp))
                BasicTextField(
                    textStyle = TextStyle(fontSize = 22.sp),
                    value = reactiveCoef,
                    onValueChange = { reactiveCoef = it },
                    modifier = Modifier
                        .width(70.dp)
                        .background(Color.hsv(132f, 0.02f, 0.84f))
                )
            }

            Spacer(modifier = Modifier.height(32.dp))
            Button  (onClick = { calculate() }) {

                Text("Розрахувати")
            }
            Spacer(modifier = Modifier.height(24.dp))

            Text(text = result, fontSize = 24.sp, color = Color.Black)


        }
    }
}