
public class Mouse extends Animal{
	 public Mouse()
	    {
	    	this.name = "Mouse";
	    	this.age = 2;
	    	this.classification = "Rodent";
	    }
	    public void squeak() {
	        System.out.println("There is a Mouse here and it squeaks");
	    }
	    public void display()
	    {
	    	this.squeak();
	    }
}
