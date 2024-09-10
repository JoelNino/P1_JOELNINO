package logica;

public abstract class Ficha {
    
	protected int fila;
    protected int columna;
    
   
    public Ficha(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    public abstract int calcularCantidadCasillas();
}