package com.yusufkutluay.homeworkfournav

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import cafe.adriel.voyager.core.screen.Screen

class SayfaX : Screen {
    @Composable
    override fun Content() {
        Tasarim(
            baslik = stringResource(R.string.sayfa_x),
            aciklama = stringResource(R.string.sayfax_aciklama),
            hedefAciklama = stringResource(R.string.sayfax_buton),
            hedef = SayfaY())
    }
}