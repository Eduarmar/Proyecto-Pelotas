/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

public class Medida {
    
    private float cm;
    private Forma aspecto;

    public Medida(float cm, Forma aspecto) {
        this.cm = cm;
        this.aspecto = aspecto;
    }

    
    public float getCm() {
        return cm;
    }

    public void setCm(float cm) {
        this.cm = cm;
    }

    public Forma getAspecto() {
        return aspecto;
    }

    public void setAspecto(Forma aspecto) {
        this.aspecto = aspecto;
    }
    
    
    
}
