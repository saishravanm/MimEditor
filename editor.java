import java.util.Scanner;
import java.util.*;
public class editor {

String[] lines;	
public void write()
{
	boolean keepWriting = true;
	Scanner input = new Scanner(System.in);
	int lineNumber = 1;
	while(keepWriting == true)
	{
		String inputter = input.nextLine();
		if(inputter.length() == 100)
		{
			lines[lineNumber] = inputter;
			lineNumber++;
		}
	}
}
}
