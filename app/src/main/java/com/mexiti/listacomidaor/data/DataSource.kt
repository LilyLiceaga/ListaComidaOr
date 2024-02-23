package com.mexiti.listacomidaor.data

import com.mexiti.listacomidaor.R
import com.mexiti.listacomidaor.model.Platillo

class DataSource() {
    fun LoadPlatillos(): List<Platillo>{
        return listOf(
            Platillo(R.string.desayuno,R.drawable.desayuno,R.string.precioDesayuno),
            Platillo(R.string.hamburger,R.drawable.hamburger, R.string.preciohamburger),
            Platillo(R.string.pizza,R.drawable.pizza, R.string.precioPizza),
            Platillo(R.string.postre,R.drawable.postre, R.string.precioPostre),
            Platillo(R.string.pozole,R.drawable.pozole, R.string.precioPozole),
            Platillo(R.string.tacos,R.drawable.tacos, R.string.precioTacos)
        )
    }
}