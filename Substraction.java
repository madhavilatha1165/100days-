package string_prgms;

public class Substraction {
		void sub(int a,int b)
		{
			int s=a-b;
			System.out.println("sub of two numbers:"+s);
		}
		void sub(int a,int b,int c)
		{
			int t=a-b-c;
			System.out.println("sub of three numbers:"+t);
		}
	public static void main(String[] args) {
		Substraction a= new Substraction();
		a.sub(10, 30);
		a.sub(50, 100,150);

	}

}
