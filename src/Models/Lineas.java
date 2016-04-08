/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;



public class Lineas {
    
    private final String tipolinea;
    private final int n;
    private final float [] puntoscortesX;
    private final float [] puntoscortesY;

    public Lineas(String tipolinea, int n, float[] puntoscortesX, float[] puntoscortesY) {
        this.tipolinea = tipolinea;
        this.n = n;
        this.puntoscortesX = puntoscortesX;
        this.puntoscortesY = puntoscortesY;
    }

    public String getTipolinea() {
        return tipolinea;
    }

    public int getN() {
        return n;
    }

    public float[] getPuntoscortesX() {
        return puntoscortesX;
    }

    public float[] getPuntoscortesY() {
        return puntoscortesY;
    }


    
}
