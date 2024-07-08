package arravs;

public class Arrays53 {

	public static void main(String[] args) {
		
		        int[] array = {4, 2, 10, 3, -5, 0, 17};

		        // Parameter für die zu tauschenden Indizes
		        int i = 3;
		        int j = 5;

		        // Ursprüngliches Feld ausgeben
		        System.out.println("Feld: " + arrayToString(array));
		        System.out.println("Parameter 1: " + i);
		        System.out.println("Parameter 2: " + j);

		        // Tausch durchführen
		        swap(array, i, j);

		        // Geändertes Feld ausgeben
		        System.out.println("neues Feld: " + arrayToString(array));
		    }

		    public static void swap(int[] a, int i, int j) {
		        int temp = a[i];
		        a[i] = a[j];
		        a[j] = temp;
		    }

		    public static String arrayToString(int[] array) {
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < array.length; i++) {
		            sb.append(array[i]);
		            if (i < array.length - 1) {
		                sb.append(" ");
		            }
		        }
		        return sb.toString();
		 
	}

}
