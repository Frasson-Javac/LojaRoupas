/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Usuario;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class consultausuario extends javax.swing.JInternalFrame {
 Usuario user=new Usuario();

    /**
     * Creates new form ConsultarUsuario
     */
    public consultausuario() {
     
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpesquisar = new javax.swing.JButton();
        NomePesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPesquisarUsuarios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Pesquisar Usuário");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        NomePesquisar.setText("Digite o Nome do Usuario");
        NomePesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomePesquisarMouseClicked(evt);
            }
        });
        NomePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomePesquisarKeyPressed(evt);
            }
        });

        TabelaPesquisarUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Login", "Perfil", "Email"
            }
        ));
        TabelaPesquisarUsuarios.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TabelaPesquisarUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnpesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // TODO add your handling code here:
        
        
       
        String nomePesquisa=NomePesquisar.getText();
        int i=pesquisa(nomePesquisa);
        
        if(i!=-1){
        String nome = user.getUsers().get(i).getNome();;
        String login = user.getUsers().get(i).getLogin();
        String perfil = user.getUsers().get(i).getPerfil();
        String email = user.getUsers().get(i).getEmail();
        Object[]date={nome,login,perfil,email};
       DefaultTableModel dtn=(DefaultTableModel)TabelaPesquisarUsuarios.getModel();
       dtn.removeTableModelListener(TabelaPesquisarUsuarios);
        dtn.addRow(date);
       
      
        }else{
            
                  JOptionPane.showMessageDialog(null,"Não Exite usuário com esse CPF"+nomePesquisa);
        }
        
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void NomePesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomePesquisarKeyPressed
        // TODO add your handling code here:   /// Estudar aqui
          String nomePesquisa=NomePesquisar.getText();
          int quat=nomePesquisa.length();
          
         DefaultTableModel dtn=(DefaultTableModel)TabelaPesquisarUsuarios.getModel();
         dtn.setRowCount(0);
        
       for(int i=0;i<user.getUsers().size();i++)    {
          
        if(user.getUsers().get(i).getNome().length()>=nomePesquisa.length()){
            String list=user.getUsers().get(i).getNome().substring(0,quat);
           
            if(nomePesquisa.equalsIgnoreCase(list)){
                 
                  String []table={user.getUsers().get(i).getNome(),user.getUsers().get(i).getCpf(),user.getUsers().get(i).getLogin(),
            user.getUsers().get(i).getPerfil(),user.getUsers().get(i).getEmail()
               
            
        };
                  dtn.addRow(table);
        
        
           
            }
           
        }
      
       }
        
        
    }//GEN-LAST:event_NomePesquisarKeyPressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
       NomePesquisar.setForeground(Color.gray);
        DefaultTableModel dtn=(DefaultTableModel)TabelaPesquisarUsuarios.getModel();
       
        
     
        for(int i=0;i<user.getUsers().size();i++){
          
        String dados []={user.getUsers().get(i).getNome(),user.getUsers().get(i).getCpf(),user.getUsers().get(i).getLogin(),
            user.getUsers().get(i).getPerfil(),user.getUsers().get(i).getEmail()};
            dtn.addRow(dados);
        }
        
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void NomePesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomePesquisarMouseClicked
        // TODO add your handling code here:
            NomePesquisar.setForeground(Color.BLACK);
            NomePesquisar.setText("");
        
    }//GEN-LAST:event_NomePesquisarMouseClicked
public int pesquisa (String pramNome){
    Usuario user=new Usuario();
    for(int i=0;i<user.getUsers().size();i++)    {
        if(user.getUsers().get(i).getNome().equals(pramNome)){
           
         
           return i;
        }
            
    } 
    return -1;
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomePesquisar;
    private javax.swing.JTable TabelaPesquisarUsuarios;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
