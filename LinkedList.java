/***
Colette Midulla
LinkedList sort
 ***/
public class LinkedList {
  //this is our code
  public static void main(String[] args) {
    Node n1 = new Node();
    Node n2 = new Node();
    Node n3 = new Node();
    Node n4 = new Node();
    
    n1.value = 'C';
    n1.link = n2;
    n2.value = 'A';
    n2.link = n3;
    n3.value = 'T';
    n3.link = null;
    
    n4.value = 'S';
    insert(n1, 2, n4);

    //printLL(n1);
    printLL(sort(n1));
  }
  
  
  static void insert(Node ll, int i, Node n)//tiluna noelle jared
  {
    Node insertspot = peek(ll, i);
    n.link = insertspot.link;
    insertspot.link=n;
  }
  
  //steven and tyler
  static void delete(Node ll, int i)
  {
      Node n = peek(ll, i-1); //is the i-1th node
      n.link = n.link.link;
  }
  
  static Node peek(Node n, int i) //Jetta Colette sam yuri
  {
    if(i==0) return n;
    else return peek(n.link, i-1); 
  }
  
  static int find(Node n, char c)
  {
    if(n.value==c) return 0;
    else if(n.link==null) return 1000000;
    else return 1+find(n.link, c);
  }
      
  static void printLL(Node n)
  {
    System.out.println(n.value);
    if(n.link!=null) printLL(n.link);
  }
  static int size(Node n){
	int counter = 0;
	while(n.link!=null)
	    {
		counter ++;
		n = n.link;
	    }
	return counter;
    }
    static void swap(Node n)
    {
	char temp = n.value;
	n.value = n.link.value;
	n.link.value = temp;
	// Node temp = n.link.link;
	//n.link.link = temp;
	//n.link.link=n;
	//n=n.link;
	//n.link=temp;
    }


    static Node sort(Node n)
  {
      boolean hasswapped = true;
      Node first = n;

      for(int i=0; i<size(n); i++) { //for open 

	  if(hasswapped == true) { //if open
	      hasswapped=false;
	      while(n.link!=null) {   //while open
		  if(n.value > n.link.value) //if it's greater than the next one, swap them.
		      { //if open
			     swap(n);
			     hasswapped=true;
			 }//if close
		 
		     n = n.link;
	      }//while close
	    }//if close
	  else
	      {
		  break;
	      }//else close
      }//for close

      return first;
 }//static node sort close
}
class Node 
{
  char value;
  Node link;
}  


