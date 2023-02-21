package com.infnet.basespringboot.model.exception;

public class ValorValidoException extends Throwable {
    public ValorValidoException (String mensagem){
        super("Valor inválido! " + mensagem);
    }
}
