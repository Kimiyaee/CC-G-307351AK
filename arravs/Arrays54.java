package arravs;
import java.util.Arrays;

public class Arrays54 {

	public static void main(String[] args) {

		        int[] arr = {3, 4, 1, 9, -5, 4};
		        int valueToDelete = 9;

		        // Ursprüngliches Feld ausgeben
		        System.out.println("Feld: " + Arrays.toString(arr));
		        System.out.println("Das zu löschende Element ist: " + valueToDelete);

		        // Element löschen
		        int[] newArray = deleteArrayElement(arr, valueToDelete);

		        // Geändertes Feld ausgeben
		        System.out.println("neues Feld: " + Arrays.toString(newArray));
		    }

		    public static int[] deleteArrayElement(int[] a, int w) {
		        // Nach dem Element suchen
		        int index = -1;
		        for (int i = 0; i < a.length; i++) {
		            if (a[i] == w) {
		                index = i;
		                break;
		            }
		        }

		        // Element nicht gefunden, ursprüngliches Array zurückgeben
		        if (index == -1) {
		            return a;
		        }

		        // Neues Array erstellen, das um ein Element kleiner ist
		        int[] newArray = new int[a.length - 1];

		        // Elemente kopieren, dabei das zu löschende Element überspringen
		        System.arraycopy(a, 0, newArray, 0, index);
		        System.arraycopy(a, index + 1, newArray, index, a.length - index - 1);

		        return newArray;
		   
	}

}
