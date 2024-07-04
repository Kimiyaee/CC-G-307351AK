package switchControlWithLoop;

import java.util.Scanner;

public class SwitchControlWithLoop { 

	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char continueInput;

	        do {
	            // Benutzer auffordern, eine Zahl zwischen 0 und 9 einzugeben
	            System.out.print("Bitte geben Sie eine Zahl zwischen 0 und 9 ein: ");
	            int zahl = scanner.nextInt();

	            // Switch-Kontrollstruktur zur Überprüfung der eingegebenen Zahl
	            switch (zahl) {
	                case 0:
	                case 1:
	                case 2:
	                case 3:
	                    System.out.println("Bereich Null bis Drei");
	                    break;
	                case 4:
	                case 5:
	                case 6:
	                case 7:
	                    System.out.println("Bereich Vier bis Sieben");
	                    break;
	                case 8:
	                case 9:
	                    System.out.println("Bereich Acht bis Neun");
	                    break;
	                default:
	                    System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 0 und 9 ein.");
	                    break;
	            }

	            // Benutzer fragen, ob eine weitere Eingabe gewünscht ist
	            System.out.print("Möchten Sie eine weitere Zahl eingeben? (j/n): ");
	            continueInput = promptAndReadChar(scanner);

	        } while (continueInput == 'j' || continueInput == 'J');

	        // Scanner schließen
	        scanner.close();
	    }

	    // Methode zum Einlesen eines Zeichens von der Konsole
	    private static char promptAndReadChar(Scanner scanner) {
	        return scanner.next().charAt(0);
	    }
	}


