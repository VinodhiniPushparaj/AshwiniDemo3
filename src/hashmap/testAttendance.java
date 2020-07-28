package hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class testAttendance {
	static Hashtable<String,String> atd=new Hashtable<>();
	
	public Hashtable<String, String> addAttendance(HashMap<Integer, String> std)
	{
		Scanner s=new Scanner(System.in);
		
		
		for(Map.Entry m:std.entrySet())
		{
			
				String name=(String) m.getValue();
				System.out.println("Enter the attendance record of "+name+" : ");
				String attendance=s.nextLine();
				atd.put(name, attendance);
				
			
			
		}
		
		return atd;
	}

}
