
package bancosinbanco;

/**
 *
 * @author marcos
 * @version 1
 */
public class Hastable {
    private int num;
    private String h;

    /**
     * Constructor principal de hastable
     * @param num
     * @param h
     */
    public Hastable(int num, String h) {
        this.num = num;
        this.h = h;
    }

    /**
     * devuelve la variable num
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * rellena la variable num
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * devuelve la varibale h
     * @return
     */
    public String getH() {
        return h;
    }

    /**
     * rellena la varible h
     * @param h
     */
    public void setH(String h) {
        this.h = h;
    }
    
    
}
