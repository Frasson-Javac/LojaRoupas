/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Cliente extends Pessoa{
    
    public File file=new File("txt_clientes.txt");
    private String cpf;
    private String nome;
    private char sexo;
    private ArrayList<Cliente>listagemClientes=new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(String cpf, String nome, char sexo, String email, String endereco, String telefone) {
        super(email, endereco, telefone);
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }

    
    
    public Cliente(String cpf, String nome, char sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    
    
    

    public Cliente(String cpf, String nome, char sexo, FileWriter fr, PrintWriter pw, BufferedWriter br) {
        super(fr, pw, br);
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Cliente(String cpf, String nome, char sexo, String email, String endereco, String telefone, FileWriter fr, PrintWriter pw, BufferedWriter br) {
        super(email, endereco, telefone, fr, pw, br);
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        
        
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Cliente> getListagemClientes() {
        return listagemClientes;
    }

    public void setListagemClientes(ArrayList<Cliente> listagemClientes) {
        this.listagemClientes = listagemClientes;
    }
    
    
    
    

   
    

    @Override
    public void gravarArquivo() {
       
        try{
           super.fr=new FileWriter(file);
           super.pw =new PrintWriter(fr);
           super.pw.print(this.getListagemClientes().toString());
           pw.close();
        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
            
        }
    }

    @Override
    public void lerarquivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recuperar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void cadastrarcliente(Cliente cliente){
        
   cliente=new Cliente();
        for(int i=0;i<listagemClientes.size();i++){
            
            listagemClientes.add( cliente);
            
        }
        gravarArquivo();
     
}

    @Override
    public String toString() {
        String s="";
        return s+=this.nome+"\n"+
                this.cpf+"\n"+
                super.toString();
        
        
    }

    
}
    
    
    
    
    

