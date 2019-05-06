
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
     * Constructor principal de persona
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
     * devuelve la variable nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * rellena la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve la variable apellidos
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * rellena la variable apellidos
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * deveuleve la variable fecha
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * rellena la variable fecha
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Función para mostrar los de datos de la clase persona
     */
    @Override
    public void imprimir() {
        String datos="";
        
        datos+=" " + nombre + " " + apellidos + " " + fecha +" ";
        
        System.out.println(datos);
    }
    
   
    
    
}
