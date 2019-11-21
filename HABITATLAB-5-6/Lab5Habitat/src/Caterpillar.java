
public class Caterpillar extends Animal {
	 public Caterpillar()
	    {
	    	this.name = "Caterpillar";
	    	this.age = 2;
	    	this.classification = "Insect";
	    }
	    public void metamorphasis() {
	        System.out.println("There is a Caterpillar here and it goes through a metamorphasis");
	    }
	    public void display()
	    {
	    	this.metamorphasis();
	    }
}
