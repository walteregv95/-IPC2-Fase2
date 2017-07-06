
package banco;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login extends JFrame{
    JPanel panel;
    JLabel Usuario,TipoCuenta,Contraseña,Login;
    JTextField txtUsuario;
    JPasswordField txtContraseña;
    JButton BotonLogin;
    JComboBox cmbOpcionCuenta;
   public static String[] usuario = new String [5];
    String [] contraseña = new String [5];
    
    String combo;

    public Login() {
        usuario[0] = "walter";
        usuario[1] = "eliette";
        usuario[2] = "*";
        usuario[3] = "*";
        usuario[4] = "*";
       
        contraseña[0]= "admin";
        contraseña[1] = "201504216";
        contraseña[2] = "*";
        contraseña[3] = "*";
        contraseña[4] = "*";
        
        setBounds(200, 50, 370, 300);
        
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        setContentPane(panel);
        panel.setLayout(null );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Usuario = new JLabel("Usuario");
        TipoCuenta = new JLabel("Tipo de Cuenta");
        Contraseña = new JLabel("Contraseña");
        Login = new JLabel("LOGIN");
        
        txtUsuario = new JTextField();
        txtContraseña = new JPasswordField();
        
        cmbOpcionCuenta = new JComboBox();
        
        BotonLogin = new JButton("Entrar");
        
        Login.setBounds(150,3,85,30);
        panel.add(Login);      
        TipoCuenta.setBounds(100,30,85,30);
        panel.add(TipoCuenta);
        
        cmbOpcionCuenta.setBounds(100,55,125,20);
        cmbOpcionCuenta.addItem("Servicio al Cliente");
        cmbOpcionCuenta.addItem("Receptor Pagador");
        cmbOpcionCuenta.addItem("Administrador");        
        panel.add(cmbOpcionCuenta);    
        
        Usuario.setBounds(100,70,85,30);
        panel.add(Usuario);            
        txtUsuario.setBounds(100,95,125,20);
         panel.add(txtUsuario);
         
        Contraseña.setBounds(100,110,85,30);
        panel.add(Contraseña);
        txtContraseña.setBounds(100,140,125,20);
         panel.add(txtContraseña);
        
        BotonLogin.setBounds(110,185,100,30);
        panel.add(BotonLogin);
        BotonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                combo = (String) cmbOpcionCuenta.getSelectedItem();
                for (int i = 0;i<5;i++){
                if(usuario[i].equals(txtUsuario.getText())&& contraseña[i].equals(txtContraseña.getText())){
                if (combo.equals("Servicio al Cliente")){
                CuentaHabientes enlace = new CuentaHabientes ();
                enlace.setVisible(true);
                dispose();}else if (combo.equals("Receptor Pagador")){
                Receptor_Pagador enlace = new Receptor_Pagador ();
                enlace.setVisible(true);
                dispose();
                }
                 break;
                } else if(i==4) {JOptionPane.showMessageDialog( null, "Usuario o Contraseña incorrecta" );} 
                 
                }
            }
        });
     
                     
        setVisible(true);
    }
    
    
    
}
