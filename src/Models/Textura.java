/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Textura {
    
    private final String superficie;
    private int corrugado;

    public Textura(String superficie, int corrugado) {
        this.superficie = superficie;
        this.corrugado = corrugado;
    }

    public String getSuperficie() {
        return superficie;
    }
   
    public int getCorrugado() {
        return corrugado;
    }

    public void setCorrugado(int corrugado) {
        this.corrugado = corrugado;
    }
    
}
