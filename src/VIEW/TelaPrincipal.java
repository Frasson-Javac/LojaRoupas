/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.plaf.DesktopPaneUI;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author vinic
 */
public class TelaPrincipal extends javax.swing.JFrame {
GerarIntenalFrameCentralizado InternalframeCentralizado=new GerarIntenalFrameCentralizado();
Login login=new Login();
CadastarFornecedor cadastrofornecedor=new CadastarFornecedor();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_hora = new javax.swing.JLabel();
        lbl_data1 = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu_Usuario = new javax.swing.JMenu();
        jMenuItem_Usuario_Cadastrar = new javax.swing.JMenuItem();
        jMenu_Usuario_consultar = new javax.swing.JMenuItem();
        jMenu_Usuario_Listar = new javax.swing.JMenuItem();
        jMenuItem_Usuario_AlterarSenha = new javax.swing.JMenuItem();
        jMenu_Usuario_Excluir = new javax.swing.JMenuItem();
        jMenu_Fornecedor = new javax.swing.JMenu();
        jMenuItem_Fornecedor_Cadastrar = new javax.swing.JMenuItem();
        jMenuItem_Fornecedor_Consultar = new javax.swing.JMenuItem();
        jMenu_Fornecedo_Listar = new javax.swing.JMenuItem();
        jMenuItem_Fornecedor_Alterar = new javax.swing.JMenuItem();
        jMenuItem_Fornecedor_Excluir = new javax.swing.JMenuItem();
        jMenu_PedidoCompra = new javax.swing.JMenu();
        jMenuItem_PedidoCompra_Cadastrar = new javax.swing.JMenuItem();
        jMenuItem_PedidoCompra_Consultar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem_PedidoCompra_Alterar = new javax.swing.JMenuItem();
        jMenuItem_PedidoCompra_Excluir = new javax.swing.JMenuItem();
        jMenu_Estoque = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem_Estoque_Relatorio = new javax.swing.JMenuItem();
        jMenu_Cliente = new javax.swing.JMenu();
        jMenuItem_Cliente_Cadastrar = new javax.swing.JMenuItem();
        jMenuItem_Cliente_Consultar = new javax.swing.JMenuItem();
        jMenuItem_Cliente_Alterar = new javax.swing.JMenuItem();
        jMenuItem_Cliente_Excluir = new javax.swing.JMenuItem();
        jMenu_Vendas = new javax.swing.JMenu();
        jMenuItem_Vendas_Vender = new javax.swing.JMenuItem();
        jMenuItem_Vendas_Consultar = new javax.swing.JMenuItem();
        jMenuItem_Vendas_Alterar = new javax.swing.JMenuItem();
        jMenuItem_Vendas_Excluir = new javax.swing.JMenuItem();
        jMenu_Ajuda = new javax.swing.JMenu();
        jMenuItem_Ajuda_Sobre = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem15.setText("jMenuItem15");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        desktopPrincipal.setBackground(new java.awt.Color(241, 241, 241));
        desktopPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        desktopPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${size.height}"), desktopPrincipal, org.jdesktop.beansbinding.BeanProperty.create("minimumSize"));
        bindingGroup.addBinding(binding);

        lbl_hora.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_hora.setForeground(new java.awt.Color(0, 0, 153));

        lbl_data1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_data1.setForeground(new java.awt.Color(0, 0, 153));

        lbl_user.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(0, 0, 153));
        lbl_user.setText("jLabel1");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(lbl_user, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 246, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(lbl_data1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(lbl_hora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(lbl_user, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lbl_data1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lbl_hora, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );

        desktopPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout desktopPrincipalLayout = new org.jdesktop.layout.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(jLabel1)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 705, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jMenu_Usuario.setText("Usuario");
        jMenu_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_UsuarioActionPerformed(evt);
            }
        });

        jMenuItem_Usuario_Cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Usuario_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-adicionar-livro-36.png"))); // NOI18N
        jMenuItem_Usuario_Cadastrar.setText("Cadastrar");
        jMenuItem_Usuario_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Usuario_CadastrarActionPerformed(evt);
            }
        });
        jMenu_Usuario.add(jMenuItem_Usuario_Cadastrar);

        jMenu_Usuario_consultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu_Usuario_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pesquisar-mais-36.png"))); // NOI18N
        jMenu_Usuario_consultar.setText("Consultar");
        jMenu_Usuario_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Usuario_consultarActionPerformed(evt);
            }
        });
        jMenu_Usuario.add(jMenu_Usuario_consultar);

        jMenu_Usuario_Listar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu_Usuario_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-lista-de-tarefas-36.png"))); // NOI18N
        jMenu_Usuario_Listar.setText("Listar");
        jMenu_Usuario_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Usuario_ListarActionPerformed(evt);
            }
        });
        jMenu_Usuario.add(jMenu_Usuario_Listar);

        jMenuItem_Usuario_AlterarSenha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Usuario_AlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-editar-conta-36.png"))); // NOI18N
        jMenuItem_Usuario_AlterarSenha.setText("Alterar senha");
        jMenu_Usuario.add(jMenuItem_Usuario_AlterarSenha);

        jMenu_Usuario_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-excluir-36.png"))); // NOI18N
        jMenu_Usuario_Excluir.setText("Excluir");
        jMenu_Usuario.add(jMenu_Usuario_Excluir);

        Menu.add(jMenu_Usuario);

        jMenu_Fornecedor.setText("Fornecedor");
        jMenu_Fornecedor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem_Fornecedor_Cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Fornecedor_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-adicionar-livro-36.png"))); // NOI18N
        jMenuItem_Fornecedor_Cadastrar.setText("Cadastrar");
        jMenuItem_Fornecedor_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Fornecedor_CadastrarActionPerformed(evt);
            }
        });
        jMenu_Fornecedor.add(jMenuItem_Fornecedor_Cadastrar);

        jMenuItem_Fornecedor_Consultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Fornecedor_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pesquisar-mais-36.png"))); // NOI18N
        jMenuItem_Fornecedor_Consultar.setText("Consultar");
        jMenuItem_Fornecedor_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Fornecedor_ConsultarActionPerformed(evt);
            }
        });
        jMenu_Fornecedor.add(jMenuItem_Fornecedor_Consultar);

        jMenu_Fornecedo_Listar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu_Fornecedo_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-lista-de-tarefas-36.png"))); // NOI18N
        jMenu_Fornecedo_Listar.setText("Listar");
        jMenu_Fornecedo_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Fornecedo_ListarActionPerformed(evt);
            }
        });
        jMenu_Fornecedor.add(jMenu_Fornecedo_Listar);

        jMenuItem_Fornecedor_Alterar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Fornecedor_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-editar-conta-36.png"))); // NOI18N
        jMenuItem_Fornecedor_Alterar.setText("Alterar");
        jMenu_Fornecedor.add(jMenuItem_Fornecedor_Alterar);

        jMenuItem_Fornecedor_Excluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Fornecedor_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-excluir-36.png"))); // NOI18N
        jMenuItem_Fornecedor_Excluir.setText("Excluir");
        jMenu_Fornecedor.add(jMenuItem_Fornecedor_Excluir);

        Menu.add(jMenu_Fornecedor);

        jMenu_PedidoCompra.setText("Pedido de Compra");
        jMenu_PedidoCompra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem_PedidoCompra_Cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_PedidoCompra_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-adicionar-livro-36.png"))); // NOI18N
        jMenuItem_PedidoCompra_Cadastrar.setText("Cadastrar");
        jMenuItem_PedidoCompra_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PedidoCompra_CadastrarActionPerformed(evt);
            }
        });
        jMenu_PedidoCompra.add(jMenuItem_PedidoCompra_Cadastrar);

        jMenuItem_PedidoCompra_Consultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_PedidoCompra_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pesquisar-mais-36.png"))); // NOI18N
        jMenuItem_PedidoCompra_Consultar.setText("Consultar");
        jMenuItem_PedidoCompra_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PedidoCompra_ConsultarActionPerformed(evt);
            }
        });
        jMenu_PedidoCompra.add(jMenuItem_PedidoCompra_Consultar);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-lista-de-tarefas-36.png"))); // NOI18N
        jMenuItem2.setText("Listar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_PedidoCompra.add(jMenuItem2);

        jMenuItem_PedidoCompra_Alterar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_PedidoCompra_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-editar-conta-36.png"))); // NOI18N
        jMenuItem_PedidoCompra_Alterar.setText("Alterar");
        jMenu_PedidoCompra.add(jMenuItem_PedidoCompra_Alterar);

        jMenuItem_PedidoCompra_Excluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_PedidoCompra_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-excluir-36.png"))); // NOI18N
        jMenuItem_PedidoCompra_Excluir.setText("Excluir");
        jMenuItem_PedidoCompra_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PedidoCompra_ExcluirActionPerformed(evt);
            }
        });
        jMenu_PedidoCompra.add(jMenuItem_PedidoCompra_Excluir);

        Menu.add(jMenu_PedidoCompra);

        jMenu_Estoque.setText("Estoque");
        jMenu_Estoque.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem31.setText("Consultar ");
        jMenu_Estoque.add(jMenuItem31);

        jMenuItem_Estoque_Relatorio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Estoque_Relatorio.setText("Relatório");
        jMenu_Estoque.add(jMenuItem_Estoque_Relatorio);

        Menu.add(jMenu_Estoque);

        jMenu_Cliente.setText("Cliente");
        jMenu_Cliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem_Cliente_Cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Cliente_Cadastrar.setText("Cadastrar");
        jMenu_Cliente.add(jMenuItem_Cliente_Cadastrar);

        jMenuItem_Cliente_Consultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Cliente_Consultar.setText("Consultar");
        jMenu_Cliente.add(jMenuItem_Cliente_Consultar);

        jMenuItem_Cliente_Alterar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Cliente_Alterar.setText("Alterar");
        jMenu_Cliente.add(jMenuItem_Cliente_Alterar);

        jMenuItem_Cliente_Excluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Cliente_Excluir.setText("Excluir");
        jMenu_Cliente.add(jMenuItem_Cliente_Excluir);

        Menu.add(jMenu_Cliente);

        jMenu_Vendas.setText("Vendas");
        jMenu_Vendas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem_Vendas_Vender.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Vendas_Vender.setText("Vender");
        jMenu_Vendas.add(jMenuItem_Vendas_Vender);

        jMenuItem_Vendas_Consultar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Vendas_Consultar.setText("Consultar");
        jMenuItem_Vendas_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Vendas_ConsultarActionPerformed(evt);
            }
        });
        jMenu_Vendas.add(jMenuItem_Vendas_Consultar);

        jMenuItem_Vendas_Alterar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Vendas_Alterar.setText("Alterar");
        jMenu_Vendas.add(jMenuItem_Vendas_Alterar);

        jMenuItem_Vendas_Excluir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Vendas_Excluir.setText("Excluir");
        jMenu_Vendas.add(jMenuItem_Vendas_Excluir);

        Menu.add(jMenu_Vendas);

        jMenu_Ajuda.setText("Ajuda");
        jMenu_Ajuda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jMenuItem_Ajuda_Sobre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem_Ajuda_Sobre.setText("Sobre");
        jMenu_Ajuda.add(jMenuItem_Ajuda_Sobre);

        Menu.add(jMenu_Ajuda);

        Sair.setText("Sair");
        Sair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);

        setJMenuBar(Menu);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPrincipal)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_Usuario_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Usuario_CadastrarActionPerformed
        // TODO add your handling code here:
  
     
          InternalframeCentralizado.gerarcental(new CadastraUsuarios(), desktopPrincipal);
       
        
    }//GEN-LAST:event_jMenuItem_Usuario_CadastrarActionPerformed

    private void jMenuItem_PedidoCompra_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PedidoCompra_ConsultarActionPerformed
        // TODO add your handling code here:
        InternalframeCentralizado.gerarcental(new ConsultarPedidoCompra(), desktopPrincipal);
    }//GEN-LAST:event_jMenuItem_PedidoCompra_ConsultarActionPerformed

    private void jMenuItem_Vendas_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Vendas_ConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Vendas_ConsultarActionPerformed

    private void jMenu_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_UsuarioActionPerformed

    private void jMenuItem_PedidoCompra_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PedidoCompra_ExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_PedidoCompra_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
    // TODO add your handling code here:
   
    }//GEN-LAST:event_SairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:       
      Login log=new Login();
      
     //  log.perfil();
      
        Date dt=new Date();
       SimpleDateFormat ff=new SimpleDateFormat("dd/MM/yyyy");
      lbl_data1.setText(ff.format(dt));
      
      Timer timer=new Timer(1000,new hora()) ;
      timer.start();
               
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem_Fornecedor_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fornecedor_CadastrarActionPerformed
        // TODO add your handling code here:
        InternalframeCentralizado.gerarcental(new CadastarFornecedor(), desktopPrincipal);
    }//GEN-LAST:event_jMenuItem_Fornecedor_CadastrarActionPerformed

    private void jMenu_Usuario_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Usuario_consultarActionPerformed
        // TODO add your handling code here:
         InternalframeCentralizado.gerarcental(new consultausuario(), desktopPrincipal);
    }//GEN-LAST:event_jMenu_Usuario_consultarActionPerformed

    private void jMenuItem_Fornecedor_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Fornecedor_ConsultarActionPerformed
        // TODO add your handling code here:
        InternalframeCentralizado.gerarcental(new ConsultarFornecedor(), desktopPrincipal);
    }//GEN-LAST:event_jMenuItem_Fornecedor_ConsultarActionPerformed

    private void jMenu_Fornecedo_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Fornecedo_ListarActionPerformed
        // TODO add your handling code here:
         InternalframeCentralizado.gerarcental(new ExibirFornecedor(), desktopPrincipal);
    }//GEN-LAST:event_jMenu_Fornecedo_ListarActionPerformed

    private void jMenu_Usuario_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Usuario_ListarActionPerformed
        // TODO add your handling code here:
        InternalframeCentralizado.gerarcental(new ExibirUsuarios(), desktopPrincipal);
    }//GEN-LAST:event_jMenu_Usuario_ListarActionPerformed

    private void jMenuItem_PedidoCompra_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PedidoCompra_CadastrarActionPerformed
        // TODO add your handling code here:
         InternalframeCentralizado.gerarcental(new PedidoCompraView(), desktopPrincipal);
    }//GEN-LAST:event_jMenuItem_PedidoCompra_CadastrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         InternalframeCentralizado.gerarcental(new ListarPedidosCompra(), desktopPrincipal);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Sair;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem_Ajuda_Sobre;
    private javax.swing.JMenuItem jMenuItem_Cliente_Alterar;
    private javax.swing.JMenuItem jMenuItem_Cliente_Cadastrar;
    private javax.swing.JMenuItem jMenuItem_Cliente_Consultar;
    private javax.swing.JMenuItem jMenuItem_Cliente_Excluir;
    private javax.swing.JMenuItem jMenuItem_Estoque_Relatorio;
    private javax.swing.JMenuItem jMenuItem_Fornecedor_Alterar;
    private javax.swing.JMenuItem jMenuItem_Fornecedor_Cadastrar;
    private javax.swing.JMenuItem jMenuItem_Fornecedor_Consultar;
    private javax.swing.JMenuItem jMenuItem_Fornecedor_Excluir;
    private javax.swing.JMenuItem jMenuItem_PedidoCompra_Alterar;
    private javax.swing.JMenuItem jMenuItem_PedidoCompra_Cadastrar;
    private javax.swing.JMenuItem jMenuItem_PedidoCompra_Consultar;
    private javax.swing.JMenuItem jMenuItem_PedidoCompra_Excluir;
    private javax.swing.JMenuItem jMenuItem_Usuario_AlterarSenha;
    private javax.swing.JMenuItem jMenuItem_Usuario_Cadastrar;
    private javax.swing.JMenuItem jMenuItem_Vendas_Alterar;
    private javax.swing.JMenuItem jMenuItem_Vendas_Consultar;
    private javax.swing.JMenuItem jMenuItem_Vendas_Excluir;
    private javax.swing.JMenuItem jMenuItem_Vendas_Vender;
    private javax.swing.JMenu jMenu_Ajuda;
    private javax.swing.JMenu jMenu_Cliente;
    private javax.swing.JMenu jMenu_Estoque;
    private javax.swing.JMenuItem jMenu_Fornecedo_Listar;
    private javax.swing.JMenu jMenu_Fornecedor;
    private javax.swing.JMenu jMenu_PedidoCompra;
    private javax.swing.JMenu jMenu_Usuario;
    private javax.swing.JMenuItem jMenu_Usuario_Excluir;
    private javax.swing.JMenuItem jMenu_Usuario_Listar;
    private javax.swing.JMenuItem jMenu_Usuario_consultar;
    private javax.swing.JMenu jMenu_Vendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_data1;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_user;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

 class hora implements ActionListener{

     @Override
     public void actionPerformed(ActionEvent e){
         Date dtt=new Date();
         Calendar now=Calendar.getInstance();
         lbl_hora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
         
         
         
     }
}
}

