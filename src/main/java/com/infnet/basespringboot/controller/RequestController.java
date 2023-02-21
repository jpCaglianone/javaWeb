package com.infnet.basespringboot.controller;

import com.infnet.basespringboot.model.domain.Requisitante;
import com.infnet.basespringboot.model.exception.NomeInvalidoException;
import com.infnet.basespringboot.model.exception.TipoInsumoException;
import com.infnet.basespringboot.model.exception.ValorValidoException;
import com.infnet.basespringboot.model.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {


    @GetMapping("/cadastroRequisitante")
    public String cadUserPage() {
        return "usuario/cadastroRequisitante";
    }

    @PostMapping(value="cadastroRequisitante/incluir")
    public String postCadRequester(@RequestParam String nome, @RequestParam String tipoRequisitante ,@RequestParam String orgao ) throws TipoInsumoException, NomeInvalidoException, ValorValidoException {

        Requisitante requisitante = new Requisitante(nome, Integer.parseInt(tipoRequisitante),orgao );
        UserRepository.inclusaoRequisitante(requisitante);

        return "redirect:/";
    }

    @GetMapping("listaRequisitante")
    public String listRequesterPage() { return "usuario/listaRequisitante";}

    public boolean msg = false;
}
