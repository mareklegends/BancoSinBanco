/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
     *
     * @param num
     * @param h
     */
    public Hastable(int num, String h) {
        this.num = num;
        this.h = h;
    }

    /**
     *
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     *
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     *
     * @return
     */
    public String getH() {
        return h;
    }

    /**
     *
     * @param h
     */
    public void setH(String h) {
        this.h = h;
    }
    
    
}
