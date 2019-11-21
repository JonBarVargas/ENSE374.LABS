
public class Bluejay extends Animal{
	 public Bluejay()
	    {
	    	this.name = "BlueJay";
	    	this.age = 1;
	    	this.classification = "Bird";
	    }
	    public void chirp() {
	        System.out.println("There is a Bluejay here and it chirps");
	    }
	    public void display()
	    {
	    	this.chirp();
	    }
}
