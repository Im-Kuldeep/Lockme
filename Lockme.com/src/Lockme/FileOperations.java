package Lockme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations
{	
	SortFiles s=new SortFiles();
	Scanner sc= new Scanner(System.in);
	void search(String path)
	{	
		System.out.println("Please enter file name to Search");
		String name=sc.nextLine();
		File f0 = new File(path,name);
			if(f0.exists())
			{   
			  System.out.println("File is present");  
			} 
			else 
			{  
			  System.out.println("File not found");  
			}
		
	}
	void addfile(String path)
	{
		try 
		{  
            // Creating an object of a file
			System.out.println("Please enter file name to add");
			String name=sc.nextLine();
            File f0 = new File(path,name);   
            if (f0.createNewFile()) {  
                       System.out.println("File " + f0.getName() + " is created successfully.");  
            } else {  
                       System.out.println("File is already exist in the directory.");  
            }  
          } 
		catch (IOException exception) 
		{  
                   System.out.println("An unexpected error is occurred.");  
                   exception.printStackTrace();  
       }   
	}
	void deleteFile(String path)
	{  			
			System.out.println("Please enter file name to delete");
			String name=sc.nextLine();
			File f0 = new File(path,name);
			
				if(f0.delete())
				{   
				  
				  System.out.println(f0.getName()+ " file is deleted successfully.");  
				} 
				else 
				{  
				  System.out.println("File not found");  
				}
			
	}

}
