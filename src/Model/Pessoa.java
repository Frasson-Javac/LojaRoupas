/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author vinic
 */
public abstract class Pessoa extends arquivo {
    
    private String email;
    private String  endereco;
    private String telefone;

    
    public Pessoa(){
        super();
        
    }

    public Pessoa( String telefone,String email, String endereco) {
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
       
    }
    
    
    
    
   

    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String s="";
     s= 
             this.getTelefone()+";"
             +this.getEmail()+";"
             +this.getEndereco();

   
    
    
    return s;
    }
    
    
    
}
