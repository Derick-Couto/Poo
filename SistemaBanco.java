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
public class SistemaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean consegui;
        Conta minhaConta, contaDestino;
        
        Pessoa maria, joao, felipe;
        Endereco je = new Endereco("endje", "come", "je1", "ki", 50);

        maria = new Pessoa("Maria", new Endereco("aaa","aa","aaaa","a",1), new Telefone(22,837), new dataDeNascimento(21,12,1999));
        joao = new Pessoa("Joao",je,new Telefone(2,3), new dataDeNascimento(21,11,1111));
        felipe = new Pessoa("Felipe",new Endereco("aab","bb","aacca","cas",213), new Telefone(222,8337), new dataDeNascimento(211,122,13999));
        
        minhaConta = new Conta(maria, 1000, 700);
        minhaConta.imprimir();
        
        contaDestino = new Conta(joao, 500);
        contaDestino.deposita(200);
        contaDestino.imprimir();
        
        Conta contaFelipe = new Conta(felipe, 400, 300);
        
        consegui = minhaConta.saca(700);
        if (consegui == true)
            System.out.println("Saque realizado com sucesso!");
        else
            System.out.println("Saldo Insuficiente!");
        
        minhaConta.transferirPara(contaDestino, 500);
        
        minhaConta.imprimir();
        contaDestino.imprimir();
        contaFelipe.imprimir();
    }
}