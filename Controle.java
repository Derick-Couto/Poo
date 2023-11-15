/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer_3_1;

/**
 *
 * @author Derick
 */
public class Controle {
    Televisao tv = new Televisao();
    
    public void receberValores(){
    tv.receberValores(3, 15);
    }
    
    public void trocarCanal(int canal){
        tv.trocar_canal(canal);
        }
    
    public void aumentarCanal(){    
    this.tv.aumentar_canal();
    }

public void diminuirCanal(){    
    this.tv.diminuir_canal();
    }

public void aumentarVolume(){    
    this.tv.aumentar_volume();
    }

public void diminuirVolume(){    
    this.tv.diminuir_volume();
    }

public void mostrarInfo(){    
    this.tv.mostrar_info();
    }
}