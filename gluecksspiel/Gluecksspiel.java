package gluecksspiel;

import java.util.Random;
import java.util.Scanner;

public class Gluecksspiel {

	public static void main(String[] args) {

	

		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        boolean weiterspielen = true;

		        System.out.println("Willkommen beim Gluecksspiel!");

		        while (weiterspielen) {
		            System.out.print("Geben Sie Ihre Vermutung (eine ganze Zahl zwischen 1 und 100) ein oder 's' zum Beenden: ");
		            String eingabe = scanner.next();

		            // Prüfen, ob der Benutzer das Spiel beenden möchte
		            if (eingabe.equalsIgnoreCase("s")) {
		                weiterspielen = false;
		                System.out.println("Spiel beendet. Auf Wiedersehen!");
		            } else {
		                try {
		                    int vermutung = Integer.parseInt(eingabe);
		                    if (vermutung < 1 || vermutung > 100) {
		                        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein.");
		                    } else {
		                        int zufallszahl = random.nextInt(100) + 1;
		                        System.out.println("Die generierte Zahl lautet: " + zufallszahl);
		                        if (zufallszahl >= 40 && zufallszahl <= 60) {
		                            System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
		                        } else {
		                            System.out.println("Leider verloren. Versuchen Sie es beim nächsten Mal!");
		                        }
		                    }
		                } catch (NumberFormatException e) {
		                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 100 ein oder 's' zum Beenden.");
		                }
		            }
		        }

		        scanner.close();
		    }
	

		
	}


