package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction add(Fraction f2)
	{
		int d3 = this.denominator * f2.denominator;
		int n3 = this.numerator*f2.denominator + f2.numerator*this.denominator;
		
		Fraction f3 = new Fraction(n3, d3);
		return f3;
	}
	
	public Fraction multiply(Fraction f2)
	{
		int d3 = this.denominator * f2.denominator;
		int n3 = this.numerator * f2.numerator;
		
		Fraction f3 = new Fraction(n3, d3);
		return f3;
	}
	
	public Fraction reciprocal()
	{
		Fraction f3 = new Fraction(this.denominator, this.numerator);
		return f3;
	}
	
	public Fraction simplify()
	{
		int d3 = this.denominator;
		int n3 = this.numerator;
		
		for (int i = 1; i <= this.denominator; i++)
		{
			if (d3%i == 0 && n3%i == 0)
			{
				d3 = d3/i;
				n3 = n3/i;
			}
		}
		Fraction f3 = new Fraction(n3,d3);
		return f3;
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(5,10);
		Fraction f2 = f1.simplify();
		System.out.println(f2.numerator);
		System.out.println(f2.denominator);

	}

}
