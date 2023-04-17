
package com.trab.biblioteca_anderson.model;

import java.util.ArrayList;

/**
 *
 * @author eduar
 */
public class Venda {
    private int numeroPedido;
    private Cliente cliente;
    private ArrayList<LivroPedido> listaLivros;
    private ArrayList<formaPagamento> formasPagamento;
    
    public Venda() {
     this.listaLivros = new ArrayList<>();
     this.formasPagamento = new ArrayList<>();
   }
   
    // constructor //

    public Venda(int numeroPedido, Cliente cliente, ArrayList<LivroPedido> listaLivros, ArrayList<formaPagamento> formasPagamento) {
        this.listaLivros = new ArrayList<>();
        this.formasPagamento = new ArrayList<>();
     
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaLivros = listaLivros;
        this.formasPagamento = formasPagamento;
    }
    // getters e setters //

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<LivroPedido> getListaLivros(){
        return listaLivros ;
    }
    public void setListaLivros(ArrayList<LivroPedido> listaLivros){
        this.listaLivros = listaLivros ;
    }
     public ArrayList<formaPagamento> getFormasPagamento() {
        return formasPagamento;
    }
     public void setFormasPagamento(ArrayList<formaPagamento> formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    @Override
    public String toString() {
        return "Venda{" + "numeroPedido=" + numeroPedido + ", cliente=" + cliente + ", listaLivros=" + listaLivros.toString() + ", formasPagamento=" + formasPagamento + '}';
    }
     
    
   
}
