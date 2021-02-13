import java.util.*;
public class Input{
	
	private Scanner console = new Scanner(System.in);
	/*int
	  double 
	  char
	  String
	*/
	

	public int iInput(String text){

		System.out.println(text);
		return console.nextInt();
	}

	public double dInput(String text){

		System.out.println(text);
		return console.nextDouble();
	}

	public char cInput(String text){

		System.out.println(text);
		return console.next().charAt(0);
	}

	public String sInput(String text){

		System.out.println(text);
		return console.next();
	}
}
