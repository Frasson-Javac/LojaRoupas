/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedWriter;
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

    public Pessoa(String email, String endereco, String telefone) {
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    
    
    
    public Pessoa(String email, String endereco, String telefone, FileWriter fr, PrintWriter pw, BufferedWriter br) {
        super(fr, pw, br);
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa(FileWriter fr, PrintWriter pw, BufferedWriter br) {
        super(fr, pw, br);
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
        return s+=this.email+"\n"+
                this.endereco+"\n"+
                this.telefone;
    }
    
    
    
    
    
    
    
}
