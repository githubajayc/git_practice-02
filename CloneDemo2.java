package cloneing_and_serialization;

import java.util.ArrayList;

public class CloneDemo2 {
	
	//Here we will clone ArrayList data

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("ratan");
		al.add("anu");
		al.add("durga");
		
		//Now Cloneing ArrayList data
		
		ArrayList<String> copy = (ArrayList<String>)al.clone();   //typecasting bcz clone() belongs to Object class
		
		System.out.println(copy);
		
		

	}

}
