package Oops_Inheritance.Encapsulation.Problem1;



	public class TestBook {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Author author = new Author("James Gosling","james@gmail.com",'M');
	        Book book = new Book("Java Programming",author,699.50,25);

	        System.out.println("Book Name : " + book.getName());
	        System.out.println("Price : " + book.getPrice());
	        System.out.println("Quantity : " + book.getQtyInStock());

	        System.out.println("\nAuthor Details");
	        System.out.println("Name : " + book.getAuthor().getName());
	        System.out.println("Email : " + book.getAuthor().getEmail());
	        System.out.println("Gender : " + book.getAuthor().getGender());

		}

	}

