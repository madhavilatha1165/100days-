package patterns4;
public class Pattern56 {
public static void main(String[] args) {
		int n=3;
		for(int i=n;i>=-n;i--)
		{
			for(int j=Math.abs(i);j<=n;j++)
				//j=3, 3 >= 3 -> t // 1 row
			    // j=2, 2>= 3 -> f
					
				//j=3, 3 >= 3 -> t  // 2 row
				//j=2, 2 >= 3 -> t
				System.out.print((char)(j+65)+" ");
			System.out.println();
		}

	}

}
