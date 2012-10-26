class IntStackTest
{
    public static void main(String[] args)
    {
	IntStack is = new IntStack(2);

	System.out.println(is.isEmpty());
	is.push(4);
	is.push(5);
	is.push(6);
       	System.out.println(is.pop());
	System.out.println(is.peek());
	System.out.println(is.isEmpty());


	//testing for peek depth
	System.out.println(is.peek(2));
	System.out.println(is.peek(5));

	//testing for flip
	is.flip();
	System.out.println(is.peek()); //should be 4


	//testing for pushpop
	is.push(9);
	int popped = is.pushpop(4);
	System.out.println(popped);
	System.out.println(is.peek());
   }
}
