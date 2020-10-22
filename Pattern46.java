package patterns3;
public class Pattern46 {
public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print("  ");
			for(int k=i-1;k>=-(i-1);k--)
				// k =1-1 =0; 0 >= 0 ; // 1 row
				 //2 row
				 // k=2-1= 1; 1 >= -(2-1)= -1
				 // k=0; 0 >= -1; k--
				 // k=-1; -1 >= -1; k--
				System.out.print(i-Math.abs(k));
			// 1-0= 1	 		-> 1 row 
			//2- 1= 1, 	2-0 =2,  2-1=1		 -> 2 row
			System.out.println();
		}

	}

}
