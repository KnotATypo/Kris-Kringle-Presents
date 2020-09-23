package app;

import model.Engine;
import view.Frame;

public class Client
{

	public static void main(String[] args)
	{
		Engine engine = new Engine();

		new Frame(engine);
	}

}
