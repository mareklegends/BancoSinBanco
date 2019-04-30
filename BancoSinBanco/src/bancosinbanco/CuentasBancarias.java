
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public abstract class CuentasBancarias implements Imprimible{
    
    protected Persona titular;
    protected double saldo;
    protected String numerocuenta;

    public CuentasBancarias() {
    }
    
    

    public CuentasBancarias(Persona titular, double saldo, String numerocuenta) {
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
        this.saldo = saldo;
        this.numerocuenta = numerocuenta;
    }

    public Persona getTitular() {
        return new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
    }

    public void setTitular(Persona titular) {
        this.titular = new Persona(titular.getNombre(), titular.getApellidos(), titular.getFecha());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    @Override
    public void imprimir() {
        String datos="";
        datos+=" " +titular.getNombre() + " " + titular.getApellidos() + " " + titular.getFecha() + " " + saldo + "€ " + numerocuenta;
        System.out.println(datos);
    }

    
    

    
    
    
    
    
}
