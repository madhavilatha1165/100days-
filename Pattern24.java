package patterns2;
public class Pattern24 {
public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print(" ");//j=4 >=2
			for(int k=1;k<=i;k++)//k=1 <= 2 ->t
				System.out.print("*");//1,2,3,4,5 -> *
			System.out.println();
		}

	}

}
