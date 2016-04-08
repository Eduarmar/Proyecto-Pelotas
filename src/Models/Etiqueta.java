/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Etiqueta {
    
    private String nombre;
    private Color colornombre;
    private Textura forma;
    private int tamanoX;
    private int tamanoY;

    public Etiqueta(String nombre, int tamanoX, int tamanoY) {
        this.nombre = nombre;
        this.tamanoX = tamanoX;
        this.tamanoY = tamanoY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColornombre() {
        return colornombre;
    }

    public void setColornombre(Color colornombre) {
        this.colornombre = colornombre;
    }

    public Textura getForma() {
        return forma;
    }

    public void setForma(Textura forma) {
        this.forma = forma;
    }

    public int getTamanoX() {
        return tamanoX;
    }

    public void setTamanoX(int tamanoX) {
        this.tamanoX = tamanoX;
    }

    public int getTamanoY() {
        return tamanoY;
    }

    public void setTamanoY(int tamanoY) {
        this.tamanoY = tamanoY;
    }
    
    
    
    
}
