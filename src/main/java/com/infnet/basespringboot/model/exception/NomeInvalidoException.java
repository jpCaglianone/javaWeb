package com.infnet.basespringboot.model.exception;

public class NomeInvalidoException extends Throwable {
    public NomeInvalidoException(String mensagem) {
        super("Nome inválido! " + mensagem);
    }
}
