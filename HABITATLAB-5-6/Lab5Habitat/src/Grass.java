
public class Grass extends Plant{
	private int numBlades;
	public Grass()
    {
    	this.name = "Grass";
    	this.age = 15;
    	this.numBlades = 10;
    }
    public void display()
    {
    	System.out.println("There is a patch of grass here and it has " + this.numBlades + " blades of grass.");
    }
}

