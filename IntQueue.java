class IntQueue {
    //declare:
    private int[] q;
    private int front=0;
    private int back=0;

    public IntQueue(int size)
    {
	q = new int[size];
    }

    void put(int item)
    {
	q[back]=item;
	back=(back+1)%q.size;
	if(back==front) resize();
    }

    int get()
    {
	if(isEmpty()) return -1;
	int retValue = q[front];
	front=(front+1)%q.size;
	return retValue;
    }

    boolean isEmpty()
    {
	return back==front;
    }

    void resize()
    {
	//currently unimplemented
    }

}
