/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariajessicacamp;

/**
 *
 * @author MAMA
 */
public class Auto extends Vehiculo {
    private String puertas;

    public Auto() {
    }      

    public Auto(String marca, String modelo, String puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }       

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
       
    
    @Override
    public String toString() {
        return "Marca: " + this.marca + " " + "//" + " " +
        "Modelo: " + this.modelo + " " + "//" + " " +
        "Puertas: " + " " + this.puertas + " " + "//" + " " +
        "Precio: $" + String.format("%,.2f",this.precio);
   }
    @Override
    public String toStringCustom() {
        String result = this.getMarca() + " " + this.getModelo();
        return result;
   }  
}
