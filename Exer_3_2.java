/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer_3_2;

import java.util.Iterator;

/**
 *
 * @author Derick
 */
public class Exer_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relogio r1 = new Relogio();
        r1.inicia();
        for (int i=0; i<=1; i=0) {
            r1.eventoRelogio();
            r1.mostrarInfo();   
        }
    }
    
}
