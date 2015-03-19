/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Lucas Costa Araújo
 */
public class Produto {
    
    private String nome;
    private String preco;
    private int quantidade;
    private LocalDateTime dataPagamento;
    private LocalDateTime dataAdesao;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDateTime getDataAdesao() {
        return dataAdesao;
    }

    public void setDataAdesao(LocalDateTime dataAdesao) {
        this.dataAdesao = dataAdesao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    public String[] getArrayStringDeDadosComDataPagamento(){
        
        if(getDataPagamento() != null && getNome() != null && getPreco() != null)
        {
            String data =  String.valueOf(getDataPagamento().getDayOfMonth()) + " " + 
                        String.valueOf(getDataPagamento().getHour()) +":" + 
                        String.valueOf(getDataPagamento().getMinute());
            String[] arrayDados = {data ,getNome(),getPreco()};

            return arrayDados;
        }
        else
        {   
            System.out.println("Dados incompletos do Produto");
            return null;
        }
    }
    
    public String[] getArrayStringDeDadosComDataAdesao(){
        
        if(getDataAdesao() != null && getNome() != null && getPreco() != null)
        {
            String data =  String.valueOf(getDataAdesao().getDayOfMonth()) + " " + 
                        String.valueOf(getDataAdesao().getHour()) +":" + 
                        String.valueOf(getDataAdesao().getMinute());
            String[] arrayDados = {data ,getNome(),getPreco()};

            return arrayDados;
        }
        else
        {   
            System.out.println("Dados incompletos do Produto");
            return null;
        }
    }
    
    public String[] getArrayStringDeDados(){
        
        if(getNome() != null && getPreco() != null)
        {
            String[] arrayDados = {getNome(),getPreco()};
            return arrayDados;
        }
        else
        {   
            System.out.println("Dados incompletos do Produto");
            return null;
        }
    }
    
    
}
