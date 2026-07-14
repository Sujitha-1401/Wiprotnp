
	package AbstractionPackages.ExceptionHandling.problem4;
	import java.util.Scanner;

	public class UserRegistration {

	    public void registerUser(String userName, String userCountry)
	            throws InvalidCountryException {

	        if (!userCountry.equalsIgnoreCase("India")) {
	            throw new InvalidCountryException(
	                    "User Outside India cannot be registered");
	        }

	        System.out.println("User registration done successfully");
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter User Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Country: ");
	        String country = sc.nextLine();

	        UserRegistration user = new UserRegistration();

	        try {

	            user.registerUser(name, country);

	        } catch (InvalidCountryException e) {

	            System.out.println(e.getMessage());

	        }

	        sc.close();
	    }
	}

