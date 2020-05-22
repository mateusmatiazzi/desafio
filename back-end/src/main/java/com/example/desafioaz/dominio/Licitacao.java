package com.example.desafioaz.dominio;

public class Licitacao {
    private String descricao;
    private TipoDeClassificacao tipoDeClassificacao;

    public Licitacao(String descricao, TipoDeClassificacao tipoDeClassificacao) {
        this.descricao = descricao;
        this.tipoDeClassificacao = tipoDeClassificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoDeClassificacao getTipoDeClassificacao() {
        return tipoDeClassificacao;
    }

    public void setTipoDeClassificacao(TipoDeClassificacao tipoDeClassificacao) {
        this.tipoDeClassificacao = tipoDeClassificacao;
    }
}
