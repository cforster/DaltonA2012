class IntStackTest
{
    public static void main(String[] args)
    {
	IntStack is = new IntStack(2);
        int[] nums = new int[5];
        
        System.out.println("enter values");
        for(int i=0;i<nums.length; i++)
        {
            
        }
	System.out.println(is.isEmpty());
        push(int[] nums);
        //for(int i=0; i< )
        //is.push(4);
        //is.push(5);
        //is.push(6);
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

	//testing for multiple push:
	System.out.println("testing for push(int[])");
	is.push(new int[] {1,2,3,4,5});
	System.out.println("should be 5:" + is.peek());
	for(int i=0; i<5; i++)
	    {
		System.out.println("should be " + (5-i) + ": " +is.pop());
	    }
    }
}
