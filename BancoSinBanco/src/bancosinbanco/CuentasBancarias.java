
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public abstract class CuentasBancarias implements Imprimible{
    
    /**
     * variblae objeto de persona - titular
     */
    protected Persona titular;

    /**
     * variable saldo
     */
    protected double saldo;

    /**
     * variable numerocuenta
     */
    protected String numerocuenta;

    /**
     * Constructor principal de cuentasbancarias
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
     * Devuelve el objeto de persona variable titular
     * @return
     */
    public Persona getTitular() {
        return new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
    }

    /**
     * Rellena el objeto de persona variable titular
     * @param titular
     */
    public void setTitular(Persona titular) {
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
    }

    /**
     * Devuelve la variable saldo
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Rellena la variable saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve la variable numero de cuenta
     * @return
     */
    public String getNumerocuenta() {
        return numerocuenta;
    }

    /**
     * Rellena la variable numero de cuenta
     * @param numerocuenta
     */
    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    /**
     * Función para mostrar los de datos de la clase cuentascancarias
     */
    @Override
    public void imprimir() {
        String datos="";
        datos+=" " +titular.getNombre() + " " + titular.getApellidos() + " " + titular.getFecha() + " " + saldo + "€ " + numerocuenta;
        System.out.println(datos);
    }

    
    

    
    
    
    
    
}
