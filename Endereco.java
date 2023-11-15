/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabanco;

/**
 *
 * @author Derick
 */
public class Endereco {
    private String logradouro, complemento, cidade, estado;
    private int cep;
    
    public Endereco(String logradouro, String complemento, String cidade, String estado, int cep){
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.logradouro = logradouro;
    }
    
    public void imprimirEndereco (){
        System.out.println("cep:"+cep+"\ncidade:"+cidade+"\ncomplemento:"+complemento+"\nestado:"+estado+"\nlogradouro:"+logradouro);
    }
}
