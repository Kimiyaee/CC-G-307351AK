package arravs;
import java.util.Arrays;

public class Arrays512 {

	public static void main(String[] args) {


	
		        // Array 1: Enthält nur gerade (zufällige) Zahlen
		        int[] array1 = new int[20];
		        for (int i = 0; i < array1.length; i++) {
		            array1[i] = (int)(Math.random() * 100) * 2;
		        }

		        // Array 2: Enthält ganze (zufällige) Zahlen, die aufwärts sortiert sind
		        int[] array2 = new int[20];
		        for (int i = 0; i < array2.length; i++) {
		            array2[i] = (int)(Math.random() * 100);
		        }
		        Arrays.sort(array2);

		        // Arrays ausgeben
		        System.out.println("Array 1 (nur gerade Zahlen): " + Arrays.toString(array1));
		        System.out.println("Array 2 (aufsteigend sortiert): " + Arrays.toString(array2));
	
		
	}

}
