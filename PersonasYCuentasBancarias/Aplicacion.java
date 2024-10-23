import clases.Persona;
import java.util.ArrayList;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Macarena", 20);
        Persona persona2 = new Persona("Pablo", 25);
        Persona persona3 = new Persona("Maria", 22);

        CuentaBancaria cuenta1 = new CuentaBancaria(15000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(30000, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(20000, persona3);

        cuenta1.depositar(5000);
        cuenta2.retirar(15000);
        cuenta3.retirar(3000);

        ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

        listaDeCuentasBancarias.add(cuenta1);
        listaDeCuentasBancarias.add(cuenta2);
        listaDeCuentasBancarias.add(cuenta3);

        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta3.getSaldo());

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas(listaDeCuentasBancarias);
    }
}
