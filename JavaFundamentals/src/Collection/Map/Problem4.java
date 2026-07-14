
	package Collection.Map;
	import java.util.*;

	public class Problem4 {

	    HashMap<String, Integer> contacts = new HashMap<>();

	    public void addContact(String name, Integer number) {
	        contacts.put(name, number);
	    }

	    public boolean containsName(String name) {
	        return contacts.containsKey(name);
	    }

	    public boolean containsNumber(Integer number) {
	        return contacts.containsValue(number);
	    }

	    public void display() {

	        Iterator<Map.Entry<String, Integer>> itr =
	                contacts.entrySet().iterator();

	        while (itr.hasNext()) {
	            Map.Entry<String, Integer> entry = itr.next();
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {

	        Problem4 obj = new Problem4();

	        obj.addContact("Rahul", 987654321);
	        obj.addContact("Amit", 987654322);
	        obj.addContact("John", 987654323);

	        System.out.println(obj.containsName("Rahul"));
	        System.out.println(obj.containsNumber(987654322));

	        obj.display();
	    }
	}

