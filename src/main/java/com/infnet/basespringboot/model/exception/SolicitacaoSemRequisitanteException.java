package com.infnet.basespringboot.model.exception;

public class SolicitacaoSemRequisitanteException extends Throwable {
    public SolicitacaoSemRequisitanteException(String mensagem) {
        super("Solicitação inválida! " + mensagem);
    }
}
