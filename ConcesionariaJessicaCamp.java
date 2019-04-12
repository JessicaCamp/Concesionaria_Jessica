/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionariajessicacamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author MAMA
 */
public class ConcesionariaJessicaCamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto("Peugeot","206","4",200000.00);
        Moto moto1 = new Moto("Honda","Titan","125",60000.00);
        Auto auto2 = new Auto("Peugeot","208","5",250000.00);
        Moto moto2 = new Moto("Yamaha","YBR","160",80500.50);
        
        Vehiculo vehiculos[] = {auto1,moto1,auto2,moto2};
        for(Vehiculo v : vehiculos) {
            System.out.println(v);
        }
        
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
       
        List<Vehiculo> vehiculosLista = new ArrayList<Vehiculo>();
        // agrego los objetos a la lista
        vehiculosLista.add(auto1);
        vehiculosLista.add(auto2);
        vehiculosLista.add(moto1);
        vehiculosLista.add(moto2);
        
        //ordeno 
        Collections.reverse(vehiculosLista);
        //Muestro el de mayor y menor precio
        System.out.println("Vehiculo más caro: " + Collections.min(vehiculosLista).toStringCustom());
        System.out.println("Vehiculo más barato: " + Collections.max(vehiculosLista).toStringCustom());
        
        for(Vehiculo v : vehiculosLista){
            if(v.getModelo().contains("Y")){
            System.out.println("Vehiculo que contiene en el modelo la letra 'Y': "+ v.getMarca()+" "+ v.getModelo()+" "+ String.format("$%,.2f",v.getPrecio()));
            }
        }
        Arrays.sort(vehiculos);
         System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("Vehiculos ordenados por precio de mayor a menor:");
        for(Vehiculo v : vehiculos) {        
        System.out.println(v.getMarca() + " " + v.getModelo());
        }        
    }    
}
  
