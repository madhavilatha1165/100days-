package prgms4;
import java.util.*;
public class Trapezium {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 2 sides:");
		int a = obj.nextInt();
		int b = obj.nextInt();
		System.out.println("enter height:");
		int h = obj.nextInt();
		double area = (a+b)*(h)/2.0;
		System.out.println("area og Tripezium="+area);

	}

}
