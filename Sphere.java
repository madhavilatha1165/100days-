package Formulas;
import java.util.*;
public class Sphere {

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter radius:");
		int r = obj.nextInt();
		double v = (4.0/3.0)*3.14*(r*r*r);
		System.out.println("volume of sphere ="+v);

	}

}
