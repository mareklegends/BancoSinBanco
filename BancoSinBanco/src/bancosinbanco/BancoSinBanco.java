package bancosinbanco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marcos
 * @version 1
 */
public class BancoSinBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera = true;

        boolean bandera2 = true;
        boolean bandera3 = true;

        String buscarncuenta = "";
        Scanner leer_buscarncuenta = new Scanner(System.in);
        double saldo_cuenta_total = 0;
        Scanner dineronuevo = new Scanner(System.in);

        Hastable h = new Hastable(1, "nombre hastables");

        ArrayList<CuentasBancarias> vCuentas = new ArrayList<>();
        ArrayList<String> vBancos = new ArrayList();
        vBancos.add("Caja Rural");
        vBancos.add("BBVA");
        vBancos.add("Santander");

        Persona nuevap = null;

        do {
            switch (Menu.mostrarMenu()) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("1. Abrir una nueva cuenta.");
                    System.out.println("--------------------");
                    try {
                        System.out.println("Dime tu nmbre");
                        String nombre = " ";
                        Scanner leer_nombre = new Scanner(System.in);
                        nombre = leer_nombre.nextLine();
                        System.out.println("Dime tus apellidos");
                        String apellidos = "";

                        Scanner leer_apellidos = new Scanner(System.in);
                        apellidos = leer_apellidos.nextLine();
                        System.out.println("Dime tu fecha de nacimiento");
                        String fecha = "";
                        Scanner leer_fecha = new Scanner(System.in);
                        fecha = leer_fecha.nextLine();
                        nuevap = new Persona(nombre, apellidos, fecha);
                    } catch (Exception e) {
                        System.out.println("Error al introducir los datos");
                    }

                    do {
                        switch (Menu.mostrarMenuTipoCuenta()) {
                            case 1:
                                System.out.println("--------------------");
                                System.out.println("1. Crear cuenta de ahorros.");
                                System.out.println("--------------------");
                                CuentaDeAhorro cda = null;
                                try {
                                    System.out.println("Dime cuanto dinero quieres tener en la cuenta");
                                    double dinerocuenta = 0.00;
                                    Scanner leer_dinerocuenta = new Scanner(System.in);
                                    dinerocuenta = leer_dinerocuenta.nextDouble();
                                    System.out.println("Dime tu nuemro de cuenta");
                                    String numerocuenta = "";
                                    Scanner leer_numerocuenta = new Scanner(System.in);
                                    numerocuenta = leer_numerocuenta.nextLine();

                                    cda = new CuentaDeAhorro(0, nuevap, dinerocuenta, numerocuenta);
                                    vCuentas.add(cda);
                                } catch (Exception e) {
                                    System.out.println("Error al introducir los datos");
                                }
                                bandera = true;
                                break;
                            case 2:

                                System.out.println("--------------------");
                                System.out.println("2. Crear cuenta corriente.");
                                System.out.println("--------------------");

                                do {
                                    switch (Menu.mostrarMenuTipoCuentaCorriente()) {

                                        case 1:

                                            System.out.println("--------------------");
                                            System.out.println("1. Crear cuenta corriente >> PERSONAL.");
                                            System.out.println("--------------------");
                                            try {
                                                double importecuenta = 3.20;
                                                System.out.println("Dime cuanto dinero quieres tener en la cuenta");
                                                double dinerocuenta2 = 0.00;
                                                Scanner leer_dinerocuenta2 = new Scanner(System.in);
                                                dinerocuenta2 = leer_dinerocuenta2.nextDouble();
                                                System.out.println("Dime tu nuemro de cuenta");
                                                String numerocuenta2 = "";
                                                Scanner leer_numerocuenta2 = new Scanner(System.in);
                                                numerocuenta2 = leer_numerocuenta2.nextLine();
                                                CuentaCorrientePersonal ccp = new CuentaCorrientePersonal(importecuenta, vBancos, h, nuevap, dinerocuenta2, numerocuenta2);

                                            } catch (Exception e) {
                                                System.out.println("Error al introducir los datos");
                                            }

                                            bandera = true;
                                            break;

                                        case 2:

                                            System.out.println("--------------------");
                                            System.out.println("2. Crear cuenta corriente >> EMPRESA");
                                            System.out.println("--------------------");
                                            try {
                                                System.out.println("Dime cuanto dinero quieres tener en la cuenta");
                                                double dinerocuenta3 = 0.00;
                                                Scanner leer_dinerocuenta3 = new Scanner(System.in);
                                                dinerocuenta3 = leer_dinerocuenta3.nextDouble();
                                                System.out.println("Dime tu nuemro de cuenta");
                                                String numerocuenta3 = "";
                                                Scanner leer_numerocuenta3 = new Scanner(System.in);
                                                numerocuenta3 = leer_numerocuenta3.nextLine();

                                                CuentaCorrienteEmpresa cce = new CuentaCorrienteEmpresa(1, 2, vBancos, h, nuevap, dinerocuenta3, numerocuenta3);

                                            } catch (Exception e) {
                                                System.out.println("Error al introducir los datos");
                                            }

                                            bandera = true;
                                            break;
                                        case 3:
                                            System.out.println("--------------------");
                                            System.out.println("3. Atras.");
                                            System.out.println("--------------------");
                                            System.out.println(">> Atras");
                                            bandera = false;

                                            break;

                                        default:
                                            bandera = false;

                                            break;
                                    }
                                } while (bandera3 != false);

                                bandera = true;
                                break;
                            case 3:
                                System.out.println("--------------------");
                                System.out.println("3. Atras.");
                                System.out.println("--------------------");
                                System.out.println(">> Atras");
                                bandera = false;

                                break;

                            default:
                                bandera = false;

                                break;

                        }
                    } while (bandera2 != false);

                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 2:
                    System.out.println("--------------------");
                    System.out.println("2. Ver un listado de las cuentas disponibles.");
                    System.out.println("--------------------");

                    for (int i = 0; i < vCuentas.size(); i++) {
                        if (vCuentas.get(i) != null) {
                            vCuentas.get(i).imprimir();
                        }
                    }

                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 3:
                    System.out.println("--------------------");
                    System.out.println("3. Obtener los datos de una cuenta concreta.");
                    System.out.println("--------------------");

                    System.out.println("Dime tu numero de curenta");
                    try {
                        buscarncuenta = leer_buscarncuenta.nextLine();

                        for (int i = 0; i < vCuentas.size(); i++) {
                            if (vCuentas.get(i) != null) {
                                if (vCuentas.get(i).getNumerocuenta().equalsIgnoreCase(buscarncuenta)) {
                                    vCuentas.get(i).imprimir();
                                    break;
                                }
                            }

                        }
                    } catch (Exception e) {
                        System.out.println("Error al introducir los datos");
                    }
                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 4:
                    System.out.println("--------------------");
                    System.out.println("4. Realizar un ingreso en una cuenta.");
                    System.out.println("--------------------");
                    System.out.println("Dime tu numero de cuento");
                    buscarncuenta = leer_buscarncuenta.nextLine();
                    System.out.println("Dime cuanto dinero queieres sacar");
                    try {
                        double saldo_cuenta = dineronuevo.nextDouble();

                        for (int i = 0; i < vCuentas.size(); i++) {
                            if (vCuentas.get(i) != null) {
                                if (vCuentas.get(i).getNumerocuenta().equalsIgnoreCase(buscarncuenta)) {
                                    saldo_cuenta_total = vCuentas.get(i).getSaldo();
                                    vCuentas.get(i).setSaldo(saldo_cuenta_total + saldo_cuenta);
                                    break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error al introducir los datos");
                    }
                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 5:
                    System.out.println("--------------------");
                    System.out.println("5. Retirar efectivo de una cuenta.");
                    System.out.println("--------------------");
                    try {
                        System.out.println("Dime tu numero de cuento");
                        buscarncuenta = leer_buscarncuenta.nextLine();
                        System.out.println("Dime cuanto dinero queieres sacar");
                        double saldo_cuenta2 = dineronuevo.nextDouble();

                        for (int i = 0; i < vCuentas.size(); i++) {
                            if (vCuentas.get(i) != null) {
                                if (vCuentas.get(i).getNumerocuenta().equalsIgnoreCase(buscarncuenta)) {
                                    saldo_cuenta_total = vCuentas.get(i).getSaldo();
                                    vCuentas.get(i).setSaldo(saldo_cuenta_total - saldo_cuenta2);
                                    break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error al introducir los datos");
                    }
                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 6:
                    System.out.println("--------------------");
                    System.out.println("6. Consultar el saldo actual de una cuenta.");
                    System.out.println("--------------------");

                    System.out.println("Dime tu numero de cuenta");
                    buscarncuenta = leer_buscarncuenta.nextLine();

                    for (int i = 0; i < vCuentas.size(); i++) {
                        if (vCuentas.get(i) != null) {
                            if (vCuentas.get(i).getNumerocuenta().equalsIgnoreCase(buscarncuenta)) {
                                System.out.println(vCuentas.get(i).getSaldo());

                                break;
                            }
                        }
                    }
                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 7:
                    System.out.println("--------------------");
                    System.out.println("7. Salir de la aplicación.");
                    System.out.println("--------------------");
                    System.out.println(">> Saliendo de la aplicación...");
                    bandera = false;

                    break;

                default:
                    bandera = false;

                    break;

            }
        } while (bandera != false);

    }

}
