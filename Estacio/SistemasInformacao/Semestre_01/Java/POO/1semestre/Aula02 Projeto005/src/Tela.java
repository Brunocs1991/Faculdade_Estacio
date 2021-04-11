
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.List;
import java.awt.TextArea;
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
public class Tela extends JFrame{
    
    private GridBagLayout layout = null;
    private final int noLinhas = 3;
    
    public Tela() {
        super("Teste GridBagLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
        layout = new GridBagLayout();
        getContentPane().setLayout(layout);
        
        List lEsq = new List(noLinhas, true);
        lEsq.add("Um");
        lEsq.add("Dois");
        lEsq.add("Tres");
        lEsq.add("Quatro");
        lEsq.add("Cinco");
        lEsq.add("Seis");
        lEsq.add("Sete");
        Button add = new Button(">>");
        Button clear = new Button("Clear");
        Button close = new Button("Close");
        TextArea tDir = new TextArea("", noLinhas, 10, TextArea.SCROLLBARS_NONE);
        
        GridBagConstraints restricoes = new GridBagConstraints();
        restricoes.gridx = 0;
        restricoes.gridy = 0;
        restricoes.gridwidth = 1;
        restricoes.gridheight = 3;
        restricoes.fill = GridBagConstraints.VERTICAL;
        add(lEsq, restricoes);
        
        restricoes.gridx = 2;
        add(tDir, restricoes);
        
        Insets margens = new Insets(4, 3, 4, 3);
        restricoes.gridx = 1;
        restricoes.gridy = 0;
        restricoes.gridwidth = 1;
        restricoes.gridheight = 1;
        restricoes.fill = GridBagConstraints.BOTH;
        restricoes.ipadx = 4;
        restricoes.ipady = 4;
        restricoes.insets = margens;
        add(add, restricoes);
        
        restricoes.gridy = 1;
        add(clear, restricoes);
        
        restricoes.gridy = 2;
        add(close, restricoes);
        
        pack();       
    }
}
