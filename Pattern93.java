package patterns6;

public class Pattern93 {

	public static void main(String[] args) {
		int n=7;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=x||j>=n-x+1)
					//for 1 row		// 1 <= 1 || 1 >= 7 ->t
					// 7 <= 1 || 7 >= 7 -> t	
					
			// for 2 row		// 1 <= 2 || 1 >= 6 ->t 
					// 2 <= 2 || 2 >= 6 ->t
					// 6 <= 2 || 6 >= 6 -> t
					// 7 <= 2 || 7 >= 6 -> t
					System.out.print("*");
				//1..7
				//1,2..6,7
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2)
				x=x+1;
			else
				x=x-1;
		}

	}

}
