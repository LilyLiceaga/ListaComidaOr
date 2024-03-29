package com.mexiti.listacomidaor.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int,
    @StringRes val stringResourceId2: Int,
    @StringRes val stringResourceId3: Int
)
