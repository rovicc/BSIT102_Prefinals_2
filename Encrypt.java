import java.util.ArrayList;
import java.util.Scanner;
import java.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;


public class Encrypt {
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		
		String input = "";
		
		do
		{
			input = sc.nextLine();
			words.add(input);
		}
		while (!input.equals(":q"));
		{
		
			for(String s : words)
			{
				String encrypt = Base64.getEncoder() .encodeToString(s.getBytes());
				System.out.println ("Do you want Save or Discard?");
				String choose = sc.nextLine();
				
				if(choose.equals("Save"))
				{
					FileWriter fw = new FileWriter( encrypt+".jgh");
					System.out.println("Input File name:");
					fw.write(sc.nextLine());
					break;
				}	
				else
				{
					System.out.println("Thank you for your using this program");
				}
			}
			
		
				
		}
		
		
	}
}
