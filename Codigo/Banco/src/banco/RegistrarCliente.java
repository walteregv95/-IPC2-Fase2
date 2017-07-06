/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class RegistrarCliente {
    private int NoCuenta;
    private String Nombre;
    private String Direccion;
    private String Tipo;
    private String Moneda;
    private Double Monto;

    public RegistrarCliente(int NoCuenta, String Nombre, String Direccion, String Tipo, String Moneda, Double Monto) {
        this.NoCuenta = NoCuenta;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Tipo = Tipo;
        this.Moneda = Moneda;
        this.Monto = Monto;
    }

    /**
     * @return the NoCuenta
     */
    public int getNoCuenta() {
        return NoCuenta;
    }

    /**
     * @param NoCuenta the NoCuenta to set
     */
    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Moneda
     */
    public String getMoneda() {
        return Moneda;
    }

    /**
     * @param Moneda the Moneda to set
     */
    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    /**
     * @return the Monto
     */
    public Double getMonto() {
        return Monto;
    }

    /**
     * @param Monto the Monto to set
     */
    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }
    
}
