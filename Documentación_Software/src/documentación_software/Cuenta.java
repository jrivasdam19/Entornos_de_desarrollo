/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentación_software;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase Cuenta representa la cuenta bancaria de un cliente.
 * @author Jose
 */
public class Cuenta {

    //Atributos
    private String numeroCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    private int pin;

    //Constructores.
    /**
     * Contructor sin parámetros.
     */
    public Cuenta() {
    }

    /**
     * Constructor con 5 parámetros.
     *
     * @param numeroCliente Número identificativo del cliente.
     * @param numeroCuenta Número identificativo de la cuenta.
     * @param tipoInteres Tipo de interés que se aplica a la cuenta.
     * @param saldo Cantidad de dinero disponible en euros en cuenta.
     * @param pin Número de identificación personal de la cuenta.
     */
    public Cuenta(String numeroCliente, String numeroCuenta, double tipoInteres, double saldo, int pin) {
        this.numeroCliente = numeroCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
        this.pin = pin;
    }

    //Getters. Los Getters nos devuelven los atributos de las instancias.
    /**
     *
     * @return Devuelve el número identificativo del cliente.
     */
    public String getNumeroCliente() {
        return this.numeroCliente;
    }

    /**
     *
     * @return Devuelve el número identificativo de la cuenta.
     */
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    /**
     *
     * @return Devuelve el tipo de interés.
     */
    public double getTipoInteres() {
        return this.tipoInteres;
    }

    /**
     *
     * @return Devuelve el saldo actual.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     *
     * @return Devuelve el número de identificación personal de la cuenta.
     */
    public int getPin() {
        return pin;
    }

    //Setters. Los Setters nos modifican los atributos de una instancia.
    /**
     *
     * @param numeroCliente Número identificativo del cliente.
     */
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    /**
     *
     * @param numeroCuenta Número identificativo de la cuenta.
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     *
     * @param tipoInteres Tipo de interés que se aplica a la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     *
     * @param saldo Cantidad de dineroen euros disponible en cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @param pin Número de identificación personal de la cuenta.
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    //Métodos públicos.
    /**
     * Instancia la clase Cuenta y define sus atributos.
     *
     * Este método pide al usuario la introducción de los datos correspondientes
     * a cada atributo de la clase.
     *
     * @return una instancia de la clase Cuenta personalizada.
     */
    public static Cuenta darDeAlta() {
        Scanner lector = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        System.out.println("Escribe el numero del cliente:");
        c1.setNumeroCliente(lector.nextLine());
        System.out.println("Escribe el numero de cuenta: ");
        c1.setNumeroCuenta(lector.nextLine());
        System.out.println("Escribe el tipo de interés: ");
        c1.setTipoInteres(lector.nextDouble());
        System.out.println("Introduce un saldo: ");
        c1.setSaldo(lector.nextDouble());
        System.out.println("Introduce un número pin");
        c1.setPin(lector.nextInt());
        return c1;
    }

    /**
     * Imprime los atributos por consola de una instancia de la clase Cuenta.
     *
     * @param c1 Instancia personalizada de la clase Cuenta.
     */
    public void mostrarDatos(Cuenta c1) {
        System.out.println("El número de la cuenta es " + c1.getNumeroCliente()
                + ".");
        System.out.println("El número de cliente es " + c1.getNumeroCliente()
                + ".");
        System.out.println("El tipo de interés es " + c1.getTipoInteres()
                + ".");
        System.out.println("El saldo actual es de " + c1.getSaldo() + "€.");
        System.out.println("El número pin es " + c1.getPin() + ".");
    }

    /**
     * Modifica positivamente el atributo saldo de una instancia de la clase
     * Cuenta.
     *
     * Este método pide al usuario que introduzca una cantidad positiva que será
     * sumada al saldo de la cuenta.
     *
     * @param c1 Instancia personalizada de la clase Cuenta.
     * @return True si se ha modificado el saldo, de lo contrario devuelve
     * False.
     */
    public boolean ingreso(Cuenta c1) {
        Scanner lector = new Scanner(System.in);
        boolean resultado;
        System.out.println("Indique la cantidad ingresada");
        double cantidadIngresada = lector.nextDouble();
        if (cantidadIngresada < 0) {
            System.out.println("La cantidad debe ser positiva");
            resultado = false;
        } else {
            c1.setSaldo(c1.getSaldo() + cantidadIngresada);
            System.out.println("Su saldo actual es de " + c1.getSaldo() + ".");
            resultado = true;
        }
        return resultado;
    }

    /**
     * Modifica negativamente el atributo saldo de una instancia de la clase
     * Cuenta.
     *
     * Este método pide al usuario que introduzca una cantidad mayor que 0 e
     * igual o inferior a la cantidad disponible en la cuenta.
     *
     * @param c1 Instancia personalizada de la clase Cuenta.
     * @return True si se ha modificado el saldo, de lo contrario devuelve
     * False.
     */
    public boolean reintegro(Cuenta c1) {
        Scanner lector = new Scanner(System.in);
        boolean resultado = false;
        System.out.println("El saldo disponible es de " + c1.getSaldo()
                + " ¿Qué cantidad desea retirar?");
        double cantidadRetirada = lector.nextDouble();
        if (cantidadRetirada > 0) {
            if (cantidadRetirada > c1.getSaldo()) {
                System.out.println("La cantidad es superior al saldo disponible"
                        + ", vuelva a intentarlo");
                resultado = false;
            } else {
                this.setSaldo(c1.getSaldo() - cantidadRetirada);
                System.out.println("Su saldo actual es de " + c1.getSaldo() + ".");
                resultado = true;
            }
        } else {
            System.out.println("La cantidad debe ser mayor que 0.");
        }
        return resultado;
    }

    /**
     * Transfiere una cantidad positiva igual o inferior al saldo disponible de
     * una cuenta a otra.
     *
     * @param cuentaDestino Número de la cuenta donde se ingresa el dinero.
     * @param importe Cantidad de dinero que se transfiere.
     */
    public void transferencia(Cuenta cuentaDestino, double importe) {
        this.setSaldo(this.getSaldo() - importe);
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + importe);
        System.out.println("El saldo actual de " + this.getNumeroCliente() + " es de "
                + this.getSaldo() + ".");
        System.out.println("El saldo actual de " + cuentaDestino.getNumeroCliente() + " es de "
                + cuentaDestino.getSaldo() + ".");
    }

    /**
     * Permite identificar la cuenta del cliente mediante la introducción de un
     * pin.
     *
     * @param listaCuentas ArrayList donde se guardan las instancias de Cuenta.
     * @param i Índice del ArrayList donde se encuentra la instancia de Cuenta
     * que queremos validar.
     * @return True si el pin es correcto, de lo contrario devuelve False.
     */
    public static boolean validarCuenta(ArrayList<Cuenta> listaCuentas, int i) {
        Scanner lector = new Scanner(System.in);
        boolean validado = false;
        int j = 3;
        while (j > 0) {
            System.out.println("Introduce el número pin. Te quedan " + j
                    + " intentos.");
            int intentoPin = lector.nextInt();
            if (listaCuentas.get(i).getPin() == intentoPin) {
                System.out.println("¡Bienvenido " + listaCuentas.get(i).getNumeroCliente()
                        + "!");
                validado = true;
                j = 0;
            } else {
                System.out.println("Pin Incorrecto.");
                j--;
            }
        }
        return validado;
    }

    /**
     * Busca la instancia de Cuenta que coincida con el número dado.
     *
     * @param listaCuentas ArrayList donde se guardan las instancias de Cuenta.
     * @param numeroCuenta Numero de cuenta que se busca en el ArrayList.
     * @return Índice del ArrayList donde se encuentra la instancia de Cuenta.
     */
    public static int buscarCuenta(ArrayList<Cuenta> listaCuentas, String numeroCuenta) {
        boolean encontrado = false;
        int index = -1;
        int i = 0;
        while (encontrado == false) {
            if (i == listaCuentas.size()) {
                System.out.println("No existe ninguna cuenta con ese número.");
                encontrado = true;
            } else {
                boolean comparar = listaCuentas.get(i).getNumeroCuenta().equals(numeroCuenta);
                if (comparar == true) {
                    encontrado = true;
                    index = i;
                } else {
                    i++;
                }
            }
        }
        return index;
    }
}
