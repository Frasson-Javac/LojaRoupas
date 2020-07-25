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
public class Usuario {
    
    File file=new File("Usuario.txt");
    ArrayList<Usuario>users=new ArrayList();
    public String nome;
    public String login;
    public String senha;
    public String perfil;
    public String Email;
    public String cpf;
    
    
    public Usuario() {
        recuperaruser();
    }

    public Usuario(String nome, String login, String senha, String perfil, String Email, String cpf) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.Email = Email;
        this.cpf = cpf;
    }

    public Usuario(String nome, String login, String perfil, String Email) {
        this.nome = nome;
        this.login = login;
        this.perfil = perfil;
        this.Email = Email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    
    

  


    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
    public void gravarusuario(String nome,String login,String senha,String perfil, String email,String cpf){
        if(!file.exists()){
            file=new File("Usuario.txt");
        }
        try{
            FileWriter fw=new FileWriter(file,true);
            PrintWriter pw=new PrintWriter(fw);
            pw.print(nome+";"+login+";"+senha+";"+perfil+";"+email+";"+cpf+"\n");
            
            pw.close();
           
           
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
        
    }
    
    public void recuperaruser(){
        
        try{
          
            FileReader fr=new FileReader(file);
            BufferedReader  br=new BufferedReader(fr);
            
            String linha="";
            linha=br.readLine();
            while(br.ready()){
                linha=br.readLine();
                String []vect=linha.split(";");
                String nome=vect[0];
                String user=vect[1];
                String password=vect[2];
                String perfil=vect[3];
                String email=vect[4];
                String cpf=vect[5];
                
                
                Usuario us=new Usuario(nome,user,password,perfil,email,cpf);
                users.add(us);
                
            }
           
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
        
    }
    
    public String verificarusuario(String login,String senha){
        if(!users.isEmpty()){
        for(int i=0;i<users.size();i++){
           
            if(users.get(i).getLogin().equals(login)&&users.get(i).getSenha().equals(senha)){   
                return users.get(i).getLogin();
                
            }
         
        }
        
        }else{
           
            JOptionPane.showMessageDialog(null, "Arquivo não existe registro no sistema");
        }
        return "";
    }
    
    public String verificarusuario(String cpf ){
        if(!users.isEmpty()){
        for(int i=0;i<users.size();i++){
           
            if(users.get(i).getCpf().equals(cpf)){ 
                return users.get(i).getCpf();
                
            }
         
        }
        
        
        }
        return null;
    }
    
     public String verificarus(String login, String senha ){
        if(!users.isEmpty()){
        for(int i=0;i<users.size();i++){
           
            if(users.get(i).getLogin().equals(login)&&users.get(i).getSenha().equals(senha)){ 
             
                return "encontrado";
                
            }
         
        }
        
        
        }
        return "";
    }
      

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", login=" + login + ", senha=" + senha + ", perfil=" + perfil + ", Email=" + Email + ", cpf=" + cpf + '}';
    }
       
       
    
}



