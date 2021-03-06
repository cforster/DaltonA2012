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
   
    //Morris

    int bump(int depth)
    {
	int x; //temporary variable to store value of depth
	x = q[depth];
	q[depth] = q[depth-1];
	q[depth-1] = x;
    }

    //Yuri and Jetta
    
    //clear the array: this resets the front and back counters to 0
    void clear (int [] q)
    {
        front = 0;
        back = 0;
    }
    
    //return the size of the queue: this takes the size of the array and sets it as the size of the queue
    int sizeQueue (int [] q)
    {
        int size = q.size;
        return size;
    }
    
    //return the entire queue: this returns the entire array by printing an int array display
    int [] getAll (int [] q)
    {
        int [] display = new Int [size];
        
        for( i = 0; i < q.size; i++)
        {
            display[i] = q[i];
        }
        
        return display;
    }

    void resize()
    {
	//currently unimplemented
    }

    //tyler,noelle,tiluna

    int[] get(int x)
    {
	//new array
    	int[] getmult = new int[x];
	
	//repeat x times:
	for(int i =0; i<x; i++)
	    {
		//get an item
		//put it into the array
		getmult[i] = get();
	    }

	return getmult;
    }
  
	//toStack : Sam and Colette
	IntStack toStack()
	{
		IntStack s = new IntStack(q.length);
		int qelement = get();
        
		System.out.println(front + " " + back);
        
		while(qelement != -1)
		{
			s.push(qelement);
			qelement = get();
		}
		
		
		return s;
	}


    //putget Steven Barker and Jared Mandelbaum
    //put item in back of queue
    //get different item from front of queue
    
 	int putget(int i)
	{
		put(i);
		return get();
	}

}
