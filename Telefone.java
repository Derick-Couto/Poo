/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author Derick
 */
public class Telefone {
    int area, tel;
    
    public Telefone (int area, int tel){
        this.area = area;
        this.tel = tel;
    }
 public void imprimirTel(){
     System.out.println("Telefone:"+"("+area+") "+tel);
 }
    
}
