
public class Main {

	public static void main(String[] args) {
		Organism[][] World = new Organism[20][20];
		Organism[] livingItems = new Organism[20];
		
		int random;
		random = (int)(Math.random()*((19-0)+1));
		for (int i = 0; i < 40; i++) {
			random = (int)(Math.random()*((20-0)+1));
			System.out.println(random);
		}
		initList(livingItems);
		
		
		livingItems[10].display();
		
//		for (int row = 0; row < 20; row++)
//		{
//			for (int col = 0; col < 20; col++)
//			{
//				World[row][col] 
//			}
//		}
		
	}
	
	public static void initList (Organism[] list ) {
		Bluejay bluejay = new Bluejay();
		Caterpillar caterpillar = new Caterpillar();
		Deer deer = new Deer();
		Fox fox = new Fox();
		Grasshopper grasshopper = new Grasshopper();
		Rabbit rabbit = new Rabbit();
		Squirrel squirrel = new Squirrel();
		Wolf wolf = new Wolf();
		
		Flower flower = new Flower();
		Grass grass = new Grass();
		Shrub shrub = new Shrub();
		Tree tree = new Tree();
		
		
		list[0] = null;
		list[1] = null;
		list[2] = bluejay;
		list[3] = caterpillar;
		list[4] = deer;
		list[5] = fox;
		list[6] = grasshopper;
		list[7] = rabbit;
		list[8] = squirrel;
		list[9] = wolf;
		list[10] = flower;
		list[11] = grass;
		list[12] = shrub;
		list[13] = tree;
		list[14] = null;
		list[15] = null;
		list[16] = null;
		list[17] = null;
		list[18] = null;
		list[19] = null;
	}
	
}
