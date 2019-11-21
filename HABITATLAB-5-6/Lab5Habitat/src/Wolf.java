
public class Wolf extends Animal{
    public Wolf()
    {
    	this.name = "Wolf";
    	this.age = 5;
    	this.classification = "Mammal";
    }
    public void howl() {
        System.out.println("There is a wolf here and it howls");
    }
    public void display()
    {
    	this.howl();
    }
}
