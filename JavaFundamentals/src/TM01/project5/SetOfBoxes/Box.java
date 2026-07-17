
	package TM01.project5.SetOfBoxes;

	public class Box {

	    private Double length;
	    private Double width;
	    private Double height;

	    public Box(Double length, Double width, Double height) {
	        this.length = length;
	        this.width = width;
	        this.height = height;
	    }

	    public Double getLength() {
	        return length;
	    }

	    public Double getWidth() {
	        return width;
	    }

	    public Double getHeight() {
	        return height;
	    }

	    public Double getVolume() {
	        return length * width * height;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;

	        if (!(obj instanceof Box))
	            return false;

	        Box b = (Box) obj;

	        return Double.compare(this.getVolume(), b.getVolume()) == 0;
	    }

	    @Override
	    public int hashCode() {
	        return Double.valueOf(getVolume()).hashCode();
	    }
	}

