package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class test {
	
	static  HashMap<Integer,String> studentDetails=new HashMap<>();
	
	public HashMap<Integer, String> addStudentDetails()
	{
		Scanner s=new Scanner(System.in);
		int number_Of_Students=5;
		for(int i=1;i<number_Of_Students;i++)
		{
//		System.out.println("Enter the Student id");
//		int num=s.nextInt();
		System.out.println("Enter the student name:");
		String name=s.nextLine();
		studentDetails.put(i, name);
		
		
		
	}
	
		return studentDetails;	
	

	

	}

}
