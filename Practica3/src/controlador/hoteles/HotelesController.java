/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador.hoteles;

import controlador.grafos.GrafoNoDirigidoEtiquetado;
import java.util.Random;
import modelo.Hotel;
import modelo.Ubicacion;

/**
 *
 * @author lettc
 */

public class HotelesController {
    private GrafoNoDirigidoEtiquetado<Hotel> gnde;
    private Hotel hotel;

   
    public HotelesController() {
        gnde=new GrafoNoDirigidoEtiquetado<>(5,Hotel.class);
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            Ubicacion u= new Ubicacion();
            u.setId(i);
            u.setLatitud(Math.round((90.99 + ( 90.99 - (-90.99) ) * rand.nextDouble())*100.0)/100.0);
            u.setLongitud(Math.round((90.99 + ( 90.99 - (-90.99) ) * rand.nextDouble())*100.0)/100.0);
            Hotel h= new Hotel(i,"Hotel "+i, i, u);
            gnde.etiquetarVertice(i, h);
        }
        sinHoteles();    
    }

    public GrafoNoDirigidoEtiquetado<Hotel> getGnde() {
        return gnde;
    }

    public void setGnde(GrafoNoDirigidoEtiquetado<Hotel> gnde) {
        this.gnde = gnde;
    }

    public Hotel getHotel() {
        if(hotel==null){
            hotel= new Hotel();
        }
        return hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    

    public void sinHoteles(){
        Ubicacion u= new Ubicacion(0,0.0,0.0);        
        hotel = new Hotel(0,"",0, u); 
    }

    public Double calcularDistancia(Hotel ho, Hotel hd) {
        Double dis = 0.0;
        Double lon = ho.getUbicacion().getLongitud() - hd.getUbicacion().getLongitud();
        Double lat = ho.getUbicacion().getLatitud() - hd.getUbicacion().getLatitud();
        dis = Math.sqrt((lon*lon) + (lat*lat));
        return dis;
    }


    public Boolean nuevoHotel( ) {
        try {
            gnde.nuevoGrafo();
            System.out.println(hotel.getNombre());
            gnde.etiquetarVertice(gnde.numVertices(), hotel);
            sinHoteles();
            return true;
        } catch (Exception e) {
            return false;
        }       
    }
    
}