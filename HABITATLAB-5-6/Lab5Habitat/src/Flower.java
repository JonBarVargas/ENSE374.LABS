
public class Flower extends Plant {
		private int numPetals;
		public Flower()
	    {
	    	this.name = "Flower";
	    	this.age = 2;
	    	this.numPetals = 15;
	    }
	    public void display()
	    {
	    	System.out.println("There is a Flower here and it has " + this.numPetals + " Petals.");
	    }
	}
