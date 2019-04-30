
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

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public void imprimir() {
        String datos="";
        
        datos+=" " + nombre + " " + apellidos + " " + fecha +" ";
        
        System.out.println(datos);
    }
    
   
    
    
}
