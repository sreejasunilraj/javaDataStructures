package test.pack.one;

public class MyLinkedList {
	
	private Node start = null;
	private Node current = null;
	
	public void insert(int val) {
		if(start == null) {
			start = new Node();
			start.insert(val);
			current = start;
		}else {
			Node tempNode = new Node();
			tempNode.insert(val);
			current.nextNode = tempNode;
			current = tempNode;			
		}
	}
	
	public void display() {
		Node dispNode = start;
		while(dispNode != null)
		{
			dispNode.display();
			dispNode = dispNode.nextNode;				
		}	
	}
	
	public void remove(int index) {
		int pos = 0;
		Node nodeToDel = start;
		Node prevNode = null;
		if(start != null) 
		{
			if(index == 0) {
				start = start.nextNode;
			}else {
				while(nodeToDel != current ) {
						prevNode = nodeToDel;
						nodeToDel = nodeToDel.nextNode;
						pos++;
						if(pos == index) {
							prevNode.nextNode = nodeToDel.nextNode;
							break;
						}
					}
			}			
		}else
			System.out.println("Empty Linked List!");
	}
}


class Node{
	private int val = 0;
	Node nextNode = null;
	
	public void insert(int value) {
		val = value;
	}
	
	public void display() {
			System.out.println(val);
	}
}
