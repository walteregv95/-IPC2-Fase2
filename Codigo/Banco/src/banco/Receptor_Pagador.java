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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
public class Receptor_Pagador extends JFrame {
    JPanel panel,panelServicios,panelDeposito,panelRetiro;
    JButton bPagos, bDeposito, bRetiro,bProcesar,bDepositar,bRetirar,bBuscar,bBuscarD,bBuscarR,bRegresar,bRdeposito;
    JLabel lblServicios, lblTotal, lblDeposito,lblNoCuentaD,lblMontoD, lblRetiro,lblNoCuentaR,lblMontoR,lblNoCuentaS,lblNombre,lblCuenta,lblFecha;
    JRadioButton optTelefono, optLuz, optAgua;
    JTextField txtTotal, txtNoCuentaD, txtMontoD, txtNoCuentaR, txtMontoR,txtNoCuentaS,txtNoCuenta,txtNombre;
    ButtonGroup bgServicios;
    
    int NoCuenta;
    int indice;
    int contador = 0;
    String Fecha,Descripcion,DebCred,Saldo;
    public static EstadoCuenta []EstadoCuenta = new EstadoCuenta[50];
    public Receptor_Pagador() {
        setTitle("Receptor Pagador");
       setBounds(150, 20, 750, 430);
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelServicios = new JPanel();
        panelDeposito = new JPanel();
        panelRetiro = new JPanel();
        
        lblServicios = new JLabel("SERVICIOS");
        lblTotal = new JLabel("Total a Pagar");
        lblDeposito = new JLabel("DEPOSITOS");
        lblNoCuentaD = new JLabel("No. Cuenta");
        lblMontoD= new JLabel("Monto");
        lblRetiro= new JLabel("RETIROS");
        lblNoCuentaR = new JLabel("No. Cuenta");
        lblMontoR = new JLabel("Monto");
        lblNoCuentaS = new JLabel("No. Cuenta");
        lblFecha = new JLabel("DD/MM/YYYY");
        
        optTelefono = new JRadioButton("Telefono");
        optLuz = new JRadioButton("Luz");
        optAgua = new JRadioButton("Agua");
        
        txtTotal = new JTextField();
        txtNoCuentaD = new JTextField(); 
        txtMontoD = new JTextField();
        txtNoCuentaR= new JTextField();
        txtMontoR = new JTextField();
        txtNoCuentaS = new JTextField();
        
        bPagos = new JButton("Pagos");
        bDeposito = new JButton("Deposito");
        bRetiro = new JButton("Retiro");
        bProcesar = new JButton("Procesar");
        bDepositar = new JButton("Depositar");
         bRetirar = new JButton("Retirar");
         bBuscar = new JButton("Buscar");
         bBuscarD= new JButton("Buscar");
         bBuscarR= new JButton("Buscar");
         bRegresar= new JButton("Regresar");
         bRdeposito= new JButton("Boleta");
        
         lblCuenta = new JLabel("Cuenta No.");
        txtNoCuenta = new JTextField();
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        bgServicios = new ButtonGroup();
        
        bRdeposito.setBounds(20, 200, 150, 20);
        panel.add(bRdeposito);
        bRdeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reporte.html");
            archivo.write("<html class=fondo> \n".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<link rel=stylesheet href=cssExterno.css>".getBytes());
            archivo.write("<title> Boleta </title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body background= \"credito1.jpeg\" text= \"white\" >\n".getBytes());            
            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>Boleta</h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());
            archivo.write("<table align=center border = 2 width=500 >\n".getBytes());
            archivo.write("<tr>\n".getBytes());
            archivo.write("<td>No Cuenta</td>\n".getBytes()); 
            archivo.write("<td>fecha</td>\n".getBytes());            
            archivo.write("</tr>\n".getBytes());  
            archivo.write("<tr>\n".getBytes());
            archivo.write("</tr>\n".getBytes());
            archivo.write("<td colspa>Nombre</td>\n".getBytes()); 
             archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reporte.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
            }
        });
        bRegresar.setBounds(20, 365, 150, 20);
        panel.add(bRegresar);
        bRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Login enlace = new Login();
                enlace.setVisible(true);
                dispose();
            }
        });
        bPagos.setBounds(20, 80, 150, 20);
        panel.add(bPagos);
        bPagos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelServicios.setVisible(true);
                panelDeposito.setVisible(false);
                panelRetiro.setVisible(false);
            }
        });
        bDeposito.setBounds(20, 110, 150, 20);
        panel.add(bDeposito);
        bDeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelServicios.setVisible(false);
                panelDeposito.setVisible(true);
                panelRetiro.setVisible(false);   
            }
        });
        bRetiro.setBounds(20, 140, 150, 20);
        panel.add(bRetiro);
        bRetiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelServicios.setVisible(false);
                panelDeposito.setVisible(false);
                panelRetiro.setVisible(true); 
            }
        });
         panelServicios.setBounds(180, 80,550, 300);       
        panel.add(panelServicios);
        panelServicios.setBackground(Color.gray);
        panelServicios.setLayout(null );
        panelServicios.setVisible(false);
        
         panelDeposito.setBounds(180, 80,550, 300);       
        panel.add(panelDeposito);
        panelDeposito.setBackground(Color.gray);
        panelDeposito.setLayout(null );
        panelDeposito.setVisible(false);
        
        panelRetiro.setBounds(180, 80,550, 300);       
        panel.add(panelRetiro);
        panelRetiro.setBackground(Color.gray);
        panelRetiro.setLayout(null );
        panelRetiro.setVisible(false);
        
        lblFecha.setBounds(475, 5, 130, 30);
        panel.add(lblFecha);
        lblFecha.setText(Fecha());
        lblCuenta.setBounds(10, 5, 130, 30);
        panel.add(lblCuenta);
        txtNoCuenta.setBounds(10,30,130,20);
        panel.add(txtNoCuenta);
        lblNombre.setBounds(175, 5, 130, 30);
        panel.add(lblNombre);
        txtNombre.setBounds(175, 30, 200, 20);
        panel.add(txtNombre);
        lblServicios.setBounds(20, 15, 80, 30);
        panelServicios.add(lblServicios);
        lblNoCuentaS.setBounds(180, 20, 80, 20);
        panelServicios.add(lblNoCuentaS);
        txtNoCuentaS.setBounds(280, 20, 80, 20);
        panelServicios.add(txtNoCuentaS);
        bBuscar.setBounds(400, 20, 100, 20);
        panelServicios.add(bBuscar);
        bBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 NoCuenta = Integer.parseInt(txtNoCuentaS.getText());
                for (int i = 0; i < 50; i++) {
                    
                    if (AperturaCuenta.registro[i].getNoCuenta()== NoCuenta){
                        JOptionPane.showMessageDialog( null, "Registro Encontrado" );
                        indice = i;
                        txtNoCuenta.setText(String.valueOf(AperturaCuenta.saldo[i].getNoCuenta()));
                        txtNombre.setText(AperturaCuenta.registro[i].getNombre());
                       break;
                    } else {JOptionPane.showMessageDialog( null, "No encontró Registro" );}
                }
            }
        });
        if(optLuz.isSelected()){
            txtTotal.setText("700");
        } else if(optAgua.isSelected()){
            txtTotal.setText("350");
        } else if(optTelefono.isSelected()){
            txtTotal.setText("200");
        }
        bgServicios.add(optTelefono);
        optTelefono.setBounds(50, 80 , 100, 30);        
        panelServicios.add(optTelefono);
        bgServicios.add(optLuz);
        optLuz.setBounds(200, 80 , 100, 30);        
        panelServicios.add(optLuz);
        bgServicios.add(optAgua);
        optAgua.setBounds(350, 80 , 100, 30);        
        panelServicios.add(optAgua);
        lblTotal.setBounds(100, 130, 80, 20);
        panelServicios.add(lblTotal);
        txtTotal.setBounds(200, 130, 80, 20);
        panelServicios.add(txtTotal);
        bProcesar.setBounds(180, 180, 120, 20);
        panelServicios.add(bProcesar);
        bProcesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                AperturaCuenta.Debito = Double.parseDouble(txtTotal.getText());
                AperturaCuenta.Disponible = AperturaCuenta.SaldoInicial - AperturaCuenta.Debito + AperturaCuenta.Deposito;
                    AperturaCuenta.saldo[indice] = new Saldo(NoCuenta,AperturaCuenta.SaldoInicial,AperturaCuenta.Deposito,AperturaCuenta.Debito,AperturaCuenta.Disponible);
                    Fecha = lblFecha.getText();
                    if(optTelefono.isSelected()){Descripcion = "Pago Telefono ";
                    }else if(optLuz.isSelected()){Descripcion = "Pago Luz";
                    }else if(optAgua.isSelected()){Descripcion = "Pago Agua";}
                    DebCred = txtTotal.getText();
                    Saldo = String.valueOf(AperturaCuenta.saldo[indice].getDisponible());
                  EstadoCuenta[contador] = new EstadoCuenta(Fecha,Descripcion,DebCred,Saldo);
                  contador = contador +1;
                    JOptionPane.showMessageDialog( null, "Pago Realizado" );
                
            }
        });
        
        
        
        lblDeposito.setBounds(20, 15, 80, 30);
        panelDeposito.add(lblDeposito);
        lblNoCuentaD.setBounds(145, 100, 80, 20);
        panelDeposito.add(lblNoCuentaD);
        txtNoCuentaD.setBounds(245,100, 80, 20);
        panelDeposito.add(txtNoCuentaD);
        bBuscarD.setBounds(365,100, 80, 20);
        panelDeposito.add(bBuscarD);
        bBuscarD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  NoCuenta = Integer.parseInt(txtNoCuentaD.getText());
                for (int i = 0; i < 50; i++) {
                    
                    if (AperturaCuenta.registro[i].getNoCuenta()== NoCuenta){
                        JOptionPane.showMessageDialog( null, "Registro Encontrado" );
                        indice = i;
                      txtNoCuenta.setText(String.valueOf(AperturaCuenta.saldo[i].getNoCuenta()));
                        txtNombre.setText(AperturaCuenta.registro[i].getNombre()); 
                       break;
                    } else {JOptionPane.showMessageDialog( null, "No encontró Registro" );}
                }
            }
        });
        lblMontoD.setBounds(145, 140, 80, 20);
        panelDeposito.add(lblMontoD);
        txtMontoD.setBounds(245,140, 80, 20);
        panelDeposito.add(txtMontoD);
        bDepositar.setBounds(160,200, 120, 20);
        panelDeposito.add(bDepositar);
        bDepositar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                AperturaCuenta.Deposito = Double.parseDouble(txtMontoD.getText());
                AperturaCuenta.Disponible = AperturaCuenta.SaldoInicial  + AperturaCuenta.Deposito;
                    AperturaCuenta.saldo[indice] = new Saldo(NoCuenta,AperturaCuenta.SaldoInicial,AperturaCuenta.Deposito,AperturaCuenta.Debito,AperturaCuenta.Disponible);
                    Fecha = lblFecha.getText();
                    Descripcion = "Deposito";
                    DebCred = txtMontoD.getText();
                    Saldo = String.valueOf(AperturaCuenta.saldo[indice].getDisponible());
                  EstadoCuenta[contador] = new EstadoCuenta(Fecha,Descripcion,DebCred,Saldo);
                  contador = contador +1;
                    JOptionPane.showMessageDialog( null, "Deposito Realizado" );
            }
        });  
        
        lblRetiro.setBounds(20, 15, 80, 30);
        panelRetiro.add(lblRetiro);
        lblNoCuentaR.setBounds(145, 100, 80, 20);
        panelRetiro.add(lblNoCuentaR);
        txtNoCuentaR.setBounds(245,100, 80, 20);
        panelRetiro.add(txtNoCuentaR);
        lblMontoR.setBounds(145, 140, 80, 20);
        panelRetiro.add(lblMontoR);
        txtMontoR.setBounds(245,140, 80, 20);
        panelRetiro.add(txtMontoR);
        bRetirar.setBounds(160,200, 120, 20);
        panelRetiro.add(bRetirar);
        bRetirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 AperturaCuenta.Debito = Double.parseDouble(txtMontoR.getText());
                AperturaCuenta.Disponible = AperturaCuenta.SaldoInicial - AperturaCuenta.Debito + AperturaCuenta.Deposito;
                    AperturaCuenta.saldo[indice] = new Saldo(NoCuenta,AperturaCuenta.SaldoInicial,AperturaCuenta.Deposito,AperturaCuenta.Debito,AperturaCuenta.Disponible);
                    Fecha = lblFecha.getText();
                    Descripcion = "Retiro";
                    DebCred = txtMontoR.getText();
                    Saldo = String.valueOf(AperturaCuenta.saldo[indice].getDisponible());
                  EstadoCuenta[contador] = new EstadoCuenta(Fecha,Descripcion,DebCred,Saldo);
                  contador = contador +1;
                    JOptionPane.showMessageDialog( null, "Retiro Realizado" );
            }
        });
        bBuscarR.setBounds(365,100, 80, 20);
        panelRetiro.add(bBuscarR);
        bBuscarR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  NoCuenta = Integer.parseInt(txtNoCuentaR.getText());
                for (int i = 0; i < 50; i++) {
                    
                    if (AperturaCuenta.registro[i].getNoCuenta()== NoCuenta){
                        JOptionPane.showMessageDialog( null, "Registro Encontrado" );
                        indice = i;
                      txtNoCuenta.setText(String.valueOf(AperturaCuenta.saldo[i].getNoCuenta()));
                        txtNombre.setText(AperturaCuenta.registro[i].getNombre()); 
                       break;
                    } else {JOptionPane.showMessageDialog( null, "No encontró Registro" );}
                }
            }
        });
       
        setVisible(true);
        
    }
    
     public static String Fecha(){
            Date fecha = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
            return formato.format(fecha);
        }
}
