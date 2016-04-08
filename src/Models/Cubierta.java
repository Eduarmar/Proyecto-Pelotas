/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Cubierta {
    
    private String Nombre;
    private Material tipo;
    private Textura acabado;

    public Cubierta() {
    }

    public Cubierta(String Nombre, Material tipo, Textura acabado) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.acabado = acabado;
    }

     public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
