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
public class Nucleo {
    
    private Material tipo;
    private int capas;

    public Nucleo() {
    }

    public Material getTipo() {
        return tipo;
    }

    public void setTipo(Material tipo) {
        this.tipo = tipo;
    }

    public int getCapas() {
        return capas;
    }

    public void setCapas(int capas) {
        this.capas = capas;
    }

}
