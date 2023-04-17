/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trab.biblioteca_anderson;

import com.trab.biblioteca_anderson.model.Cliente;
import com.trab.biblioteca_anderson.model.Livro;
import com.trab.biblioteca_anderson.model.LivroPedido;
import com.trab.biblioteca_anderson.model.Relatorio;
// import com.trab.biblioteca_anderson.model.Relatorio_vendas;
import com.trab.biblioteca_anderson.model.Venda;
import com.trab.biblioteca_anderson.model.formaPagamento;

/**
 *
 * @author eduar
 */

public class Biblioteca_anderson {
   public static void main(String[] args) {
  
       Livro livro1 = new Livro( 1,"Harry Potter", "editora", "eu e sei la", 2008, "aventura", 256, 100, 30.25);
       Livro livro2 = new Livro(2, "Arte da guerra", "Principis","Sun Tzu", 2019,"gestao e lideraça", 160, 20, 14.40);
       Livro livro3 = new Livro(3, "Mitologia Nordica", "Intrinseca", "Neil Gaiman", 2017, "Estudo de Linguas Estrangeiras", 288, 59, 52.40);
      
     
      Cliente Eduardo = new Cliente("Eduardo Issao Nakai frasson","000-000-000-00", "Av Costa e silva", 517, "Centro", "Parana", "Brazil");
        
         
       Venda venda = new Venda();
       venda.setCliente(Eduardo);
       venda.setNumeroPedido(1234);
      
      LivroPedido livroPedido1 = new LivroPedido();
      livroPedido1.setLivro(livro1);
      livroPedido1.setQtdVenda(2);
      livroPedido1.setVlPrecoUnitario(livro1.getPrecoVenda());
      livroPedido1.setVlDesconto(7.00);
       
       
      LivroPedido livroPedido2 = new LivroPedido();
      livroPedido2.setLivro(livro2);
      livroPedido2.setQtdVenda(1);
      livroPedido2.setVlPrecoUnitario(livro2.getPrecoVenda());
      livroPedido2.setVlDesconto(20.00);
      
      
     LivroPedido livroPedido3 = new LivroPedido();
     livroPedido3.setLivro(livro3);
     livroPedido3.setQtdVenda(10);
     livroPedido3.setVlPrecoUnitario(livro3.getPrecoVenda());
     livroPedido3.setVlDesconto(10.00);
     
        venda.getListaLivros().add(livroPedido1);
       venda.getListaLivros().add(livroPedido2);
       venda.getListaLivros().add(livroPedido3);
       
        formaPagamento Dinheiro = new formaPagamento(1, "Dinheiro");
       formaPagamento Pix = new formaPagamento(2, "Pix");
      
       venda.getFormasPagamento().add(Pix);
       venda.getFormasPagamento().add(Dinheiro);
       
       Relatorio relatorio = new Relatorio();
       relatorio.getListaVenda().add(venda);
       
       
       System.out.println(relatorio.toString());
       
       livro1.setEstoque( livro1.getEstoque() - livroPedido1.getQtdVenda());
       livro2.setEstoque( livro2.getEstoque() - livroPedido2.getQtdVenda());
       livro3.setEstoque(livro3.getEstoque() - livroPedido3.getQtdVenda());
       
       System.out.println(livro1.toString());
       System.out.println(livro2.toString());
       System.out.println(livro3.toString());
       
    }

  
}
