package pack1;
abstract class Transport
{
	void Color()
	{
		System.out.println("red");
	}
	abstract int Wheels();
}
class Car extends Transport
{
	int Wheels()
	{
		return 4;
	}
}
class Byke extends Transport
{
	int Wheels()
	{
		return 2;
	}
}


public class Abstractclass {

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.Color();
		System.out.println("Car has " + obj1.Wheels()+ " wheels");

		Byke obj2 = new Byke();
		obj2.Color();
		System.out.println("byke has " + obj2.Wheels()+ " wheels");


	}

}
