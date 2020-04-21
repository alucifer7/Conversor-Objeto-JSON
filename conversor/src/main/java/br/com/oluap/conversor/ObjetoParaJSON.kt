package br.com.oluap.conversor

import com.google.gson.GsonBuilder

/*
Author: Paulo Fernandes
Created on 21/04/2020
*/

/** Esta classe recebe um objeto qualquer (genérico) e retorna uma String JSON desse objeto */
/** This class takes a (generic) object and returns a JSON String for that object */

class ObjetoParaJSON <T> {

    private var objetoGenerico: T

    constructor(objetoGenerico: T) {
        this.objetoGenerico = objetoGenerico
    }

    fun retornaStringObjetoGenerico(): String{
        val gson = GsonBuilder().setPrettyPrinting().create()

        return gson.toJson(this.objetoGenerico)
    }

}