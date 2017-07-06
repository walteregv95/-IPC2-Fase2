/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;



public class EstadoCuenta {
   private String Fecha;
   private String Descripcion; 
   private String DebCred;
   private String Saldo;

    public EstadoCuenta(String Fecha, String Descripcion, String DebCred, String Saldo) {
        this.Fecha = Fecha;
        this.Descripcion = Descripcion;
        this.DebCred = DebCred;
        this.Saldo = Saldo;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the DebCred
     */
    public String getDebCred() {
        return DebCred;
    }

    /**
     * @param DebCred the DebCred to set
     */
    public void setDebCred(String DebCred) {
        this.DebCred = DebCred;
    }

    /**
     * @return the Saldo
     */
    public String getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }
   

}
