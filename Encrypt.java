import java.util.ArrayList;
import java.util.Scanner;
import java.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;


public class Encrypt {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();//creates an arraylist
		
		String input = "";
		
		do
		{
			input = sc.nextLine();//read line
			words.add(input);//add input to array
		}
		while (!input.equals(":q"));//while the input is not equals to ":q" loop will continue
		{
		
			for(String s : words)//gets the words in the arraylist
			{
				String encrypt = Base64.getEncoder() .encodeToString(s.getBytes());//encrypt words into base64
				System.out.println ("Do you want Save or Discard?");
				String choose = sc.nextLine();//read line
				
				if(choose.equals("Save"))//if choose is equals to "Save"
				{
					FileWriter fw = new FileWriter( encrypt+".jgh");//write a new file
					System.out.println("Input File name:");
					fw.write(sc.nextLine());//input file name
					break;//to stop the if statement
				}	
				else
				{
					System.out.println("Thank you for your using this program");
				}
			}
			
		
				
		}
		
		
	}
}
