
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente{
    private int tipointeresdescuento;
    private int maxdescubiertopermitido;

    public CuentaCorrienteEmpresa(int tipointeresdescuento, int maxdescubiertopermitido, ArrayList<String> listadeentidades, Hastable h, Persona titular, double saldo, String numerocuenta) {
        super(listadeentidades, h, titular, saldo, numerocuenta);
        this.tipointeresdescuento = tipointeresdescuento;
        this.maxdescubiertopermitido = maxdescubiertopermitido;
    }

    public int getTipointeresdescuento() {
        return tipointeresdescuento;
    }

    public void setTipointeresdescuento(int tipointeresdescuento) {
        this.tipointeresdescuento = tipointeresdescuento;
    }

    public int getMaxdescubiertopermitido() {
        return maxdescubiertopermitido;
    }

    public void setMaxdescubiertopermitido(int maxdescubiertopermitido) {
        this.maxdescubiertopermitido = maxdescubiertopermitido;
    }

   
 

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
