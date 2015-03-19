/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import modelo.Quarto;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Lucas
 */
public class ControleQuartos {
    private ArrayList<Quarto> listaQuartos;
    
    public ControleQuartos(){
        listaQuartos = new ArrayList<>();
    }
    
    public boolean criarQuarto(int numero){
        Quarto quarto = new Quarto();
        quarto.setNumero(numero);
            listaQuartos.add(quarto);
            return true;
    }
    
    public void addQuarto(Quarto quarto){
        listaQuartos.add(quarto);
    }
    
    public Quarto getQuartoByNumber(int number){
        return listaQuartos.get(number);
    }
    
    public void rmQuartoNumber(int number){
        listaQuartos.remove(number);
    }
    
    public void rmQuarto(Quarto quarto){
        listaQuartos.remove(quarto);
    }
    
    public boolean checarNumeroQuarto(int numero){
        for(Quarto quarto: listaQuartos){
            if(quarto.getNumero() == numero)
                return true;
        }
        return false;
    }
    
    public JComboBox getJComboBoxNumerosDeQuartos()
    {
        JComboBox jComboBox = new javax.swing.JComboBox();
        
        for(Quarto quarto: listaQuartos)
            jComboBox.addItem(quarto.getNumero());

        return jComboBox;
    }
    
    //new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" })
    
    public String[] getStringArrayNumerosDosQuartos(){
        String[] arrayQuartos = null;
        int i = 0;
        
        for(Quarto quarto: listaQuartos){
            arrayQuartos[i] = (String.valueOf(quarto.getNumero()));
            i++;
        }
        
        return arrayQuartos;
    }
            
    
    public void gerarRelatorioQuarto(int number){
        //Gerar Relatorio com produtos pagos e data
    }
}
