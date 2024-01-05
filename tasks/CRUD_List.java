package tasks;

import java.util.Scanner;




public class CRUD_List {
   
	Enode root ;
	
	void createList()
	{
		root=null;
	}
	
	void insert(int emp_id, String name, String gender, double salary)
	{
		Enode n = new Enode( emp_id,name,gender,salary);
		if(root==null)
			 root=n;
		 else 
		 {
			 Enode t = root;
			 while(t.next!=null)
				 t=t.next;
			 t.next = n; 
		 }
		System.out.println("Data Inserted");
	}
	
	void update(Enode t)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\1.Update name \n2.Update gender \n3.Update Salary");
		int i_ch = in.nextInt();
		if(i_ch == 1)
		{
			System.out.println("old : "+ t.name);
			System.out.println("Enter new name :");
			t.name = in.nextLine();
		}
		if(i_ch == 2)
		{
			System.out.println("old : "+ t.gender);
			System.out.println("Enter gender :");
			t.gender = in.nextLine();
		}
		if(i_ch == 3)
		{
			System.out.println("old : "+ t.salary);
			System.out.println("Enter new salary :");
			t.salary = in.nextDouble();
		}
		System.out.println("\n Data updated successfully");
	}
	
	
	
	void printList()
	 {
		 if(root==null)
		 {
			 System.out.println("Empty list");
		 }
		 else
		 {
			 Enode t = root;
			 while (t!=null)
			 {
				 System.out.println(t.emp_id+ "," + t.name+","+t.gender + ","+t.salary);
				 t=t.next;
			 }
		 }
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 CRUD_List obj = new CRUD_List();
		 obj.createList();
		
	 
	 }
}


