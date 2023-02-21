package com.infnet.basespringboot.model.repository;

import com.infnet.basespringboot.model.domain.Requisitante;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<Requisitante> listaRequisitantes = new ArrayList<Requisitante>();

    public static boolean inclusaoRequisitante(Requisitante requisitante) {

        try {
            listaRequisitantes.add(requisitante);
            for (int i = 0; i < listaRequisitantes.size(); i++) {
                System.out.println(listaRequisitantes.get(i)); //temporário, para testes
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

