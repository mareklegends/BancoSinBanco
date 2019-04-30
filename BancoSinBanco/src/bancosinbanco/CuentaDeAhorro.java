
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public abstract class CuentaDeAhorro extends CuentasBancarias{
    private int tipodeinteres;
 
    public CuentaDeAhorro() {
    }

    public CuentaDeAhorro(int tipodeinteres) {
        this.tipodeinteres = tipodeinteres;
    }

    public CuentaDeAhorro(int tipodeinteres, Persona titular, float saldo, String numerocuenta) {
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
