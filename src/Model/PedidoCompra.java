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
public class PedidoCompra {
   private File file=new File("Pedido_compra.txt");
    
   private int codPedido;
   private String nome_Produto;
   private String descricao;
   private String tamanho;
   private String genero;
   private int qtde;
   private double valor_Unitario;
   private double valor_Total;
   private String nome_fornecedor;
   private String data;
   private String hora;
   
   private ArrayList<PedidoCompra>pedidos=new ArrayList();
   
   
   public PedidoCompra(){
       recuperar();
   }
   
 
 
     
          public PedidoCompra(int cod,String nome,String desc,String tam,String genero,int qte,double valorUnit,double valortot,String fornecedor){
       utilitarios util=new utilitarios();
       this.codPedido=cod;
       this.nome_Produto=nome;
       this.descricao=desc;
       this.tamanho=tam;
       this.genero=genero;
       this.qtde=qte;
       this.valor_Unitario=valorUnit;
       this.valor_Total=valortot;
       this.nome_fornecedor=fornecedor;
       this.data=util.obter_data();
       this.hora=util.obter_hora();
      
     
   }
          
           public PedidoCompra(int cod,String nome,String desc,String tam,String genero,int qte,double valorUnit,double valortot,String fornecedor,String dta,String hora){
       utilitarios util=new utilitarios();
       this.codPedido=cod;
       this.nome_Produto=nome;
       this.descricao=desc;
       this.tamanho=tam;
       this.genero=genero;
       this.qtde=qte;
       this.valor_Unitario=valorUnit;
       this.valor_Total=valortot;
       this.nome_fornecedor=fornecedor;
       this.data=dta+util.obter_data();
       this.hora=hora+util.obter_hora();
      
     
   }

    

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public String getNome_Produto() {
        return nome_Produto;
    }

    public void setNome_Produto(String nome_Produto) {
        this.nome_Produto = nome_Produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor_Unitario() {
        return valor_Unitario;
    }

    public void setValor_Unitario(double valor_Unitario) {
        this.valor_Unitario = valor_Unitario;
    }

    public double getValor_Total() {
        return valor_Total;
    }

    public void setValor_Total(double valor_Total) {
        this.valor_Total = valor_Total;
    }

    public ArrayList<PedidoCompra> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<PedidoCompra> pedidos) {
        this.pedidos = pedidos;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
   
    
    
    public void gravar(PedidoCompra pd){
        
        
        
        
        try{
            
            FileWriter fw=new FileWriter(file,true);
            PrintWriter pw=new PrintWriter(fw);
            pw.println(pd.toString());
            pw.flush();
            pw.close();
            
            
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
        
        
    }
    
    public void  recuperar(){
        
        
        
        try{
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            
            
            String linha;
            linha=br.readLine();
            while(br.ready()){
               linha=br.readLine();
                
                String []vector=linha.split(";");
                int cod=Integer.parseInt(vector[0]);
                String produto=vector[1];
                String desc=vector[2];
                String tam=vector[3];
                String genero=vector[4];
               
                int qtde=Integer.parseInt(vector[5]);
                double valorunit=Double.parseDouble(vector[6]);
                double valorTotal=Double.parseDouble(vector[7]);
                String nomeFornecedor=vector[8];
                String data=vector[9];
                String hora=vector[10];
                PedidoCompra pd=new PedidoCompra(cod, produto, desc, tam, genero, qtde, valorunit, valorTotal, nomeFornecedor,data,hora);
                pedidos.add(pd);
                
                
                 
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
       
    }
    public String obter_codigo(){
     int maior = this.getPedidos().size();
   
        if (this.getPedidos().size() == 0) {
           return "1";

        } else {
           maior+=1;
           String s=""+maior;
           return  s;
         
        }
  
}

       
    @Override
    public String toString() {
        String s="";
        return  s+=
                codPedido+";"+
                nome_Produto+";"+
                descricao+";"+
                tamanho+";"+
                genero+";"+
                qtde+";"+
                valor_Unitario+";"+
                valor_Total+";"+
                nome_fornecedor+";"+
                data+";"+
                hora;
    }
    
    
   
   
 
   
   
   
   
    
}
