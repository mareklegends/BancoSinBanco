
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public abstract class CuentasBancarias implements Imprimible{
    
    /**
     *
     */
    protected Persona titular;

    /**
     *
     */
    protected double saldo;

    /**
     *
     */
    protected String numerocuenta;

    /**
     *
     * @param titular
     * @param saldo
     * @param numerocuenta
     */
    public CuentasBancarias(Persona titular, double saldo, String numerocuenta) {
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
        this.saldo = saldo;
        this.numerocuenta = numerocuenta;
    }

    /**
     *
     * @return
     */
    public Persona getTitular() {
        return new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
    }

    /**
     *
     * @param titular
     */
    public void setTitular(Persona titular) {
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
    }

    /**
     *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    public String getNumerocuenta() {
        return numerocuenta;
    }

    /**
     *
     * @param numerocuenta
     */
    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    /**
     *
     */
    @Override
    public void imprimir() {
        String datos="";
        datos+=" " +titular.getNombre() + " " + titular.getApellidos() + " " + titular.getFecha() + " " + saldo + "€ " + numerocuenta;
        System.out.println(datos);
    }

    
    

    
    
    
    
    
}
