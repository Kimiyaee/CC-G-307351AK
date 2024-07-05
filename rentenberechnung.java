package rentenberechnung;
import java.util.Scanner;

public class rentenberechnung {

	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);

		        // Eingabe des Anfangskapitals
		        System.out.print("Geben Sie das anzulegende Kapital ein: ");
		        double kapital = scanner.nextDouble();

		        // Eingabe des Zinssatzes
		        System.out.print("Geben Sie den Zinssatz ein (in %): ");
		        double zinssatz = scanner.nextDouble() / 100;

		        // Eingabe der jährlichen Rente
		        System.out.print("Geben Sie die jährliche Rente ein: ");
		        double rente = scanner.nextDouble();

		        // Überprüfen, ob die Rente > Anfangskapital x Zinssatz ist
		        if (rente <= kapital * zinssatz) {
		            System.out.println("Die jährliche Rente muss größer als der Zinsertrag des Anfangskapitals sein.");
		            return;
		        }

		        int jahre = 0;

		        // Berechnung der Jahre bis das Kapital aufgebraucht ist
		        while (kapital > 0) {
		            kapital += kapital * zinssatz; // Kapital wird verzinst
		            kapital -= rente; // Rente wird abgezogen
		            jahre++;

		            if (kapital < 0) {
		                kapital = 0;
		            }
		        }

		        // Ausgabe des Ergebnisses
		        System.out.println("Das Kapital wird nach " + jahre + " Jahren aufgebraucht sein.");
		    }
		

	}


