/**
 * @author Caleb Wallwork
 * Class for Complex Num Demo 
 */
package assg1_wallworkc19;


public class ComplexNumDemo extends ComplexNum {
	public static void main(String[] args) {
		ComplexNum z = new ComplexNum();
		z.setReal(2.2);
		System.out.print("Real z = ");
		System.out.println(z.real);
		z.setImaginary(2.5);
		System.out.print("Imaginary z = ");
		System.out.println(z.imaginary);
		
		ComplexNum y = new ComplexNum();
		y.setReal(2.2);
		y.setImaginary(-6.9);
		System.out.print("Real y = ");
		System.out.println(y.getReal());
		System.out.print("Imaginary y = ");
		System.out.println(y.getImaginary());
		
		System.out.print("z + y = ");
		System.out.print(z.add(y));
		
		System.out.print("z - y = ");
		System.out.print(z.sub(y));
		
		System.out.print("z * y = ");
		System.out.print(z.mul(y));
		
		System.out.print("y negation = ");
		System.out.print(y.neg());
		
		System.out.print("y - y = ");
		System.out.print(y.sub(y));
		
		z.setImaginary(6.9);
		System.out.print("Imaginary z = ");
		System.out.println(y.getImaginary());
		
		System.out.print("y + z = ");
		System.out.print(y.add(z));
		
		System.out.print("(t/f) y = z? ");
		System.out.println(y.equals(z));
		
		System.out.print("(t/f) y = y? ");
		System.out.println(y.equals(y));

	}
}
