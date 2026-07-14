
	package Collection.Set;
	import java.util.HashSet;
	import java.util.Iterator;

	public class Problem1 {

	    HashSet<String> H1 = new HashSet<>();

	    public HashSet<String> saveCountryNames(String countryName) {
	        H1.add(countryName);
	        return H1;
	    }

	    public String getCountry(String countryName) {
	        Iterator<String> itr = H1.iterator();

	        while (itr.hasNext()) {
	            String country = itr.next();
	            if (country.equalsIgnoreCase(countryName)) {
	                return country;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {

	        Problem1 c = new Problem1();

	        c.saveCountryNames("India");
	        c.saveCountryNames("USA");
	        c.saveCountryNames("Japan");
	        c.saveCountryNames("Australia");

	        System.out.println(c.getCountry("India"));
	        System.out.println(c.getCountry("Canada"));
	    }
	}

