package logica;

public class Peon extends Pieza{
	public Peon(String nombre, int coordenadaX, int coordenadaY, Movimiento movimiento) {
		super(nombre, coordenadaX, coordenadaY, movimiento);
		// TODO Auto-generated constructor stub
	}
	String nombre = "peon";
	Movimiento movimiento = new Movimiento(2,0,0,0);


}
