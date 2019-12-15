package tema;

public class Triangle extends Shape {

	public Triangle() {
		super();
	}

	public Triangle(String text, String material) {
		super(text, material);
	}
	
	private int base;
	private int height;
	
	public Triangle (int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(String text, String material, int base, int height) {
		this(text, material);
		this.base = base;
		this.height = height;
	}
	
	public void displayTriangleHeight() {
		System.out.println("The triangle height is: " + this.height);
	}
	
	@Override
	public int getSize() {
		int size = (this.base * this.height) / 2;
		return size;
	}
	
	@Override
	public String toString() {
		return "Triangle: height is " + this.height + ", base is: " + this.base + ", " + super.toString(); 
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
		
		Triangle triangleObj = (Triangle) obj;
		if(super.equals(triangleObj) && this.base == triangleObj.base && this.height == triangleObj.height) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result = super.hashCode();
		
		result = prime * result + this.base;
		result = prime * result + this.height;
		
		return result;
	}
}
