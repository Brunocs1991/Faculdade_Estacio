
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brunocs
 */
public class Tela extends JFrame implements ItemListener{
    
    private JTextField txtTexto = null;
    private Font fntNormal= null;
    private Font fntNegrito = null;
    private Font fntItalico = null;
    private Font fntItalicoNegrito = null;  
    
    private JRadioButton rdbNormal = null;
    private JRadioButton rdbNegrito = null;
    private JRadioButton rdbItalico = null;
    private JRadioButton rdbNegritoItalico = null;
    private ButtonGroup rdbTipoFonte = null;

    public Tela() {
        super("Exemplo de Fonte");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400,100);
        setLocation(500,300);
        Container painelConteudo = getContentPane();
        painelConteudo.setLayout(new FlowLayout());
        
        txtTexto = new JTextField("Bruno Costa e Silva", 31);
        rdbNormal = new JRadioButton("Normal",true);
        rdbNegrito = new JRadioButton("Negrito", false);
        rdbItalico = new JRadioButton("Italico", false);
        rdbNegritoItalico = new JRadioButton("Negrito/Italico", false);
        
        fntNormal = new Font("TimesRoman", Font.PLAIN, 14);
        fntNegrito = new Font("TimesRoman", Font.BOLD, 14);
        fntItalico = new Font("TimesRoman", Font.ITALIC, 14);
        fntItalicoNegrito = new Font("TimesRoman", Font.BOLD +  Font.ITALIC, 14);
        
        rdbTipoFonte = new ButtonGroup();
        rdbTipoFonte.add(rdbNormal);
        rdbTipoFonte.add(rdbNegrito);
        rdbTipoFonte.add(rdbItalico);
        rdbTipoFonte.add(rdbNegritoItalico);
        
        rdbNormal.addItemListener(this);
        rdbNegrito.addItemListener(this);
        rdbItalico.addItemListener(this);
        rdbNegritoItalico.addItemListener(this);
        
        painelConteudo.add(txtTexto);
        painelConteudo.add(rdbNormal);
        painelConteudo.add(rdbNegrito);
        painelConteudo.add(rdbItalico);
        painelConteudo.add(rdbNegritoItalico);
        
        txtTexto.setFont(fntNormal);        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == rdbNormal){
            txtTexto.setFont(fntNormal); 
        }else if(e.getSource() == rdbNegrito){
            txtTexto.setFont(fntNegrito); 
        }else if(e.getSource() == rdbItalico){
            txtTexto.setFont(fntItalico); 
        }else if(e.getSource() == rdbNegritoItalico){
            txtTexto.setFont(fntItalicoNegrito); 
        }
    }
}
