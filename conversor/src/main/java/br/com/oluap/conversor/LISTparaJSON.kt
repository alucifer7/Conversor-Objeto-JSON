package br.com.oluap.conversor

import com.google.gson.GsonBuilder

/*
Author: Paulo Fernandes
Created on 21/04/2020
*/

/** Esta classe recebe uma List<> genérica e retorna uma String JSON **/
/** This class receives a generic List<> and returns a JSON String **/

class LISTparaJSON <T> {

    private var listaGenerica: T

    constructor(listaGenerica: T) {
        this.listaGenerica = listaGenerica
    }

    fun getListaConvertidaParaJSON(): String{
        val gson = GsonBuilder().setPrettyPrinting().create()

        return gson.toJson(this.listaGenerica)
    }

}