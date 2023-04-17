/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trab.biblioteca_anderson.model;

/**
 *
 * @author eduar
 */
public class LivroPedido {
    // Variaveis seguras //
    private Livro livro ;
    private int qtdVenda;
    private double vlPrecoUnitario;
    private double vlTotal;
    private double vlDesconto ;
    // constructor vazio //
     public LivroPedido() {
        
    }
    // Constructor //

    public LivroPedido(Livro livro, int qtdVenda, double vlPrecoUnitario, double vlTotal) {
        this.livro = livro;
        this.qtdVenda = qtdVenda;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = vlTotal;
    }
    // getters e setters //
     public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
        this.vlTotal = this.vlPrecoUnitario * this.qtdVenda;
    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlTotal = this.vlPrecoUnitario * this.qtdVenda - this.vlDesconto;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }
    
    // toString //

    @Override
    public String toString() {
        return "LivroPedido{" + "livro=" + livro + ", qtdVenda=" + qtdVenda + ", vlPrecoUnitario=" + vlPrecoUnitario + ", vlTotal=" + vlTotal + ", vlDesconto=" + vlDesconto + '}';
    }
    
    
    
}
