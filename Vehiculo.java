
package carros;

import java.util.Scanner;
//atributos 
public class Vehiculo {
private String nombre;
private double[] tiempos;
    

    //constructor
    public Vehiculo(String nombre, int numVueltas){
        this.nombre=nombre;
        this.tiempos = new double [numVueltas];
    }
    //getter
    public String getNombre(){
        return nombre;
    } 
    //metodo  para que se ingrese el tiempo 
    public void ingresarTiempos(Scanner sc){
        System.out.println("INGRESE EL TIEMPO RECORRIDO EN LA VUELTA: ");
    for(int i=0; i<tiempos.length; i++){
        System.out.println("Tiempo de la vuelta "+(i+1)+":");
        tiempos[i]= sc.nextDouble();
      }
    }
    //metodo para calcular el promedio total
    public double calcularVelocidadPromedio(double distanciaTotal){
        double tiempoTotal=0;
        for(int i =0; i<tiempos.length; i++){
            tiempoTotal += tiempos[i];
            
        }
        return distanciaTotal/tiempoTotal;
    }
      
}
