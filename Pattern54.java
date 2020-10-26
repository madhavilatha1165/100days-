package patterns4;
public class Pattern54 {
public static void main(String[] args) {
		int n=3;
		for(int i=n;i>=-n;i--)
		{
			for(int j=Math.abs(i);j<=n;j++)
				//j=3, 3 <= 3 -> t // 1 row
			    // j=4, 4 <= 3 -> f
						
			//j=2, 2 <= 3 -> t  // 2 row
			 //j=3, 3 <= 3 -> t
				System.out.print(j+" ");
			System.out.println();
		}

	}

}
