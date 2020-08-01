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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Fornecedor {
    
    private File file=new File("Fornecedor.txt");
    private String nome_da_empresa;
    private String cnpj;
    public String telefone;
    private String email;
    private String Endereco;
    public ArrayList<Fornecedor>fornecedor=new ArrayList<>();

    

    public Fornecedor() {
        recuperar();
    }

    public Fornecedor(String nome_da_empresa, String cnpj, String telefone, String email,String endereco) {
        this.nome_da_empresa = nome_da_empresa;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.Endereco=endereco;
    }

    public ArrayList<Fornecedor> getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(ArrayList<Fornecedor> fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    

    public String getNome_da_empresa() {
        return nome_da_empresa;
    }

    public void setNome_da_empresa(String nome_da_empresa) {
        this.nome_da_empresa = nome_da_empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadatrarfonnecedor(String nome_empresa,String cnpj,String telefone,String Email,String endereco){
    
      //  
       /// Arquivo arquivo=new Arquivo();
     //   arquivo.gravar_no_arquivo(file, nome_empresa,cnpj,telefone,Email,endereco);
        
    }

    public void recuperar(){
        
        try{
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String linha;
            linha=br.readLine();
            
            while(br.ready()){
                linha=br.readLine();
                String []vector=linha.split(";");
                String nome_Empresa=vector[0];
                String cnpj=vector[1];
                String telefone=vector[2];
                String email=vector[3];
                String endereco=vector[4];
                
                Fornecedor forn=new Fornecedor(nome_Empresa,cnpj,telefone,email,endereco);
                fornecedor.add(forn);
                
                
                
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    
    public void  verifica(){
        
        
        
    }

 
    
    }
        
    
    
    

