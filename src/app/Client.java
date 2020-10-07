package app;

import model.Engine;
import view.Frame;

public class Client
{

	public static void main(String[] args)
	{
		Engine engine = new Engine();
		
//		addTest(engine);

		Frame frame = new Frame(engine);
		
		frame.updateData(false);
	}

	private static void addTest(Engine engine)
	{
		engine.newFamily("Dans");
		engine.newFamily("McKie");
		engine.newFamily("Mackay");
		engine.newFamily("Grandma");
		engine.newFamily("Murphy");
		
		engine.addMember("Dans", "Toby");
		engine.addMember("Dans", "Maddy");
		engine.addMember("Dans", "Cath");
		engine.addMember("Dans", "Geoff");
		
		engine.addMember("Mackay", "Josh");
		engine.addMember("Mackay", "Sam");
		engine.addMember("Mackay", "Barb");
		engine.addMember("Mackay", "Pete");
		
		engine.addMember("McKie", "Andy");
		engine.addMember("McKie", "Sandra");
		
		engine.addMember("Murphy", "Jen");
		engine.addMember("Murphy", "Bryan");
		
		engine.addMember("Grandma", "Grandma");
	}

}
