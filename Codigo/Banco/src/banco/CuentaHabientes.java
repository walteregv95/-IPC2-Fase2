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
public class CuentaHabientes extends JFrame{

    JPanel panel,panelSaldo, panelEstadoCuenta, panelPagos,panelEmisionCheque;
    JButton bSaldo, bEstadoCuenta, bAperturaCuenta, bCerrarCuenta,bBuscar,bRegresar,bReporteSaldo,bEmisionCheque,bEmitir,bCuentaHabientes;
    //JTabbedPane panelSaldo, panelEstadoCuenta, panelPagos,panelEmisionCheque;
    JLabel lblCuenta, lblSaldo, lblSaldoInicial, lblDeposito, lblCheques, lblDebito, lblDisponible, lblSobregiro,lblNombre,lblCuentaC,lblNoCheque;
    JTextField txtNoCuenta, txtSaldoInicial, txtDeposito, txtCheques, txtDebito, txtDisponible, txtSobregiro,txtNombre,txtCuentaC,txtNoCheque;
    JTable tblEstadoCuenta;
     int NoCuenta;
    String Saldo,Deposito,Debito,Disponible;
    int NoCheque;
   
    public CuentaHabientes() {
        
        
        Random rm = new Random();
        NoCheque =rm.nextInt(132139);  
        setTitle("Servicio al Cliente");
        setBounds(150, 20, 750, 430);
        panel = new JPanel(); 
        setContentPane(panel);
        panel.setLayout(null );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelSaldo = new JPanel();
        panelEstadoCuenta = new JPanel();
        panelPagos = new JPanel();
        panelEmisionCheque = new JPanel();
        
        
        lblCuenta = new JLabel("Cuenta No.");
        txtNoCuenta = new JTextField();
        
         lblSaldo = new JLabel("SALDO");   
         lblSaldoInicial = new JLabel("saldo Inicial");  
         lblDeposito = new JLabel("Deposito");  
         lblCheques = new JLabel("Cheques");  
         lblDebito = new JLabel("Debito");
         lblDisponible = new JLabel("Disponible");  
         lblSobregiro = new JLabel("Sobregiro"); 
         lblNombre = new JLabel("Nombre"); 
         lblCuentaC = new JLabel("Cuenta"); 
         lblNoCheque = new JLabel("Cheque No."); 
         
         
         txtSaldoInicial = new JTextField();
         txtDeposito = new JTextField();
         txtCheques = new JTextField();
         txtDebito = new JTextField();
         txtDisponible = new JTextField();
         txtSobregiro = new JTextField();
         txtNombre = new JTextField();
         txtCuentaC = new JTextField();
         txtNoCheque= new JTextField();
         
         

        bSaldo =new JButton("Saldo");
        bEstadoCuenta = new JButton("Estado de cuenta");
        bAperturaCuenta = new JButton("Apertura de Cuenta");
        bCerrarCuenta = new JButton("Cerrar Cuenta");
        bBuscar = new JButton("Buscar");
        bRegresar = new JButton("Regresar");
        bReporteSaldo = new JButton("Reporte");
        bEmisionCheque = new JButton("Emision de cheque");
        bEmitir= new JButton("Emitir");
        bCuentaHabientes= new JButton("Cuenta Habientes");
        tblEstadoCuenta = new JTable();
        
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
        lblCuenta.setBounds(10, 5, 130, 30);
        panel.add(lblCuenta);
        txtNoCuenta.setBounds(10,30,130,20);
       // txtNoCuenta.setEditable(false);
        panel.add(txtNoCuenta);
        lblNombre.setBounds(175, 5, 130, 30);
        panel.add(lblNombre);
        txtNombre.setBounds(175, 30, 200, 20);
        panel.add(txtNombre);
        
        bBuscar.setBounds(400, 30, 130, 20);
        panel.add(bBuscar);
        bBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                NoCuenta = Integer.parseInt(txtNoCuenta.getText());
                for (int i = 0; i < 50; i++) {
                    
                    if (AperturaCuenta.registro[i].getNoCuenta()== NoCuenta){
                        JOptionPane.showMessageDialog( null, "Registro Encontrado" );
                        txtNombre.setText(AperturaCuenta.registro[i].getNombre());
                        txtSaldoInicial.setText(String.valueOf(AperturaCuenta.saldo[i].getSaldoInicial()));
                        txtDeposito.setText(String.valueOf(AperturaCuenta.saldo[i].getDeposito()));
                        txtDebito.setText(String.valueOf(AperturaCuenta.saldo[i].getDebito()));
                        txtDisponible.setText(String.valueOf(AperturaCuenta.saldo[i].getDisponible()));
                       break;
                    } else {JOptionPane.showMessageDialog( null, "No encontró Registro" );}
                }
            }
        });
                
        bCuentaHabientes.setBounds(20, 200, 150, 20);
        panel.add(bCuentaHabientes);
        bCuentaHabientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reporte.html");
            archivo.write("<html class=fondo> \n".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<link rel=stylesheet href=cssExterno.css>".getBytes());
            archivo.write("<title> Reporte de Cuenta Habientes </title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body background= \"credito1.jpeg\" text= \"white\" >\n".getBytes());            
            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>Cuenta Habientes</h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());
            archivo.write("<table align=center border = 2 width=500 >\n".getBytes());
            archivo.write("<tr>\n".getBytes());  
            archivo.write("<td><h3>Nombre</h3></td>\n".getBytes()); 
            archivo.write("<td><h3>Direccion</h3></td>\n".getBytes()); 
            archivo.write("<td><h3>Moneda</h3></td>\n".getBytes()); 
            archivo.write("<td><h3>Tipo</h3></td>\n".getBytes()); 
            archivo.write("</tr>\n".getBytes());
                   for (int i = 0; i < 3; i++) {
            archivo.write("<tr>\n".getBytes());
            archivo.write(("<td>"+AperturaCuenta.registro[i].getNombre()+"</td>\n").getBytes());
            archivo.write(("<td>"+AperturaCuenta.registro[i].getDireccion()+"</td>\n").getBytes());
            archivo.write(("<td>"+AperturaCuenta.registro[i].getMoneda()+"</td>\n").getBytes());
            archivo.write(("<td>"+AperturaCuenta.registro[i].getTipo()+"</td>\n").getBytes());
            archivo.write("<t/r>\n".getBytes());
                       
                   }
            
             archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reporte.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
            }
        });
        bSaldo.setBounds(20, 80, 150, 20);
        panel.add(bSaldo);
        bSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelSaldo.setVisible(true);
                panelEstadoCuenta.setVisible(false);
                panelPagos.setVisible(false);
                panelEmisionCheque.setVisible(false);
            }
        });
        bEmisionCheque.setBounds(20, 170, 150, 20);
        panel.add(bEmisionCheque);
        bEmisionCheque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelSaldo.setVisible(false);
                panelEstadoCuenta.setVisible(false);
                panelPagos.setVisible(false);
                panelEmisionCheque.setVisible(true);
                txtCuentaC.setText(txtNoCuenta.getText()); 
                txtNoCheque.setText(String.valueOf(NoCheque));
            }
        });
        bEstadoCuenta.setBounds(20, 110, 150, 20);
        bEstadoCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
        
               try {
            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reporte.html");
            archivo.write("<html class=fondo> \n".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<link rel=stylesheet href=cssExterno.css>".getBytes());
            archivo.write("<title> Estado Cuenta </title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body background= \"credito1.jpeg\" text= \"white\" >\n".getBytes());            
            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>Estado Cuenta</h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());
            archivo.write("<table align=center border = 2 width=500 >\n".getBytes());
            archivo.write("<tr>\n".getBytes());  
            archivo.write("<td><h3>Fecha</h3></td>\n".getBytes()); 
            archivo.write("<td><h3>Descripcion</h3></td>\n".getBytes()); 
            archivo.write("<td><h3>Deposito/Debito</h3></td>\n".getBytes()); 
            archivo.write("<td><h3>Saldo</h3></td>\n".getBytes()); 
            archivo.write("</tr>\n".getBytes());
                   for (int i = 0; i < 3; i++) {
            archivo.write("<tr>\n".getBytes());
            archivo.write(("<td>"+Receptor_Pagador.Fecha()+"</td>\n").getBytes());
            archivo.write(("<td>"+Receptor_Pagador.EstadoCuenta[i].getDescripcion()+"</td>\n").getBytes());
            archivo.write(("<td>"+Receptor_Pagador.EstadoCuenta[i].getDebCred()+"</td>\n").getBytes());
            archivo.write(("<td>"+Receptor_Pagador.EstadoCuenta[i].getSaldo()+"</td>\n").getBytes());
            archivo.write("<t/r>\n".getBytes());
                       
                   }
            
             archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reporte.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
            }
        });
        panel.add(bEstadoCuenta);
        bAperturaCuenta.setBounds(20, 140, 150, 20);
        bAperturaCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                AperturaCuenta enlace = new AperturaCuenta();
                enlace.setVisible(true);
            }
        });
        panel.add(bAperturaCuenta);
        /*bCerrarCuenta.setBounds(20, 170, 150, 20);
        panel.add(bCerrarCuenta);*/
        
        panelSaldo.setBounds(180, 80,550, 300);       
        panel.add(panelSaldo);
        panelSaldo.setBackground(Color.gray);
        panelSaldo.setLayout(null );
        panelSaldo.setVisible(false);
        
        panelEstadoCuenta.setBounds(180, 80,550, 400);
        panel.add(panelEstadoCuenta);
        panelEstadoCuenta.setBackground(Color.gray);
        panelEstadoCuenta.setLayout(null );
        panelEstadoCuenta.setVisible(false);
        
        panelPagos.setBounds(180, 80,550, 400);
        panel.add(panelPagos);
        panelPagos.setBackground(Color.gray); 
        panelPagos.setLayout(null );
        panelPagos.setVisible(false);
        
        panelEmisionCheque.setBounds(180, 80,550, 400);
        panel.add(panelEmisionCheque);
        panelEmisionCheque.setBackground(Color.gray);  
        panelEmisionCheque.setLayout(null );
        panelEmisionCheque.setVisible(false);
        
        lblSaldo.setBounds(20, 15, 80, 30);
        panelSaldo.add(lblSaldo);
        lblSaldoInicial.setBounds(50,80, 100, 20);
        panelSaldo.add(lblSaldoInicial);
        txtSaldoInicial.setBounds(150,80,80,20);
        panelSaldo.add(txtSaldoInicial);  
        txtSaldoInicial.setText("0.00");
        txtSaldoInicial.setEditable(false);
        lblDeposito.setBounds(50,120, 100, 20);
        panelSaldo.add(lblDeposito);
        txtDeposito.setBounds(150,120,80,20);
        panelSaldo.add(txtDeposito); 
        txtDeposito.setText("0.00");
        txtDeposito.setEditable(false);
        lblCheques.setBounds(50,160, 100, 20);
        panelSaldo.add(lblCheques);
        txtCheques.setBounds(150,160,80,20);
        panelSaldo.add(txtCheques); 
        txtCheques.setText("0.00");
        txtCheques.setEditable(false);
        lblDebito.setBounds(300,80, 100, 20);
        panelSaldo.add(lblDebito);
        txtDebito.setBounds(400,80,80,20);
        panelSaldo.add(txtDebito);  
        txtDebito.setText("0.00");
        txtDebito.setEditable(false);
        lblSobregiro.setBounds(300,120,100, 20);
        panelSaldo.add(lblSobregiro);
        txtSobregiro.setBounds(400,120,80,20);
        panelSaldo.add(txtSobregiro);
        txtSobregiro.setText("0.00");
        txtSobregiro.setEditable(false);
        lblDisponible.setBounds(190,200, 100, 20);
        panelSaldo.add(lblDisponible);
        txtDisponible.setBounds(270,200,80,20);
        txtDisponible.setForeground(Color.blue);
        txtDisponible.setText("0.00"); 
        txtDisponible.setEditable(false);
        panelSaldo.add(txtDisponible);
        bReporteSaldo.setBounds(380, 270, 80, 20);
        panelSaldo.add(bReporteSaldo);
        bReporteSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Saldo = txtSaldoInicial.getText();
                 Deposito = txtDeposito.getText();
                Debito = txtDebito.getText();
                Disponible = txtDisponible.getText();
                try {
            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reporte.html");
            archivo.write("<html class=fondo> \n".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<link rel=stylesheet href=cssExterno.css>".getBytes());
            archivo.write("<title> Reporte de Saldo </title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body background= \"fondo.jpg\" text= \"white\" >\n".getBytes());            
            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>Reporte de Saldo</h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());
            archivo.write("<table align=center border = 2>\n".getBytes());
            archivo.write("<tr>\n".getBytes());     
            archivo.write("<td><h3>Saldo Inicial</h5></td>\n".getBytes());
            archivo.write(("<td><h3>"+Saldo+"</h5></td>\n").getBytes());
            archivo.write("</tr>\n".getBytes()); 
            archivo.write("<tr>\n".getBytes());
            archivo.write("<td><h3>Deposito</h5></td>\n".getBytes());
            archivo.write(("<td><h3>"+Deposito+"</h5></td>\n").getBytes());
            archivo.write("</tr>\n".getBytes()); 
            archivo.write("<tr>\n".getBytes());
            archivo.write("<td><h3>Debito</h5></td>\n".getBytes());
            archivo.write(("<td><h3>"+Debito+"</h5></td>\n").getBytes());
            archivo.write("</tr>\n".getBytes());
            archivo.write("<tr>\n".getBytes());
            archivo.write("<td><h3>Disponible</h5></td>\n".getBytes());
            archivo.write(("<td><h3>"+Disponible+"</h5></td>\n").getBytes());
            archivo.write("</tr>\n".getBytes());
             archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reporte.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
            }
        });
                 
        tblEstadoCuenta.setBounds(5, 40, 510, 360);
        panelEstadoCuenta.add(tblEstadoCuenta);
        
        lblCuentaC.setBounds(50, 100, 80, 20);
        panelEmisionCheque.add(lblCuentaC);
        txtCuentaC.setBounds(140, 100, 120, 20);
        panelEmisionCheque.add(txtCuentaC);
        lblNoCheque.setBounds(280, 100, 80, 20);
        panelEmisionCheque.add(lblNoCheque);
        txtNoCheque.setBounds(380, 100, 120, 20);
        panelEmisionCheque.add(txtNoCheque);
        bEmitir.setBounds(200, 150, 120, 20);
        panelEmisionCheque.add(bEmitir);
        bEmitir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 try {
            java.io.FileOutputStream archivo = new java.io.FileOutputStream("reporte.html");
            archivo.write("<html class=fondo> \n".getBytes());
            archivo.write("<head>\n".getBytes());
            archivo.write("<link rel=stylesheet href=cssExterno.css>".getBytes());
            archivo.write("<title> Emision de Cheque </title>\n".getBytes());
            archivo.write("</head>\n".getBytes());
            archivo.write("<body >\n".getBytes());            
            archivo.write("<center>\n".getBytes());
            archivo.write("<h1>Cheque</h1>\n".getBytes());
            archivo.write("</center>\n".getBytes());
            archivo.write("<table align=center width=800 cellpadding= 0 cellspacing = 0 border = 1>\n".getBytes());
            archivo.write("<tr>\n".getBytes());     
            archivo.write("<td><h2>BANCO</h2></td>\n".getBytes());
            archivo.write("<td><h3>Cuenta</h3></td>\n".getBytes());
            archivo.write(("<td><h3>"+txtCuentaC.getText()+"</h3></td>\n").getBytes());
            archivo.write("<td colspan=2></td>\n".getBytes());
            
            archivo.write("</tr>\n".getBytes());
            archivo.write("<tr>\n".getBytes());
            archivo.write("<td colspan = 3 rowspan = 2 ></td>\n".getBytes()); 
            archivo.write("<td width = 120><h3>Cheque No.</h3></td>\n".getBytes()); 
            archivo.write(("<td><h3>"+txtNoCheque.getText()+"</h3></td>\n").getBytes()); 
            archivo.write("</tr>\n".getBytes()); 
            archivo.write("<tr>\n".getBytes()); 
            archivo.write("<td colspan = 2><h3>Q._______________</h3></td>\n".getBytes()); 
            archivo.write("</tr>\n".getBytes()); 
            archivo.write("<tr>\n".getBytes()); 
            archivo.write("<td colspan= 5><h6>Lugar y Fecha:___________________________________________________________</6></td><\n".getBytes()); 
            archivo.write("</tr>\n".getBytes()); 
            archivo.write("<tr>\n".getBytes()); 
            archivo.write("<td colspan= 5><h6>Paguese A:________________________________________________________________</h6></td><\n".getBytes()); 
            archivo.write("</tr>\n".getBytes());
            archivo.write("<tr>\n".getBytes()); 
            archivo.write("<td colspan= 5><h6>Suma de:__________________________________________________________________</h6></td><\n".getBytes()); 
            archivo.write("</tr>\n".getBytes()); 
             archivo.write("<tr>\n".getBytes()); 
              archivo.write("<td colspan = 2></td>\n".getBytes()); 
              archivo.write("<td colspan = 2><h3>Firma:____________________</h3></td>\n".getBytes()); 
              archivo.write("</tr>\n".getBytes()); 
            archivo.write("</table>\n".getBytes());
            archivo.write("</body>\n".getBytes());
            archivo.write("</html>".getBytes());
            Runtime.getRuntime().exec("explorer.exe reporte.html");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
            }
        });
        
       setVisible(true);
    }
    
}
