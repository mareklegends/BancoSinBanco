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

        ArrayList vBancos = new ArrayList();
        vBancos.add("Caja Rural");
        vBancos.add("BBVA");
        vBancos.add("Santander");

        do {
            switch (Menu.mostrarMenu()) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("1. Abrir una nueva cuenta.");
                    System.out.println("--------------------");

                    String nombre = " ";
                    Scanner leer_nombre = new Scanner(System.in);
                    nombre = leer_nombre.nextLine();
                    String apellidos = "";
                    Scanner leer_apellidos = new Scanner(System.in);
                    apellidos = leer_apellidos.nextLine();
                    String fecha = "";
                    Scanner leer_fecha = new Scanner(System.in);
                    fecha = leer_fecha.nextLine();

                    Persona nuevap = new Persona(nombre, apellidos, fecha);

                    do {
                        switch (Menu.mostrarMenuTipoCuenta()) {
                            case 1:
                                System.out.println("--------------------");
                                System.out.println("1. Crear cuenta de ahorros.");
                                System.out.println("--------------------");
                                double dinerocuenta = 0.00;
                                Scanner leer_dinerocuenta = new Scanner(System.in);
                                dinerocuenta = leer_dinerocuenta.nextDouble();

                                String numerocuenta = "";
                                Scanner leer_numerocuenta = new Scanner(System.in);
                                numerocuenta = leer_numerocuenta.nextLine();

                                CuentaDeAhorro cda = new CuentaDeAhorro(0, nuevap, dinerocuenta, numerocuenta);

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

                                            double importecuenta = 3.20;

                                            double dinerocuenta2 = 0.00;
                                            Scanner leer_dinerocuenta2 = new Scanner(System.in);
                                            dinerocuenta2 = leer_dinerocuenta2.nextDouble();

                                            String numerocuenta2 = "";
                                            Scanner leer_numerocuenta2 = new Scanner(System.in);
                                            numerocuenta2 = leer_numerocuenta2.nextLine();

                                            CuentaCorrientePersonal ccp = new CuentaCorrientePersonal(importecuenta, vBancos, nuevap, dinerocuenta2, numerocuenta2);

                                            bandera = true;
                                            break;

                                        case 2:

                                            System.out.println("--------------------");
                                            System.out.println("2. Crear cuenta corriente >> EMPRESA");
                                            System.out.println("--------------------");

                                            double dinerocuenta3 = 0.00;
                                            Scanner leer_dinerocuenta3 = new Scanner(System.in);
                                            dinerocuenta3 = leer_dinerocuenta3.nextDouble();

                                            String numerocuenta3 = "";
                                            Scanner leer_numerocuenta3 = new Scanner(System.in);
                                            numerocuenta3 = leer_numerocuenta3.nextLine();

                                            CuentaCorrienteEmpresa cce = new CuentaCorrienteEmpresa(1, 2, vBancos, nuevap, dinerocuenta3, numerocuenta3);

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

                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 3:
                    System.out.println("--------------------");
                    System.out.println("3. Obtener los datos de una cuenta concreta.");
                    System.out.println("--------------------");

                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 4:
                    System.out.println("--------------------");
                    System.out.println("4. Realizar un ingreso en una cuenta.");
                    System.out.println("--------------------");

                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 5:
                    System.out.println("--------------------");
                    System.out.println("5. Retirar efectivo de una cuenta.");
                    System.out.println("--------------------");

                    System.out.println("--------------------");
                    bandera = true;

                    break;

                case 6:
                    System.out.println("--------------------");
                    System.out.println("6. Consultar el saldo actual de una cuenta.");
                    System.out.println("--------------------");

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
