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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
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
    static String documento =null;
    static String telefone=null;
    TELEFONE tel=new TELEFONE();
    GerarIntenalFrameCentralizado gerar=new GerarIntenalFrameCentralizado();
    

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
        jLabel7 = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        btn_cadastrarCliente = new javax.swing.JButton();
        btn_limparCampos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboBox_TipoDocumento = new javax.swing.JComboBox<>();
        campoformatadoCnpj = new javax.swing.JFormattedTextField();
        lbltipodocumento = new javax.swing.JLabel();
        campoformatado_cpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_data = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        JRatioTipoFixo = new javax.swing.JRadioButton();
        JRatioTipoMovel = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 247, 247));
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

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

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
        txt_nomeCliente.setText("Digite o nome do Cliente");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Endereço");

        txt_Endereco.setBackground(new java.awt.Color(255, 255, 204));
        txt_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnderecoActionPerformed(evt);
            }
        });

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF/CNPJ", "Telefone", "Email"
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        campoformatadoCnpj.setBackground(new java.awt.Color(255, 255, 204));
        try {
            campoformatadoCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoformatadoCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbltipodocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbltipodocumento.setText("CPF");

        campoformatado_cpf.setBackground(new java.awt.Color(255, 255, 204));
        try {
            campoformatado_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoformatado_cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(comboBox_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltipodocumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoformatado_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoformatadoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_TipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltipodocumento)
                    .addComponent(campoformatado_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoformatadoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        txt_email.setBackground(new java.awt.Color(255, 255, 204));
        txt_email.setText("example@gmail.com");
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento");

        txt_data.setText("01/12/2011");
        txt_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dataKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        JRatioTipoFixo.setBackground(new java.awt.Color(255, 255, 255));
        JRatioTipoFixo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JRatioTipoFixo.setText("FIXO");
        JRatioTipoFixo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JRatioTipoFixoItemStateChanged(evt);
            }
        });
        JRatioTipoFixo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRatioTipoFixoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JRatioTipoFixoFocusLost(evt);
            }
        });
        JRatioTipoFixo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRatioTipoFixoMouseClicked(evt);
            }
        });

        JRatioTipoMovel.setBackground(new java.awt.Color(255, 255, 255));
        JRatioTipoMovel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JRatioTipoMovel.setText("MOVEL");
        JRatioTipoMovel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JRatioTipoMovelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JRatioTipoMovelFocusLost(evt);
            }
        });
        JRatioTipoMovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRatioTipoMovelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JRatioTipoFixo)
                .addGap(18, 18, 18)
                .addComponent(JRatioTipoMovel)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRatioTipoFixo)
                    .addComponent(JRatioTipoMovel))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jButton1.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(txt_nomeCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_limparCampos)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cadastrarCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrarCliente)
                    .addComponent(btn_limparCampos))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarClienteActionPerformed
        // TODO add your handling code here:
        
        char sex = 0;
        

        int campos = camposObrigatorios();
        if (campos == 1) {

            if (jRadioButton1.isSelected()) {

                sex = 'm';

            } else if (jRadioButton2.isSelected()) {
                sex = 'f';

            }
           
            String formatar=txt_data.getText();
            SimpleDateFormat sf=new SimpleDateFormat("dd/MM/yyyy");
          
            Date data=new Date();
            try {
                data=sf.parse(formatar);
                cliente.setNascimento(data);
            } catch (ParseException ex) {
                Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
            
            if (comboBox_TipoDocumento.getSelectedItem().equals("CPF")){
                
                 documento=(String)campoformatado_cpf.getText();
                
            } else if(comboBox_TipoDocumento.getSelectedItem().equals("CNPJ")){
                       documento=(String)campoformatadoCnpj.getText();
            }

            cliente.cadastrarcliente(txt_nomeCliente.getText(),documento , txt_email.getText(), telefone, txt_Endereco.getText(), sex,cliente.getNascimento());

            String[] dados = {txt_nomeCliente.getText(), documento, txt_email.getText(), telefone, txt_Endereco.getText(), String.valueOf(sex),cliente.getNascimento().toString()};

            DefaultTableModel dtn = (DefaultTableModel) jtable_clientes.getModel();

            dtn.addRow(dados);
            limparCampos();
            JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso !!!");
            
        
       
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
          campoformatado_cpf.setEditable(true);
          campoformatado_cpf.setEnabled(true);
                  
                  
            
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
         txt_email.setForeground(Color.gray);
    }//GEN-LAST:event_formInternalFrameOpened

    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        // TODO add your handling code here:
       txt_email.setForeground(Color.black);
       txt_email.setText("");
       
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnderecoActionPerformed

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed
        // TODO add your handling code here:
        String txtoexemplo=txt_email.getText();
        System.out.println(txtoexemplo);
        if(txt_email.equals(txtoexemplo)){
            txt_email.setText(""); 
            
        }
    }//GEN-LAST:event_txt_emailKeyPressed

    private void JRatioTipoFixoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JRatioTipoFixoItemStateChanged
       
    }//GEN-LAST:event_JRatioTipoFixoItemStateChanged

    private void JRatioTipoFixoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRatioTipoFixoFocusGained
        //
    }//GEN-LAST:event_JRatioTipoFixoFocusGained

    private void JRatioTipoMovelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRatioTipoMovelFocusGained
        // TODO add your handling code her
    }//GEN-LAST:event_JRatioTipoMovelFocusGained

    private void JRatioTipoFixoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRatioTipoFixoFocusLost
          
    }//GEN-LAST:event_JRatioTipoFixoFocusLost

    private void JRatioTipoMovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JRatioTipoMovelFocusLost
     
    }//GEN-LAST:event_JRatioTipoMovelFocusLost

    private void JRatioTipoFixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRatioTipoFixoMouseClicked
        // TODO add your handling code here:
          JRatioTipoMovel.setSelected(false);
          
        if(JRatioTipoFixo.isSelected()){
        JRatioTipoFixo.setSelected(true);
         JRatioTipoMovel.setSelected(false);
         tel.CampoFormatado_Telefone.setVisible(true);
         tel.CampoFormatado_Celular.setVisible(false);
             gerar.gerarcentalPaineis(tel,  TelaPrincipal.jLayeredPane1);
          
        
          
         
          
          
      }
    }//GEN-LAST:event_JRatioTipoFixoMouseClicked

    private void JRatioTipoMovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRatioTipoMovelMouseClicked
        // TODO add your handling code here:
         JRatioTipoFixo.setSelected(false);
        
        if(JRatioTipoMovel.isSelected()){
         JRatioTipoMovel.setSelected(true);
          JRatioTipoFixo.setSelected(false);
         tel.CampoFormatado_Celular.setVisible(true);
          tel.CampoFormatado_Telefone.setVisible(false);
          gerar.gerarcentalPaineis(tel,  TelaPrincipal.jLayeredPane1);
        
        
             
         
        
          
          
      }
    }//GEN-LAST:event_JRatioTipoMovelMouseClicked

    private void txt_dataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataKeyPressed
        // TODO add your handling code here:
        txt_data.setText("");
        String tam=txt_data.getText();
        int tamanho=tam.length();
         String subs=tam;
        if(evt.getKeyCode()!=evt.VK_BACK_SPACE){
        
        for(int i=0;i<=6;i++){// a data tem 10 caracteres
           if(tam!="01/12/2011"){
                       subs.substring(0,tamanho);
            System.out.println(subs);
           }

          
           
            
        }
           txt_data.setText(subs.substring(0)+subs.substring(1)+"/"+subs.substring(2)+"/"+subs.substring(3)+subs.substring(4)+subs.substring(5)+subs.substring(6));
      /*  while(tam.length()>=0){
        txt_data.setText(" 1/12/2011");
        txt_data.setText("  / 2/2011");
        txt_data.setText("  / /2011");
        txt_data.setText("  / / 011");
        txt_data.setText("  / /  11");
        txt_data.setText("  / /   1");
        txt_data.setText("  / /   ");
        } 
        */    
        }
        
    }//GEN-LAST:event_txt_dataKeyPressed
    public void limparCampos() {

        txt_nomeCliente.setText("");
        txt_Endereco.setText("");
        txt_email.setText("");
        //   campoformatado_cpf.setText("");
        lbltipodocumento.setText("CPF");
     //   CampoFormatado_Telefone.setText("");
        comboBox_TipoDocumento.setSelectedIndex(0);
        comboBox_TipoDocumento.setEnabled(true);
        campoformatadoCnpj.setText("");
        campoformatado_cpf.setText("");

        if (jRadioButton1.isSelected()) {
            jRadioButton1.setSelected(false);

        } else if (jRadioButton2.isSelected()) {
            jRadioButton2.setSelected(false);

        }

    }

    public int camposObrigatorios() {

        // falta colocar o padão do cnpj no if
        if (txt_nomeCliente.getText() != "" && txt_Endereco.getText() != "" && txt_email.getText() != "" && telefone.length()!=0 && comboBox_TipoDocumento.getSelectedItem() != "Selecione") {

            return 1;// se retorar 1 foi preenchido todos os campos
        }
        return 0;// se retornar 0 não foi preenchido todos os campos
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton JRatioTipoFixo;
    public static javax.swing.JRadioButton JRatioTipoMovel;
    private javax.swing.JButton btn_cadastrarCliente;
    private javax.swing.JButton btn_limparCampos;
    private javax.swing.JFormattedTextField campoformatadoCnpj;
    private javax.swing.JFormattedTextField campoformatado_cpf;
    private javax.swing.JComboBox<String> comboBox_TipoDocumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_clientes;
    private javax.swing.JLabel lbltipodocumento;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nomeCliente;
    // End of variables declaration//GEN-END:variables
}
