
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    private double comisionmantenimiento;
    
    public CuentaCorrientePersonal() {
    }

    public CuentaCorrientePersonal(double comisionmantenimiento, ArrayList listadeentidades, Persona titular, double saldo, String numerocuenta) {
        super(listadeentidades, titular, saldo, numerocuenta);
        this.comisionmantenimiento = comisionmantenimiento;
    }

    public double getComisionmantenimiento() {
        return comisionmantenimiento;
    }

    public void setComisionmantenimiento(double comisionmantenimiento) {
        this.comisionmantenimiento = comisionmantenimiento;
    }
    
   

 

  
    
    
}
