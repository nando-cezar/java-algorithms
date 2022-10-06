package business;

public class Stillborn extends Person{

	public Stillborn(String name, Person father) {
		super("Stillborn: " + name, father);
	}

	@Override
	public void registerDescendants(String name, String gender) throws Exception{
		throw new Exception();
	}

}

