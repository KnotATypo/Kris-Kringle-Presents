package model;

public class Person
{
	public String name;
	private Person giftTo;

	public Person(String name)
	{
		this.name = name;
	}

	public Person getGiftTo()
	{
		return giftTo;
	}

	public void setGiftTo(Person person)
	{
		giftTo = person;
	}

	public String toString()
	{
		return String.format(name);
	}
	
	public boolean equals(Person person)
	{
		return (person.name == name);
	}
}
