
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public final class CuentaDeAhorro extends CuentasBancarias{
    private int tipodeinteres;
 
    /**
     *
     * @param tipodeinteres
     * @param titular
     * @param saldo
     * @param numerocuenta
     */
    public CuentaDeAhorro(int tipodeinteres, Persona titular, double saldo, String numerocuenta) {
        super(titular, saldo, numerocuenta);
        this.tipodeinteres = tipodeinteres;
    }

    /**
     *
     * @return
     */
    public int getTipodeinteres() {
        return tipodeinteres;
    }

    /**
     *
     * @param tipodeinteres
     */
    public void setTipodeinteres(int tipodeinteres) {
        this.tipodeinteres = tipodeinteres;
    }
    
    
    
}
