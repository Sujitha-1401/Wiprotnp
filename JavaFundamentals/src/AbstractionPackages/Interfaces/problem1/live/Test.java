
	package AbstractionPackages.Interfaces.problem1.live;

	import AbstractionPackages.Interfaces.problem1.music.Playable;
	import AbstractionPackages.Interfaces.problem1.music.string.Veena;
	import AbstractionPackages.Interfaces.problem1.music.wind.Saxophone;

	public class Test {

	    public static void main(String[] args) {

	        // a. Create an instance of Veena and call play()
	        Veena veena = new Veena();
	        veena.play();

	        // b. Create an instance of Saxophone and call play()
	        Saxophone saxophone = new Saxophone();
	        saxophone.play();

	        // c. Using Playable reference
	        Playable p;

	        p = new Veena();
	        p.play();

	        p = new Saxophone();
	        p.play();
	    }
	}

