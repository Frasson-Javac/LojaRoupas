/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
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
    private Date nascimento;
    private ArrayList<Cliente>listagemClientes=new ArrayList<>();

    public Cliente() {
        super();
    }

    public Cliente(String cpf, String nome, char sexo, String email, String endereco, String telefone, Date data) {
        super(email, endereco, telefone);
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento=data;
    }

    
    
    public Cliente(String cpf, String nome, char sexo, Date data) {
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
    
    
    
    

   
    

    @Override
    public void gravarArquivo(Object cliente) {
       
        try{
           super.fw=new FileWriter(file,true);
           super.pw =new PrintWriter(fw);
           super.pw.print(cliente+"\n");
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
       try{
           super.fr=new FileReader(file);
           super.br=new BufferedReader(fr);
           String linha="";
           while(br.ready()){
               linha=br.readLine();
               String [] dados=linha.split(";");
               String nome=dados[0];
               String cpf=dados[1];
                        char sexo=dados[2].charAt(0);
                       String email=dados[3];
                String emdreco=dados[4];
                        String telefone=dados[5];
                        
                        
               
               
           }
           
       }catch(Exception e){
           
       }
    }
    
    
    public void cadastrarcliente(String nome,String cpf, String email,String telefone,String endereco, char sexo, Date date ){
        

 
            
            
            Cliente cliente= new Cliente(cpf, nome, sexo, email, endereco, telefone, date);
            this.gravarArquivo(cliente);
            
       
        
        }
    
       
     


    @Override
    public String toString() {
        String s="";
        return s+=this.nome+";"+
                this.cpf+";"+
                this.sexo+";"+
                super.toString();
        
        
    }

    
}
    
    
    
    
    

