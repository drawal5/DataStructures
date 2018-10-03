package my.datastructure;
//A simple Java program for traversal of a linked list
class LinkedListSet1
{
 

 /* Linked list Node.  This inner class is made static so that
    main() can access it */
 static class Node {
     int data;
     Node next;
      
     // Constructor to create a new node
     // Next is by default initialized
     // as null
     Node(int d)  {
    	 data = d; 
    	 next=null;
    	 } 
  }
 
 Node head;
 
 // head of list/* This function prints contents of linked list starting from head */
 public void printList()
 {
     Node n = head;
     while (n != null)
     {
         System.out.print(n.data+" ");
         n = n.next;
     }
 }

 
 /* method to create a simple linked list with 3 nodes*/
 public static void main(String[] args)
 {
     /* Start with the empty list. */
     LinkedListSet1 llist = new LinkedListSet1();

     Node head  = new Node(1);
     Node second = new Node(2);
     Node third  = new Node(3);

     /* Three nodes have been allocated  dynamically.
       We have references to these three blocks as first,  
       second and third

         head            second             third
          |                |                  |
          |                |                  |
      +----+------+     +----+------+     +----+------+
      | 1  | null |     | 2  | null |     |  3 | null |
      +----+------+     +----+------+     +----+------+ */
     System.out.println("before: "+ head.next);
     head.next = second; // Link first node with the second node
      System.out.println("after: "+ head.next);
     /*  Now next of first Node refers to second.  So they
         both are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  | null |     |  3 | null |
     +----+------+     +----+------+     +----+------+ */

     second.next = third; // Link second node with the third node

     /*  Now next of second Node refers to third.  So all three
         nodes are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  |  o-------->|  3 | null |
     +----+------+     +----+------+     +----+------+ */

     llist.printList();
 }
}
