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
public class Costura {
    
    private String nombre;
    private int paneles;
    private float anchopanel;
    private float largopanel;
    private int puntos;
    private Cubierta cpanel;

    public Costura() {
    }

    public Costura(String nombre, int paneles, float anchopanel, float largopanel, int puntos, Cubierta cpanel) {
        this.nombre = nombre;
        this.paneles = paneles;
        this.anchopanel = anchopanel;
        this.largopanel = largopanel;
        this.puntos = puntos;
        this.cpanel = cpanel;
    }

    public Cubierta getCpanel() {
        return cpanel;
    }
    
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPaneles() {
        return paneles;
    }

    public void setPaneles(int paneles) {
        this.paneles = paneles;
    }

    public float getAnchopanel() {
        return anchopanel;
    }

    public void setAnchopanel(float anchopanel) {
        this.anchopanel = anchopanel;
    }

    public float getLargopanel() {
        return largopanel;
    }

    public void setLargopanel(float largopanel) {
        this.largopanel = largopanel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
    
}
