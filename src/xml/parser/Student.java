package xml.parser;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

public class Student {

	/*
	 * Student class have 4 variables which will be constructed as Student Object into List<Student>.
	 */
	public String firstName;
	public String lastName;
	public String score;
	public String id;
	List<Student> Student = new LinkedList<>();



	@Override
	public String toString()
	{
		return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+score;
	}
	
}
