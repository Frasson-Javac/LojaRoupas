/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.Fornecedor;
import Model.PedidoCompra;
import Model.utilitarios;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinic
 */
public class PedidoCompraView extends javax.swing.JInternalFrame {

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
        jLabel8 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btbCancelar = new javax.swing.JButton();
        jcombo_Forn = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_ValorTotal = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_Subtotal = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPedidoCompra = new javax.swing.JTable();
        txt_valorUnitario = new javax.swing.JTextField();

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

        setClosable(true);
        setTitle("Pedido de Compra");
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

        jLabel1.setText("Produto");

        jLabel2.setText("Codigo");

        txt_cod.setEditable(false);

        jLabel4.setText("Quantidade");

        jArea_Descricao.setColumns(20);
        jArea_Descricao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jArea_Descricao.setRows(5);
        jScrollPane1.setViewportView(jArea_Descricao);

        jLabel5.setText("Descrição");

        jLabel6.setText("Gênero");

        Jcombo_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        jLabel7.setText("Tamanho");

        jCombo_Tamnho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "PP", "P", "M", "G", "GG", "EXG", "36", "38", "40", "42", "44", "46", "48", "52", "54", "56" }));
        jCombo_Tamnho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_TamnhoActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-em-trânsito-84.png"))); // NOI18N

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btbCancelar.setText("Cancelar");

        jcombo_Forn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcombo_Forn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcombo_FornMouseClicked(evt);
            }
        });

        jLabel9.setText("Fornecedor");

        jLabel11.setText("Valor Unitário");

        jLabel12.setText("Valor Total");

        txt_ValorTotal.setEditable(false);
        txt_ValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jLabel13.setText("SubTotal");

        txt_Subtotal.setEditable(false);
        txt_Subtotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jPedidoCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Produto", "Tamnho", "Genero", "Descrição", "Fornecedor", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ));
        jScrollPane3.setViewportView(jPedidoCompra);

        txt_valorUnitario.setText("0,00");
        txt_valorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_valorUnitarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_valorUnitarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(28, 28, 28)
                                                .addComponent(jCombo_Tamnho, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Jcombo_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcombo_Forn, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btbCancelar)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btn_salvar))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel12)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(txt_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel4)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel13))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_valorUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                        .addComponent(txt_Subtotal))
                                                    .addGap(3, 3, 3)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_valorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvar)
                            .addComponent(btbCancelar))
                        .addGap(4, 4, 4)))
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCombo_TamnhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_TamnhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_TamnhoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        PedidoCompra pd = new PedidoCompra();
        utilitarios util = new utilitarios();

        String tam = (String) jCombo_Tamnho.getSelectedItem();// combo box dos tamnhos dos uniformes
        String gen = (String) Jcombo_Genero.getSelectedItem();// combo box dos generos m/f
        int qtde = Integer.parseInt(txt_Quantidade.getText());//quantidade de uniformes

        String convertTotal = util.convertnumero(Double.parseDouble(txt_ValorTotal.getText()));//converte com duas casas decimais
        double valortotal = Double.parseDouble(txt_valorUnitario.getText()) * qtde;

        String fornecedo = (String) jcombo_Forn.getSelectedItem();

        PedidoCompra pedido = new PedidoCompra(Integer.parseInt(txt_cod.getText()), txt_Produto.getText(), jArea_Descricao.getText(), tam, gen,
                qtde, Double.parseDouble(txt_valorUnitario.getText()), Double.parseDouble(convertTotal), jcombo_Forn.getSelectedItem().toString());
        pedido.gravar(pedido);

        String[] dados = {txt_cod.getText(), txt_Produto.getText(), tam, gen, jArea_Descricao.getText(), fornecedo,
            txt_Quantidade.getText(), txt_valorUnitario.getText(), convertTotal};

        DefaultTableModel dtn = (DefaultTableModel) jPedidoCompra.getModel();
        dtn.addRow(dados);
        txt_Quantidade.setText("");
        txt_Produto.setText("");
        txt_Quantidade.setText("");

     //   txt_Subtotal.setText("" + util.convertnumero(subtotal));

        //    txt_cod.setText(""+ cod++);
        txt_ValorTotal.setText("");
        txt_valorUnitario.setText("");
        jArea_Descricao.setText("");
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

    private void txt_valorUnitarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorUnitarioKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_valorUnitarioKeyPressed

    private void txt_valorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorUnitarioKeyReleased
        // TODO add your handling code here
 
   utilitarios util=new utilitarios();
        double calc = Double.parseDouble(txt_Quantidade.getText()) * (Double.parseDouble(txt_valorUnitario.getText()));// calcula quantidade x valor unitario
        

        txt_ValorTotal.setText("" + util.convertnumero(calc));
     double calc1=0;
        calc1=calc1+Double.parseDouble(txt_ValorTotal.getText());
        txt_Subtotal.setText("" +calc1 );
    }//GEN-LAST:event_txt_valorUnitarioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcombo_Genero;
    private javax.swing.JButton btbCancelar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextArea jArea_Descricao;
    private javax.swing.JComboBox<String> jCombo_Tamnho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jPedidoCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcombo_Forn;
    private javax.swing.JTextField txt_Produto;
    private javax.swing.JTextField txt_Quantidade;
    private javax.swing.JFormattedTextField txt_Subtotal;
    private javax.swing.JFormattedTextField txt_ValorTotal;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_valorUnitario;
    // End of variables declaration//GEN-END:variables
}
