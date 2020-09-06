package pack1;
import java.util.Scanner;
public class File3 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter sno:");
		int sno = obj.nextInt();
		System.out.println("enter sname:");
		String sname = obj.next();
		System.out.println("enter age:");
		byte age = obj.nextByte();
		System.out.println("enter fee");
		float fee = obj.nextFloat();
		System.out.println(" sno = "+sno+"\n sname = "+sname+"\n age = "+age+"\n fee = "+fee);
		

	}

}
