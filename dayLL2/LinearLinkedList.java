package dayLL2;

import java.util.Scanner;

import day2.Queueex1;

public class LinearLinkedList {

	 Node root;
	 
	 void createList()
	 {
		 root=null; //nullify the root -> assigning it null so we know when to use it
	 }
	 
	 void insertLeft(int data)
	 {
		 Node n = new Node(data);
		 if(root==null)
			 root=n;
		 else 
		 {
			 n.next=root;  
			 root=n; 
		 }
	 }
	 void insertRight(int data)
	 {
		 Node n = new Node(data);
		 if(root==null)
			 root=n;
		 else 
		 {
			 Node t = root;
			 while(t.next!=null)
				 t=t.next;
			 t.next = n; 
		 }
	 }
	 
	 void deleteLeft()
	 {
		 Node t;
		 if(root==null)
			 System.out.println("Empty List");
		 else 
		 {
			t=root ; //copy the root node
			root = root.next;
			System.out.println("Deleted"+t.data);
		 }
	 }
	 
	 void deleteRight()
	 {
		 
		 if(root==null)
			 System.out.println("Empty List");
		 else 
		 {
			 Node t , t2;
			t=t2 = root ; 
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			if(t==root)
				root=null;
	        t2.next = null;
			System.out.println("Deleted"+t.data);
		 }
	 }
	 void printList()
	 {
		 if(root==null)
		 {
			 System.out.println("Empty list");
		 }
		 else
		 {
			 Node t = root;
			 while (t!=null)
			 {
				 System.out.print("|" + t.data + "|");
				 t=t.next;
			 }
		 }
	 }
	 public static void main(String[] args)
	 {
		 Scanner in=new Scanner(System.in);
		 LinearLinkedList obj=new LinearLinkedList();
         obj.createList();
         int ch;
         do
         {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int e=in.nextInt();
                       obj.insertLeft(e);
                       break;
               case 2:
                       System.out.println("\nEnter a number:");
                       e=in.nextInt();
                       obj.insertRight(e);
                       break;    
               case 3:
                      obj.deleteLeft();
                      break;
               case 4:
                      obj.deleteRight();
                      break;
               case 5:
                      System.out.println("\nelements in list:");
                      obj.printList();
                       break;
               case 0:
                       System.out.println("Exiting");
                   break;
               default:
                       System.out.println("Wrong Choice");
                   break;
           }
             
         }while(ch!=0);
     }
    
}