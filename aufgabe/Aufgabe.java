package aufgabe;

public class Aufgabe {

	public static void main(String[] args) {
		 int x, y; 
	        boolean result;

	        // Ausdruck (a)
	        x = 5; y = 3;
	        result = (y < 6) || (x > 7);
	        System.out.println( result);

	        // Ausdruck (b)
	        x = 4; y = 3;
	        result = (x == 4) ^ (3 == y);
	        System.out.println( result);

	        // Ausdruck (c)
	        x = 5; y = 3;
	        result = (y > 2) && (x > 6);
	        System.out.println( result);

	        // Ausdruck (d)
	        x = 11; y = 1;
	        result = (x + y < 20) && (y < 2);
	        System.out.println(result);

	        // Ausdruck (e)
	        result = (4 < 6) && (4 > 6);
	        System.out.println(result);

	        // Ausdruck (f)
	        x = 5; y = 4;
	        result = (x + y >= 10) || (x > 8);
	        System.out.println(result);

	        // Ausdruck (g)
	        x = 2; y = 2;
	        result = (x <= 3) ^ (y != 1);
	        System.out.println( result);

	        // Ausdruck (h)
	        x = 4; y = 2;
	        result = (y > 1) && (x <= 5);
	        System.out.println( result);

	        // Ausdruck (i)
	        x = 3; y = 4;
	        result = (x * y <= 10) && (y > 1);
	        System.out.println( result);

	        // Ausdruck (j)
	        x = 3; y = 2;
	        result = (5 < 2 * y) && (x + y > 7);
	        System.out.println( result);






		 
	}

}
