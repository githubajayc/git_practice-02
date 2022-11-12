package arrayList;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add('A');
		al.add(null);
		al.add(new Employee(111,"Ajay"));   //classname@hashcode
		al.add(new Student(222,"Chavan"));  //classname@hashcode
		
		System.out.println(al);
		
		//now printing collection data
		
		for(Object o : al) {
			
			if (o instanceof Integer) {
				System.out.println(o.toString());
			}
			
			if (o instanceof Character) {
				System.out.println(o.toString());
			}
			
			if (o == null) {
				System.out.println(o);
			}
			
			if (o instanceof Employee) {
				Employee e = (Employee)o;       //typecasting
				System.out.println(e.id + " " + e.name);
			}
			
			if (o instanceof Student) {
				Student s = (Student)o;          //typecasting
				System.out.println(s.id + " " + s.name);
			}
			
		}
		   System.out.println(al);
	}

}
