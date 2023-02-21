package com.infnet.basespringboot.model.tests;

import com.infnet.basespringboot.model.exception.*;

import com.infnet.basespringboot.model.auxs.*;

import com.infnet.basespringboot.model.domain.*;
public class RequisitanteTeste {
    public static void main(String[] args){

        try {
            Requisitante r1 = new Requisitante("João Pedro", 1,"Público");
            System.out.println(r1.toString());
        } catch (ValorValidoException | TipoInsumoException | NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Requisitante r2 = new Requisitante("", 1,"Privado");
            System.out.println(r2.toString());
        } catch (ValorValidoException | TipoInsumoException | NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Requisitante r2 = new Requisitante("João Pedro", 6,"");
            System.out.println(r2.toString());
        } catch (ValorValidoException | TipoInsumoException | NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
