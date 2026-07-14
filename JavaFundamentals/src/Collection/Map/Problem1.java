
	package Collection.Map;

	import java.util.*;

	public class Problem1 {

	    HashMap<String, String> M1 = new HashMap<>();

	    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
	        M1.put(countryName, capital);
	        return M1;
	    }

	    public String getCapital(String countryName) {
	        return M1.get(countryName);
	    }

	    public String getCountry(String capitalName) {
	        for (Map.Entry<String, String> entry : M1.entrySet()) {
	            if (entry.getValue().equals(capitalName)) {
	                return entry.getKey();
	            }
	        }
	        return null;
	    }

	    public HashMap<String, String> swapKeyValue() {
	        HashMap<String, String> M2 = new HashMap<>();

	        for (Map.Entry<String, String> entry : M1.entrySet()) {
	            M2.put(entry.getValue(), entry.getKey());
	        }

	        return M2;
	    }

	    public ArrayList<String> toArrayList() {
	        return new ArrayList<>(M1.keySet());
	    }

	    public static void main(String[] args) {

	        Problem1 obj = new Problem1();

	        obj.saveCountryCapital("India", "Delhi");
	        obj.saveCountryCapital("Japan", "Tokyo");

	        System.out.println(obj.getCapital("India"));
	        System.out.println(obj.getCountry("Tokyo"));
	        System.out.println(obj.swapKeyValue());
	        System.out.println(obj.toArrayList());
	    }
	}

