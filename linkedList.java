/*Q2:Reverse a Linked List 
Given the pointer to the head node of a linked list, change the next pointers of the nodes so that their 
order is reversed. The head pointer given may be null meaning that the initial list is empty.
Example
head references the list 1->2->3->NULL
Manipulate the next pointers of each node in place and return head, now referencing the head of the 
list.
3->2->1->NULL.
Function Description
Complete the reverse function in the editor below.
reverse has the following parameter:
 Node pointer head: a reference to the head of a list
Returns
LinkedListNode pointer: a reference to the head of the reversed list
Input Format
The first line contains an integer t, the number of test cases.
Each test case has the following format:
The first line contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the data values of the elements in the linked list*/
class linkedList{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	void display(Node node){
		while(node != null){
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	public static void main(String... args){
		linkedList l1 = new linkedList();
		l1.head= new Node(2);
		l1.head.next=new Node(4);
		l1.head.next.next=new Node(3);
		l1.head.next.next.next=new Node(4);
		l1.head.next.next.next.next=new Node(2);
		l1.head.next.next.next.next.next=new Node(5);
		System.out.println("Linked list");
		l1.display(head);
		head= l1.reverse(head);
		System.out.println();
		System.out.println("Reverse list:");
		l1.display(head);
	}
}