package DAY3_DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkListMain {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DoublyLinkListClass obj=new DoublyLinkListClass();//object created
	        int ch, e;
	        obj.create_list();//creating LinkedList
	        do {
	            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Print Reverse\n0.Exit :");
	            ch = in.nextInt();
	            switch (ch) {
	                case 1:
	                    System.out.println("Enter element:");
	                    e = in.nextInt();
	                    obj.insert_left(e);
	                    System.out.println("Element Inserted");
	                    break;

	                case 2:
	                    System.out.println("Enter element:");
	                    e = in.nextInt();
	                    obj.insert_right(e);
	                    System.out.println("Element Inserted");
	                    break;

	                case 3:
	                    obj.delete_left();
	                    break;

	                case 4:
	                    obj.delete_right();
	                    break;
	                case 5:
	                    obj.print_list();
	                    break;
	                case 6:
	                    obj.print_list_rev();
	                    break;

	                case 0:
	                    System.out.println("Exiting....");
	                    break;

	                default:
	                    System.out.println("Wrong option selected");
	                    break;

	            }

	        } while (ch != 0);
	    }
	}