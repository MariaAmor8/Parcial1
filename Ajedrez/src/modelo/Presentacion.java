package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import logica.Ajedrez;

public class Presentacion {
	Ajedrez ajedrez = new Ajedrez();
	
	public void ejecutar() {
		int opcionficha = Integer.parseInt(input("Ingrese una pieza:\n 1.Peon \n2.Torre\n 3.Rey"));
		
		int coordX= Integer.parseInt(input("Ingrese coordenada en x: "));
		int coordY= Integer.parseInt(input("Ingrese coordenada en y: "));
		ajedrez.ingresarFicha(opcionficha,coordX,coordY);
		
	}
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
