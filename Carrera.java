
package carros;

import java.util.Scanner;

public class Carrera {
    //declarando constante de vueltas
    private static final int NUM_VUELTAS =5;//NUMEROS DE VUELTAS
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        //menu
        System.out.println("ingrese la opcion del menu");
        System.out.println("1. INGRESO DE VEHICULO");
        System.out.println("2. SALIR");
        
        System.out.println("Digite su opcion");
        int opcion = sc.nextInt();
        //menu para opcion 1 y opcion 2
        switch(opcion){
            case 1:
        
        System.out.println("INGRESE LA DISTANCIA TOTAL DE LA PISTA (EN KILOMETROS)");
        double distanciaTotal = sc.nextDouble();
        
        System.out.println("INGRESE EL NUMERO DE VEHICULO ");
        int numVehiculos= sc.nextInt();
        
        Vehiculo[] vehiculos = new Vehiculo[numVehiculos];
        
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println("INGRESE EL NOMBRE DE LOS VEHICULOS " + (i + 1) + ":");
            String nombreVehiculo = sc.nextLine();
            nombreVehiculo = sc.nextLine();
            vehiculos[i] = new Vehiculo(nombreVehiculo, NUM_VUELTAS);
            vehiculos[i].ingresarTiempos(sc);
        }
        
       System.out.println("\nResultados de la carrera:");
        for (Vehiculo vehiculo : vehiculos) {
            double velocidadPromedio = vehiculo.calcularVelocidadPromedio(distanciaTotal);
            System.out.println("Vehículo '" + vehiculo.getNombre() + "': Velocidad Promedio: " + velocidadPromedio + " km/h");
        }
        break;
        //finalizacion del programa
            case 2:
                System.out.println("Gracias por usar este programa");
            default:
                System.out.println("error la opcion no existe");
        
        
    }
}
}//fin de clase