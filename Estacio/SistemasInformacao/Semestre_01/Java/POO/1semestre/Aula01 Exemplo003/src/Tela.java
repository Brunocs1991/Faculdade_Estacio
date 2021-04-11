
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
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
public class Tela extends JFrame{
    private JLabel lblTitulo = null;
    private JLabel lblNome = null;
    private JLabel lblEmail = null;
    private JLabel lblSexo = null;
    private JLabel lblSenha = null;
    private JLabel lblEstiloLeitura = null;
    private JLabel lblTimeFutebol = null;
    private JTextField txtNome = null;
    private JTextField txtEmail = null;
    private JPasswordField pswSenha = null;
    private JRadioButton rdbMasculino = null;
    private JRadioButton rdbFeminino = null;
    private JCheckBox chkEsportes =  null;
    private JCheckBox chkEducacao = null;
    private JCheckBox chkCulinaria = null;
    private JComboBox jComboBox1 = null;
    private JButton btnEnviar = null;    
    private ButtonGroup tipoSexo = null;
    
    public Tela(){
        setSize(420,410);
        setTitle("Exemplo de Tela");
        setLocation(10,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lblTitulo = new JLabel("Cadastro de Clientes");
        lblTitulo.setLocation(118,6);
        lblTitulo.setSize(154,23);
        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 18));
        
        lblNome = new JLabel("Nome:");
        lblNome.setLocation(103, 52);
        lblNome.setSize(41, 16);
        
        txtNome = new JTextField(10);
        txtNome.setLocation(150, 46);
        txtNome.setSize(123, 28); 
        
        lblEmail = new JLabel("Email:");
        lblEmail.setLocation(106, 92);
        lblEmail.setSize(38, 16);
        
        txtEmail = new JTextField(10);
        txtEmail.setLocation(150, 86);
        txtEmail.setSize(123, 28);
        
        lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(103, 126, 41, 16);
        
        pswSenha = new JPasswordField();
        pswSenha.setBounds(150, 120, 123, 28);
        
        lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(110, 175, 34, 16);
        
        rdbMasculino = new JRadioButton("Masculino");
        rdbMasculino.setBounds(150, 160, 96, 23);
        
        rdbFeminino= new JRadioButton("Feminino");
        rdbFeminino.setBounds(150, 195, 90, 23);
        
        lblEstiloLeitura = new JLabel("Estilo de Leitura:");
        lblEstiloLeitura.setBounds(39, 233, 105, 16);
        
        chkEsportes = new JCheckBox("Esportes");
        chkEsportes.setBounds(150, 229, 86, 23);
        
        chkEducacao = new JCheckBox("Educação");
        chkEducacao.setBounds(150, 258, 91, 23);
        
        chkCulinaria = new JCheckBox("Culinaria");
        chkCulinaria.setBounds(150, 287, 88, 23);
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(350, 352, 10, 10);
        
        lblTimeFutebol = new JLabel("Time de Futebol");
        lblTimeFutebol.setBounds(39, 326, 105, 16);
        
        jComboBox1 = new JComboBox();
        jComboBox1.setBounds(150, 322, 102, 27);
        jComboBox1.addItem("Fluminense");
        jComboBox1.addItem("BotaFogo");
        jComboBox1.addItem("Vasco");
        jComboBox1.addItem("América");
        jComboBox1.addItem("Flamengo");
        
        tipoSexo = new ButtonGroup();
        tipoSexo.add(rdbMasculino);
        tipoSexo.add(rdbFeminino);
        add(lblTitulo);
        add(lblNome);
        add(txtNome);
        add(lblEmail);
        add(txtEmail);
        add(lblSenha);
        add(pswSenha);
        add(lblSexo);
        add(rdbMasculino);
        add(rdbFeminino);
        add(lblEstiloLeitura);
        add(chkEsportes);
        add(chkEducacao);
        add(chkCulinaria);
        add(lblTimeFutebol);
        add(jComboBox1);
        add(btnEnviar);       
        
    }
}
