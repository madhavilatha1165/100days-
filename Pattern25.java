package patterns2;
public class Pattern25 {
public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)// 5 rows
		{
			for(int j=n-1;j>=i;j--)// j=4 >= 2
				System.out.print(" ");//4,3,2,1,0 -> space 
			for(int k=1;k<=i;k++)// repeating
				System.out.print(i);//1,2,3,4,5 -> *
			System.out.println();
		}

	}

}
