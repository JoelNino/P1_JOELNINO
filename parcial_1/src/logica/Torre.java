package logica;

public class Torre extends Ficha {
    
    public Torre(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCantidadCasillas() {
        int cantidad = 0;
        
        // Movimientos horizontales en la misma columna
        int movimientosIzquierda = columna - 1;  
        int movimientosDerecha = 8 - columna;    
        cantidad += movimientosIzquierda + movimientosDerecha;

        // Movimientos verticales en la misma fila
        int movimientosArriba = 8-fila;        
        int movimientosAbajo = fila-1;         
        cantidad += movimientosArriba + movimientosAbajo;
        
        return cantidad;
    }
}
