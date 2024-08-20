package com.yusufkutluay.homeworkfournav
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import cafe.adriel.voyager.core.screen.Screen

class SayfaA : Screen {
    @Composable
    override fun Content() {
        Tasarim(
            baslik = stringResource(R.string.sayfa_a),
            aciklama = stringResource(R.string.sayfa_a_aciklama),
            hedefAciklama = stringResource(R.string.sayfa_a_buton) ,
            hedef = SayfaB())
    }
}