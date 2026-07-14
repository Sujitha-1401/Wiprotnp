package AbstractionPackages.Packages.problem2;

public class Compartment {
	
	    private int height;
	    private int width;
	    private int breadth;

	    public Compartment(int height, int width, int breadth) {
	        this.height = height;
	        this.width = width;
	        this.breadth = breadth;
	    }

	    public int getHeight() {
	        return height;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public int getBreadth() {
	        return breadth;
	    }

	    @Override
	    public String toString() {
	        return "Height = " + height +
	               ", Width = " + width +
	               ", Breadth = " + breadth;
	    }
	}

