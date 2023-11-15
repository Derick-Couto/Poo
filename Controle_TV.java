/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_5_poo;

/**
 *
 * @author aluno
 */
public class Controle_TV {
    private TV tv;
    
    public Controle_TV (TV tv) {
        this.tv = tv;
    }
    
    public void aumentarVolume () {
        tv.aumentarVolume();
    }
    
    public void diminuirVolume () {
        tv.diminuirVolume();
    }
    
    public void proximoCanal () {
        tv.proximoCanal();
    }
    
    public void ultimoCanal () {
        tv.ultimoCanal();
    }
    
    public void inserirCanal (int canal) {
        tv.inserirCanal(canal);
    }
    
    void infoVolumeCanal () {
        tv.infoVolumeCanal();
    }
    
}
