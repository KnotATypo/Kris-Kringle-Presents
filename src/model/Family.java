package model;

import java.util.ArrayList;
import java.util.List;

public class Family
{
	private List<Person> family = new ArrayList<Person>();
	
	public void addMember(String name)
	{
		family.add(new Person(name));
	}
}
