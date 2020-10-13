package patterns2;
public class Pattern27 {
public static void main(String[] args) {
		for(int i='A';i<='E';i++)
		{
			for(int j='E'-1;j>=i;j--)
				System.out.print(" ");
			for(int k='A';k<=i;k++)
				System.out.print((char)i);
			System.out.println();
		}

	}

}
