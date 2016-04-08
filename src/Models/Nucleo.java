/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Nucleo {
    
    private String nombre;
    private Cubierta tipo;
    private int capas;

    public Nucleo() {
    }

    public Nucleo(String nombre, Cubierta tipo, int capas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capas = capas;
    }
       
    
    public String getNombre() {
        return nombre;
    }
    
    public Cubierta getTipo() {
        return tipo;
    }

    public void setTipo(Cubierta tipo) {
        this.tipo = tipo;
    }

    public int getCapas() {
        return capas;
    }

    public void setCapas(int capas) {
        this.capas = capas;
    }

}
