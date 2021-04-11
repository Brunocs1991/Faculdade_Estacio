
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brunocs
 */
public class Tela extends JFrame implements ActionListener{
    private String TextoPadraoBotao = null;
    private JButton botao = null;
    private Cursor cursorEspera = null;
    private Cursor cursorPadrao = null;
    private boolean aux;

    public Tela() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,300));
        TextoPadraoBotao = "Click na tela e altere o cursor para o tipo espere";
        
        botao = new JButton(TextoPadraoBotao);
        cursorEspera = new Cursor(Cursor.WAIT_CURSOR);
        cursorPadrao = new Cursor(Cursor.DEFAULT_CURSOR);
        
        botao.addActionListener(this);
        
        add(botao);
        pack();
        setLocationRelativeTo(null);
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(aux){
            aux = false;
            botao.setText(TextoPadraoBotao);
            setCursor(cursorPadrao);
        }else{
            aux = true;
            botao.setText("Click na tela e altere o cursor para o tipo padrao");
            setCursor(cursorEspera);
        }
    }
}
