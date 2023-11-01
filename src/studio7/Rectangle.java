package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perimeter = 2*length + 2*width;
	}
	
	public int getArea() {
		return this.length * this.width; 
	}
	
	public boolean smallerThan(Rectangle r1)
	{
		if (this.area < r1.area)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isSquare()
	{
		if (this.width == this.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(7, 5);
		System.out.println(r1.width);
		System.out.println(r1.isSquare());
		Rectangle r2 = new Rectangle(2, 2);
		System.out.println(r1.smallerThan(r2));

	}

}