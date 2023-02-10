/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author lettc
 */
public class Ubicacion {
   
    private Integer id;
    private Double latitud;
    private Double longitud;

    
    public Ubicacion() {
    }
    

    public Ubicacion(Integer id, Double longitud, Double latitud) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }


    @Override
    public String toString() {
        return " Longitud : "+longitud+" || Latitud: "+latitud;
    }
    
}