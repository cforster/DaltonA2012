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
    }
}
