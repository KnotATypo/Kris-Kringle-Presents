package model;

public class Person
{
	public String name;
	private String giftTo;
	public boolean used;
	
	public Person(String name)
	{
		this.name = name;
	}

	public String getGiftTo()
	{
		return giftTo;
	}
	
	public void setGiftTo(String giftTo)
	{
		this.giftTo = giftTo;
	}
}
