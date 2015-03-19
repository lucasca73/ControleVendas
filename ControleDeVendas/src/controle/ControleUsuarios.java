/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import modelo.Usuario;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class ControleUsuarios {
    private ArrayList<Usuario> listaUsuarios;
    
    public ControleUsuarios(){
        listaUsuarios = new ArrayList<>();
    }
    
    public void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    
    public void rmUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    }
    
    public void rmUsuarioIndex(int index){
        listaUsuarios.remove(index);
    }
    
    public Usuario getUsuarioByIndex(int index){
        return listaUsuarios.get(index);
    }
    
    public boolean checarUsuarioCadastrado(String nome)
    {
        for (Usuario user: listaUsuarios)
            if(user.getNome().equals(nome))
                return true;
        return false;
    }
    
    public Usuario loginUsuario(String nome, char[] senha)
    {
        for (Usuario user: listaUsuarios)
            if(user.getNome().equals(nome))
                if(Arrays.equals(user.getSenha(), senha))
                    return user;
        
        return null;
    }
}
