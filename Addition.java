package string_prgms;

public class Addition {
		void sum(int a,int b)
		{
			int s=a+b;
			System.out.println("sum of two numbers:"+s);
		}
		void sum(int a,int b,int c)
		{
			int t=a+b+c;
			System.out.println("sum of three numbers:"+t);
		}
	public static void main(String[] args) {
		Addition a= new Addition();
		a.sum(10, 30);
		a.sum(50, 100,150);

	}

}
