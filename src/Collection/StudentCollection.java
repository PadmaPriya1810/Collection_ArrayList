package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentCollection
{
public static void main(String[] args)
{
 //Changing More than 1 Value = ConcurrentModificationException
	
	ArrayList<Student> l1=new ArrayList();
	l1.add(new Student("Priya",1,98765432));
	l1.add(new Student("Banu",2,87654329));
	l1.add(new Student("Garzia",3,76543990));
	l1.add(new Student("Abi",4,65437892));
	
	System.out.println(l1);//[Priya98765432, Banu87654329, Garzia76543990, Abi65437892]
	
	//TASK : PRINT ALL STUDENT OBJECT
	for(Object o:l1)
	{
		Student s=(Student)o;
		System.out.println(s.getSname()+" -- "+s.getSid()); // Priya -- 1
															// Banu -- 2
															// Garzia -- 3
															// Abi -- 4

	}
	
	//TASK :REMOVE THE STUDENT WHO IS HAVING ID:1
	
	Iterator i=l1.iterator();
	Student r=null;
	
	while(i.hasNext())
	{
		Student s=(Student)i.next();
		if(s.getSid()==1)
		{
			r=s;
		}
	}
	l1.remove(r);
	System.out.println(l1); //[Banu87654329, Garzia76543990, Abi65437892]
	
	Collections.sort(l1);
	System.out.println(l1);//[Abi65437892, Banu87654329, Garzia76543990]
}
}
