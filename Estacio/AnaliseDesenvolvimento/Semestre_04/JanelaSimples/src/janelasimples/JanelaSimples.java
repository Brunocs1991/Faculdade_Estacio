/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasimples;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author bruno
 */
public class JanelaSimples extends JDialog{
    private JTextField txt1;
    private JCheckBox chk1, chk2;
    private JRadioButton rb1, rb2;
    private JButton btn1, btn2;
    
    public JanelaSimples() {
        setLayout(new GridLayout(4, 2));
        add(new JLabel("nome"));
        add(txt1 = new JTextField(10));
        //Campo de texto com 10 posições
        add(new JLabel("Opções de Leitura"));
        JPanel jp1 = new JPanel(new GridLayout(2, 1));
        jp1.add(chk1 = new JCheckBox("Revista Mensal"));
        jp1.add(chk2 =new JCheckBox("Revista Digital"));
        //painel com as caixas de seleção
        add(jp1);
        add(new JLabel("Graduado"));
        JPanel jp2 = new JPanel(new GridLayout(2, 1));
        jp2.add(rb1 = new JRadioButton("Sim"));
        jp2.add(rb2 = new JRadioButton("Não"));
        //painel com os boroes radio
        ButtonGroup bp = new ButtonGroup();
        bp.add(rb1);
        bp.add(rb2);
        add(jp2);
        
        add(btn1 = new JButton("OK"));
        add(btn2 = new JButton("CANCELA"));
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        JanelaSimples j1 = new JanelaSimples();
        j1.setModal(true);
        j1.setBounds(0, 0, 300, 300);
        j1.setVisible(true);
    }
    
}
