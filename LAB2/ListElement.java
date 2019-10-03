public class ListElement {
	
	private ListElement next;
	private ListElement previous;
	private int data;
	
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
	this.next = le;
	le.previous = this;
	System.out.println("hooray");
	System.out.println(le.previous);
System.out.println(this.next);
}


}