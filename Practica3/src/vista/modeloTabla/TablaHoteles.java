/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controlador.grafos.GrafoNoDirigidoEtiquetado;
import javax.swing.table.AbstractTableModel;
import modelo.Hotel;

/**
 *
 * @author lettc
 */

public class TablaHoteles extends AbstractTableModel {

    private GrafoNoDirigidoEtiquetado<Hotel> hotelGrafo;

    public GrafoNoDirigidoEtiquetado<Hotel> getHotelGrafo() {
        return hotelGrafo;
    }

    public void setHotelGrafo(GrafoNoDirigidoEtiquetado<Hotel> hotelGrafo) {
        this.hotelGrafo = hotelGrafo;
    }

    
    @Override
    public int getRowCount() {
        return hotelGrafo.numVertices();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Nombre";
            case 2:
                return "Habitaciones";
            case 3:
                return "Ubicacion";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Hotel h = hotelGrafo.obtenerEtiqueta(rowIndex+1);
            switch (columnIndex) {
                case 0:
                    return (rowIndex + 1);
                case 1:
                    return h.getNombre();
                case 2:
                    return h.getNumHabitaciones();
                case 3:
                    return (h.getUbicacion()==null)?"No posee ubicacion":h.getUbicacion().toString();
                default:
                    return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

}