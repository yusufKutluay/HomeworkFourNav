package com.yusufkutluay.homeworkfournav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.yusufkutluay.homeworkfournav.ui.theme.ArkaPlan

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tasarim (baslik:String, aciklama:String, hedefAciklama:String, hedef: Screen?){

    val navigator = LocalNavigator.currentOrThrow
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Scaffold (
        containerColor = ArkaPlan,
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = baslik) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF13678A),
                    titleContentColor = Color(0xffDAFDBA)
                ))
        }
    ){ paddingValues ->

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = aciklama, fontSize = 30.sp, fontWeight = FontWeight.Black, color = Color(0xFFC2C0A6))

            if (hedefAciklama != null && hedef != null){
                Button(onClick = {
                    navigator.push(hedef)
                },
                    modifier = Modifier.padding(top = 20.dp).width((screenWidth-100).dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffA8B545),
                        contentColor = Color.Black
                    )
                ) {
                    Text(text = hedefAciklama, fontSize = 20.sp)
                }
            }

        }

    }

}