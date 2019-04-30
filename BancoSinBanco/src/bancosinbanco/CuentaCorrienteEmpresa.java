
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

    public CuentaCorrienteEmpresa() {
    }

    public CuentaCorrienteEmpresa(int tipointeresdescuento, int maxdescubiertopermitido, ArrayList listadeentidades, Persona titular, float saldo, String numerocuenta) {
        super(listadeentidades, titular, saldo, numerocuenta);
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
    
    
}
