package patterns4;
public class Pattern52 {
public static void main(String[] args) {
		int n=3;
		for(int i=n;i>=-n;i--)
		{
			for(int j=n;j>=Math.abs(i);j--)
				//j=3, 3 >= 3 -> t // 1 row
			    // j=2, 2>= 3 -> f
				
				//j=3, 3 >= 2 -> t  // 2 row
				//j=3, 2 >= 2 -> t
				System.out.print("*");
			System.out.println();
		}

	}

}
