
package appapplicationtriangulo;

import Entidades.Trismgulo;
import java.util.Scanner;

public class AppApplicationTriangulo {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Trismgulo x,y;
        x = new Trismgulo();
        y = new Trismgulo ();
        System.out.println("Base Tri�ngulo x");
        x.base = ler.nextDouble();
        System.out.println("Altura tri�ngulo x");
        x.altura = ler.nextDouble();
        System.out.println("Base Tri�ngulo y");
        y.base = ler.nextDouble();
        System.out.println("Altura tri�ngulo y");
        y.altura = ler.nextDouble();
        double areaX = x.areaTriangulo();
        double areaY = y.areaTriangulo();
        System .out.printf("�rea X = 2f%n", areaX);
        System .out.printf("�rea Y = 2f%n", areaY);
        if (areaX > areaY){
            System.out.println("Maior �rea X");
        }
        else{ 
            System.out.println("Maior �rea Y");
        }
        
        ler.close();
        
        
    }
    
}
