package verschachtelungen;

public class TriangularNumbers622 {

	public static void main(String[] args) {

	
		        int max = 15; // Maximale Grenze
		        int maxBreite = 0;

		        // Ermitteln der maximalen Breite der Ausgabe
		        for (int n = 1; ; n++) {
		            int dreieckszahl = n * (n + 1) / 2;
		            if (dreieckszahl > max) {
		                break;
		            }
		            int aktuelleBreite = getDreieckszahlString(n).length();
		            if (aktuelleBreite > maxBreite) {
		                maxBreite = aktuelleBreite;
		            }
		        }

		        // Ausgabe der Dreieckszahlen
		        for (int n = 1; ; n++) {
		            int dreieckszahl = n * (n + 1) / 2;
		            if (dreieckszahl > max) {
		                break;
		            }
		            printDreieckszahlZentriert(n, maxBreite);
		        }
		    }

		    public static String getDreieckszahlString(int n) {
		        StringBuilder sb = new StringBuilder();
		        for (int i = 1; i <= n; i++) {
		            sb.append(i);
		            if (i < n) {
		                sb.append(" + ");
		            }
		        }
		        sb.append(" = ").append(n * (n + 1) / 2);
		        return sb.toString();
		    }

		    public static void printDreieckszahlZentriert(int n, int maxBreite) {
		        String dreieckszahlString = getDreieckszahlString(n);
		        int padding = (maxBreite - dreieckszahlString.length()) / 2;
		        String formatString = "%" + padding + "s" + dreieckszahlString;
		        System.out.println(formatString);
		   

	}

}
