package pack1;
import java.io.*;
public class Files2 {

	public static void main(String[] args)throws Exception
	{
	   int c = 0;
	   File f = new File("C:\\");
	   //f var holds id of d:\\ drive
	   String[] s = f.list();
	   //enhanced for loop
	   for(String s1 : s)
	   {
		File f2 = new File(f,s1);
		if(f2.isFile())
		{
			System.out.println(s1);
			c++;
		}
	   }
       System.out.println("total files ="+c);
	}

}
