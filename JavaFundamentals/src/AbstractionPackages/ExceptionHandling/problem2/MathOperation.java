
	package AbstractionPackages.ExceptionHandling.problem2;
	public class MathOperation {

	    public static void main(String[] args) {

	        try {

	            if (args.length != 5) {
	                throw new IllegalArgumentException("Please enter exactly 5 integers.");
	            }

	            int sum = 0;

	            for (String arg : args) {
	                sum += Integer.parseInt(arg);
	            }

	            double average = (double) sum / 5;

	            System.out.println("Sum = " + sum);
	            System.out.println("Average = " + average);

	        } catch (NumberFormatException e) {

	            System.out.println("NumberFormatException");

	        } catch (ArithmeticException e) {

	            System.out.println("ArithmeticException");

	        } catch (IllegalArgumentException e) {

	            System.out.println(e.getMessage());

	        }
	    }
	}

