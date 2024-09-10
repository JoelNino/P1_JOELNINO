package logica;

public class Alfil extends Ficha {
    
    public Alfil(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCantidadCasillas() {
        int cantidad = 0;
        
        
        int movimientosAbajoDerecha = Math.min(8 - fila, 8 - columna);
        
       
        int movimientosArribaDerecha = Math.min(8 - fila, columna - 1);
        
       
        int movimientosAbajoIzquierda = Math.min(fila - 1, 8 - columna);
        
        
        int movimientosArribaIzquierda = Math.min(fila - 1, columna - 1);
        
        cantidad = movimientosArribaDerecha + movimientosArribaIzquierda + movimientosAbajoDerecha + movimientosAbajoIzquierda;
        
        return cantidad;
    }
}
