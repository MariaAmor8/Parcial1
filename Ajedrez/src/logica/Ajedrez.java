package logica;

public class Ajedrez {
	Pieza pieza;
	
	public void ingresarFicha(int ficha, int coordx, int coordy) {
		if(ficha == 1) {
		pieza = new Peon("peon", coordx, coordy, new Movimiento(2,0,0,0));	
		}
		if(ficha == 2) {
			pieza = new Peon("torre", coordx, coordy, new Movimiento(8,8,8,8));	
			}
		if(ficha == 3) {
			pieza = new Peon("rey", coordx, coordy, new Movimiento(1,1,1,1));	
			}
	}
	
	public int calcularCasillasPosibles() {
		String rta = "";
		int x = pieza.getCoordenadaX();
		int y = pieza.getCoordenadaY();
		int posible = 0;
		int maxArriba = pieza.getMovimiento().getMaxDesplazamientoAdelante();
//		if((maxArriba + x) < 8) {
//			for(i=0;i<maxArriba;i++) {
//				posible = x+i;
//			}
	//	}
		return(0);
	}

}
