/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 */
public class Pelota {
    
    private final String nombre;
    private Medida medida;
    private Etiqueta etiqueta;
    private Nucleo nucleo;
    private Lineas lineas;
    private Costura costura;
    private Cubierta cubierta;

    public Pelota(String nombre, Medida medida, Nucleo nucleo, Cubierta cubierta) {
        this.nombre = nombre;
        this.medida = medida;
        this.nucleo = nucleo;
        this.cubierta = cubierta;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    public Pelota(String nombre) {
        this.nombre=nombre;
    }

    public Medida getMedida() {
        return medida;
    }

    public void setMedida(Medida medida) {
        this.medida = medida;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Nucleo getNucleo() {
        return nucleo;
    }

    public void setNucleo(Nucleo nucleo) {
        this.nucleo = nucleo;
    }

    public Lineas getLineas() {
        return lineas;
    }

    public void setLineas(Lineas lineas) {
        this.lineas = lineas;
    }

    public Costura getCostura() {
        return costura;
    }

    public void setCostura(Costura costura) {
        this.costura = costura;
    }

    public Cubierta getCubierta() {
        return cubierta;
    }

    public void setCubierta(Cubierta cubierta) {
        this.cubierta = cubierta;
    }

    
    
    
}
