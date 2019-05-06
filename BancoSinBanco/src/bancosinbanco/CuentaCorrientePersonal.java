
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    private double comisionmantenimiento;

    /**
     * Constructor principal de CuentaCorrientePersonal
     * @param comisionmantenimiento
     * @param listadeentidades
     * @param h
     * @param titular
     * @param saldo
     * @param numerocuenta
     */
    public CuentaCorrientePersonal(double comisionmantenimiento, ArrayList<String> listadeentidades, Hastable h, Persona titular, double saldo, String numerocuenta) {
        super(listadeentidades, h, titular, saldo, numerocuenta);
        this.comisionmantenimiento = comisionmantenimiento;
    }

    /**
     * Devuelve la varaible comision de mantenimiento
     * @return
     */
    public double getComisionmantenimiento() {
        return comisionmantenimiento;
    }

    /**
     * Añade valores a la variable comision de mantenimiento
     * @param comisionmantenimiento
     */
    public void setComisionmantenimiento(double comisionmantenimiento) {
        this.comisionmantenimiento = comisionmantenimiento;
    }   
  

/* Devuelve los datos de la clase cuenta corriente personal */
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
   

 

  
    
    
}
