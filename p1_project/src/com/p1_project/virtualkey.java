package com.p1_project;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class virtualkey {

	public static void main(String[] args) throws IOException {

		System.out.println("####################################################################");
		System.out.println("Welcome to Virtual Key Repository!!!");
		System.out.println("Developed By Maligi Anantha Akshay , TEKsystems Global Services.");
		System.out.println("####################################################################\n");

		first_operation();
	}
	static Scanner h = new Scanner(System.in);
	static File f = new File("c:\\p1");

	private static void first_operation() throws IOException {
		System.out.println("Select the Option to Perform Opertion ");
		System.out.println("-------------------------------------");
		System.out.println("1.Retrieve the files in Ascending Order.");
		System.out.println("2.Add, Delete, Search Files.");
		System.out.println("3.Close the Application.");
		int i = h.nextInt();
	
		if(i==1)
		{
			File[] file = f.listFiles();
			if(file.length==0)
			{
				System.out.println("No files are Present!! Please add files\n");
				first_operation();
			}
			else {
			System.out.println("Files present are:");
			
			for (int j = 0; j < file.length; j++)
				System.out.println(file[j].getName());
			System.out.println();
			first_operation();
			}
			
		}
          
		else if(i==2)
			second_operation();
		else if(i==3)
			System.exit(0);
		else if(i<=0 && i>=4)
			{System.out.println("Please select options in 1 to 3 only!!");first_operation();}
		

	}


	private static void second_operation() throws IOException {
		System.out.println("1.Add file");
		System.out.println("2.Delete File");
		System.out.println("3.Search File in repository");
		System.out.println("4.Return to main context");
		int ch=h.nextInt();
		do {
			switch (ch) {
			case 1: 
            System.out.println("Enter a filename to add");	
            add_file(h.next()); 
            System.out.println("Do you want add more files Enter 1 else 0");
            ch=h.nextInt();
            if(ch!=1)
            	second_operation();
            break;
             
			case 2: 
	            System.out.println("Enter a filename to delete");	
	            delete_file(h.next());
	            System.out.println("Do you want delete more files Enter 2 else 0");
	            ch=h.nextInt();
	            if(ch!=2)
	            	second_operation();
	            System.out.println("");
	            break;
	             
			case 3: 
	            System.out.println("Enter a filename to search");	
	            search_file((h.next()).toLowerCase());
	            System.out.println("Do you want search more files Enter 3 else 0 ");
	            ch=h.nextInt();
	            if(ch!=3)
	            	second_operation();
	            break;
	             
			case 4:
				first_operation();
				break;
			
			}
		}while(true);
	}


	private static void add_file(String fname) throws IOException {
		File f1 = new File("c:\\p1\\" + fname);
		if (!f1.exists()) {
			f1.createNewFile();
			System.out.println("New File added Successfully!!");
		}
		else
			System.out.println("Sorry!! File Already Exists.");
	}

	private static void delete_file(String fname) throws IOException {
		File f1 = new File("c:\\p1\\" + fname);
		if (f1.exists()) {
			f1.delete();
			System.out.println(" File deleted Successfully!!");
		}
		else
			System.out.println("File Not Found.");
	}
	private static void search_file(String fname) {
		File f1 = new File("c:\\p1\\" + fname);
		if (f1.exists()) {
			System.out.println("File Found!!");
		}
		else
			System.out.println("Sorry!! File doesn't found.");
	}

}
