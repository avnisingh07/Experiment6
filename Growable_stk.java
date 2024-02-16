package assignment6;

import java.util.*;

public class Growable_stk implements Interface_stk
{

    ArrayList<Integer> stack;
    int top = -1;



    public Growable_stk() {

        stack = new ArrayList<Integer>(5);
        this.top = -1;

    }

    @Override
    public void push(int element)
    {
        stack.add(++top, element);

    }

    @Override
    public int pop() {
        if(underflow())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            int element = stack.get(top);
            stack.remove(top--);
            return element;
        }
        return -1;
    }

    @Override
    public void displayStack() {
        // TODO Auto-generated method stub
        for(int x:stack)
        {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    @Override
    public boolean overflow()
    {
        System.out.println("Not applicable for growable stack");
        return false;

    }

    @Override
    public boolean underflow()
    {
        return top == -1;
    }



}
