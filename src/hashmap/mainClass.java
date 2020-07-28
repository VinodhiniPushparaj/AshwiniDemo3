package hashmap;

import java.util.HashMap;
import java.util.Hashtable;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj=new test();
		
		HashMap<Integer,String> std = new HashMap<>();
		std=obj.addStudentDetails();
		System.out.println(std);
		
		testAttendance obj1=new testAttendance();
		Hashtable<String,String> attendance=new Hashtable<>();
		//obj1.addAttendance(std);
		attendance=obj1.addAttendance(std);
		System.out.println(attendance);
		
		

	}

}
