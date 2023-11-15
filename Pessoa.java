/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

/**
 *
 * @author Felipe Marques
 */
public class Pessoa {
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private dataDeNascimento nascimento;
    
    
    public Pessoa(String nome, Endereco endereco, Telefone telefone, dataDeNascimento nascimento ) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    
    
    public void imprimir() {
        System.out.println("+----------------------------------+");
        System.out.println("Nome: " + nome);
        this.endereco.imprimirEndereco();
        this.telefone.imprimirTel();
        this.nascimento.imprimirData();
        System.out.println("+----------------------------------+");
    }
}
