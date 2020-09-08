package pack1;
import java.io.*;
public class Files1 {

	public static void main(String[] args) {
		int c = 0;
		File f = new  File("D:\\");
		String[] s = f.list();
		//enhanced for loop
		for(String s1 : s)
		{
			System.out.println(s1);
			c++;
		}
        System.out.println("total = "+c);
	}

}
