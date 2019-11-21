
public class Shrub extends Plant {
	private int numStems;
	public Shrub()
    {
    	this.name = "Shrub";
    	this.age = 9;
    	this.numStems = 50;
    }
    public void display()
    {
    	System.out.println("There is a Shrub here and it has " + this.numStems + " Stems.");
    }
}
