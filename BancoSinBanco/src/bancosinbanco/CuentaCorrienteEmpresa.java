
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

    /**
     *
     * @param tipointeresdescuento
     * @param maxdescubiertopermitido
     * @param listadeentidades
     * @param h
     * @param titular
     * @param saldo
     * @param numerocuenta
     */
    public CuentaCorrienteEmpresa(int tipointeresdescuento, int maxdescubiertopermitido, ArrayList<String> listadeentidades, Hastable h, Persona titular, double saldo, String numerocuenta) {
        super(listadeentidades, h, titular, saldo, numerocuenta);
        this.tipointeresdescuento = tipointeresdescuento;
        this.maxdescubiertopermitido = maxdescubiertopermitido;
    }

    /**
     *
     * @return
     */
    public int getTipointeresdescuento() {
        return tipointeresdescuento;
    }

    /**
     *
     * @param tipointeresdescuento
     */
    public void setTipointeresdescuento(int tipointeresdescuento) {
        this.tipointeresdescuento = tipointeresdescuento;
    }

    /**
     *
     * @return
     */
    public int getMaxdescubiertopermitido() {
        return maxdescubiertopermitido;
    }

    /**
     *
     * @param maxdescubiertopermitido
     */
    public void setMaxdescubiertopermitido(int maxdescubiertopermitido) {
        this.maxdescubiertopermitido = maxdescubiertopermitido;
    }

   
 

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
