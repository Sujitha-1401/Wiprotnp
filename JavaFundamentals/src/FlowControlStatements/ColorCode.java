package FlowControlStatements;

public class ColorCode {
	

	

	    public static void main(String[] args) {

	        if (args.length == 0) {
	            System.out.println("Please enter a color code");
	            return;
	        }

	        char color = Character.toUpperCase(args[0].charAt(0));

	        switch (color) {
	            case 'R':
	                System.out.println("Red");
	                break;

	            case 'B':
	                System.out.println("Blue");
	                break;

	            case 'G':
	                System.out.println("Green");
	                break;

	            case 'O':
	                System.out.println("Orange");
	                break;

	            case 'Y':
	                System.out.println("Yellow");
	                break;

	            case 'W':
	                System.out.println("White");
	                break;

	            default:
	                System.out.println("Invalid Code");
	        }
	    }
	}


