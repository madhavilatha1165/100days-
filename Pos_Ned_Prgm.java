package pack1;
import java.util.*;
public class Pos_Ned_Prgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n; i++)
		{
			a[i]=sc.nextInt();
		}
        for(int i = 0;i < n; i++)
        {
        	if(a[i] > 0)
        		System.out.println(a[i]+"is Positive");
        	else
        		System.out.println(a[i]+"is Negative");
        }
	}

}
