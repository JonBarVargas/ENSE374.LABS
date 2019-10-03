public class ListElement {
	
	private ListElement next ;
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
*	None
**/
public int getData() {
	return this.data;
}

/**
* @param le
* an integer to be stored in the node
*@return
*	None
**/
public void addElement(ListElement le)
{
	this.next = le;
	le.previous = this;
}


}