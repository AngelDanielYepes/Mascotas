/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author DCDAngel
 */
public class ComidaHumeda extends Productos{
    private String forma;
    private long cantidad;

    public ComidaHumeda(String forma, long cantidad, String nombres, String id, String tipo, long Precio) {
        super(nombres, id, tipo, Precio);
        this.forma = forma;
        this.cantidad = cantidad;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getPrecio() {
        return Precio;
    }

    public void setPrecio(long Precio) {
        this.Precio = Precio;
    }

    
    public void mostrarDatos(){
        
        
        JOptionPane.showMessageDialog(null,"La comida " + getNombres() + ", con el id " +getId()+ ", tiene una cantidad de "+getCantidad()+"Kg, Con un precio de $"+ getPrecio(), "SALIDA DE DATOS",JOptionPane.INFORMATION_MESSAGE);
       
    }
    
}
