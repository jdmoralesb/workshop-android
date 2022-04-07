package com.example.workshopandroid.data

import com.example.workshopandroid.R
import com.example.workshopandroid.entity.Product
import com.example.workshopandroid.entity.ProductPlatform

object MockDataProvider {
    fun getListOfProducts(): List<Product> = listOf(
        Product(
            1,
            "Fifa 22",
            "Crea un club, llévalo desde los puestos de descenso hasta lo más alto de la competición.\n\nExpresa tu estilo en el terreno de juego para que conectes con tu equipo en pistas callejeras en el mundo.\n\nFUT 22 rediseña Division Rivals y FUT Champions, ahora lo tienes más fácil para poner a prueba tus habilidades.",
            ProductPlatform.Playstation,
            R.mipmap.img_product_1,
            75.0
        ),
        Product(
            2,
            "Mario Kart 8 Deluxe",
            "Con circuitos y personajes populares ademas de los descargables.\n\nTe permite partidas multijugador local hasta para 8 pilotos.\n\nPilotos inexpertos cuenta con asistencia del nuevo volante inteligente.",
            ProductPlatform.Nintendo,
            R.mipmap.img_product_2,
            62.0
        ),
        Product(
            3,
            "Halo Infinite",
            "Halo regresa una de las franquicias más icónicas en caja de metal de edición limitada.\n\nEl Master Chief está listo para enfrentarse al enemigo más despiadado que jamás haya enfrentado.\n\nVuelve el celebrado modo multijugador de Halo, reimaginado y gratis para jugar!.",
            ProductPlatform.Xbox,
            R.mipmap.img_product_3,
            68.0
        ),
        Product(
            4,
            "Horizon Forbidden West",
            "Descubre tierras lejanas, enemigos nuevos, culturas ricas y personajes llenos de vida.\n\nRecorre bosques frondosos, ciudades hundidas y montañas imponentes en el futuro lejano de un continente estadounidense desolado.\n\nLucha en batallas estratégicas contra máquinas enormes y los enemigos humanos que las controlan, usa armas, equipo y trampas improvisadas.",
            ProductPlatform.Playstation,
            R.mipmap.img_product_4,
            72.0
        ),
        Product(
            5,
            "Far Cry 5",
            "Tendrás que ponerte en la piel de un agente de policía novato y liderar a los lugareños.\n\nPuedes conseguir aliados de todo tipo: recluta a tus amigos para jugar de manera cooperativa.\n\nAdéntrate en una guerra que se ha estado fraguando durante 15 años.",
            ProductPlatform.Playstation,
            R.mipmap.img_product_5,
            54.0
        ),
        Product(
            6,
            "Super Smash Ultimate",
            "Gran variedad de mecanismos que le dan giros imprevistos al combate.\n\n¡Mas de 72 combatientes!.\n\nEscenarios cambian de forma y aparecen personajes invitados.",
            ProductPlatform.Nintendo,
            R.mipmap.img_product_6,
            68.0
        ),
        Product(
            7,
            "Gears 5",
            "Lucha con tus amigos en modo en línea o modo cooperativo de pantalla dividida de tres jugadores.\n\nCinco emocionantes modos. Una experiencia épica.\n\nEnfréntate a nuevos desafíos emocionantes, consigue increíbles recompensas y haz lucir tu botín.",
            ProductPlatform.Xbox,
            R.mipmap.img_product_7,
            62.0
        ),
        Product(
            8,
            "Luigis Mansion 3",
            "La Torre del Horror te ofrece acción multijugador frenética.\n\nLuigi cuenta con más armas a su disposición que nunca antes.\n\nnuevos y poderosos movimientos aporrear ventosa y propulsor.",
            ProductPlatform.Nintendo,
            R.mipmap.img_product_8,
            65.0
        )
    )

    fun getProductById(id: Int): Product? {
        return getListOfProducts().find { it.id == id }
    }
}