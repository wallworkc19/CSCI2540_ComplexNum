/**
 * @author Caleb Wallwork
 * Class for Complex Num 
 */
package assg1_wallworkc19;


public class ComplexNum {
	double real;
	double imaginary;
	
	/**
	 * Default constructor
	 */
	public ComplexNum() {
		real = 0.0;
		imaginary = 0.0;
	}
	
	/**
	 * Constructor with given real
	 * @param r is the given real
	 */
	public ComplexNum(double r) {
		real = r;
		imaginary = 0;
	}
	
	/**
	 * Constructor with given real and imaginary
	 * @param r is the given real
	 * @param i is the given imaginary
	 */
	public ComplexNum(double r, double i) {
		real = r;
		imaginary = i;
	}
	
	/**
	 * Retrieves the real
	 * @return the real
	 */
	public double getReal(){
		return real;
	}
	
	/**
	 * Retrieves the imaginary
	 * @return the imaginary
	 */
	public double getImaginary(){
		return imaginary;
	}
	
	/**
	 * Modifies the real
	 * @param nReal The  new real
	 */
	public void setReal(double nReal) {
		real = nReal;
	}
	
	/**
	 * Modifies the imaginary
	 * @param nImaginary The  new imaginary
	 */
	public void setImaginary(double nImaginary) {
		imaginary = nImaginary;
	}
	
	/**
	 * Computes the addition of two ComplexNum objects
	 * @param n ComplexNum object added
	 * @return the addition of two ComplexNum objects
	 */
	public ComplexNum add(ComplexNum n) {
		ComplexNum x = new ComplexNum();
		x.real = real + n.real;
		x.imaginary = imaginary + n.imaginary;
		return x;
	}
	
	/**
	 * Computes the subtraction of two ComplexNum objects
	 * @param n ComplexNum object subtracted 
	 * @return the subtraction of two ComplexNum objects
	 */
	public ComplexNum sub(ComplexNum n) {
		ComplexNum x = new ComplexNum();
		x.real = real - n.real;
		x.imaginary = imaginary - n.imaginary;
		return x;
	}
	
	/**
	 * Computes the multiplication of two ComplexNum objects
	 * @param n ComplexNum object to be multiplied 
	 * @return the multiplication of two ComplexNum objects
	 */
	public ComplexNum mul(ComplexNum n) {
		ComplexNum x = new ComplexNum();
		x.real = real * n.real - imaginary * n.imaginary;
		x.imaginary = real * n.real + imaginary * n.imaginary;
		return x;
	}
	
	/**
	 * Computes the negation of the ComplexNum object
	 * @return the negation of the ComplexNum object
	 */
	public ComplexNum neg() {
		ComplexNum x = new ComplexNum();
		x.imaginary = imaginary * -1;
		x.real = real * -1;
		return x;
	}
	
	/** 
	 * Return the string with complex number
	 * @return The string with complex number 
	 */
	@Override
	public String toString() {
		String s;
		if(real != 0 & imaginary > 0) {
			s = real + "+" + imaginary + "i\n";
		}
		else if (real != 0 & imaginary < 0) {
			s = real + "-" + imaginary * -1 + "i\n";
		}
		else if(real == 0 & imaginary != 0) {
			s = imaginary + "i\n";
		}
		else if(real != 0 & imaginary == 0) {
			s = real + "\n";
		}
		else {
			s = "0\n";
		}
	
		return s;
	}
	
	/** 
	 * Compare this ComplexNum with another object.
	 * @param a The object to compare
	 * @return Return true if this ComplexNum has the same real and imaginary
	  as the other. Otherwise return false.
	 */
	public boolean equals(ComplexNum a) {
		if(a.imaginary == imaginary & a.real == real) {
			return true;
		}
		else {
				return false;
		}
	}
}