/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer_3_1;

/**
 *
 * @author Derick
 */
public class Televisao {
    int volume, canal;
    
    void receberValores(int volume, int canal){
        this.canal = canal;
        this.volume = volume;
    }
    
    
    void aumentar_volume(){
        if (this.volume <100){
            this.volume++;
        }else{}
        
    }
    
     void diminuir_volume(){
        if (this.volume >0){
            this.volume--;
        }else{}
        
    }
    
      void aumentar_canal(){
        if (this.canal <100){
            this.canal++;
        }else{this.canal = 1;}
        
    } 
    
    void diminuir_canal(){
        if (this.canal >0){
            this.canal--;
        }else{}
    }
    
    void trocar_canal(int canal){
        if(canal>=0  && canal<=100){
        this.canal = canal;
    }else{}
    }

    void mostrar_info(){
        System.out.println("\nCanal:"+ canal + " Volume:"+ volume);
    }
}
