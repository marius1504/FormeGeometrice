package tema;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
	}

	public Rectangle(String text, String material) {
		super(text, material);
	}

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String text, String material, int width, int height) {
		this(text, material);
		this.width = width;
		this.height = height;
	}
	
	public void displayRectangleHeight() {
		System.out.println("The rectangle height is: " + this.height);
	}
	
	@Override
	public int getSize() {
		int size = this.width * this.height;
		return size;
	}
	
	@Override
	public String toString() {
		return "Triangle: height is " + this.height + ", width is: " + this.width + ", " + super.toString(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Rectangle rectangleObj = (Rectangle) obj;
		if(super.equals(rectangleObj) && 
				this.height == rectangleObj.height && 
				this.width == rectangleObj.width) {
			return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = super.hashCode();
		
		result = prime * result + this.height;
		result = prime * result + this.width;
		
		return result;
	}
}
