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
    
    private int paneles;
    private float anchopanel;
    private float largopanel;
    private int puntos;
    private Material mhilo;
    private Material mpanel;
    private Textura tpanel;

    public Costura() {
    }
    
    public Costura(int paneles, float anchopanel, float largopanel, int puntos) {
        this.paneles = paneles;
        this.anchopanel = anchopanel;
        this.largopanel = largopanel;
        this.puntos = puntos;
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

    public Material getMhilo() {
        return mhilo;
    }

    public void setMhilo(Material mhilo) {
        this.mhilo = mhilo;
    }

    public Material getMpanel() {
        return mpanel;
    }

    public void setMpanel(Material mpanel) {
        this.mpanel = mpanel;
    }

    public Textura getTpanel() {
        return tpanel;
    }

    public void setTpanel(Textura tpanel) {
        this.tpanel = tpanel;
    }
    
    
    
    
    
}
