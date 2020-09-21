package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Family
{
	private List<Person> family = new ArrayList<Person>();
	private int size;
	
	public Family()
	{
		size = 0;
	}
	
	public void addMember(String name)
	{
		family.add(new Person(name));
		size++;
	}
	
	public int getSize()
	{
		return size;
	}

	public Vector<String> toVector()
	{
		Vector<String> returnVector = new Vector<String>();
		
		for(Person person : family)
			returnVector.add(person.name);
		
		return returnVector;
	}
}
