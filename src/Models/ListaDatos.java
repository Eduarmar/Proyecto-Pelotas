/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;


public class ListaDatos {
    
    public List<Pelota> listaPelota;
    public List<Forma> listaForma;
    public List<Cubierta> listaCubierta;
    public List<Nucleo> listaNucleo;
    public List<Costura> listaCostura;
    public List<Lineas> listaLinea;
    public List<Etiqueta> listaEtiqueta;

    public ListaDatos() {
        this.listaLinea = new ArrayList<>();
        this.listaEtiqueta = new ArrayList<>();
        this.listaCostura = new ArrayList<>();
        this.listaNucleo = new ArrayList<>();
        this.listaCubierta = new ArrayList<>();
        this.listaPelota = new ArrayList<>();
        this.listaForma = new ArrayList<>();
    }
    
    
    
    public Object ObtenerObjeto(String nombre, int list){
        
        
        switch (list){
            
            case 1:
                for (Pelota lista : this.listaPelota) {
                     if (lista.getNombre().equals(nombre)) {
                        return lista;
                }
            } break;
            
            case 2:
                 for (Forma lista : this.listaForma) {
                     if (lista.getNombre().equals(nombre)) {
                        return lista;
                }
            } break;
                
           case 3:
                 for (Cubierta lista : this.listaCubierta) {
                     if (lista.getNombre().equals(nombre)) {
                        return lista;
                }
            } break; 
               
            case 4:
                 for (Nucleo lista : this.listaNucleo) {
                     if (lista.getNombre().equals(nombre)) {
                        return lista;
                }
            } break;   
                
            case 5:
                 for (Costura lista : this.listaCostura) {
                     if (lista.getNombre().equals(nombre)) {
                        return lista;
                }
            } break;
            
            case 6:
                 for (Lineas lista : this.listaLinea) {
                     if (lista.getTipolinea().equals(nombre)) {
                        return lista;
                }
            } break;
        
        }
        
        return null;
       
    }
    
    
}
