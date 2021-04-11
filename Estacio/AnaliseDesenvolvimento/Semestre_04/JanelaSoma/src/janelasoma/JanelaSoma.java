/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasoma;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class JanelaSoma extends JFrame implements ActionListener{
    private JTextField txt1, txt2;
    private JButton btn1;

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer i1 = new Integer(txt1.getText());
        Integer i2 = new Integer(txt2.getText());
        JOptionPane.showMessageDialog(this,"A soma será "+(i1+i2));
    }
    public JanelaSoma() {
        setLayout(new FlowLayout());
        add(txt1=new JTextField(5));
        add(txt2=new JTextField(5));
        add(btn1=new JButton("Somar"));
        btn1.addActionListener(this);
    }
    public static void main(String[] args) {
        JanelaSoma j1 = new JanelaSoma();
        j1.setBounds(0,0, 300, 100);
        j1.setVisible(true);
    }
}