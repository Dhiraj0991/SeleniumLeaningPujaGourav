package openNotepadInMydesktop;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OpenDesktopTextFile
{
	public static void main(String[] args) throws Exception
	{
		Desktop d = Desktop.getDesktop();
		try
		{
			d.open(new File("C:\\Users\\PUJA\\Desktop\\New folder\\java\\language.txt"));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\PUJA\\Desktop\\New folder\\java\\language.txt", true)));
			out.println("Selenium");
			out.flush();
			out.close();
		} 
		catch (IOException e)
		{
			// e.printStackTrace();
			System.out.println(e);
		}
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /IM notepad.exe");
	}

}
