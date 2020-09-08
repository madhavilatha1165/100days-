package pack1;
import java.io.*;
public class Files4 {

	public static void main(String[] args)throws Exception 
	{
		File f = new File("e:\\File1.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[50];
		fr.read(ch);
		for (char c1:ch)
		{
			System.out.println(c1);
		}
	}
}