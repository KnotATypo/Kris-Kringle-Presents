package model;

import java.util.HashMap;
import java.util.Map;

public class Engine
{
	private Map<String, Family> families = new HashMap<String, Family>();
	
	public void newFamily(String name)
	{
		families.put(name, new Family());
	}
	
	public void addMember(String familyName, String member)
	{
		Family family = families.get(familyName);
		family.addMember(member);
	}
	
	public Map<String, Family> getFamilies()
	{
		return families;
	}
	
	public int highNumOfMembers()
	{
		int most = 0;
		
		for(Family family : families.values())
		{
			int size = family.getSize();	
			if (size > most)
				most = size;
		}
		
		return most;
	}
}
