package aufgabe;
import java.util.Scanner;

public class Zinsberechnung {

	public static void main(String[] args) {



		        Scanner scanner = new Scanner(System.in);

		        // Eingabe des anzulegenden Kapitals
		        System.out.print("Geben Sie das anzulegende Kapital ein: ");
		        double kapital = scanner.nextDouble();

		        // Eingabe des Zinssatzes
		        System.out.print("Geben Sie den Zinssatz ein (z.B. 10 für 10%): ");
		        double zinssatz = scanner.nextDouble();
		        double z = zinssatz / 100;

		        // Eingabe der Laufzeit der Geldanlage
		        System.out.print("Geben Sie die Laufzeit der Geldanlage in Jahren ein: ");
		        int laufzeit = scanner.nextInt();

		        // Berechnung und Ausgabe des Kapitals für jedes Jahr
		        for (int jahr = 1; jahr <= laufzeit; jahr++) {
		            kapital = kapital + (kapital * z);
		            System.out.printf("Jahr %d: %.2f\n", jahr, Math.round(kapital * 100.0) / 100.0);
		        }

		        scanner.close();
		    }
		
		
	}

