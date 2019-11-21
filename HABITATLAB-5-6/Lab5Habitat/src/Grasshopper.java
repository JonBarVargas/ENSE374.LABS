
public class Grasshopper extends Animal{
	 public Grasshopper()
	    {
	    	this.name = "Grasshopper";
	    	this.age = 2;
	    	this.classification = "Insect";
	    }
	    public void howl() {
	        System.out.println("There is a Grasshopper here and it jumps");
	    }
	    public void displayActivity()
	    {
	    	this.howl();
	    }
}
