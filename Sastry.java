package prgms1;
import java.util.*;
public class Sastry {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();
	//int num=183184
	String str=Integer.toString(n)+Integer.toString(n+1);
	int num=Integer.valueOf(str);
	double sr=Math.sqrt(num);
	if((sr-Math.floor(sr))==0)
		System.out.println("Sastry number");
	else
		System.out.println("not Sastry number");

	}

}
