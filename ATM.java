package atm;

import java.util.Scanner;

public class ATM { 

	public static void main(String[] args) {

		

		        Scanner scanner = new Scanner(System.in);
		        
		        // Das aktuelle Guthaben des Benutzers
		        double kontoStand = 346.14;

		        // Anzeigen des aktuellen Guthabens
		        System.out.println("Ihr Guthaben beläuft sich auf " + kontoStand + " Euro.");

		        // Eingabeaufforderung für den Abhebungsbetrag
		        System.out.print("Wie viel Geld möchten Sie abheben? ");
		        double abhebungsBetrag = scanner.nextDouble();

		        // Überprüfung, ob der Abhebungsbetrag das Guthaben nicht überschreitet
		        if (abhebungsBetrag > kontoStand) {
		            System.out.println("Keine Auszahlung möglich! Der angegebene Betrag übersteigt Ihr Guthaben.");
		            System.out.println("Ihr Guthaben beträgt " + kontoStand + " Euro.");
		        } else {
		            // Abhebungsbetrag wird vom Guthaben abgezogen
		            kontoStand -= abhebungsBetrag;
		            System.out.println("Es werden " + abhebungsBetrag + " Euro ausgezahlt.");
		            System.out.println("Ihr Konto beträgt " + kontoStand + " Euro.");
		        }

		        scanner.close();
		    }
		

	}

