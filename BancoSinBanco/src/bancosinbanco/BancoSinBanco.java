
package bancosinbanco;

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
        boolean bandera=true;
        do{
            switch(Menu.mostrarMenu()){
                case 1: 
                System.out.println("--------------------"); 
                System.out.println("1. Abrir una nueva cuenta.");
                System.out.println("--------------------");
                
                String nombre=" ";
                Scanner leer_nombre = new Scanner(System.in);
                nombre = leer_nombre.nextLine();
                String apellidos="";
                Scanner leer_apellidos = new Scanner(System.in);
                apellidos = leer_apellidos.nextLine();
                String fecha="";
                Scanner leer_fecha = new Scanner(System.in);
                fecha = leer_fecha.nextLine();
                
                Persona nuevap = new Persona(nombre, apellidos, fecha);
                
                
                
                System.out.println("--------------------"); 
                bandera=true;
                
                    break;
                    
                case 2: 
                System.out.println("--------------------"); 
                System.out.println("2. Ver un listado de las cuentas disponibles.");
                System.out.println("--------------------"); 
                
                System.out.println("--------------------"); 
                bandera=true;
                
                    break;
                
                case 3: 
                System.out.println("--------------------"); 
                System.out.println("3. Obtener los datos de una cuenta concreta.");
                System.out.println("--------------------"); 
                
                System.out.println("--------------------"); 
                bandera=true;
                
                   break;
                
                case 4: 
                System.out.println("--------------------"); 
                System.out.println("4. Realizar un ingreso en una cuenta.");
                System.out.println("--------------------"); 
               
                System.out.println("--------------------"); 
                bandera=true;
                
                    break;
                    
                case 5: 
                System.out.println("--------------------"); 
                System.out.println("5. Retirar efectivo de una cuenta.");
                System.out.println("--------------------");
                
                System.out.println("--------------------"); 
                bandera=true;
                    
                    break;
                    
                case 6: 
                System.out.println("--------------------"); 
                System.out.println("6. Consultar el saldo actual de una cuenta.");
                System.out.println("--------------------");
                
                System.out.println("--------------------"); 
                bandera=true;

                    break;
                    
                case 7: 
                System.out.println("--------------------"); 
                System.out.println("7. Salir de la aplicación.");         
                System.out.println("--------------------");
                System.out.println(">> Saliendo de la aplicación...");
                bandera=false;
                
                    break;
                    
                default:
                bandera=false;
                
                    break;
            
            }
        }while(bandera!=false);
        
       
        
        
    
    }
    
}
