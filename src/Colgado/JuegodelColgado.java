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
		//	------------------------------------------------------------------------------------------------
			System.out.print("Cuantas rondas se van a jugar?");
			int numeroRondas = a.nextInt();
			
			int[] puntuacion = new int[numeroJugadores];
			
			for (int ronda = 1; ronda <=numeroRondas; ronda++) {
				System.out.println("-Ronda" + ronda + "-");
				System.out.print("Introduce la palabra para adivinar, Endministrator: ");
				
				String palabraAmnesia = a.nextLine().toLowerCase();
			//------------------------------------------------------------------------------------------------	
				
				char[] palabraOculta = new char[palabraAmnesia.length()];
				for (int i = 0; i < palabraOculta.length; i++) {
					palabraOculta[i] = '_';
				}
				
				int roundwinner = -1;
				int vidas = 6;
				
				while (roundwinner == -1 && vidas > 0) {
					for (int i = 0; i < numeroJugadores; i++) {
						if (roundwinner != -1) break;
						
						System.out.println("Palabra descubierta: " + String.valueOf(palabraOculta));
						System.out.println("Le toca a " + Jugadores[i] + "-Vidas que le quedan: " + vidas);
						System.out.print("Introduce una letra: ");
						char caracter = a.nextLine().toLowerCase().charAt(0);
				//----------------------------------------------------------------------------------------------
						
						boolean correcto = false;
						for (int j = 0; j < palabraAmnesia.length(); j++) {
							if (palabraAmnesia.charAt(j) == caracter) {
								palabraOculta[j] = caracter;
								correcto = true;
								
							}
						}
						
						if (correcto) {
							System.out.println("Acertaste crack");
						} else {
							System.out.println("Fallaste paquete");
							vidas--;
						}
						
						if (String.valueOf(palabraOculta).equals(palabraAmnesia)) {
							roundwinner = i;
							puntuacion[i]++;
							System.out.println("$" + Jugadores[i] + "Gano la ronda$");
							break;
						//----------------------------------------------------------------------------------------
						
						
						
						
						
					}
				}
				
				
				
				
				
				
				
				
			}
		}
		
		
	}

}
