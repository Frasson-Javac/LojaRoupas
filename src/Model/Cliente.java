/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    private String nascimento;
    private ArrayList<Cliente>listagemClientes=new ArrayList<>();

    public Cliente() {
       
        
       
       recuperar();
      
    }

    public Cliente(String cpf, String nome, char sexo, String email, String endereco, String telefone, String data) {
        super(telefone, email, endereco);
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento=data;
        
    }

    
    
    public Cliente(String cpf, String nome, char sexo, String data) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento=data;
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
    
    

   
    

    @Override
    public void gravarArquivo(Object cliente) {
       
        try{
           super.fw=new FileWriter(file,true);
           super.pw =new PrintWriter(fw);
           super.pw.print(cliente+"\n");
           pw.close();
           fw.close();
           
        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
            
        }
    }

    @Override
    public void lerarquivo() {
        
        
        
    }

   

    public void recuperar() {
        
       try{
           super.fr=new FileReader(file);
            super.br=new BufferedReader(fr);
           String linha;
           while(super.br.ready()){
               linha=super.br.readLine();
               String [] dados=linha.split(";");
               String nome=dados[0];
               String cpfs=dados[1];
                        char sexo=dados[2].charAt(0);
                        String nascimentos=dados[3];
                         String telefone=dados[4];
                       String email=dados[5];
                String endereco=dados[6];
                       
                        Cliente cliente=new Cliente(cpfs, nome, sexo, email, endereco, telefone, email);
                        listagemClientes.add(cliente);
                        
                        
               
               
           }
           
           
          
          
         
           
       }catch(Exception e){
           
       }
    }
    
    
    public void cadastrarcliente(String nome,String cpf, String email,String telefone,String endereco, char sexo, String date ){
        

 
            
            
            Cliente cliente= new Cliente(cpf, nome, sexo, email, endereco, telefone, date);
            this.gravarArquivo(cliente);
            
       
        
        }
    
       
     


    @Override
    public String toString() {
        String s="";
        return s+=this.nome+";"+
                this.cpf+";"+
                this.sexo+";"+
                this.nascimento+";"+
                super.toString();
        
        
    }

    
}
    
    
    
    
    

