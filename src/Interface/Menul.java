/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controle.View;

/**
 *
 * @author epic4
 */
public class Menul extends javax.swing.JFrame {

    /**
     * Creates new form Menul
     */
    public Menul() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Principal = new javax.swing.JPanel();
        jLabel1Menu = new javax.swing.JLabel();
        jLabel1Produtos = new javax.swing.JLabel();
        jLabel5Produtoss = new javax.swing.JLabel();
        jLabel5Produtoss1 = new javax.swing.JLabel();
        jLabel5Produtoss2 = new javax.swing.JLabel();
        jLabel1Produtos1 = new javax.swing.JLabel();
        jLabel5Produtoss3 = new javax.swing.JLabel();
        jLabel5Produtoss4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1Opcoes = new javax.swing.JMenu();
        jMCadastrarFornecedor = new javax.swing.JMenuItem();
        jMCadastrarProdutos = new javax.swing.JMenuItem();
        jMStatus = new javax.swing.JMenuItem();
        jMSaida = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenuItem();
        jMLogar = new javax.swing.JMenuItem();
        jMenu2Config = new javax.swing.JMenu();
        jMenuItem4Ferramentas = new javax.swing.JMenuItem();
        jMenu3Sair = new javax.swing.JMenu();
        jMenuItem1Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1Principal.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1Principal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1Principal.setLayout(null);

        jLabel1Menu.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1Menu.setText("Menu");
        jPanel1Principal.add(jLabel1Menu);
        jLabel1Menu.setBounds(380, 50, 130, 40);

        jLabel1Produtos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1Produtos.setText("Observação: ");
        jPanel1Principal.add(jLabel1Produtos);
        jLabel1Produtos.setBounds(80, 330, 120, 30);

        jLabel5Produtoss.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5Produtoss.setText("Para navegar entre as telas do App va em \"Opções\" e selecione o item desejado.");
        jPanel1Principal.add(jLabel5Produtoss);
        jLabel5Produtoss.setBounds(90, 360, 720, 19);

        jLabel5Produtoss1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5Produtoss1.setText("Para um bom funcionamento do sistem siga os seguintes passos:");
        jPanel1Principal.add(jLabel5Produtoss1);
        jLabel5Produtoss1.setBounds(90, 240, 720, 19);

        jLabel5Produtoss2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5Produtoss2.setText("faça inicialmente o cadastro do fornecedor apos isso cadastre os produtos com todos os campos devidamente ");
        jPanel1Principal.add(jLabel5Produtoss2);
        jLabel5Produtoss2.setBounds(90, 260, 701, 19);

        jLabel1Produtos1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1Produtos1.setText("Considerações de uso:");
        jPanel1Principal.add(jLabel1Produtos1);
        jLabel1Produtos1.setBounds(90, 210, 210, 30);

        jLabel5Produtoss3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5Produtoss3.setText("preenchidos. Para alteração e exclusão de itens da tabela faça a seleção dos itens desejados com o mouse ");
        jPanel1Principal.add(jLabel5Produtoss3);
        jLabel5Produtoss3.setBounds(90, 280, 690, 19);

        jLabel5Produtoss4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5Produtoss4.setText("sobre o item.");
        jPanel1Principal.add(jLabel5Produtoss4);
        jLabel5Produtoss4.setBounds(90, 300, 720, 19);

        getContentPane().add(jPanel1Principal);
        jPanel1Principal.setBounds(0, 0, 880, 674);

        jMenuBar2.setForeground(new java.awt.Color(153, 153, 153));

        jMenu1Opcoes.setText("Opções");

        jMCadastrarFornecedor.setText("Cadastrar Fornecedor");
        jMCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarFornecedorActionPerformed(evt);
            }
        });
        jMenu1Opcoes.add(jMCadastrarFornecedor);

        jMCadastrarProdutos.setText("Cadastrar Produtos");
        jMCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarProdutosActionPerformed(evt);
            }
        });
        jMenu1Opcoes.add(jMCadastrarProdutos);

        jMStatus.setText("Entrada de Produtos");
        jMStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMStatusActionPerformed(evt);
            }
        });
        jMenu1Opcoes.add(jMStatus);

        jMSaida.setText("Saida de  Produtos");
        jMSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSaidaActionPerformed(evt);
            }
        });
        jMenu1Opcoes.add(jMSaida);

        jMenu.setText("Menu");
        jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActionPerformed(evt);
            }
        });
        jMenu1Opcoes.add(jMenu);

        jMLogar.setText("Logar");
        jMLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLogarActionPerformed(evt);
            }
        });
        jMenu1Opcoes.add(jMLogar);

        jMenuBar2.add(jMenu1Opcoes);

        jMenu2Config.setText("Configurações");

        jMenuItem4Ferramentas.setText("Ferramentas");
        jMenu2Config.add(jMenuItem4Ferramentas);

        jMenuBar2.add(jMenu2Config);

        jMenu3Sair.setText("Sair");

        jMenuItem1Sair.setText("Sair");
        jMenu3Sair.add(jMenuItem1Sair);

        jMenuBar2.add(jMenu3Sair);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(898, 736));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMStatusActionPerformed
        View objtview = new View();
        objtview.MenuEntrada();
        dispose();
    }//GEN-LAST:event_jMStatusActionPerformed

    private void jMCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarFornecedorActionPerformed
        View objtview = new View();
        objtview.MenuFornecedor();
        dispose();
    }//GEN-LAST:event_jMCadastrarFornecedorActionPerformed

    private void jMSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSaidaActionPerformed
        View objtview = new View();
        objtview.MenuSaida();
        dispose();
    }//GEN-LAST:event_jMSaidaActionPerformed

    private void jMCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarProdutosActionPerformed
        View objtview = new View();
        objtview.MenuProdutos();
        dispose();
    }//GEN-LAST:event_jMCadastrarProdutosActionPerformed

    private void jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActionPerformed
        View objtview = new View();
        objtview.Menu();
        dispose();
    }//GEN-LAST:event_jMenuActionPerformed

    private void jMLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLogarActionPerformed
        View objtview = new View();
        objtview.MenuLogin();
        dispose();
    }//GEN-LAST:event_jMLogarActionPerformed

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
            java.util.logging.Logger.getLogger(Menul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1Menu;
    private javax.swing.JLabel jLabel1Produtos;
    private javax.swing.JLabel jLabel1Produtos1;
    private javax.swing.JLabel jLabel5Produtoss;
    private javax.swing.JLabel jLabel5Produtoss1;
    private javax.swing.JLabel jLabel5Produtoss2;
    private javax.swing.JLabel jLabel5Produtoss3;
    private javax.swing.JLabel jLabel5Produtoss4;
    private javax.swing.JMenuItem jMCadastrarFornecedor;
    private javax.swing.JMenuItem jMCadastrarProdutos;
    private javax.swing.JMenuItem jMLogar;
    private javax.swing.JMenuItem jMSaida;
    private javax.swing.JMenuItem jMStatus;
    private javax.swing.JMenuItem jMenu;
    private javax.swing.JMenu jMenu1Opcoes;
    private javax.swing.JMenu jMenu2Config;
    private javax.swing.JMenu jMenu3Sair;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1Sair;
    private javax.swing.JMenuItem jMenuItem4Ferramentas;
    private javax.swing.JPanel jPanel1Principal;
    // End of variables declaration//GEN-END:variables

}