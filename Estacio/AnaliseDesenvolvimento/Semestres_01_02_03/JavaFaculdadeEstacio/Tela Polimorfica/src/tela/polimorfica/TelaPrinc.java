/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.polimorfica;

/**
 *
 * @author bruno
 */
import javax.swing.JOptionPane;

public class TelaPrinc extends javax.swing.JFrame {

    public TelaPrinc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuClube = new javax.swing.JMenuItem();
        menuSocio = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clube Recreativo");
        menuCadastros.setText("Cadastros");
        menuClube.setText("Clube");
        menuClube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClubeActionPerformed(evt);
            }
        });
        menuSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSocioActionPerformed(evt);
            }
        });
        menuCadastros.add(menuClube);
        menuSocio.setText("Sócio");
        menuCadastros.add(menuSocio);
        jMenuBar1.add(menuCadastros);
        menuSair.setText("Sair");
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }

            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }

            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuSairMenuSelected(evt);
            }
        });
        jMenuBar1.add(menuSair);
        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 279, Short.MAX_VALUE)
        );
        pack();
    }

    private void menuClubeActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadClube tela = new TelaCadClube();
        tela.setVisible(true);
    }

    private void menuSocioActionPerformed(java.awt.event.ActionEvent evt) {
        TelaCadSocio tela = new TelaCadSocio();
        tela.setVisible(true);
    }

    private void menuSairMenuSelected(javax.swing.event.MenuEvent evt) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja sair do programa",
                "Sim ou não?", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrinc().setVisible(true);
            }
        });
    }
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuClube;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSocio;
}
