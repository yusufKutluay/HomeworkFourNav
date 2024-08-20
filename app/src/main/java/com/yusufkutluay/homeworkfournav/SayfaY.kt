package com.yusufkutluay.homeworkfournav

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class SayfaY : Screen {
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        Tasarim(
            baslik = stringResource(R.string.sayfa_y),
            aciklama = stringResource(R.string.sayfa_y_aciklama),
            hedefAciklama = "" ,
            hedef = null)

        BackHandler {
            // ilk sayfaya dönmesi için asağıdaki
            // ifadeyi kullanıyoruz..
            navigator.popUntilRoot()
        }
    }


}