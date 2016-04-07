/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.util.Arrays;

/**
 *
 * @author AliRafael
 */
public class Lineas {
    
    private String tipolinea;
    private final float valorx;
    private final float valory;
    private final int n;
    private float [] puntoscortesX;
    private float [] puntoscortesY;

    public Lineas(String tipolinea, float valorx, float valory, int n) {
        this.tipolinea = tipolinea;
        this.valorx = valorx;
        this.valory = valory;
        this.n = n;
        
        this.puntoscortesX= new float[n];
        this.puntoscortesY= new float[n];
        
        Arrays.fill(this.puntoscortesX, 0);
        Arrays.fill(this.puntoscortesY, 0);
    }

    public String getTipolinea() {
        return tipolinea;
    }

    public void setTipolinea(String tipolinea) {
        this.tipolinea = tipolinea;
    }

    public float getValorx() {
        return valorx;
    }

    public float getValory() {
        return valory;
    }

    public void setPuntoscortesX(float[] puntoscortesX) {
        this.puntoscortesX = puntoscortesX;
    }

    public void setPuntoscortesY(float[] puntoscortesY) {
        this.puntoscortesY = puntoscortesY;
    }

}
