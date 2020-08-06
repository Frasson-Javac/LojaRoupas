/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Cliente;
import Model.utilitarios;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author vinic
 */
public class CadastrarCliente extends javax.swing.JInternalFrame {

    Cliente cliente = new Cliente();
    static char sexo = 0;

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboBox_TipoDocumento = new javax.swing.JComboBox<>();
        lbltipodocumento = new javax.swing.JLabel();
        campoformatado_cpf = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoFormatado_Telefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        btn_cadastrarCliente = new javax.swing.JButton();
        btn_limparCampos = new javax.swing.JButton();
        campoformatadoCnpj = new javax.swing.JFormattedTextField();
        txt_email = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
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

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel21.setText("Cadastrar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        txt_nomeCliente.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tipo documento");

        comboBox_TipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "CPF", "CNPJ" }));
        comboBox_TipoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_TipoDocumentoItemStateChanged(evt);
            }
        });
        comboBox_TipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_TipoDocumentoActionPerformed(evt);
            }
        });

        lbltipodocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbltipodocumento.setText("CPF");

        campoformatado_cpf.setBackground(new java.awt.Color(255, 255, 204));
        try {
            campoformatado_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoformatado_cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jRadioButton1.setText("Masculino");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusLost(evt);
            }
        });

        jRadioButton2.setText("Feminino");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButton2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRadioButton2FocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Telefone");

        CampoFormatado_Telefone.setBackground(new java.awt.Color(255, 255, 204));
        try {
            CampoFormatado_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Endereço");

        txt_Endereco.setBackground(new java.awt.Color(255, 255, 204));

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Telefone", "Email", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(jtable_clientes);

        btn_cadastrarCliente.setText("Cadastrar");
        btn_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarClienteActionPerformed(evt);
            }
        });

        btn_limparCampos.setText("Limpar");
        btn_limparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparCamposActionPerformed(evt);
            }
        });

        campoformatadoCnpj.setBackground(new java.awt.Color(255, 255, 204));
        try {
            campoformatadoCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoformatadoCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_email.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(comboBox_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lbltipodocumento)
                        .addGap(5, 5, 5)
                        .addComponent(campoformatado_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(campoformatadoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton1)
                            .addGap(14, 14, 14)
                            .addComponent(jRadioButton2)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(CampoFormatado_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel7)
                            .addGap(22, 22, 22)
                            .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(793, 793, 793)
                            .addComponent(btn_limparCampos)
                            .addGap(18, 18, 18)
                            .addComponent(btn_cadastrarCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(CampoFormatado_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoformatado_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoformatadoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbltipodocumento)
                            .addComponent(jLabel6))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limparCampos)
                    .addComponent(btn_cadastrarCliente))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        String documento =null;
        char sex = 0;

        int campos = camposObrigatorios();
        if (campos == 1) {

            if (jRadioButton1.isSelected()) {

                sex = 'm';

            } else if (jRadioButton2.isSelected()) {
                sex = 'f';

            }
            String telefone = (String) CampoFormatado_Telefone.getText();
            
            if (!campoformatado_cpf.equals("   .   .   -  ")||(!campoformatadoCnpj.equals("  .   .   /    -  "))){
                
                 documento=(String)campoformatado_cpf.getText();
                
            } else if(!campoformatadoCnpj.equals("  .   .   /    -  ")){
                       documento=(String)campoformatadoCnpj.getText();
            }

            cliente.cadastrarcliente(txt_nomeCliente.getText(),documento , txt_email.getText(), telefone, txt_Endereco.getText(), sex);

            String[] dados = {txt_nomeCliente.getText(), documento, txt_email.getText(), telefone, txt_Endereco.getText(), String.valueOf(sex)};

            DefaultTableModel dtn = (DefaultTableModel) jtable_clientes.getModel();

            dtn.addRow(dados);
        
            JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso !!!");
            limparCampos();
        
       
        }else{
            JOptionPane.showMessageDialog(null, "Favor preencher todos os Campos !!!");
            
        }


    }//GEN-LAST:event_btn_cadastrarClienteActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusGained
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setSelected(true);
            sexo = 'm';

        } else if (jRadioButton2.isSelected()) {
            jRadioButton2.setSelected(false);

        }
    }//GEN-LAST:event_jRadioButton1FocusGained

    private void jRadioButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton2FocusGained
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setSelected(false);

        } else if (jRadioButton2.isSelected()) {
            jRadioButton2.setSelected(true);
        }
    }//GEN-LAST:event_jRadioButton2FocusGained

    private void jRadioButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusLost
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
        }


    }//GEN-LAST:event_jRadioButton1FocusLost

    private void jRadioButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton2FocusLost
        // TODO add your handling code here:
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2FocusLost

    private void btn_limparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparCamposActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btn_limparCamposActionPerformed
    public void formtacnpj() {

        try {

            MaskFormatter msk2 = new MaskFormatter("##.###.###/####-##");
            lbltipodocumento.setText("CNPJ");
            campoformatado_cpf.setEditable(true);

            campoformatado_cpf.setFormatterFactory(new DefaultFormatterFactory(msk2));

        } catch (ParseException ex) {

        }
    }

    public void formatcpf() {

        try {

            MaskFormatter msk1 = new MaskFormatter("###.###.###-##");

            lbltipodocumento.setText("CPF");
            campoformatado_cpf.setFormatterFactory(new DefaultFormatterFactory(msk1));
        } catch (ParseException ex) {

        }
    }


    private void comboBox_TipoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_TipoDocumentoItemStateChanged
        // TODO add your handling code here:// verificar a logica aqui , comflito na seleçaõ campo ficando em branco 
        utilitarios util = new utilitarios();
        
        
      comboBox_TipoDocumento.setEnabled(true);
            
         if (comboBox_TipoDocumento.getSelectedItem().equals("CPF")) {
          lbltipodocumento.setText("CPF");
            campoformatado_cpf.setVisible(true);
            campoformatadoCnpj.setVisible(false);
               comboBox_TipoDocumento.setEnabled(false);

         } else if(comboBox_TipoDocumento.getSelectedItem().equals("CNPJ")){
            lbltipodocumento.setText("CNPJ");
             campoformatado_cpf.setVisible(false);
             campoformatadoCnpj.setVisible(true);
             comboBox_TipoDocumento.setEnabled(false);
           

         }
            
           
        

  


    }//GEN-LAST:event_comboBox_TipoDocumentoItemStateChanged

    private void comboBox_TipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_TipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_TipoDocumentoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        campoformatado_cpf.setEnabled(false);
        campoformatadoCnpj.setVisible(false);
    }//GEN-LAST:event_formInternalFrameOpened
    public void limparCampos() {

        txt_nomeCliente.setText("");
        txt_Endereco.setText("");
        txt_email.setText("");
        //   campoformatado_cpf.setText("");
        lbltipodocumento.setText("CPF");
        CampoFormatado_Telefone.setText("");
        comboBox_TipoDocumento.setSelectedIndex(0);
        comboBox_TipoDocumento.setEnabled(true);
        campoformatadoCnpj.setText("");
        campoformatadoCnpj.setText("");

        if (jRadioButton1.isSelected()) {
            jRadioButton1.setSelected(false);

        } else if (jRadioButton2.isSelected()) {
            jRadioButton2.setSelected(false);

        }

    }

    public int camposObrigatorios() {

        // falta colocar o padão do cnpj no if
        if (txt_nomeCliente.getText() != "" && txt_Endereco.getText() != "" && txt_email.getText() != "" && campoformatado_cpf.getSelectedText() != "   .   .   .-  " && CampoFormatado_Telefone.getText() != "(  )    -    " && comboBox_TipoDocumento.getSelectedItem() != "Selecione") {

            return 1;// se retorar 1 foi preenchido todos os campos
        }
        return 0;// se retornar 0 não foi preenchido todos os campos
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CampoFormatado_Telefone;
    private javax.swing.JButton btn_cadastrarCliente;
    private javax.swing.JButton btn_limparCampos;
    private javax.swing.JFormattedTextField campoformatadoCnpj;
    private javax.swing.JFormattedTextField campoformatado_cpf;
    private javax.swing.JComboBox<String> comboBox_TipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_clientes;
    private javax.swing.JLabel lbltipodocumento;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nomeCliente;
    // End of variables declaration//GEN-END:variables
}
