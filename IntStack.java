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

    void resize()
    {
	int[] newArray = new int[st.length*2];

	for(int i =0; i<st.length; i++){
	    newArray[i] = st[i];
	}

	st = newArray;
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



}
