/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDateTime;

/**
 *
 * @author Lucas
 */
public class Usuario {
    
    //Usuario que pagou...
    //Usuario que aderiu ao quarto...
    private String nome;
    private char[] senha;
    private LocalDateTime DataCriacao;
    private LocalDateTime DataUltimaVisita;

    private void setDataCriacao(LocalDateTime DataCriacao) {
        this.DataCriacao = DataCriacao;
    }
    
    public Usuario()
    {
        this.setDataCriacao(LocalDateTime.now());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCriacao() {
        return DataCriacao;
    }



    public LocalDateTime getDataUltimaVisita() {
        return DataUltimaVisita;
    }

    public void setDataUltimaVisita(LocalDateTime DataUltimaVisita) {
        this.DataUltimaVisita = DataUltimaVisita;
    }
    
    
    
}
