/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author walter garcia
 */
public class Saldo {
    private int NoCuenta;
    private Double SaldoInicial;
    private Double Deposito;
    private Double Debito;
    private Double Disponible;

    public Saldo(int NoCuenta, Double SaldoInicial, Double Deposito, Double Debito, Double Disponible) {
        this.NoCuenta = NoCuenta;
        this.SaldoInicial = SaldoInicial;
        this.Deposito = Deposito;
        this.Debito = Debito;
        this.Disponible = Disponible;
    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public Double getSaldoInicial() {
        return SaldoInicial;
    }

    public void setSaldoInicial(Double SaldoInicial) {
        this.SaldoInicial = SaldoInicial;
    }

    public Double getDeposito() {
        return Deposito;
    }

    public void setDeposito(Double Deposito) {
        this.Deposito = Deposito;
    }

    public Double getDebito() {
        return Debito;
    }

    public void setDebito(Double Debito) {
        this.Debito = Debito;
    }

    public Double getDisponible() {
        return Disponible;
    }

    public void setDisponible(Double Disponible) {
        this.Disponible = Disponible;
    }
    
}
