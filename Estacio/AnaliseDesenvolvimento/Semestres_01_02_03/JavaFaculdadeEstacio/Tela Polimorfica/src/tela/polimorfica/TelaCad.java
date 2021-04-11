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
public abstract class TelaCad extends javax.swing.JFrame {

    public TelaCad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        botaoIncluir = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        botaoIncluir.setText("Incluir");
        botaoConsultar.setText("Consultar");
        botaoAlterar.setText("Alterar");
        botaoExcluir.setText("Excluir");
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoSair)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.
                        createSequentialGroup()
                        .addContainerGap(266, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoIncluir)
                                .addComponent(botaoConsultar)
                                .addComponent(botaoAlterar)
                                .addComponent(botaoExcluir)
                                .addComponent(botaoSair))
                        .addContainerGap())
        );
        pack();
    }

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }
    protected javax.swing.JButton botaoAlterar;
    protected javax.swing.JButton botaoConsultar;
    protected javax.swing.JButton botaoExcluir;
    protected javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoSair;
}
