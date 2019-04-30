
package bancosinbanco;

import java.util.Scanner;

/**
 *
 * @author marcos
 * @version 1- final
 */
public class Menu {
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
}
