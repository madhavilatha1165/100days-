package patterns3;
public class Pattern44 {
	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print("  ");
			for(int k=x;k>=1;k--)
				System.out.print(Math.abs(k-i));
			System.out.println();
			x=x+2;
		}

	}

}
