
public class Rabbit extends Animal{
	 public Rabbit()
	    {
	    	this.name = "Rabbit";
	    	this.age = 4;
	    	this.classification = "Mammal";
	    }
	    public void hop() {
	        System.out.println("There is a Rabbit here and it hops");
	    }
	    public void display()
	    {
	    	this.hop();
	    }
}
