package verschachtelungen61;

public class Passwörtern62 {

	public static void main(String[] args) {

		
		        String[] passwoerter = {"Pass1234", "123456", "Password", "StrongPass1", "weak", "Test123"};

		        for (String passwort : passwoerter) {
		            if (isStrong(passwort)) {
		                System.out.println(passwort + " ist stark");
		            } else {
		                System.out.println(passwort + " ist schwach");
		            }
		        }
		    }

		    public static boolean isStrong(String password) {
		        if (password.length() < 8) {
		            return false;
		        }

		        boolean hasLetter = false;
		        boolean hasDigit = false;

		        for (int i = 0; i < password.length(); i++) {
		            char ch = password.charAt(i);
		            if (Character.isLetter(ch)) {
		                hasLetter = true;
		            } else if (Character.isDigit(ch)) {
		                hasDigit = true;
		            }

		            // Falls beides gefunden wurde, kann die Schleife abgebrochen werden
		            if (hasLetter && hasDigit) {
		                return true;
		            }
		        }

		        return false;
		  
	}

}
