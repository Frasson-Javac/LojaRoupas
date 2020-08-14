/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Fornecedor;
import Model.PedidoCompra;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class ConsultarPedidoCompra extends javax.swing.JInternalFrame {

    PedidoCompra pedidocompra = new PedidoCompra();
    CadastrarPedidoCompra cadastrarPedidoCompra = new CadastrarPedidoCompra();
    Fornecedor forn = new Fornecedor();
    DefaultTableModel dtn;

    static String value = "";

    /**
     * Creates new form ConsultarPedidoCompra
     */
    public ConsultarPedidoCompra() {

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
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txt_nomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_CadastrarPedido = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tamanhoList = new javax.swing.JComboBox<>();
        GeneroList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fornecedorList = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btn_CadastrarFornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEstoque = new javax.swing.JTable();

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel21.setText("Pesquisar Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("SystemWareHouse");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        txt_nomeProduto.setBackground(new java.awt.Color(255, 255, 204));
        txt_nomeProduto.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        txt_nomeProduto.setText("Digite o nome do Produto");
        txt_nomeProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(254, 247, 247)));
        txt_nomeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nomeProdutoFocusGained(evt);
            }
        });
        txt_nomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nomeProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nomeProdutoKeyReleased(evt);
            }
        });

        jLabel4.setText("Código");

        jLabel5.setText("Produto");

        btn_CadastrarPedido.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        btn_CadastrarPedido.setText("Cadastrar Produto");
        btn_CadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarPedidoActionPerformed(evt);
            }
        });

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(254, 222, 222), new java.awt.Color(0, 0, 0)));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField1.setText("0000");
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusGained(evt);
            }
        });
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_CadastrarPedido)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(btn_CadastrarPedido)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setText("Fornecedores");

        tamanhoList.setBackground(new java.awt.Color(255, 255, 204));
        tamanhoList.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        tamanhoList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(254, 239, 239)));
        tamanhoList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamanhoListItemStateChanged(evt);
            }
        });
        tamanhoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoListActionPerformed(evt);
            }
        });

        GeneroList.setBackground(new java.awt.Color(255, 255, 204));
        GeneroList.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        GeneroList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(254, 239, 239)));
        GeneroList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GeneroListItemStateChanged(evt);
            }
        });

        jLabel2.setText("Tamanho");

        jLabel1.setText("Gênero");
        jLabel1.setToolTipText("");

        fornecedorList.setBackground(new java.awt.Color(255, 255, 204));
        fornecedorList.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        fornecedorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        fornecedorList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(254, 239, 239)));
        fornecedorList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fornecedorListItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel6.setText("ESTOQUE T-DRESS ");

        btn_CadastrarFornecedor.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        btn_CadastrarFornecedor.setText("Cadastrar Fornecedor");
        btn_CadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(GeneroList, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tamanhoList, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fornecedorList, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btn_CadastrarFornecedor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(GeneroList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tamanhoList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fornecedorList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CadastrarFornecedor))
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TableEstoque.setBackground(new java.awt.Color(243, 234, 234));
        TableEstoque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0)));
        TableEstoque.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        TableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Tamanho", "Modelo", "Quantidade", "Fornecedor", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableEstoque.setToolTipText("");
        TableEstoque.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableEstoque.setFocusable(false);
        TableEstoque.setGridColor(new java.awt.Color(254, 245, 245));
        jScrollPane1.setViewportView(TableEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code h
        
        txt_nomeProduto.setForeground(Color.gray);
        
        jFormattedTextField1.setForeground(Color.gray);
        this.dtn = (DefaultTableModel) TableEstoque.getModel();
        dtn.setRowCount(0);

        for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {
            dtn.addRow(new String[]{String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido()), pedidocompra.getPedidos().get(i).getNome_Produto(),
                pedidocompra.getPedidos().get(i).getTamanho(), pedidocompra.getPedidos().get(i).getGenero(), String.valueOf(pedidocompra.getPedidos().get(i).getQtde()),
                pedidocompra.getPedidos().get(i).getNome_fornecedor(), String.valueOf(pedidocompra.getPedidos().get(i).getValor_Unitario())

            });
        }

        for (int i = 0; i < cadastrarPedidoCompra.jCombo_Tamnho.getItemCount(); i++) {

            this.tamanhoList.addItem(cadastrarPedidoCompra.jCombo_Tamnho.getItemAt(i));

        }

        for (int i = 0; i < cadastrarPedidoCompra.Jcombo_Genero.getItemCount(); i++) {

            this.GeneroList.addItem(cadastrarPedidoCompra.Jcombo_Genero.getItemAt(i));

        }

        for (int i = 0; i < forn.getFornecedor().size(); i++) {

            this.fornecedorList.addItem(forn.getFornecedor().get(i).getNome_da_empresa());

        }


    }//GEN-LAST:event_formInternalFrameOpened

    private void tamanhoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanhoListActionPerformed

    private void txt_nomeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nomeProdutoFocusGained
        // TODO add your handling code here:
        txt_nomeProduto.setForeground(Color.black);
        txt_nomeProduto.setText("");


    }//GEN-LAST:event_txt_nomeProdutoFocusGained

    private void jFormattedTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jFormattedTextField1KeyPressed

    private void jFormattedTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_jFormattedTextField1KeyTyped

    private void jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusGained
        // TODO add your handling code here:
        jFormattedTextField1.setForeground(Color.black);
        jFormattedTextField1.setText("");
    }//GEN-LAST:event_jFormattedTextField1FocusGained

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
        // TODO add your handling code here:

        dtn.setRowCount(0);

        String parametro = jFormattedTextField1.getText();
        System.out.println(parametro);

        int quant = parametro.length();

        for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {

            String caracter = String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido());
            System.out.println(caracter);

            if (caracter.contains(parametro)) {
                dtn.addRow(new String[]{String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido()), pedidocompra.getPedidos().get(i).getNome_Produto(),
                    pedidocompra.getPedidos().get(i).getTamanho(), pedidocompra.getPedidos().get(i).getGenero(), String.valueOf(pedidocompra.getPedidos().get(i).getQtde()),
                    pedidocompra.getPedidos().get(i).getNome_fornecedor(), String.valueOf(pedidocompra.getPedidos().get(i).getValor_Unitario())

                });
            } else if (!caracter.equalsIgnoreCase(parametro)) {

                evt.consume();

            }
        }
        
    }//GEN-LAST:event_jFormattedTextField1KeyReleased

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void txt_nomeProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeProdutoKeyPressed
 
    }//GEN-LAST:event_txt_nomeProdutoKeyPressed

    private void txt_nomeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeProdutoKeyReleased
        // TODO add your handling code here:
               // TODO add your handling code here:
 dtn.setRowCount(0);

        String produtodigitado = txt_nomeProduto.getText();
        txt_nomeProduto.setForeground(Color.RED);
      
        int quant = produtodigitado.length();


        for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {
              
                 
               
                 
            if (pedidocompra.getPedidos().get(i).getNome_Produto().length() >= produtodigitado.length()) {
                String caracter = pedidocompra.getPedidos().get(i).getNome_Produto().substring(0, quant);

                if (produtodigitado.equalsIgnoreCase(caracter)) {
                    dtn.addRow(new String[]{String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido()), pedidocompra.getPedidos().get(i).getNome_Produto(),
                        pedidocompra.getPedidos().get(i).getTamanho(), pedidocompra.getPedidos().get(i).getGenero(), String.valueOf(pedidocompra.getPedidos().get(i).getQtde()),
                        pedidocompra.getPedidos().get(i).getNome_fornecedor(), String.valueOf(pedidocompra.getPedidos().get(i).getValor_Unitario())

                    });

                }
            }
              
        }
    }//GEN-LAST:event_txt_nomeProdutoKeyReleased

    
    private void GeneroListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GeneroListItemStateChanged
        // TODO add your handling code here:
    
        String var=(String)GeneroList.getSelectedItem();
       
         if(GeneroList.getSelectedItem()!="Selecione"){
            dtn.setRowCount(0);
            for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {

           

                if (pedidocompra.getPedidos().get(i).getGenero().equalsIgnoreCase(var)) {
                    dtn.addRow(new String[]{String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido()), pedidocompra.getPedidos().get(i).getNome_Produto(),
                        pedidocompra.getPedidos().get(i).getTamanho(), pedidocompra.getPedidos().get(i).getGenero(), String.valueOf(pedidocompra.getPedidos().get(i).getQtde()),
                        pedidocompra.getPedidos().get(i).getNome_fornecedor(), String.valueOf(pedidocompra.getPedidos().get(i).getValor_Unitario())

                    });

                }
            }
        }
        
    }//GEN-LAST:event_GeneroListItemStateChanged

    private void tamanhoListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamanhoListItemStateChanged
        // TODO add your handling code here:
        
        String var=(String)tamanhoList.getSelectedItem();
        
 
         if(tamanhoList.getSelectedItem()!="Selecione"){
            dtn.setRowCount(0);
            for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {

           

                if (pedidocompra.getPedidos().get(i).getTamanho().equalsIgnoreCase(var)) {
                    dtn.addRow(new String[]{String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido()), pedidocompra.getPedidos().get(i).getNome_Produto(),
                        pedidocompra.getPedidos().get(i).getTamanho(), pedidocompra.getPedidos().get(i).getGenero(), String.valueOf(pedidocompra.getPedidos().get(i).getQtde()),
                        pedidocompra.getPedidos().get(i).getNome_fornecedor(), String.valueOf(pedidocompra.getPedidos().get(i).getValor_Unitario())

                    });

                }
            }
        }
         
        
        
    }//GEN-LAST:event_tamanhoListItemStateChanged

    private void fornecedorListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fornecedorListItemStateChanged
        // TODO add your handling code here:
        
        String var=(String)fornecedorList.getSelectedItem();
 
         if(fornecedorList.getSelectedItem()!="Selecione"){
            dtn.setRowCount(0);
            for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {

           

                if (pedidocompra.getPedidos().get(i).getTamanho().equalsIgnoreCase(var)) {
                    dtn.addRow(new String[]{String.valueOf(pedidocompra.getPedidos().get(i).getCodPedido()), pedidocompra.getPedidos().get(i).getNome_Produto(),
                        pedidocompra.getPedidos().get(i).getTamanho(), pedidocompra.getPedidos().get(i).getGenero(), String.valueOf(pedidocompra.getPedidos().get(i).getQtde()),
                        pedidocompra.getPedidos().get(i).getNome_fornecedor(), String.valueOf(pedidocompra.getPedidos().get(i).getValor_Unitario())

                    });

                }
            }
        }
    }//GEN-LAST:event_fornecedorListItemStateChanged

    private void btn_CadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarPedidoActionPerformed
        // TODO add your handling code here:
        GerarIntenalFrameCentralizado gerar=new GerarIntenalFrameCentralizado();
        gerar.gerarcental(cadastrarPedidoCompra, TelaPrincipal.desktopPrincipal);
    }//GEN-LAST:event_btn_CadastrarPedidoActionPerformed

    private void btn_CadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarFornecedorActionPerformed
        // TODO add your handling code here:
        GerarIntenalFrameCentralizado gerar=new GerarIntenalFrameCentralizado();
        gerar.gerarcental(new CadastarFornecedor(), TelaPrincipal.desktopPrincipal);
    }//GEN-LAST:event_btn_CadastrarFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GeneroList;
    private javax.swing.JTable TableEstoque;
    private javax.swing.JButton btn_CadastrarFornecedor;
    private javax.swing.JButton btn_CadastrarPedido;
    private javax.swing.JComboBox<String> fornecedorList;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox<String> tamanhoList;
    private javax.swing.JTextField txt_nomeProduto;
    // End of variables declaration//GEN-END:variables
}
