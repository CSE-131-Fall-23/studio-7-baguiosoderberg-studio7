package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double r, double i) {
		real = r;
		imaginary = i;
	}
	
	public Complex add(Complex c) {
		double r = this.real + c.real;
		double i = this.imaginary + c.imaginary;
		
		Complex sum = new Complex(r, i);
		
		return sum;
		
	}
	
	public Complex multiply(Complex c) {
		double r = this.real*c.real - this.imaginary*c.imaginary;
		double i = this.real*c.imaginary + this.imaginary*c.real;
		
		Complex product = new Complex(r, i);
		
		return product;
	}
	
	
	public static void main(String[] args) {
		Complex c = new Complex(2, 5);
		Complex d = new Complex(3, 3);
		Complex sum = c.add(d);
		Complex product = c.multiply(d);
		System.out.println(sum.real + ", " + sum.imaginary + "i");
		System.out.println(product.real + ", " + product.imaginary + "i ");

	}

}
