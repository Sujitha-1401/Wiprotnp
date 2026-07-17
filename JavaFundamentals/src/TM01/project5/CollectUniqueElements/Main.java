package TM01.project5.CollectUniqueElements;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.TreeMap;

	public class Main {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        LinkedHashMap<String, Card> map = new LinkedHashMap<>();

	        int count = 0;

	        while (map.size() < 4) {

	            System.out.println("Enter a card :");
	            String symbol = sc.next();

	            int number = sc.nextInt();

	            count++;

	            if (!map.containsKey(symbol)) {
	                map.put(symbol, new Card(symbol, number));
	            }
	        }

	        System.out.println("Four symbols gathered in " + count + " cards.");

	        System.out.println("Cards in Set are :");
	        TreeMap<String, Card> sorted = new TreeMap<>(map);

	        for (Map.Entry<String, Card> entry : sorted.entrySet()) {
	            Card c = entry.getValue();
	            System.out.println(c.getSymbol() + " " + c.getNumber());
	        }

	        sc.close();
	    }
	}

