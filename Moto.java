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
public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto() {
    }

    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }      
   
    @Override
    public String toString() {
        return "Marca: " + this.marca +  " " + "//" + " " +
        "Modelo: " + this.modelo + " " + "//" + " " +
        "Cilindrada: " + this.cilindrada + "c" + " " + "//" + " " +
        "Precio: $" + String.format("%,.2f",this.precio);
   }
   @Override
    public String toStringCustom() {
        String result = this.getMarca() + " " + this.getModelo();
        return result;
   }
   
}
