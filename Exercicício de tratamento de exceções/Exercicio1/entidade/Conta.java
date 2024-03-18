package Exercicio1.entidade;

import Exercicio1.excecao.Domainexception;

import java.util.zip.DataFormatException;

public class Conta {

    private Integer numero;
    private String titular;
    private Double balanco;
    private Double limiteSaque;

    public Conta(){
    }

    public Conta(Integer numero, String titular, Double balanco, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.balanco = balanco;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalanco() {
        return balanco;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public Double deposito(Double valor) {
        return balanco += valor;
    }

    public Double saque(Double valor) {
        validarSaque(valor);
        return balanco -= valor;
    }

    public void validarSaque(Double valor) {
        if (valor > getLimiteSaque()) {
            throw new Domainexception("Erro de saque: O valor excede o limite de saque");
        } else if (valor > getBalanco()) {
            throw new Domainexception("Erro de saque: balanço insuficiente");
        }
    }
}
