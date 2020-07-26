/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import Model.PedidoCompra;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class ConsultarPedidoCompra extends javax.swing.JInternalFrame {

    PedidoCompra pedidocompra = new PedidoCompra();
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
        jLabel1 = new javax.swing.JLabel();
        lbl_pesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_qtde = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl_descricao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        lbl_fornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbl_valortotal = new javax.swing.JTextField();
        btb_pesquisar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();

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
        setTitle("Pesquisa de Produtos");
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel1.setText("Pesquisa");

        lbl_pesquisa.setBackground(new java.awt.Color(255, 255, 204));
        lbl_pesquisa.setText("Digite o nome do Produto");
        lbl_pesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbl_pesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lbl_pesquisaFocusLost(evt);
            }
        });
        lbl_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_pesquisaMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel3.setText("Quantidade");

        lbl_qtde.setEditable(false);
        lbl_qtde.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel4.setText("Descrição");

        lbl_descricao.setEditable(false);
        lbl_descricao.setBackground(new java.awt.Color(255, 255, 204));
        lbl_descricao.setColumns(20);
        lbl_descricao.setRows(5);
        jScrollPane1.setViewportView(lbl_descricao);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel5.setText("Nome do Fornecedor");

        lbl_fornecedor.setEditable(false);
        lbl_fornecedor.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel6.setText("Codigo");

        lbl_codigo.setEditable(false);
        lbl_codigo.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel7.setText("Valor Total R$ ");

        lbl_valortotal.setEditable(false);
        lbl_valortotal.setBackground(new java.awt.Color(255, 255, 204));

        btb_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pesquisar-30.png"))); // NOI18N
        btb_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_pesquisarActionPerformed(evt);
            }
        });

        btn_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-apagar-30.png"))); // NOI18N
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel22.setText("Pesquisar Produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(lbl_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btb_pesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_qtde, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbl_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lbl_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_limpar)
                    .addComponent(btb_pesquisar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(lbl_qtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_valortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_pesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_pesquisaFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_lbl_pesquisaFocusGained

    private void lbl_pesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbl_pesquisaFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_lbl_pesquisaFocusLost

    private void lbl_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pesquisaMouseClicked
        // TODO add your handling code here:
        if (lbl_pesquisa.getText().equals("Digite o nome do Produto")) {
            lbl_pesquisa.setText("");
        }


    }//GEN-LAST:event_lbl_pesquisaMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formInternalFrameOpened

    private void btb_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_pesquisarActionPerformed
        // TODO add your handling code here:

        if (value != "achou") {
            for (int i = 0; i < pedidocompra.getPedidos().size(); i++) {
                if (pedidocompra.getPedidos().get(i).getNome_Produto().equalsIgnoreCase(lbl_pesquisa.getText())) {

                    lbl_codigo.setText("" + pedidocompra.getPedidos().get(i).getCodPedido());
                    lbl_fornecedor.setText(pedidocompra.getPedidos().get(i).getNome_fornecedor());
                    lbl_descricao.setText(pedidocompra.getPedidos().get(i).getDescricao());
                    lbl_qtde.setText("" + pedidocompra.getPedidos().get(i).getQtde());
                    lbl_valortotal.setText("" + pedidocompra.getPedidos().get(i).getValor_Total());
                    value = "achou";

                }
            }

        } else {
            lbl_pesquisa.setText("Digite o nome do Produto");
            JOptionPane.showMessageDialog(null, "Produto não Encontrado");

        }


    }//GEN-LAST:event_btb_pesquisarActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:

        if (value.equals("achou") || value != "") {
            lbl_pesquisa.setText("Digite o nome do Produto");
            lbl_codigo.setText("");
            lbl_fornecedor.setText("");
            lbl_descricao.setText("");
            lbl_qtde.setText("");
            lbl_valortotal.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Não Exite Valores para Limpar");
        }

    }//GEN-LAST:event_btn_limparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_pesquisar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbl_codigo;
    private javax.swing.JTextArea lbl_descricao;
    private javax.swing.JTextField lbl_fornecedor;
    private javax.swing.JTextField lbl_pesquisa;
    private javax.swing.JTextField lbl_qtde;
    private javax.swing.JTextField lbl_valortotal;
    // End of variables declaration//GEN-END:variables
}
