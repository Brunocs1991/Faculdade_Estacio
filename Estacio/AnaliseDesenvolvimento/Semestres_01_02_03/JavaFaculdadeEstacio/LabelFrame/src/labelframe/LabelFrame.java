package labelframe;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() {
        super("Teste do Jlabel");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setLocationRelativeTo(null);

        label1 = new JLabel("Label com um texto");
        label1.setToolTipText("Este e o label 1");
        add(label1);
        
        Icon bug = new  ImageIcon(getClass().getResource("bug.png"));
        label2 = new JLabel("label com texto e um icone", bug, SwingConstants.LEFT);
        label2.setToolTipText("Este e o label 2");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label com icone e texto embaixo");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Este e o label 3");
        add(label3);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LabelFrame janela = new LabelFrame();
                janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
                janela.setVisible(true);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

}
