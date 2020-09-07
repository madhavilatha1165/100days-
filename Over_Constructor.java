package pack1;
class Bank
{
	String name;
	int acc_no;
	Bank()
	{
		name = "madhavi";
		acc_no = 65;
	}
	Bank(String name)
	{
		this.name = name;
		acc_no = 11;
	}
	Bank(String name,int acc_no)
	{
		this.name = name;
		this.acc_no = acc_no;
	}
	void showBank()
	{
		System.out.println("name = "+name+"\nacc_no ="+acc_no);
	}
}

public class Over_Constructor {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		  b1.showBank();
		  Bank b2 = new Bank("manikanta");
		  b2.showBank();
		  Bank b3 = new Bank("madhavi",56);
		  b3.showBank();
		

	}

}
