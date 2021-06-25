import java.util.Scanner;

public class main {
	
	public static void main(String[] args)
	{
		editor mainEd = new editor();
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to MIM Editor");
	System.out.println("Press N to create a new document or X to exit");
	boolean stay = true;
	String inputter;
	while(stay == true)
	{
	inputter = input.next();
	if(inputter.charAt(0) == 'N' || inputter.charAt(0) =='n')
	{
		System.out.println("You are in the editor");
		mainEd.write();
	}
	else
	{
		System.out.println("Bye Bye!");
		break;
	}
	
	}
}
}