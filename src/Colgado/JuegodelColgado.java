package Colgado;

import java.util.Scanner;

public class JuegodelColgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		
		System.out.println("Este es el Juego del Colgado");
		
		System.out.print("Introduce el numero de personas que van a jugar, el minimo son 2");
		int numeroJugadores = a.nextInt();
		
		String[] Jugadores = new String[numeroJugadores];
		for (int i = 0; i < numeroJugadores; i++) {
			Jugadores[i] = "Jugador" + (i + 1);
			
		}
		
		
	}

}
