import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead
{	
	public static void main(String args[])
	{
		try
		{
			File fc=new File("E:\\Technical\\Java\\Java_Spring.txt");
			Scanner sc=new Scanner(fc);
			String str;
			while(sc.hasNextLine())
			{
				str=sc.nextLine();
				System.out.println(str);
			}
			fc.close();
		}
		catch(FileNotFoundException fe)
		{
			System.out.println(fe.getMessage());
		}
		
	}
}
