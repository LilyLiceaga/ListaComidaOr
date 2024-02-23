package com.mexiti.listacomidaor.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Precios(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int
)
