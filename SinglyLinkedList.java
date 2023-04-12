package JavaDSA;
import java.util.Scanner;
public class SinglyLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data)
		{   this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation()
	{   int data,n;
		Scanner sc= new Scanner(System.in);
		do{
		System.out.println("Enter Data:");
		data=sc.nextInt();
		Node new_node= new Node(data);
		if(head==null){
			head=new_node;}
		else{
			System.out.println("Enter 1 To Insert The Item At Beginning , 2 To Insert The Item At The End,3 To Insert At Specific Location");
			int m=sc.nextInt();
			switch(m)
			{
			case 1:
				new_node.next=head;
				head=new_node;
			    break;
			case 2:
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
					
				}
				temp.next=new_node;
				break;
			case 3:
				System.out.println("Enter Position Of Node To Be Inserted");
				int p= sc.nextInt();
				Node temp1=head;
				for(int i=0;i<(p-1);i++)
				{
					temp1=temp1.next;
					
				}
				new_node.next=temp1.next;
				temp1.next=new_node;
				break;
				
			}
			}
		System.out.println("Do You Want To Add More Data.If Yes,Press:1");
		n=sc.nextInt();}
		while(n==1);
	}
	public void traverse()
	{   Node temp=head;
		if(head==null){
			System.out.println("Linked List Does Not Exist...");}
		else{
		   while(temp!=null){
			   System.out.print(" "+temp.data);
			   temp=temp.next;}
		   }
	}
	public static void main(String[] args) {
		SinglyLinkedList ll= new SinglyLinkedList();
		ll.creation();
		ll.traverse();
	}
}
