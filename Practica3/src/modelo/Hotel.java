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
public class Hotel {
    private Integer id;
    private String nombre;
    private int numHabitaciones;
    private Ubicacion ubicacion;

    public Hotel() {
    }

    public Hotel(Integer id, String nombre, int numHabitaciones, Ubicacion ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.numHabitaciones = numHabitaciones;
        this.ubicacion = ubicacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
