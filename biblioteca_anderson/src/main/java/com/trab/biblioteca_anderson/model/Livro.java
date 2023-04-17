/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trab.biblioteca_anderson.model;

/**
 *
 * @author eduar
 */
public class Livro {
       // Variaveis seguras //
       private int codigoLivro ;
       private String nomeLivro ;
       private String editora;
       private String autores ;
       private int anoLancamento ;
       private String genero ;
       private int numeroDePaginas;
       private int estoque;
       private double precoVenda ;
       
    public int getCodigoLivro() {
        return codigoLivro;
    }

    // Getters e setters //
    public void setCodigoLivro(int codigoLivro) {       
        this.codigoLivro = codigoLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutores() {
        return autores;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
    
 
    
    // Constructor //
    public Livro(int codigoLivro, String nomeLivro, String editora, String autores, int anoLancamento, String genero, int numeroDePaginas, int estoque, double precoVenda) {
        this.codigoLivro = codigoLivro;
        this.nomeLivro = nomeLivro;
        this.editora = editora;
        this.autores = autores;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.numeroDePaginas = numeroDePaginas;
        this.estoque = estoque;
        this.precoVenda = precoVenda;
    }
    // Construtor vazio //

    public Livro() {
    }
    
    // toString //
    @Override
    public String toString() {
        return "Livro{codigo do livro : "+codigoLivro+  ",nomeLivro=" + nomeLivro + ", editora=" + editora + ", autores=" + autores + ", anoLancamento=" + anoLancamento + ", genero=" + genero + ", numeroDePaginas=" + numeroDePaginas + ", estoque=" + estoque + ", precoVenda=" + precoVenda + '}';
    }
       
       
               
}
