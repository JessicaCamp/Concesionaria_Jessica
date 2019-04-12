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
public class Vehiculo implements Comparable<Vehiculo> {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo() {
    }
       
    public Vehiculo (String marca, String modelo,double precio) {
        this.marca = marca;
        this.modelo = modelo;       
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio Invalido");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
           
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio Invalido");
        }
    }
    
    public String toStringCustom() {
        String result = this.getMarca() + this.getModelo() + this.getPrecio();
        return result;
   }
             
    @Override
    public int compareTo(Vehiculo v){

        int resultado=0;
        if (this.precio > v.precio){
            resultado = -1;      
        }
        else 
            if (this.precio < v.precio){
                resultado = 1;      
            }
        return resultado;      
    
    }
    
}

    
