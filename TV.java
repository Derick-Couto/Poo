/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_5_poo;

/**
 *
 * @author aluno
 */
public class TV {
    
    private int canal;
    private int volume;
    
    public TV (int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }
    
    public TV () {
        canal = 1;
        volume = 10;
    }
    
    public void aumentarVolume () {
        if (volume < 100)
            volume++;
    }
    
    public void diminuirVolume () {
        if (volume > 0)
            volume--;
    }
    
    public void proximoCanal () {
        if (canal < 200)
            canal++;
        else
            canal = 1;
    }
    
    public void ultimoCanal () {
        if (canal > 0)
            canal--;
        else
            canal = 200;
    }
    
    public void inserirCanal (int canal) {
        if (canal > 0 && canal <= 200)
            this.canal = canal;
    }
    
    public void infoVolumeCanal () {
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume + '\n');
    }
    
}

