package com.infnet.basespringboot.model.exception;

import javax.swing.text.TableView;

public class AnoInvalidoException extends Throwable {
    public AnoInvalidoException(String mensagem) {
        super("Ano inválido! " + mensagem);
    }
}
