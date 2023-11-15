/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer_3_2;

/**
 *
 * @author Derick
 */
public class Relogio {
    int minutos, horas;
    
   void inicia(){
       this.horas = 0;
       this.minutos = 0;
   }
   
   
   void eventoRelogio(){
       if(this.minutos<59)
       {
       this.minutos++;
       }else{
                if (this.horas <24)
                {
                    this.horas++;
                    this.minutos = 0;
                }else
                {
                    this.horas = 0;
                    this.minutos = 0;
                }
            }
   }

void mostrarInfo(){
    System.out.println("|"+this.horas+":"+this.minutos+"|\n");
}

}