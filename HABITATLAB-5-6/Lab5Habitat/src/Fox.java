
public class Fox extends Animal {
	 public Fox()
	    {
	    	this.name = "Fox";
	    	this.age = 5;
	    	this.classification = "Mammal";
	    }
	    public void stalk() {
	        System.out.println("There is a Fox here and it stalks");
	    }
	    public void display()
	    {
	    	this.stalk();
	    }
}
