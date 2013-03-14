class IntQueueTest {
    public static void main(String[] args) {
	IntQueue iq = new IntQueue(5);
        iq[0] = 7;
        iq[1] = 4;
        iq[2] = 5;
        iq[3] = 1;
        iq[4] = 9;

	//tests here:
        //clear, getall, size
        //yuri and jetta
        
        System.out.println(iq.size);
        System.out.println(iq.GetAll);
	System.out.println(iq.clear); 

        //Sam and Colette testing
		System.out.println("size: "+ iq.sizeQueue());
		
        //		System.out.println("queue:");
        //		while(!iq.isEmpty())
        //		{
        //			System.out.println(iq.get());
        //		}
		
		IntStack is = iq.toStack();
		
		
		
		System.out.println("stack:");
		while(!is.isEmpty())
		{
			System.out.println(is.pop());
		} 
	
    }
}
