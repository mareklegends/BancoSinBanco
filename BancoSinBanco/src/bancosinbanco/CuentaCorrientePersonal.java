
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    private float comisionmantenimiento;
    
    public CuentaCorrientePersonal() {
    }

    public CuentaCorrientePersonal(float comisionmantenimiento, ArrayList listadeentidades, Persona titular, float saldo, String numerocuenta) {
        super(listadeentidades, titular, saldo, numerocuenta);
        this.comisionmantenimiento = comisionmantenimiento;
    }
    
   

    public float getComisionmantenimiento() {
        return comisionmantenimiento;
    }

    public void setComisionmantenimiento(float comisionmantenimiento) {
        this.comisionmantenimiento = comisionmantenimiento;
    }

  
    
    
}
