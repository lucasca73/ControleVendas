/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author Lucas
 */
public class Quarto {
    
    private int numero;
    public ArrayList<Produto> listaProdutosPagos;
    public ArrayList<Produto> listaProdutosAderidos;
    
    public Quarto(){
        listaProdutosAderidos = new ArrayList<>();
        listaProdutosPagos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int sizeProdutosPagos(){
        return listaProdutosPagos.size();
    }
    
    public int sizeProdutosAPagar(){
        return listaProdutosAderidos.size();
    }
    
    public void pagarProduto(Produto produto){
        
        
        if(contemProdutoAderido(produto)){
            
        
        produto.setDataPagamento(LocalDateTime.now());
        listaProdutosPagos.add(produto);
        listaProdutosAderidos.remove(produto);
        }
        else
            System.out.println("Produto nao esta na lista "
                    + "de produtos aderidos ao quarto");
    }
    
    public void addProdutoAoQuarto(Produto produto){
        produto.setDataAdesao(LocalDateTime.now());
        listaProdutosAderidos.add(produto);
    }
    
    public Produto getProdutoPagoByIndex(int index){
        return listaProdutosPagos.get(index);
    }
    
    public Produto getProdutoAderidoByIndex(int index){
        return listaProdutosAderidos.get(index);
    }
    
    public void rmProdutoPagoIndex(int index){
        listaProdutosPagos.remove(index);
    }
    
    public void rmProdutoAderidoIndex(int index){
        listaProdutosAderidos.remove(index);
    }
    
    public Produto getProdutoAderidoPorNome(String nomeProduto){
        if(nomeProduto != null)
        {
            for(int i = 0; i < listaProdutosAderidos.size(); i++)
            {
                Produto produto = this.getProdutoAderidoByIndex(i);
                if(produto.getNome().equals(nomeProduto))
                {
                    return produto;
                }
            }
        }
        
        return null;
    }
    
    public boolean contemProdutoAderido(Produto algumProduto){
        
        if(algumProduto != null)
        {
            for(int i = 0; i < listaProdutosAderidos.size(); i++)
            {
                Produto produto = this.getProdutoAderidoByIndex(i);
                if(produto.equals(algumProduto))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean contemProdutoPago(Produto algumProduto){
        for(Produto produto: listaProdutosPagos){
            if(produto.equals(algumProduto))
                return true;
        }
        return false;
    }
    
}
