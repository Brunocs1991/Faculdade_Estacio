package textedragdrop;


import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class TesteDragDrop extends JFrame{
    private final ImageIcon
        icon1 = new ImageIcon("src/resources/sad.png"),
        icon2 = new ImageIcon("src/resources/happy.png"),
        icon3 = new ImageIcon("src/resources/surprised.png");
    private JLabel label1, label2, label3;
    private final DragMouseAdapter
            listener = new DragMouseAdapter();
    private JButton button;

    private class DragMouseAdapter extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }  
    }
    private void initUI(){
        label1 = new JLabel(icon1, JLabel.CENTER);
        label2 = new JLabel(icon2, JLabel.CENTER);
        label3 = new JLabel(icon3, JLabel.CENTER);
        label1.addMouseListener(listener);
        label2.addMouseListener(listener);
        label3.addMouseListener(listener);
        (button = new JButton(icon2)).setFocusable(false);
        setTitle("Icon Drag & Drop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        label1.setTransferHandler(new TransferHandler("icon"));
        label2.setTransferHandler(new TransferHandler("icon"));
        label3.setTransferHandler(new TransferHandler("icon"));
        button.setTransferHandler(new TransferHandler("icon"));
        createLayout();
    }
    private void createLayout(){
        Container pane = getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);
        g1.setAutoCreateContainerGaps(true);
        g1.setAutoCreateGaps(true);
        g1.setHorizontalGroup(g1.createParallelGroup(GroupLayout.Alignment.CENTER).addGroup(g1.createSequentialGroup()
                .addComponent(label1).addGap(30)
                .addComponent(label2).addGap(30)
                .addComponent(label3))
                .addComponent(button,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,Integer.MAX_VALUE)
        );
        g1.setVerticalGroup(g1.createSequentialGroup().addGroup(g1.createParallelGroup()
                .addComponent(label1)
                .addComponent(label2)
                .addComponent(label3))
                .addGap(30)
                .addComponent(button)
        );
        pack();
    }

    public TesteDragDrop() {
        initUI();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new TesteDragDrop().setVisible(true);
        });
    }
    
}
