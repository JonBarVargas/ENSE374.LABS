
public class Main {

	public static void main(String[] args) {
		final int NUMROW = 20;
		final int NUMCOL = 20;
		final int NUMITEMS = 30;
		Organism[][] World = new Organism[NUMROW][NUMCOL];
		Organism[] livingItems = new Organism[NUMITEMS];
		
		initList(livingItems);
		initWorld(World, livingItems, NUMROW, NUMCOL);
		displayWorld(World, livingItems, NUMROW, NUMCOL);
		
		
	}
	public static void displayWorld(Organism[][] board, Organism[] list, int numRow, int numCol)
	{
		for (int row = 0; row < numRow; row++)
		{
			for (int col = 0; col < numCol; col++)
			{
				System.out.println("coordinate: " + row + "," + col);
				if (board[row][col] == null) {
					System.out.println("There is nothing here");
				}
				else
				{
				board[row][col].display();
				}
				System.out.println();
			}
		}
	}
	
	public static int randomGen()
	{
		int random;
		random = (int)(Math.random()*((29-0)+1));
		return random;
	}
	
	public static void initWorld (Organism[][] board, Organism[] list, int numRow, int numCol)
	{
		int random;
		for (int row = 0; row < numRow; row++)
		{
			for (int col = 0; col < numCol; col++)
			{
				random = randomGen();
				board[row][col] =  list[random];
			}
		}
	}
	
	public static void initList (Organism[] list) {
		Bluejay bluejay = new Bluejay();
		Caterpillar caterpillar = new Caterpillar();
		Deer deer = new Deer();
		Fox fox = new Fox();
		Grasshopper grasshopper = new Grasshopper();
		Rabbit rabbit = new Rabbit();
		Squirrel squirrel = new Squirrel();
		Wolf wolf = new Wolf();
		Hawk hawk = new Hawk();
		
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
		list[20] = null;
		list[21] = null;
		list[22] = null;
		list[23] = null;
		list[24] = null;
		list[25] = null;
		list[26] = null;
		list[27] = null;
		list[28] = null;
		list[29] = hawk;
	}
	
}
