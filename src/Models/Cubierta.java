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
public class Cubierta {
    
    private Material tipo;
    private Textura acabado;

    public Cubierta() {
    }

    public Material getTipo() {
        return tipo;
    }

    public void setTipo(Material tipo) {
        this.tipo = tipo;
    }

    public Textura getAcabado() {
        return acabado;
    }

    public void setAcabado(Textura acabado) {
        this.acabado = acabado;
    }
    
    
    
}
