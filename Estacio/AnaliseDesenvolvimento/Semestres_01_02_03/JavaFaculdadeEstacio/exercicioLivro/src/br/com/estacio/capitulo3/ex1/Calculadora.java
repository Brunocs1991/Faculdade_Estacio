/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacio.capitulo3.ex1;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author bruno
 */
public class Calculadora extends JFrame implements ActionListener {

    private JButton btnResult, btnLimpar, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMais, btnMenos, btnDivide, btnMultplica, btnPonto;
    private JLabel resultado;
    String operador;
    String primeiro = "", segundo = "", sinal = "";
    int cont = 1;

    public Calculadora() {
        super("Calculadora");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250, 380);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        Container c = this.getContentPane();
        c.setLayout(null);

        final JTextField tbxPrincipal = new JTextField("");
        tbxPrincipal.setBounds(20, 40, 198, 20);
        c.add(tbxPrincipal);
        btn7 = new JButton("7");
        btn7.setBounds(20, 80, 45, 45);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "7";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn7);
        btn8 = new JButton("8");
        btn8.setBounds(70, 80, 45, 45);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "8";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn8);
        btn9 = new JButton("9");
        btn9.setBounds(120, 80, 45, 45);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "9";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn9);
        btn4 = new JButton("4");
        btn4.setBounds(20, 130, 45, 45);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "4";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn4);
        btn5 = new JButton("5");
        c.add(btn5);
        btn5.setBounds(70, 130, 45, 45);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "5";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        btn6 = new JButton("6");
        btn6.setBounds(120, 130, 45, 45);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "6";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn6);
        btn1 = new JButton("1");
        btn1.setBounds(20, 180, 45, 45);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "1";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn1);
        btn2 = new JButton("2");
        btn2.setBounds(70, 180, 45, 45);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "2";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn2);
        btn3 = new JButton("3");
        btn3.setBounds(120, 180, 45, 45);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "3";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn3);
        btn0 = new JButton("0");
        btn0.setBounds(20, 230, 45, 45);
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = "0";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btn0);
        btnPonto = new JButton(".");
        btnPonto.setBounds(70, 230, 45, 45);
        btnPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = ".";
                if (cont == 1) {
                    primeiro = primeiro + n;
                    tbxPrincipal.setText(primeiro);
                } else {
                    segundo = segundo + n;
                    tbxPrincipal.setText(segundo);
                }
            }
        });
        c.add(btnPonto);
        btnResult = new JButton("=");
        btnResult.setBounds(120, 230, 45, 45);
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorResultado = 0;
                if ("+".equals(sinal)) {
                    valorResultado = Double.valueOf(primeiro) + Double.valueOf(segundo);
                    tbxPrincipal.setText(String.valueOf(valorResultado));
                    cont = 1;
                    primeiro = "";
                    segundo = "";
                } else if ("-".equals(sinal)) {
                    valorResultado = Double.valueOf(primeiro) - Double.valueOf(segundo);
                    tbxPrincipal.setText(String.valueOf(valorResultado));
                    cont = 1;
                    primeiro = "";
                    segundo = "";
                } else if ("*".equals(sinal)) {
                    valorResultado = Double.valueOf(primeiro) * Double.valueOf(segundo);
                    tbxPrincipal.setText(String.valueOf(valorResultado));
                    cont = 1;
                    primeiro = "";
                    segundo = "";
                } else if ("/".equals(sinal)) {
                    valorResultado = Double.valueOf(primeiro) / Double.valueOf(segundo);
                    tbxPrincipal.setText(String.valueOf(valorResultado));
                    cont = 1;
                    primeiro = "";
                    segundo = "";
                } else {
                    tbxPrincipal.setText("Sem valores para afetuar funções");
                }
            }
        });
        c.add(btnResult);
        btnDivide = new JButton("/");
        btnDivide.setBounds(170, 80, 45, 45);
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = tbxPrincipal.getText();
                tbxPrincipal.setText(valor + "/");
                sinal = "/";
                cont = 2;
            }
        });
        c.add(btnDivide);
        btnMultplica = new JButton("*");
        btnMultplica.setBounds(170, 130, 45, 45);
        btnMultplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = tbxPrincipal.getText();
                tbxPrincipal.setText(valor + "*");
                sinal = "*";
                cont = 2;
            }
        });
        c.add(btnMultplica);
        btnMenos = new JButton("-");
        btnMenos.setBounds(170, 180, 45, 45);
        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = tbxPrincipal.getText();
                tbxPrincipal.setText(valor + "-");
                sinal = "-";
                cont = 2;
            }
        });
        c.add(btnMenos);
        btnMais = new JButton("+");
        btnMais.setBounds(170, 230, 45, 45);
        btnMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = tbxPrincipal.getText();
                tbxPrincipal.setText(valor + "+");
                sinal = "+";
                cont = 2;

            }
        });
        c.add(btnMais);
        btnLimpar = new JButton("CCE");
        btnLimpar.setBounds(20, 280, 85, 45);
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = tbxPrincipal.getText();
                tbxPrincipal.setText("");
                sinal = "CCE";
                cont = 1;
            }
        });
        c.add(btnLimpar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Calculadora f = new Calculadora();
                // f.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
}
