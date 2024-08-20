package com.yusufkutluay.homeworkfournav
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

import cafe.adriel.voyager.core.screen.Screen

class SayfaB : Screen {
    @Composable
    override fun Content() {
        Tasarim(
            baslik = stringResource(R.string.sayfa_b),
            aciklama = stringResource(R.string.sayfa_b_aciklama),
            hedefAciklama = stringResource(R.string.sayfa_b_buton) ,
            hedef = SayfaY())
    }

}