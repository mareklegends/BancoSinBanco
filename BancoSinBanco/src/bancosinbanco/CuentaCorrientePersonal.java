
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    private double comisionmantenimiento;

    public CuentaCorrientePersonal(double comisionmantenimiento, ArrayList<String> listadeentidades, Hastable h, Persona titular, double saldo, String numerocuenta) {
        super(listadeentidades, h, titular, saldo, numerocuenta);
        this.comisionmantenimiento = comisionmantenimiento;
    }

    public double getComisionmantenimiento() {
        return comisionmantenimiento;
    }

    public void setComisionmantenimiento(double comisionmantenimiento) {
        this.comisionmantenimiento = comisionmantenimiento;
    }   
  


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
   

 

  
    
    
}
