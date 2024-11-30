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
			
		//	------------------------------------------------------------------------------------------------
			System.out.print("Cuantas rondas se van a jugar?");
			int numeroRondas = a.nextInt();
			
			int[] puntuacion = new int[numeroJugadores];
			
			for (int ronda = 1; ronda <=numeroRondas; ronda++) {
				System.out.println("-Ronda" + ronda + "-");
				System.out.print("Introduce la palabra para adivinar, Endministrator: ");
				
				String palabraOculta = a.nextLine().toLowerCase();
			//------------------------------------------------------------------------------------------------	
				
			}
		}
		
		
	}

}
