package Collection;

import java.util.Objects;

public class Student implements Comparable 

{
	private String sname;
	private int sid;
	private long cno;
	
	public Student() 
	{
		super();
	}
	
	public Student(String sname, int sid, long cno)
	{
		super();
		this.sname = sname;
		this.sid = sid;
		this.cno = cno;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname = sname;
	}
	public int getSid()
	{
		return sid;
	}
	
	public long getCno()
	{
		return cno;
	}
	
	public void setCno(long cno) 
	{
		this.cno = cno;
	}

	
	@Override
	public String toString()
	{
		return sname+cno;
	}
	
	@Override
	public boolean equals(Object o) //UPCASTING - Already a Parent Type
	{
		Student s=(Student)o; //DOWNCASTING - To Access Child Class Members
		if(this.sname.equals(s.sname))
		{
			return true;
		}
		
		else 
		{
			return false;
		}
	}

	@Override 
	public int hashCode()
	{
		int i=Objects.hash(sname,sid,cno);
		return i; 
	}
	
	
	@Override
	public int compareTo(Object o)//sort() will call compareTo() Object o=new Student()
	{
		Student s=(Student)o;
		return (this.sname.compareTo(s.sname)); //For Comparing 2 Strings also we can use it
		//compareTo() is present in String class
	}
}
