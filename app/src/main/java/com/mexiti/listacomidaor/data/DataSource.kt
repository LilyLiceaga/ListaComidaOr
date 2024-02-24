package com.mexiti.listacomidaor.data

import com.mexiti.listacomidaor.R
import com.mexiti.listacomidaor.model.Platillo

class DataSource() {
    fun LoadPlatillos(): List<Platillo>{
        return listOf(
            Platillo(R.string.desayuno,R.drawable.desayuno,R.string.precioDesayuno, R.string.descuentoDesayuno),
            Platillo(R.string.hamburger,R.drawable.hamburger, R.string.preciohamburger,R.string.descuentohamburger),
            Platillo(R.string.pizza,R.drawable.pizza, R.string.precioPizza, R.string.descuentoPizza),
            Platillo(R.string.postre,R.drawable.postre, R.string.precioPostre,R.string.descuentoPostre),
            Platillo(R.string.pozole,R.drawable.pozole, R.string.precioPozole, R.string.descuentoPozole),
            Platillo(R.string.tacos,R.drawable.tacos, R.string.precioTacos, R.string.descuentoTacos)
        )
    }
}