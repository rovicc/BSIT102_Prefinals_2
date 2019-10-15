import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) throws Exception{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the file name :");
			//gets the file that the user wants to decrypt
			File file = new File(sc.nextLine() + ".jgh");
			sc = new Scanner(file);
		
			//creates new lines
			String newline = sc.nextLine();
			System.out.println(newline);
			
		
			
			
			
		}
}
