
package bancosinbanco;

import java.util.Scanner;

/**
 *
 * @author marcos
 * @version 1- final
 */
public class Menu {

    /**
     * funcion para mostrar el menu 1
     * @return
     */
    public static int mostrarMenu(){
        
        int opcion=10;
        
        Scanner leermenu = new Scanner(System.in);
        
         System.out.println("--------Menu--------");
         System.out.println("1. Abrir una nueva cuenta.");
         System.out.println("2. Ver un listado de las cuentas disponibles.");
         System.out.println("3. Obtener los datos de una cuenta concreta.");
         System.out.println("4. Realizar un ingreso en una cuenta.");
         System.out.println("5. Retirar efectivo de una cuenta.");
         System.out.println("6. Consultar el saldo actual de una cuenta.");
         System.out.println("7. Salir de la aplicación.");         
         System.out.println("--------------------");
         do{
           try{
            opcion = leermenu.nextInt();
        }catch(Exception fallo){
            System.out.println("Fallo al leer la opción");
        }
          
          
          }while(opcion <1 || opcion >8);
         
        return opcion;
       
    }
     
    /**
     * funcion para mostrar el menu 2
     * @return
     */
    public static int mostrarMenuTipoCuenta(){
        
        int opcion2=10;
        
        Scanner leermenutipocuenta = new Scanner(System.in);
        
         System.out.println("--------Menu--------");
         System.out.println("1. Crear cuenta de ahorros.");
         System.out.println("2. Crear cuenta corriente.");
         System.out.println("3. Salir.");         
         System.out.println("--------------------");
         do{
           try{
            opcion2 = leermenutipocuenta.nextInt();
        }catch(Exception fallo){
            System.out.println("Fallo al leer la opción");
        }
          
          
          }while(opcion2 <1 || opcion2 >4);
         
        return opcion2;
       
    }
      
    /**
     * funcion para mostrar el menu 3
     * @return
     */
    public static int mostrarMenuTipoCuentaCorriente(){
        
        int opcion3=10;
        
        Scanner leermenutipocuentacorriente = new Scanner(System.in);
        
         System.out.println("--------Menu--------");
         System.out.println("1. Crear cuenta corriente >> PERSONAL.");
         System.out.println("2. Crear cuenta corriente >> EMPRESA");
         System.out.println("3. Salir.");         
         System.out.println("--------------------");
         do{
           try{
            opcion3 = leermenutipocuentacorriente.nextInt();
        }catch(Exception fallo){
            System.out.println("Fallo al leer la opción");
        }
          
          
          }while(opcion3 <1 || opcion3 >4);
         
        return opcion3;
       
    }
}
