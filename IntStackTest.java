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
	
    }
}