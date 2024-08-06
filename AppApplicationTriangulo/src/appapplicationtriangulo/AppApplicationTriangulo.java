
package appapplicationtriangulo;

import Entidades.Trismgulo;
import java.util.Scanner;

public class AppApplicationTriangulo {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Trismgulo x,y;
        x = new Trismgulo();
        y = new Trismgulo ();
        System.out.println("Base Triângulo x");
        x.base = ler.nextDouble();
        System.out.println("Altura triângulo x");
        x.altura = ler.nextDouble();
        System.out.println("Base Triângulo y");
        y.base = ler.nextDouble();
        System.out.println("Altura triângulo y");
        y.altura = ler.nextDouble();
        double areaX = x.areaTriangulo();
        double areaY = y.areaTriangulo();
        System .out.printf("Área X = 2f%n", areaX);
        System .out.printf("Área Y = 2f%n", areaY);
        if (areaX > areaY){
            System.out.println("Maior área X");
        }
        else{ 
            System.out.println("Maior área Y");
        }
        
        ler.close();
        
        
    }
    
}
