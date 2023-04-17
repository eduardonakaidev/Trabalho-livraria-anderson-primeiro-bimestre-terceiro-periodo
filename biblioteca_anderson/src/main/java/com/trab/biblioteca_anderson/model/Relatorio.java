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
public class Relatorio {
    
     private ArrayList<Venda> listaVenda;

     public Relatorio() {
        this.listaVenda = new ArrayList<>();
    }

    public Relatorio(ArrayList<Venda> listaVenda) {
         this.listaVenda = new ArrayList<>();
    }

    public ArrayList<Venda> getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(ArrayList<Venda> listaVenda) {
        this.listaVenda = listaVenda;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "listaVenda=" + listaVenda + '}';
    }
    
    
     
   
    
    
     
     
}
