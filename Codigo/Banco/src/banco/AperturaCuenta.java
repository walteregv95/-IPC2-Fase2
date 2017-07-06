/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class AperturaCuenta  extends JFrame{
    JPanel panel,panelTipo,panelMoneda;
    JButton bRegistrar;
    JLabel lblNoCuenta, lblNombre, lblDireccion, lblTipo, lblMoneda, lblMonto;
    JTextField txtNoCuenta, txtNombre, txtDireccion, txtMonto;
    JRadioButton optMonetaria,optAhorro, optQuetzales, optDolares, optEuros;
    ButtonGroup bgTipoCuenta, bgMoneda;
    int contador = 0;
    static int NoCuenta = 5000;
    String Nombre;
    String Direccion;
    String Tipo;
    String Moneda;
    Double Monto;
    static Double SaldoInicial;
    static Double Deposito;
    static Double Debito;
    static Double Disponible;
      public static RegistrarCliente[] registro = new RegistrarCliente[50];
      public static Saldo[] saldo = new Saldo[50];
    public AperturaCuenta() {
        Random rm = new Random();
        
        setTitle("Apertura de Cuenta");
        
     
         
        setBounds(150, 20, 450, 480);
        panel = new JPanel(); 
        setContentPane(panel);
        panel.setLayout(null );
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelTipo = new JPanel();
        panelMoneda = new JPanel();
        
        lblNoCuenta = new JLabel("No. Cuenta");
        lblNombre = new JLabel("Nombre");
        lblDireccion = new JLabel("Dirección");
        lblTipo = new JLabel("Tipo");
        lblMoneda = new JLabel("Moneda");
        lblMonto = new JLabel("Monto");
        
        txtNoCuenta = new JTextField();
        txtNombre = new JTextField();
        txtDireccion = new JTextField();
        txtMonto = new JTextField();
        
        optMonetaria = new JRadioButton("Monetaria");
        optAhorro = new JRadioButton("Ahorro");
        optQuetzales = new JRadioButton("Quetzales");
        optDolares = new JRadioButton("Dolares");
        optEuros = new JRadioButton("Euros");
        
        bRegistrar = new JButton("Registrar");
        
        bgTipoCuenta = new ButtonGroup();
        bgMoneda = new ButtonGroup();
        
        lblNoCuenta.setBounds(30, 40, 80, 20);
        panel.add(lblNoCuenta);
        txtNoCuenta.setBounds(110, 40, 100, 20);
        txtNoCuenta.setText(String.valueOf(NoCuenta));
        panel.add(txtNoCuenta);
        lblNombre.setBounds(30, 80, 80, 20);
        panel.add(lblNombre);
        txtNombre.setBounds(110, 80, 280, 20);
        panel.add(txtNombre);
        lblDireccion.setBounds(30, 120, 80, 20);
        panel.add(lblDireccion);
        txtDireccion.setBounds(110, 120, 280, 20);
        panel.add(txtDireccion);
        
        
        lblTipo.setBounds(10, 160, 80, 20);
        panel.add(lblTipo);
        bgTipoCuenta.add(optMonetaria);
        optMonetaria.setBounds(55, 190, 140, 20);
        panel.add(optMonetaria);
        bgTipoCuenta.add(optAhorro);
        optAhorro.setBounds(200, 190, 140, 20);
        panel.add(optAhorro);
        
        lblMoneda.setBounds(30, 230, 80, 20);
        panel.add(lblMoneda);
        bgMoneda.add(optQuetzales);
        optQuetzales.setBounds(120, 230, 140, 20);
        panel.add(optQuetzales);
        bgMoneda.add(optDolares);
        optDolares.setBounds(120, 260, 140, 20);
        panel.add(optDolares);
        bgMoneda.add(optEuros);
        optEuros.setBounds(120, 290, 140, 20);
        panel.add(optEuros);
        
        lblMonto.setBounds(50, 325, 80, 20);
        panel.add(lblMonto);
        txtMonto.setBounds(120,325,80,20);
        panel.add(txtMonto);
        
        bRegistrar.setBounds(150, 370, 100, 30);
        panel.add(bRegistrar);
        bRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
        NoCuenta = Integer.parseInt(txtNoCuenta.getText());
        Nombre = txtNombre.getText();
        Direccion = txtDireccion.getText();
        if (optMonetaria.isSelected()){
        Tipo = optMonetaria.getText();
        } else if (optAhorro.isSelected()){
        Tipo = optAhorro.getText();
        }
        if(optQuetzales.isSelected()){        
        Moneda = optQuetzales.getText();
        }else if(optDolares.isSelected()){
         Moneda = optDolares.getText();
        }else if (optEuros.isSelected()){
            Moneda = optEuros.getText();
        }
        Monto = Double.parseDouble(txtMonto.getText());
        SaldoInicial = Monto;
        Deposito = 0.00;
        Debito = 0.00;
        Disponible = Monto + Deposito - Debito;
        
                registro [contador] = new RegistrarCliente(NoCuenta,Nombre,Direccion, Tipo,Moneda,Monto);
                saldo[contador] = new Saldo(NoCuenta,SaldoInicial,Deposito,Debito,Disponible);
                contador = contador +1;
                NoCuenta = NoCuenta +1;
                JOptionPane.showMessageDialog( null, "Nuevo Usuario Registrado" );
            }
        });
        setVisible(true);
        
        
    }
    
    
}
