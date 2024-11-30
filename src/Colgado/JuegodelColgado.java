package Colgado;

import java.util.Scanner;

public class JuegodelColgado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		
		System.out.println("Este es el Juego del Colgado");
		//Primero pedimos el numero de jugadores que jugaran
		System.out.print("Introduce el numero de personas que van a jugar, el minimo son 2");
		int numeroJugadores = a.nextInt();
		
		String[] Jugadores = new String[numeroJugadores];
		for (int i = 0; i < numeroJugadores; i++) {
			Jugadores[i] = "Jugador" + (i + 1); //Esto sera para que todos losque juegen se llamen Jugador1, Jugador 2 etc
			
		}
	        //Preguntamos el numero de rondas que se jugaran
			System.out.print("Cuantas rondas se van a jugar?");
			int numeroRondas = a.nextInt();
			
			int[] puntuacion = new int[numeroJugadores];
			
			//Comenzamos el juego pidiendo al Adinistrador que elija una palabra
			for (int ronda = 1; ronda <= numeroRondas; ronda++) {
				System.out.println("-Ronda" + ronda + "-");
				System.out.print("Introduce la palabra para adivinar, Endministrator: ");
				
				String palabraAmnesia = a.nextLine().toLowerCase();
				
				//Esto cambiara la palabra introducida por guiones bajos
				char[] palabraOculta = new char[palabraAmnesia.length()];
				for (int i = 0; i < palabraOculta.length; i++) {
					palabraOculta[i] = '_';
				}
				
				int roundwinner = -1; //mientras sea -1 no habra ganador
				int vidas = 6;
				//Un bucle para adivinar la palabra oculta y el break para salir del bucle cuando haya un ganador
				while (roundwinner == -1 && vidas > 0) {
					for (int i = 0; i < numeroJugadores; i++) {
						if (roundwinner != -1) break;
						
						System.out.println("Palabra descubierta: " + String.valueOf(palabraOculta));
						System.out.println("Le toca a " + Jugadores[i] + "-Vidas que le quedan: " + vidas);
						System.out.print("Introduce una letra: ");
						char caracter = a.nextLine().toLowerCase().charAt(0);
						
						//un boolean para definir si la letra que se ha escrito es parte de la palabra oculta
						boolean correcto = false;
						for (int j = 0; j < palabraAmnesia.length(); j++) {
							if (palabraAmnesia.charAt(j) == caracter) {
								palabraOculta[j] = caracter;
								correcto = true;
								
							}
						}
						
						//Mostramos el resultado de cada turno dependiendo si se ha acertado la letra o no
						if (correcto) {
							System.out.println("Acertaste crack");
						} else {
							System.out.println("Fallaste paquete");
							vidas--;
						}
						//Aqui mirara si la palabra a sido acertada
						if (String.valueOf(palabraOculta).equals(palabraAmnesia)) {
							roundwinner = i;
							puntuacion[i]++;
							System.out.println("$" + Jugadores[i] + "Gano la ronda$");
							break;
						}
						
					}
					
				}
					
				//Si este int roundwinner = -1 sigue en -1 saldra el siguiente resultado
				if (roundwinner == -1) {
					System.out.println("No se ha adivinado la palabra paquetes, esta es la palabra: " + palabraAmnesia);
							
				}	
			}
			//Al final se mostraran los resultados totales de los jugadores
			System.out.println("---Resultado---");
			int puntuacionTotal = 0;
			for (int i = 0; i < numeroJugadores; i++) {
				System.out.println(Jugadores[i] + ":" + puntuacion[i] + "Puntos");
				if (puntuacion[i] > puntuacionTotal) {
					puntuacionTotal = puntuacion[i];	
			}
		}
		
		System.out.println("The winner is:");
		for (int i = 0; i < numeroJugadores; i++) {
			if (puntuacion[i] == puntuacionTotal) {
				System.out.println(Jugadores[i]);
				
				
			}
		}
		
		
	}

}
