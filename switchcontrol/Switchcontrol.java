package switchcontrol;

import java.util.Scanner;

public class Switchcontrol {

	public static void main(String[] args) {
		 
		  try (Scanner scanner = new Scanner(System.in)) {
			  
			  
			  
			 /*
			   * Aufgabe 1
			   */
			   
			   
			// Benutzer auffordern, eine Zahl zwischen 0 und 9 einzugeben
	        System.out.print("Bitte geben Sie eine Zahl zwischen 0 und 9 ein: ");
	        int zahl = scanner.nextInt();

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
	             
			  
			  
			  /*
			    Af 3.1.2
			   */
			  /*
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
		                ;
		            case 4:
		            case 5:
		            case 6:
		            case 7:
		                System.out.println("Bereich Vier bis Sieben");
		                ;
		            case 8:
		            case 9:
		                System.out.println("Bereich Acht bis Neun");
		                ;
		            default:
		                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 0 und 9 ein.");
		                ;
		                /* 
		                 Wenn die break-Anweisung in einer switch-Kontrollstruktur vergessen wird, 
		                 führt das Programm alle nachfolgenden Anweisungen bis zum nächsten break 
		                 oder bis zum Ende des switch-Blocks aus
		                 */
	        }
		}

	}

}
