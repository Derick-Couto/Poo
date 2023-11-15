/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_5_poo;

/**
 *
 * @author aluno
 */
public class Aula_5_PoO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV tv1 = new TV (2, 15);
        Controle_TV cr1 = new Controle_TV (tv1);
        
        tv1.infoVolumeCanal ();
        tv1.aumentarVolume();
        tv1.infoVolumeCanal();
        tv1.proximoCanal();
        tv1.infoVolumeCanal();
        
    }
    
}
