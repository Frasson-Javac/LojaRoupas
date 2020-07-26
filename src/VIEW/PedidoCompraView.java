/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Fornecedor;
import Model.PedidoCompra;
import Model.utilitarios;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class PedidoCompraView extends javax.swing.JInternalFrame {
    static float soma=0;
   

    /**
     * Creates new form PedidoCompraView
     */
    public PedidoCompraView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_Produto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Quantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jArea_Descricao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jcombo_Genero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jCombo_Tamnho = new javax.swing.JComboBox<>();
        btn_salvar = new javax.swing.JButton();
        btbCancelar = new javax.swing.JButton();
        jcombo_Forn = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_ValorTotal = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Subtotal = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPedidoCompra = new javax.swing.JTable();
        lbl_valueunit = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Pedido de Compra");
        setMaximumSize(new java.awt.Dimension(2147483646, 2147483646));
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Produto");

        txt_Produto.setBackground(new java.awt.Color(255, 255, 204));
        txt_Produto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ProdutoFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        txt_cod.setEditable(false);
        txt_cod.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade");

        txt_Quantidade.setBackground(new java.awt.Color(255, 255, 204));
        txt_Quantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_QuantidadeFocusLost(evt);
            }
        });

        jArea_Descricao.setBackground(new java.awt.Color(255, 255, 204));
        jArea_Descricao.setColumns(20);
        jArea_Descricao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jArea_Descricao.setRows(5);
        jScrollPane1.setViewportView(jArea_Descricao);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Descrição");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Gênero");

        Jcombo_Genero.setBackground(new java.awt.Color(255, 255, 204));
        Jcombo_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        Jcombo_Genero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Jcombo_GeneroFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tamanho");

        jCombo_Tamnho.setBackground(new java.awt.Color(255, 255, 204));
        jCombo_Tamnho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PP", "P", "M", "G", "GG", "EXG", "36", "38", "40", "42", "44", "46", "48", "52", "54", "56" }));
        jCombo_Tamnho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCombo_TamnhoFocusLost(evt);
            }
        });
        jCombo_Tamnho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_TamnhoActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btbCancelar.setText("Cancelar");

        jcombo_Forn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcombo_Forn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcombo_FornFocusLost(evt);
            }
        });
        jcombo_Forn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcombo_FornMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fornecedor");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Valor Unitário R$");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Valor Total");

        txt_ValorTotal.setEditable(false);
        txt_ValorTotal.setBackground(new java.awt.Color(255, 255, 204));
        txt_ValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("SubTotal  R$");

        txt_Subtotal.setEditable(false);
        txt_Subtotal.setBackground(new java.awt.Color(255, 255, 204));
        txt_Subtotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jPedidoCompra.setBackground(new java.awt.Color(255, 255, 204));
        jPedidoCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Produto", "Tamanho", "Genero", "Fornecedor", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane3.setViewportView(jPedidoCompra);

        lbl_valueunit.setBackground(new java.awt.Color(255, 255, 204));
        lbl_valueunit.setText("0.00");
        lbl_valueunit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_valueunitFocusLost(evt);
            }
        });
        lbl_valueunit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_valueunitMouseClicked(evt);
            }
        });
        lbl_valueunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl_valueunitKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_valueunit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcombo_Forn, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jCombo_Tamnho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Jcombo_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(txt_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btbCancelar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btn_salvar)))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCombo_Tamnho)
                    .addComponent(jLabel6)
                    .addComponent(Jcombo_Genero))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcombo_Forn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(lbl_valueunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txt_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btbCancelar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        PedidoCompra pd = new PedidoCompra();
       

        String tam = (String) jCombo_Tamnho.getSelectedItem();// combo box dos tamnhos dos uniformes
        String gen = (String) Jcombo_Genero.getSelectedItem();// combo box dos generos m/f
        int qtde = Integer.parseInt(txt_Quantidade.getText());//quantidade de uniformes
        String fornecedor = (String) jcombo_Forn.getSelectedItem();
        PedidoCompra pedido = new PedidoCompra(Integer.parseInt(txt_cod.getText()), txt_Produto.getText(), jArea_Descricao.getText(), tam, gen,
        qtde,  Float.parseFloat(lbl_valueunit.getText().replace(",", ".")), Float.parseFloat( txt_ValorTotal.getText().replace(",", ".")), 
        jcombo_Forn.getSelectedItem().toString());
        pedido.gravar(pedido);

        String[] dados = {txt_cod.getText(), txt_Produto.getText(), tam, gen, jArea_Descricao.getText(), fornecedor,
            txt_Quantidade.getText(),"R$ "+ lbl_valueunit.getText().replace(".", ","),"R$ " +txt_ValorTotal.getText()};

        DefaultTableModel dtn = (DefaultTableModel) jPedidoCompra.getModel();
        dtn.addRow(dados);
        txt_Quantidade.setText("");
        txt_Produto.setText("");
        txt_Quantidade.setText("");
       

         soma =soma+Float.parseFloat(txt_ValorTotal.getText().replace(",", "."));
        lbl_valueunit.setText("0.00");
       
        txt_Subtotal.setText(""+soma);
        txt_ValorTotal.setText("0,00");
        jArea_Descricao.setText("");
        Jcombo_Genero.setSelectedIndex(0);
        jCombo_Tamnho.setSelectedIndex(0);
        jcombo_Forn.setSelectedIndex(0);
       
        
        int temp = Integer.parseInt(pd.obter_codigo()) + 1;
        txt_cod.setText("" + temp);


    }//GEN-LAST:event_btn_salvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        PedidoCompra pd = new PedidoCompra();
        txt_cod.setText(pd.obter_codigo());

        Fornecedor forn = new Fornecedor();

        for (int i = 0; i < forn.fornecedor.size(); i++) {
            jcombo_Forn.addItem(forn.getFornecedor().get(i).getNome_da_empresa());

        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jcombo_FornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcombo_FornMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombo_FornMouseClicked

    private void lbl_valueunitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_valueunitFocusLost
        // TODO add your handling code here:
        utilitarios util=new utilitarios();
        
        util.convertnumero(Float.parseFloat(lbl_valueunit.getText()));
        float calc = Float.parseFloat(lbl_valueunit.getText())* Float.parseFloat(txt_Quantidade.getText());
        
        txt_ValorTotal.setText(""+util.convertnumero(calc));
    }//GEN-LAST:event_lbl_valueunitFocusLost

    private void lbl_valueunitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_valueunitKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbl_valueunitKeyPressed

    private void lbl_valueunitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_valueunitMouseClicked
        // TODO add your handling code here:
        if(lbl_valueunit.getText().equals("0.00")){
        lbl_valueunit.setText("");
            
        }
    }//GEN-LAST:event_lbl_valueunitMouseClicked

    private void txt_ProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ProdutoFocusLost
        // TODO add your handling code here:
        if(txt_Produto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "\nPreenchimento Obrigatório do Campo produto");
        }
    }//GEN-LAST:event_txt_ProdutoFocusLost

    private void txt_QuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_QuantidadeFocusLost
        // TODO add your handling code here:
         if(txt_Quantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "\nPreenchimento Obrigatório do campo Quantidade");
        }
    }//GEN-LAST:event_txt_QuantidadeFocusLost

    private void Jcombo_GeneroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jcombo_GeneroFocusLost
        // TODO add your handling code here:
         if(Jcombo_Genero.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "\nPreenchimento Obrigatório do campo Gênero");
        }
    }//GEN-LAST:event_Jcombo_GeneroFocusLost

    private void jcombo_FornFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcombo_FornFocusLost
        // TODO add your handling code here:
         if(jcombo_Forn.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "\nPreenchimento Obrigatório do campo Fornecedor");
        }
    }//GEN-LAST:event_jcombo_FornFocusLost

    private void jCombo_TamnhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_TamnhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_TamnhoActionPerformed

    private void jCombo_TamnhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCombo_TamnhoFocusLost
        // TODO add your handling code here:
        if(jCombo_Tamnho.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null, "\nPreenchimento Obrigatório do campo Tamanho");
        }
    }//GEN-LAST:event_jCombo_TamnhoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcombo_Genero;
    private javax.swing.JButton btbCancelar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextArea jArea_Descricao;
    private javax.swing.JComboBox<String> jCombo_Tamnho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jPedidoCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcombo_Forn;
    private javax.swing.JFormattedTextField lbl_valueunit;
    private javax.swing.JTextField txt_Produto;
    private javax.swing.JTextField txt_Quantidade;
    private javax.swing.JFormattedTextField txt_Subtotal;
    private javax.swing.JFormattedTextField txt_ValorTotal;
    private javax.swing.JTextField txt_cod;
    // End of variables declaration//GEN-END:variables
}
