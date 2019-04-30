
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public abstract class CuentaCorriente extends CuentasBancarias{
    protected ArrayList listadeentidades;

    public CuentaCorriente() {
    }

    public CuentaCorriente(ArrayList listadeentidades) {
        this.listadeentidades = listadeentidades;
    }

    public CuentaCorriente(ArrayList listadeentidades, Persona titular, double saldo, String numerocuenta) {
        super(titular, saldo, numerocuenta);
        this.listadeentidades = listadeentidades;
    }

    public ArrayList getListadeentidades() {
        return listadeentidades;
    }

    public void setListadeentidades(ArrayList listadeentidades) {
        this.listadeentidades = listadeentidades;
    }
  
    
    
}
