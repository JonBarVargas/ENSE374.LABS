public class ListElement {
	
	private ListElement next;
	//private ListElement previous;
	private int data;
	
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
		//this.previous = null;
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
		//le.previous = this;
	}
	else
	{
		while (test.next != null)
		{
			ListElement nextElement = test.next;
			test = nextElement;
		}
		test.next= le;
		//le.previous =test;
	}
}
/**
* @param index
* the position of the linked list a user wishes to retrieve
* @return
* returns the 
**/
public ListElement getElement(int index)
{
	int numIndex = 0;
	int count = 0;
	ListElement test = this;
	ListElement numData = this;
	ListElement nextElement;
	
	//this while loop counts the number of items in connected to the linked list
	while (numData.next != null)
	{
		nextElement = numData.next;
		numData = nextElement;
		numIndex++;
	}
	
	//
	if(count > index)
	{
		System.out.println("This linked list does not have the index of " + index);
		return null;
	}
	else
	{
		while (count < index)
		{
			nextElement = test.next;
			test = nextElement;
			count++;
		}
		return test;
	}
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
	
//	while (test.previous != null)
//	{
//		ListElement previousElement = test.previous;
//		test = previousElement;
//		System.out.println(test.next);
//	}
	System.out.println(test.getData());
	while (test.next != null)
	{
		
		ListElement nextElement = test.next;
		test = nextElement;
		System.out.println(test.getData());
	}
}








}
