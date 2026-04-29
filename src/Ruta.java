/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Aleyda
 */
public class Ruta {
    private int idruta ;
    private String tipoproductos;
    private String nombrer ;

    public Ruta() {
    }
    

    public Ruta(int idruta, String tipoproductos, String nombrer) {
        this.idruta = idruta;
        this.tipoproductos = tipoproductos;
        this.nombrer = nombrer;
    }

    public String getNombrer() {
        return nombrer;
    }

    public void setNombrer(String nombrer) {
        this.nombrer = nombrer;
    }

    public int getIdruta() {
        return idruta;
    }

    public void setIdruta(int idruta) {
        this.idruta = idruta;
    }

    public String getTipoproductos() {
        return tipoproductos;
    }

    public void setTipoproductos(String tipoproductos) {
        this.tipoproductos = tipoproductos;
    }
    
}
