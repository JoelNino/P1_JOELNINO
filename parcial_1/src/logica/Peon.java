package logica;

public class Peon extends Ficha {
    
    public Peon(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCantidadCasillas() {
        int cantidad = 1;
        

        if (columna == 2) {
            cantidad = 2;
        } 
      
    
    
        // si el peon llega al final no se puede mover más
        if (columna == 1 || columna == 8) {
            cantidad = 0;
            
        }
        return cantidad;
    }
}
