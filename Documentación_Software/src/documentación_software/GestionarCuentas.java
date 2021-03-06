/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentación_software;

import java.util.*;

/**
 * Clase GestionarCuentas. En esta clase se define el menú principal a partir
 * del cual se gestionarán las instancias de la clase Cuenta.
 *
 * @author Jose
 */
public class GestionarCuentas {

    /**
     * Busca la instancia de Cuenta que coincida con el número dado y valida con
     * pin.
     *
     * @param listaCuentas ArrayList donde se guardan las instancias de Cuenta.
     * @return Índice del ArrayList donde se encuentra la instancia de Cuenta.
     */
    public static int iniciarSesion(ArrayList<Cuenta> listaCuentas) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número de cuenta.");
        String numeroCuenta = lector.next();
        boolean encontrado = false;
        int index = -1;
        boolean validado = false;
        int i = 0;
        while (encontrado == false) {
            if (i == listaCuentas.size()) {
                System.out.println("No existe ninguna cuenta con ese número.");
                encontrado = true;
            } else {
                boolean comparar = listaCuentas.get(i).getNumeroCuenta().equals(numeroCuenta);
                if (comparar == true) {
                    validado = Cuenta.validarCuenta(listaCuentas, i);
                    if (validado) {
                        encontrado = true;
                        index = i;
                    } else {
                        encontrado = true;
                        index = -1;
                    }

                } else {
                    i++;
                }
            }
        }
        return index;
    }

    /**
     * Este método principal ofrece al usuario las opciones funcionales de este
     * programa mediante dos menues.
     *
     * @param args Sin argumentos.
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Cuenta> listaCuentas = new ArrayList();

        //Menú Principal.
        boolean interruptor = true;
        while (interruptor == true) {
            System.out.println("Bienvenido \n Elige una opción");
            System.out.println("1. Iniciar sesión.");
            System.out.println("2. Alta de cuenta.");
            System.out.println("3. Salir");
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:

                    //Submenú una vez iniciada la sesión.
                    int index = iniciarSesion(listaCuentas);
                    if (index > -1) {
                        System.out.println("Elige una opción");
                        System.out.println("1. Tranferir saldo a otra cuenta.");
                        System.out.println("2. Ingresar dinero.");
                        System.out.println("3. Realizar reintegro.");
                        System.out.println("4. Mostrar datos.");
                        int opcion2 = lector.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Indroduzca el número de la cuenta destino");
                                String numeroCuenta = lector.next();
                                int cuentaDestino = Cuenta.buscarCuenta(listaCuentas, numeroCuenta);
                                System.out.println("Introduzca un importe");
                                double importe = lector.nextDouble();
                                listaCuentas.get(index).transferencia(listaCuentas.get(cuentaDestino), importe);
                                break;
                            case 2:
                                listaCuentas.get(index).ingreso(listaCuentas.get(index));
                                break;
                            case 3:
                                listaCuentas.get(index).reintegro(listaCuentas.get(index));
                                break;
                            case 4:
                                listaCuentas.get(index).mostrarDatos(listaCuentas.get(index));
                                break;
                            default:
                                System.out.println("Opción Incorrecta. Vuelve a intentarlo.");
                                interruptor = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    listaCuentas.add(Cuenta.darDeAlta());
                    break;
                case 3:
                    interruptor = false;
                    break;
                default:
                    System.out.println("Opción Incorrecta. Vuelve a intentarlo.");
                    break;
            }
        }
    }

}
