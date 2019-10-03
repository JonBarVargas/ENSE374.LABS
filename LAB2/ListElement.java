public class ListElement {
	
	private ListElement next;
	private ListElement previous;
	private int data;
	//private int listIndex;
	
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
/**
* @param data
* an integer to be stored in the node
*@return
*	None
**/
public void setData(int data) {
	this.data = data;
}

/**
* @param 
* 	None
* @return
*	the current object's data
**/
public int getData() {
	return this.data;
}

/**
* adds another instance of ListElement to the current instance.
* @param le
* the ListElement object to be added into the linked list
*@return
*	None
**/
public void addElement(ListElement le)
{
	ListElement test = this;
	if(this.next == null){
		this.next = le;
		le.previous = this;
	}
	else
	{
		while (test.next != null)
		{
			System.out.println("traversing");
			ListElement nextElement = test.next;
			test = nextElement;
		}
		test.next= le;
		le.previous =test;
	}
}
/**
* @param index
* the position of the linked list a user wishes to retrieve
* @return
*	None
**/
public ListElement getElement(int index)
{
	int count = 0;
	ListElement test = this;
	//this traverses all the way to the head of the list
	while (test.previous != null)
	{
		ListElement previousElement = test.previous;
		test = previousElement;
	}
	while (test.next != null && count <= index)
	{
		ListElement nextElement = test.next;
		test = nextElement;
		count++;
		System.out.println(count);
	}
	System.out.println();
	System.out.println(test);
	return test;
}


/**
* @param 
* 	None
*@return
*	None
**/
public void printLinkedListHead()
{
	ListElement test = this;
	
	while (test.previous != null)
	{
		ListElement previousElement = test.previous;
		test = previousElement;
		System.out.println(test.next);
	}
	System.out.println(test.getData());
	while (test.next != null)
	{
		
		ListElement nextElement = test.next;
		test = nextElement;
		System.out.println(test.getData());
	}
}








}
