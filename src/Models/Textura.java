/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author AliRafael
 */
public class Textura {
    
    private final String superficie;
    private Color ctextura;
    private int corrugado;

    public Textura(String superficie) {
        this.superficie = superficie;
    }

    public String getSuperficie() {
        return superficie;
    }
   
    public Color getCtextura() {
        return ctextura;
    }

    public void setCtextura(Color ctextura) {
        this.ctextura = ctextura;
    }

    public int getCorrugado() {
        return corrugado;
    }

    public void setCorrugado(int corrugado) {
        this.corrugado = corrugado;
    }
    
}
