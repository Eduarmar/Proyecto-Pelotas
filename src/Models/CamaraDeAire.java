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
public class CamaraDeAire {
    
    private Material tipocamara;
    private int elasticidad;
    private String valvula;
    private float presion;

    public CamaraDeAire() {
    }

    public Material getTipocamara() {
        return tipocamara;
    }

    public void setTipocamara(Material tipocamara) {
        this.tipocamara = tipocamara;
    }

    public int getElasticidad() {
        return elasticidad;
    }

    public void setElasticidad(int elasticidad) {
        this.elasticidad = elasticidad;
    }

    public String getValvula() {
        return valvula;
    }

    public void setValvula(String valvula) {
        this.valvula = valvula;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }
    
    
    
    
}
