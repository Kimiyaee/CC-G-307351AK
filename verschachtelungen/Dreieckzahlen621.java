package verschachtelungen;

public class Dreieckzahlen621 {


		    public static void main(String[] args) {
		        int max = 15; // Maximale Grenze

		        for (int n = 1; ; n++) {
		            int dreieckszahl = n * (n + 1) / 2;
		            if (dreieckszahl > max) {
		                break;
		            }

		            printDreieckszahl(n);
		        }
		    }

		    public static void printDreieckszahl(int n) {
		        int summe = 0;
		        StringBuilder sb = new StringBuilder();

		        for (int i = 1; i <= n; i++) {
		            summe += i;
		            sb.append(i);

		            if (i < n) {
		                sb.append(" + ");
		            }
		        }

		        sb.append(" = ").append(summe);
		        System.out.println(sb.toString());
		 
	}

}
