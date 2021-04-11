
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brunocs
 */
public class Tela extends JFrame{
    
    private JLabel jLabel1 = null;
    private JLabel jLabel2 = null;
    private JLabel jLabel3 = null;
    private JLabel jLabel4 = null;
    private JLabel jLabel5 = null;
    private JLabel jLabel6 = null;
    private JLabel jLabel7 = null;
    private JLabel jLabel8 = null;
    private JLabel jLabel9 = null;
    
    public Tela() {
    
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo de Bordas");
        setBackground(new Color(255,0,0));
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(260,300));
        
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Borda BevelBorder ");
        jLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Borda SoftBevelBorder ");
        jLabel2.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText(" Borda Composta (line + Etched) ");
        jLabel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(new Color(0,0,0))));
        
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText(" Borda lineBorder c/cantos arredondados ");
        jLabel4.setBorder(new LineBorder(new Color(0,0,0),1, true));
        
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText(" Borda lineBorder  ");
        jLabel5.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
        Color vermelhoEscuro = new Color(235,50,50);
        jLabel5.setForeground(vermelhoEscuro);
        
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText(" Borda EtchedBorder  ");
        jLabel6.setBorder(BorderFactory.createEtchedBorder());
        jLabel6.setForeground(Color.BLUE);
        
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText(" Borda EmptyBorder  ");
        jLabel7.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText(" Borda MatteBorder  ");
        jLabel8.setBorder(new MatteBorder(null));
        
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText(" Borda TitleBorder  ");
        jLabel9.setBorder(BorderFactory.createTitledBorder("Titulo"));
        jLabel9.setForeground(Color.RED);
        jLabel9.setOpaque(true);
        jLabel9.setBackground(Color.GREEN);
        
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);
        add(jLabel8);
        add(jLabel9);
        pack();
        setLocationRelativeTo(null);
    }
}
