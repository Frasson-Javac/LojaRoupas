/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vinic
 */
public class testarcliente {
    public static void main(String[] args) {
        String nome="vinicius";
        String email=".com";
        String cpf = "111";
        String end="rua ";
        String telefone="111111111";
        char sexo='m';
        
        Cliente cli = new Cliente();
        
        cli.cadastrarcliente(nome, cpf, email, telefone, end, sexo);
       
    
        
     //  cli.getListagemClientes().add(cli);
         
        System.out.println(cli.getListagemClientes());
    }
}
