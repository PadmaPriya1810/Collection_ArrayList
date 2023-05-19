package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{
	public static void main(String[] args)
	{
		ArrayList l1=new ArrayList();
		
		System.out.println(l1.toString());//[] //Wont give address coz toString Overriden
		
		//List l=new ArrayList(); //Upcasting Implicitly done
		
       // ==========  ADDING  ============== //	
		
		//TASK 1: ADDING ELEMENTS IN ArrayList
		
		//Auto-Boxing Implicitly done by Compiler
		l1.add(3);   //int     --> INTEGER
		l1.add(3.11); //double  --> DOUBLE
		l1.add(true); //boolean --> BOOLEAN
		l1.add('S');  //char    --> CHARACTER
		l1.add("Sai");//String
		
		System.out.println(l1.toString());//[18, 3.11, true, S, Sai]
		//While we are trying to print "l1"-Object Ref. We are getting DATA instead of ADDRESS
		//toString() is Overriden - Thats why getting Data
		
		
		//TASK 2: CREATING COLLECTION BY USING ARRAYLIST
		//ArrayList <c> have 2 CONSTRUCTORS - 1.ArrayList() 2.ArrayList(Object)
		
		ArrayList l2=new ArrayList(l1);//Considers as ArrayList(Object)
		
		System.out.println(l2);//[18, 3.11, true, S, Sai]
		//"l2" also having same Elements present in "l1"
		
		
		//TASK 3: ADDING THE ELEMENT in ArrayList Using Index
		
		l2.add(5,"Dharshan"); //l2.add(int index,Object Element)
		System.out.println(l2);//[18, 3.11, true, S, Sai, Dharshan]
		
		
		//TASK 4: CREATE NEW Collection (ArrayList) and add the "l2" COllection using addAll()
		
		ArrayList l3=new ArrayList();
		l3.add(18);
		l3.add(18.1);
		l3.add("Priya");
		l3.addAll(l2);//addAll(Collection)
		System.out.println(l3);//[18, 18.1, Priya, 3, 3.11, true, S, Sai, Dharshan]
		
		//TASK 5: ADD THE ELEMENTS OF "l1" Collection into the New Collection in 4th Index
		
		l1.addAll(4, l3);//addAll(int index,Collection c)
		System.out.println(l1);//[3, 3.11, true, S, 18, 18.1, Priya, 3, 3.11, true, S, Sai, Dharshan, Sai]
		
		
		// ========== SEARCHING ======== //
		
		//TASK 1: SEARCH YOUR NAME IS PRESENT OR NOT IN THE COLLECTION
		
		//Way 1:
		System.out.println(l3.contains("Sai"));//true
		
		//Way 2:
		if(l3.contains("Sai"))
		{
			System.out.println("Present"); //Present
		}
		else
		{
			System.out.println("Not Present");
		}
		
		//TASK 2: SEARCH THE COLLECTION "l2" is PRESENT in "l3" or not
		
		//Way 1:
		System.out.println(l3.containsAll(l2));//true
		
		//Way 2:
		if(l3.containsAll(l2))
		{
			System.out.println("Present");//Present
		}
		else
			System.out.println("Not Present");
		
		//TASK 3: FIND THE INDEX OF "SAI" in COLLECTION & ALSO CHECKS FOR ELEMENT WHICH IS NOT PRESENT
		
		System.out.println(l3.indexOf("Sai"));//7
		System.out.println(l3.indexOf("Akshu"));//-1 if Element is not Present returns -1
		
		// =============== REMOVING ============//
		
		//TASK 1: REMOVE THE OBJECT "18"
		
		l3.remove((Integer)18);//remove(Object)//Use (Integer)
		System.out.println(l3);//[18.1, Priya, 3, 3.11, true, S, Sai, Dharshan]
		
		//TASK 2: REMOVE THE OBJECT PRESENT IN 2nd Index
		
		System.out.println(l3.remove(2));//3 // 3 is present in Index 2, 
		//remove(int index); //It will Remove &  also return based on Element (Object type)
		System.out.println(l3);//[18.1, Priya, 3.11, true, S, Sai, Dharshan]
		
		//TASK 3: REMOVE "l2" COLLECTION FROM "l3"
		
		System.out.println(l3.removeAll(l2));//true
		System.out.println(l3);//[18.1, Priya]
		
		//TASK 4: retainAll()
		
		ArrayList r1=new ArrayList();
		r1.add(1);
		r1.add(2);
		r1.add(3);
		r1.add(4);
		r1.add(5);
		
		ArrayList r2=new ArrayList();
		r2.add(2);
		r2.add(4);
		
		//r1&r2 having Common Elements 2,4
		
		//retainAll(Collection c)- Retain (Preserve) the Common Elements in specified Collection
		
		System.out.println(r1.retainAll(r2));//true
		System.out.println(r1);//[2, 4]
		
		
		System.out.println(r2.retainAll(r1));//false
		System.out.println(r2);//[2,4]
		
	   	//========== ACCESSING ELEMENTS ======//
		
		
		//TASK 1:PRINT THE NUMBERS IN 'r1' COllection Using get(int index)
		
		System.out.println(r1);// [2, 4]
		for(int i=0;i<r1.size();i++)
		{
			System.out.println(r1.get(i));// 2
										  // 4
		}
		
		//TASK 2: PRINT THE EVEN NUMBERS OF "r3" using get(int index)
		
		ArrayList r3=new ArrayList();
		r3.add(11);
		r3.add(12);
		r3.add(13);
		r3.add(14);
		r3.add(15);
		
		for(int i=0;i<r3.size();i++)
		{
			Integer num=(Integer)r3.get(i);
					
			if(num%2==0)
			System.out.println(num);// 12
									// 14
				 
		}
		
		//for(Object o: Collection/array)
		
		//TASK 3: PRINT THE NUMBERS OF "r3" using "foreach loop"
		
		for(Object o: r3) //for(Object o: Collection/array)
		{
  		System.out.println(o);	    //11
									//12
									//13
									//14
									//15
		}
		
		//Iterator - ConcurrentModificationException
		//NoSuchElementException 
		//Iterator <I> -3 Methods -1.hasNext() 2.next() 3.remove()
		
		
		Iterator i=r3.iterator();//iterator() Method in "Iterator" <I>/Class?
		System.out.println(i.next());//1 i.e., next() -Returns the Value & Move the Cursor to the Next Value
		
		while(i.hasNext())//hasNext() - Checks whether Next Element is Present or Not (Boolean RT-T/F)
			              //hasNext() - To Avoid NoSuchElementException
		{
			System.out.println(i.next());//Prints Value by Value 
			
			//11
			//12
			//13
			//14
			//15

		}	
		
		//============Clear=======//
		
		//TASK 1: CLEAR THE ELEMENTS OF COLLECTION "l2"
		l2.clear();
		System.out.println(l2.size());//0
						
	}

}
