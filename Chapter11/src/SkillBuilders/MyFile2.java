package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 
{

	public static void main(String[] args) 
	{
		File textFile;
		String response;
		Scanner input = new Scanner(System.in);
		
		textFile = new File("C:\\\\Users\\\\48329002\\\\git\\\\CS30\\\\Chapter11\\\\src\\\\CS311.txt");
		
		if(textFile.exists())
		{
			System.out.println("CS311.txt file exists.");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("CS311.txt file has been created.");
			}
			catch(IOException e)
			{
				System.out.println("File could not be created.");
				System.err.println("IOException: " + e.getMessage());
			}
			
		}
		System.out.println("Would you like to delete the file?");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
		{
			if(textFile.delete())
			{
				System.out.println("File is deleted.");
			}
		}
		else
		{
			System.out.println("File is kept.");

		}

	}

}
