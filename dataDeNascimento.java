/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author Derick
 */
public class dataDeNascimento {
   public int dia, mes, ano;
    
    public dataDeNascimento (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes; 
        this.ano = ano;
    }
    public void imprimirData(){
        System.out.println("Data:"+dia+"/"+mes+"/"+ano);
        
    }
}
