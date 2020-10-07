package patterns2;
public class Pattern16 {
public static void main(String[] args) {
		for(int i=1;i<=5;i++)//5 rows
		{
			for(int j=5;j>=i;j--)//5 cols
			{
				System.out.print(i);//1 1 1 1 1
			}
			System.out.println();
		}

	}

}
