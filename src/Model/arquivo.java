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
public abstract class arquivo {
    
    FileWriter fw;
    PrintWriter pw;
     BufferedReader br;
     FileReader fr;
    
    
    public arquivo(){
        
    }

    public arquivo(FileWriter fw, PrintWriter pw, BufferedReader br, FileReader fr) {
        this.fw = fw;
        this.pw = pw;
        this.br = br;
        this.fr=fr;
    }

    public FileWriter getFr() {
        return fw;
    }

    public void setFr(FileWriter fr) {
        this.fw = fw;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }
    
    
    
    
    
    
    public abstract void gravarArquivo(Object obj);
        
    
    
    public abstract void lerarquivo();
    
    public abstract void recuperar();
        
    
}
