package com.yusufkutluay.homeworkfournav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.yusufkutluay.homeworkfournav.ui.theme.ArkaPlan

@OptIn(ExperimentalMaterial3Api::class)
class Anasayfa : Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow
        val configuration = LocalConfiguration.current
        val screenWidth = configuration.screenWidthDp

        Scaffold (
            containerColor = ArkaPlan,
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text(text = stringResource(R.string.anasayfa), fontSize = 25.sp) },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color(0xFF13678A),
                        titleContentColor = Color(0xffDAFDBA)
                    )
                    )
            }
        ){ paddingValues ->

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stringResource(R.string.anasayfa_aciklama), fontSize = 30.sp, fontWeight = FontWeight.Black, color = Color(0xFFC2C0A6))
                Button(onClick = {
                    navigator.push(SayfaA())
                                 },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width((screenWidth - 100).dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffA8B545),
                        contentColor = Color.Black
                    )
                    ) {
                        Text(text = stringResource(R.string.anasayfabuton_a), fontSize = 20.sp)
                    }
                Button(onClick = {
                    navigator.push(SayfaX())
                },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width((screenWidth - 100).dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffA8B545),
                        contentColor = Color.Black
                    )
                ) {
                    Text(text = stringResource(R.string.anasayfabuton_b), fontSize = 20.sp)
                }

            }
        }
    }
}

