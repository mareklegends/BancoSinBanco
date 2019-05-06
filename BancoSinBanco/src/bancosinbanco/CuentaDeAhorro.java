
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public final class CuentaDeAhorro extends CuentasBancarias{
    private int tipodeinteres;
 
    /**
     * Constructor principal de cuenta de ahorro
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
     * Devuelve el valor tipo de interes
     * @return
     */
    public int getTipodeinteres() {
        return tipodeinteres;
    }

    /**
     * Rellena el tipo de interes
     * @param tipodeinteres
     */
    public void setTipodeinteres(int tipodeinteres) {
        this.tipodeinteres = tipodeinteres;
    }
    
    
    
}
