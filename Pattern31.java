package patterns3;
public class Pattern31 {
public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)//5 rows
		{
			for(int j=n-1;j>=i;j--)//j=4 >= 3
				System.out.print(" ");//0,1,2 -> spaces
			for(int k=1;k<=i;k++)//k=1 <= 3 ->t
				System.out.print(k);
			System.out.println();
		}

	}

}
