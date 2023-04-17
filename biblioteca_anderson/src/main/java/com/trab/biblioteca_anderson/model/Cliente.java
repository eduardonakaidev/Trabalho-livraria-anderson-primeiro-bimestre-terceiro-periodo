/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trab.biblioteca_anderson.model;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Cliente {
    // Variaveis seguras //
    private String nome ;
    private String cpf ;
    private String rua ;
    private int numero_endereco ;
    private String bairro ;
    private String estado ;
    private String pais ;
    private String endereco ;

    // getters e setters //
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    // constructor //
    public Cliente(String nome, String cpf, String rua, int numero_endereco, String bairro, String estado, String pais) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.numero_endereco = numero_endereco;
        this.bairro = bairro;
        this.estado = estado;
        this.pais = pais;
        this.endereco = endereco = rua + ", " + numero_endereco + " - " + bairro + ", " + estado + ", " + pais;
    }
    
    // constructor vazio//
    public Cliente(){
        
    }

    // toString //
    @Override
     public String toString() {
        return "Nome: " + this.getNome()+ ",cpf : " + this.cpf + ", Endereço: " + this.getEndereco() ;
    }
    
    

   
    
}
