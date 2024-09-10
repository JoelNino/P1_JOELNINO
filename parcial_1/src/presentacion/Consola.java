package presentacion;
import logica.Peon;
import logica.Torre;
import logica.Alfil;



public class Consola {
    public static void main(String[] args) {
  
        Peon peon1 = new Peon(2, 1);
        Peon peon2 = new Peon(5, 2);
        Peon peon3 = new Peon(8, 4);
        
        Torre torre1 = new Torre(1, 1);
        Torre torre2 = new Torre(4, 4);
        Torre torre3 = new Torre(8, 8);
        Torre torre4 = new Torre(5, 3);
        
        Alfil alfil1 = new Alfil(1, 1);
        Alfil alfil2 = new Alfil(4, 4);
        Alfil alfil3 = new Alfil(8, 8);
        Alfil alfil4 = new Alfil(5, 3);
        
        System.out.println("Casillas posibles para el peón en (2,1): " + peon1.calcularCantidadCasillas()); // Esperado: 2
        System.out.println("Casillas posibles para el peón en (5,2): " + peon2.calcularCantidadCasillas()); // Esperado: 1
        System.out.println("Casillas posibles para el peón en (8,4): " + peon3.calcularCantidadCasillas()); // Esperado: 0
        
        System.out.println("Casillas posibles para la torre en (1,1): " + torre1.calcularCantidadCasillas()); // Esperado: 14
        System.out.println("Casillas posibles para la torre en (4,4): " + torre2.calcularCantidadCasillas()); // Esperado: 14
        System.out.println("Casillas posibles para la torre en (8,8): " + torre3.calcularCantidadCasillas()); // Esperado: 14
        System.out.println("Casillas posibles para la torre en (5,3): " + torre4.calcularCantidadCasillas()); // Esperado: 13
        
        System.out.println("Casillas posibles para el alfil en (1,1): " + alfil1.calcularCantidadCasillas()); // Esperado: 7
        System.out.println("Casillas posibles para el alfil en (4,4): " + alfil2.calcularCantidadCasillas()); // Esperado: 13
        System.out.println("Casillas posibles para el alfil en (8,8): " + alfil3.calcularCantidadCasillas()); // Esperado: 0
        System.out.println("Casillas posibles para el alfil en (5,3): " + alfil4.calcularCantidadCasillas()); // Esperado: 11
    }
}

