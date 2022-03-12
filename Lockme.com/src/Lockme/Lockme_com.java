package Lockme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lockme_com
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				Welcome_Page w=new Welcome_Page();
				w.welcome(); //welcome screen
				
				SortFiles S=new SortFiles();
				Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
				System.out.println(" Please enter file path in the similar format E:\\Full Stack developer\\Lockme");
				String path=sc.nextLine();   
				S.retrieve(path);
				FileOperations F =new FileOperations();
				
				//
				
				 
				  try{ 
					  
					  
					  theLabel: while (true) {

							System.out.print("Please select a number from the below options \r\n "+
							"1 to search a file in the current folder\r\n"+
							"2 to add file in the current folder\r\n"+
							"3 to Delete a file in the current folder\r\n"+
							"9 to close the application\r\n"+"\r\n");  
							int number= sc.nextInt(); 
						  switch(number)					  
					  
					  
					  {
					  
				    //Case statements  
					case 1: F.search(path);
					continue theLabel;
				    case 2: F.addfile(path);
				    continue theLabel;  
				    case 3: F.deleteFile(path);  
				    continue theLabel;  
				    case 9: System.exit(0);  
				    //Default case statement  
				    default:System.out.println(number+" is not present in the option list");
				    continue theLabel;
					  } 
					  }}
				 catch(InputMismatchException exception)
				 {
					 System.out.println("Wrong input");
				 }sc.close();

	}

}


