package patterns3;
public class Pattern42 {
public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print("  ");
			for(int k=1;k<=x;k++)
				System.out.print((char)(k+64));
			System.out.println();
			x=x+2;
		}

	}

}
