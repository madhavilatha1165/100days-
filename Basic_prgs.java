package pack1;
import java.util.*;
public class Basic_prgs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f,c;
		System.out.println("enter farenheit temperature:");
		f = sc.nextFloat();
		c = ((f-32)*5)/9;
		System.out.println("Celsius ="+c);

	}

}
