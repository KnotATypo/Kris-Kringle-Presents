package model;

import java.util.Map;

public class Engine
{
	private Map<String, Family> families;
	
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
}
