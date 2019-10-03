
public class ListTester{

	public static void main(String[] args)
	{
		ListElement list1 = new ListElement();
		ListElement item2 = new ListElement();
		ListElement item3 = new ListElement();
		ListElement item4 = new ListElement();
		ListElement item5 = new ListElement();
		list1.setData(10);
		item2.setData(2);
		item3.setData(3);
		item4.setData(4);
		item5.setData(5);
		list1.addElement(item2);
		list1.addElement(item3);
		list1.addElement(item4);
		list1.addElement(item5);
		
		//item2.getElement(2);
		list1.printLinkedListHead();
		ListElement yeehaw = list1.deleteElement(2);
		System.out.println();
		yeehaw.printLinkedListHead();
		ListElement ree = list1.getElement(2);
		ListElement crash = list1.getElement(7);
		System.out.println(ree.getData());
		System.out.println();
		
		
		
	
	}
}









