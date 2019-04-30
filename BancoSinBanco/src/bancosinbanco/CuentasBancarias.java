
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public class CuentasBancarias {
    
    private Persona titular;
    private float saldo;
    private String numerocuenta;

    public CuentasBancarias() {
    }
    
    

    public CuentasBancarias(Persona titular, float saldo, String numerocuenta) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    
    

    
    
    
    
    
}
