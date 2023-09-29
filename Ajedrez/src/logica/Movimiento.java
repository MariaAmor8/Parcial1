package logica;

public class Movimiento {
	int maxDesplazamientoAdelante;
	int maxDesplazamientoAtras;
	int maxDesplazamientoDerecha;
	int maxDesplazamientoIzquierda;
	public int getMaxDesplazamientoAdelante() {
		return maxDesplazamientoAdelante;
	}
	public void setMaxDesplazamientoAdelante(int maxDesplazamientoAdelante) {
		this.maxDesplazamientoAdelante = maxDesplazamientoAdelante;
	}
	public int getMaxDesplazamientoAtras() {
		return maxDesplazamientoAtras;
	}
	public void setMaxDesplazamientoAtras(int maxDesplazamientoAtras) {
		this.maxDesplazamientoAtras = maxDesplazamientoAtras;
	}
	public int getMaxDesplazamientoDerecha() {
		return maxDesplazamientoDerecha;
	}
	public void setMaxDesplazamientoDerecha(int maxDesplazamientoDerecha) {
		this.maxDesplazamientoDerecha = maxDesplazamientoDerecha;
	}
	public int getMaxDesplazamientoIzquierda() {
		return maxDesplazamientoIzquierda;
	}
	public void setMaxDesplazamientoIzquierda(int maxDesplazamientoIzquierda) {
		this.maxDesplazamientoIzquierda = maxDesplazamientoIzquierda;
	}
	public Movimiento(int maxDesplazamientoAdelante, int maxDesplazamientoAtras, int maxDesplazamientoDerecha,
			int maxDesplazamientoIzquierda) {
		super();
		this.maxDesplazamientoAdelante = maxDesplazamientoAdelante;
		this.maxDesplazamientoAtras = maxDesplazamientoAtras;
		this.maxDesplazamientoDerecha = maxDesplazamientoDerecha;
		this.maxDesplazamientoIzquierda = maxDesplazamientoIzquierda;
	}
	
	
}
