
	package Collection.Set;

	import java.util.TreeSet;

	public class Problem4 {

	    TreeSet<String> H1 = new TreeSet<>();

	    public TreeSet<String> saveCountryNames(String countryName) {
	        H1.add(countryName);
	        return H1;
	    }

	    public String getCountry(String countryName) {

	        for (String country : H1) {
	            if (country.equalsIgnoreCase(countryName))
	                return country;
	        }

	        return null;
	    }

	    public static void main(String[] args) {

	        Problem4 obj = new Problem4();

	        obj.saveCountryNames("India");
	        obj.saveCountryNames("USA");
	        obj.saveCountryNames("Japan");
	        obj.saveCountryNames("Australia");

	        System.out.println(obj.getCountry("Japan"));
	        System.out.println(obj.getCountry("Canada"));
	    }
	}

