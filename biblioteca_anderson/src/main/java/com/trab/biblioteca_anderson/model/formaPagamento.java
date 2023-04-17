/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trab.biblioteca_anderson.model;

/**
 *
 * @author eduar
 */
public class formaPagamento {
    private int codigopagamento ;
    private String formaPagamento ;

    public formaPagamento(int codigopagamento, String formaPagamento) {
        this.codigopagamento = codigopagamento;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigopagamento() {
        return codigopagamento;
    }

    public void setCodigopagamento(int codigopagamento) {
        this.codigopagamento = codigopagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "formaPagamento{" + "codigopagamento=" + codigopagamento + ", formaPagamento=" + formaPagamento + '}';
    }
    
    
}
