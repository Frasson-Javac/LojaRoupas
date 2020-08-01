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
public abstract class arquivo {
    
    FileWriter fr;
    PrintWriter pw;
    private BufferedWriter br;
    
    
    public arquivo(){
        
    }

    public arquivo(FileWriter fr, PrintWriter pw, BufferedWriter br) {
        this.fr = fr;
        this.pw = pw;
        this.br = br;
    }

    public FileWriter getFr() {
        return fr;
    }

    public void setFr(FileWriter fr) {
        this.fr = fr;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }

    public BufferedWriter getBr() {
        return br;
    }

    public void setBr(BufferedWriter br) {
        this.br = br;
    }
    
    
    
    
    
    public abstract void gravarArquivo();
        
    
    
    public abstract void lerarquivo();
    
    public abstract void recuperar();
        
    
}
