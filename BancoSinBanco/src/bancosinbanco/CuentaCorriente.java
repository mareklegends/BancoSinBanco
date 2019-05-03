
package bancosinbanco;

import java.util.ArrayList;

/**
 *
 * @author marcos
 * @version 1
 */
public abstract class CuentaCorriente extends CuentasBancarias{
    protected ArrayList<String> listadeentidades;

    protected Hastable h;

    public CuentaCorriente(ArrayList<String> listadeentidades, Hastable h, Persona titular, double saldo, String numerocuenta) {
        super(titular, saldo, numerocuenta);
         this.listadeentidades = new ArrayList();
        for (int i = 0; i < listadeentidades.size(); i++) {
            this.listadeentidades.add(listadeentidades.get(i).toString());
        }
        this.h = new Hastable(h.getNum(), h.getH());
       
    }

    public ArrayList<String> getListadeentidades() {
        
         this.listadeentidades = new ArrayList();
        for (int i = 0; i < listadeentidades.size(); i++) {
            this.listadeentidades.add(listadeentidades.get(i).toString());
        }
           
        return this.listadeentidades;
    }

    public void setListadeentidades(ArrayList<String> listadeentidades) {
        this.listadeentidades = new ArrayList();
        for (int i = 0; i < listadeentidades.size(); i++) {
            this.listadeentidades.add(listadeentidades.get(i).toString());
        }
    }
    public Hastable getH() {
        return new Hastable(h.getNum(), h.getH());
    }

    public void setH(Hastable h) {
        this.h = new Hastable(h.getNum(), h.getH());
    }
   
    
   

    
    
}
