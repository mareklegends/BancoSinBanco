
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public class Persona implements Imprimible{
    
    private String nombre;
    private String apellidos;
    private String fecha;

    /**
     *
     */
    public Persona() {
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @param fecha
     */
    public Persona(String nombre, String apellidos, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     */
    @Override
    public void imprimir() {
        String datos="";
        
        datos+=" " + nombre + " " + apellidos + " " + fecha +" ";
        
        System.out.println(datos);
    }
    
   
    
    
}
