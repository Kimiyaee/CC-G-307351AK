package verschachtelungen;

public class Sternen {

	public static void main(String[] args) {
		
		        int hoehe = 5; // Höhe der Pyramide

		        for (int i = 1; i <= hoehe; i++) {
		            // Leerzeichen vor den Sternen
		            for (int j = hoehe - i; j > 0; j--) {
		                System.out.print(" ");
		            }

		            // Sterne
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }

		            // Neue Zeile
		            System.out.println();
		}

	}

}
