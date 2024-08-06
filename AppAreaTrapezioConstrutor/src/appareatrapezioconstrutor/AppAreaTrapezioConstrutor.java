
package appareatrapezioconstrutor;

import entidades.Trapezio;

public class AppAreaTrapezioConstrutor {

    public static void main(String[] args) {
        double baseMaior = 10;
        double baseMenor = 7.5;
        double altura = 6.3;
        
        Trapezio x = new Trapezio(baseMaior,baseMenor,altura);
        System.out.printf("Áreaa X = %.2f%n", x.area());
    }
    
}
