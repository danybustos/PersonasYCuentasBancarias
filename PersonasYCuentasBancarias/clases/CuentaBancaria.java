package clases;
import java.util.ArrayList;

public class CuentaBancaria {
    // Atributos
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private ArrayList<CuentaBancaria> listaDeCuentasBancarias;

    // Constructor
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = (int)Math.floor(Math.random() * (1000000 - 000000) + 000000);
        this.listaDeCuentasBancarias = new ArrayList<>();
    }

    // Getters
    public double getSaldo(){
        return saldo;
    }

    public Persona getTitular(){
        return titular;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    public ArrayList<CuentaBancaria> getListaDeCuentasBancarias(){
        return listaDeCuentasBancarias;
    }

    // Setters

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setTitular(Persona titular){
        this.titular = titular;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias){
        this.listaDeCuentasBancarias = listaDeCuentasBancarias;
    }

    public double depositar(double monto){
        saldo += monto;
        return saldo;
    }
    
    public double retirar(double monto){
        saldo -= monto;
        return saldo;
    }

    public String desplegarInformacion(){
        return "Titular: " + titular.getNombre() + ", Saldo: $" + saldo + ", Número de Cuenta: " + numeroCuenta;
    }

    public static void imprimeInformacionDeTodasLasCuentas(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            System.out.println(cuenta.desplegarInformacion());
        }
    }
}