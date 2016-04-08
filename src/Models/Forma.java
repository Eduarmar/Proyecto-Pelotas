/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Forma {
    
    private String nombre;
    private float largo;
    private float elipse;

    public Forma(String nombre, float largo) {
        this.nombre = nombre;
        this.largo = largo;
    }

    
        
    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getElipse() {
        return elipse;
    }

    public void setElipse(float elipse) {
        this.elipse = elipse;
    }   
    
}
