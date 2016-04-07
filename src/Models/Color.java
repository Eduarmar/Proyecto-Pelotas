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
public class Color {
    
    private String nombreC;
    private int brillo;
    private int contraste;
    private int tinte;

    public Color() {
    }
    
    public Color(String nombreC, int brillo, int contraste, int tinte) {
        this.nombreC = nombreC;
        this.brillo = brillo;
        this.contraste = contraste;
        this.tinte = tinte;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public int getContraste() {
        return contraste;
    }

    public void setContraste(int contraste) {
        this.contraste = contraste;
    }

    public int getTinte() {
        return tinte;
    }

    public void setTinte(int tinte) {
        this.tinte = tinte;
    }
    
    
    
    
}
