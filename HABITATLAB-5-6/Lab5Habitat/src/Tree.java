
public class Tree extends Plant{
	private int numBranches;
	public Tree()
    {
    	this.name = "Tree";
    	this.age = 3;
    	this.numBranches = 4;
    }
    public void display()
    {
    	System.out.println("There is a tree here and it has " + this.numBranches + " branches.");
    }
}
