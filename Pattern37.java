package patterns3;
public class Pattern37 {
public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--) //j=4..1
				System.out.print("  "); // 4 spaces
			for(int k=1;k<=x;k++)//k=1,3,5,7,9
				System.out.print(x); //1...
			System.out.println();
			x=x+2;
			//x=3,5,7,9
		}

	}

}
