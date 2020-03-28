package openNotepadInMydesktop;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenDesktopTextFile
{
	public static void main(String[] args) throws Exception
	{
		Desktop d = Desktop.getDesktop();
		try
		{
			d.open(new File("C:\\Users\\PUJA\\Desktop\\New folder\\java\\note.txt"));

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /IM notepad.exe");
	}

}
