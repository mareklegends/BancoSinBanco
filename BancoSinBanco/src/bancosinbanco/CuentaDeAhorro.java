
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public final class CuentaDeAhorro extends CuentasBancarias{
    private int tipodeinteres;
 

    public CuentaDeAhorro(int tipodeinteres, Persona titular, double saldo, String numerocuenta) {
        super(titular, saldo, numerocuenta);
        this.tipodeinteres = tipodeinteres;
    }

    public int getTipodeinteres() {
        return tipodeinteres;
    }

    public void setTipodeinteres(int tipodeinteres) {
        this.tipodeinteres = tipodeinteres;
    }
    
    
    
}
