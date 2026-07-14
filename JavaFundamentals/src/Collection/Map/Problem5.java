
	package Collection.Map;

	import java.util.*;

	public class Problem5{

	    TreeMap<String, String> M1 = new TreeMap<>();

	    public TreeMap<String, String> saveCountryCapital(String country, String capital) {
	        M1.put(country, capital);
	        return M1;
	    }

	    public String getCapital(String country) {
	        return M1.get(country);
	    }

	    public String getCountry(String capital) {

	        for (Map.Entry<String, String> e : M1.entrySet()) {
	            if (e.getValue().equals(capital))
	                return e.getKey();
	        }

	        return null;
	    }

	    public TreeMap<String, String> swapKeyValue() {

	        TreeMap<String, String> M2 = new TreeMap<>();

	        for (Map.Entry<String, String> e : M1.entrySet()) {
	            M2.put(e.getValue(), e.getKey());
	        }

	        return M2;
	    }

	    public ArrayList<String> toArrayList() {
	        return new ArrayList<>(M1.keySet());
	    }

	    public static void main(String[] args) {

	        Problem5 obj = new Problem5();

	        obj.saveCountryCapital("India", "Delhi");
	        obj.saveCountryCapital("Japan", "Tokyo");

	        System.out.println(obj.getCapital("India"));
	        System.out.println(obj.getCountry("Tokyo"));
	        System.out.println(obj.swapKeyValue());
	        System.out.println(obj.toArrayList());
	    }
	}

