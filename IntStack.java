class IntStack
{
    //declarations:
    private int[] st;
    private int top = 0;

    public IntStack(int size)
    {
	st = new int[size];
    }
    
    
    int pop()
    {
	if(isEmpty()) return -1;
	return st[--top];
    }

    void push(int i)
    {
	st[top++] = i;
	if(top==st.length) resize();
    }

    boolean isEmpty()
    {
	return !(top>0);
    }

    int peek()
    {
	if(isEmpty()) return -1;
	return st[top-1];
    }
    //This function "peeks" to a depth specified by the user, i.e. (peek(5))
    //Author: Morris Reeves
    //Variables: depth - number of spaces from the top
    //returns position at top-depth

    int peek(int depth)
    {
        if(depth>top) return -1;
	return st[top-depth];
    }

    
    int average()
    {
        //go through array and find values
        //add values together and divide by the amount of values
        //return new value
        
        int sum = 0;
        for(int i = 0; i<top.length; i ++){
            sum+ = st[i];
        }
        return sum/top;
        }
    }
    
    
    void resize()
    {
	int[] newArray = new int[st.length*2];

	for(int i =0; i<st.length; i++)
	{
	    newArray[i] = st[i];
	}

	st = newArray;
    
    void dumpall()
    {
        top = 0;
        
        
    }

    /*
     * Size for intstack
     * Charlie Forster
     * This is O(C)
     */
    int size()
    {
	return top;
    }


    // This function pops a certain number of places
    // Author: Jetta Garbasz
    // Variables: number - number of positions to pop
    // int array list - list of popped items

    int [] pop (int number)
    {
	int[] list = new int [number];
	  
	if(number > top || number < 0) // if the user is asking to pop more elements than are in the stack or a negative number of elements
	    {
       		list[0] = -1;
	    }

	else //the user is asking for a valid number of pops
	{
	    for ( int i = 0; i < number; i++)
	    {
		list [top + i] = st[top + i];
	    }
	}

	top = top - number; //reassign the new top
	return list;
    }

    //this is a multi push--push all items in the arrray
    //sam and col
    void push(int[] nums)
    {
	if(size() < nums.length) return;
	for(int i=0; i<nums.length ; i++)
	    {
		push(nums[i]);
	    }
    }
    //exception: stack is less than array length


    /*
      flip()
      Authors Forster & Durkin
      makes the top the bottom, and bottom the top
     */
    void flip()
    {
	int[] flipped = new int[st.length];

	for(int i=0; i!=top; i++) {
	    flipped[i]=st[top-i-1];
	}


	st=flipped;
    }

//PushPop
//Jared Mandelbaum
//Steven Barker

    int pushpop(int x)
    {
	//pops the top item
	int retval = pop();

	//pushes x in
	push(x);

	return retval;
    }
    


}
