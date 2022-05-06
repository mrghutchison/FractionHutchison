
public class Fraction {
	private int numerator;
	private int denom;
	private boolean isReduced;
	
	Fraction(int n, int d) throws Exception{
		if (d==0) {
			throw new Exception("Denominator can't be zero");
		}
		
		numerator = n;
		denom = d;
		isReduced = false;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denom;
	}
	
	/**
	 * 
	 * @param b
	 * @return
	 * @throws Exception
	 */
	public Fraction add(Fraction b) throws Exception {
		//TODO
		return new Fraction (1,2);
	}
	
	/**
	 * Multiplies 2 fractions and returns a new fraction
	 * @param b fraction
	 * @return a new fraction that is the product of 2 fractions
	 * @throws Exception
	 */
	public Fraction multiply(Fraction b) throws Exception {
		//TODO
		return new Fraction (1,2);
	}
	
	public void reduce() {
		int gcdValue = gcd(numerator, denom);
		numerator = numerator/gcdValue;
		denom = denom/gcdValue;
	}
	
	private void setReducedStatus() {
		if (gcd(numerator,denom)==1) {
			isReduced = true;
		}
		else {
			isReduced = false;
		}
	}
	
	public boolean isReduced() {
		setReducedStatus();
		return isReduced;
	}
	
	private int gcd (int a, int b) {
		// TODO
		// Algorithm
		// https://www.freecodecamp.org/news/euclidian-gcd-algorithm-greatest-common-divisor/
		if (b == 0) {
	        return a;
	    }
	    return gcd(b, a % b); 
		
		
	}
	
	@Override
	public String toString() {
		String out = String.format("%d\n---\n%d\n", numerator, denom);
		return out;
	}
	
}
