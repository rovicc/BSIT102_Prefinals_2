import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) throws Exception{
			
			System.out.println("Enter the file name :");
			Scanner sc = new Scanner(System.in);
			
			File file = new File(sc.nextLine() + ".jgh");
			sc = new Scanner(file);
			
			String newline = sc.nextLine();
			System.out.println(newline);
			
		
			
			
			
		}
}
