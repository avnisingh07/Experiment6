package assignment6;

public class Fixed_stk implements Interface_stk
{
    private int[] stack = new int[5];
    int top = -1;



    public Fixed_stk(int[] stack, int top) {
        super();
        this.stack = stack;
        this.top = top;
    }

    @Override
    public void push(int element) {
        // TODO Auto-generated method stub

        if(overflow())
        {
            System.out.println("Stack is full");
        }
        else
        {
            stack[++top] = element;
        }

    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub

        if(underflow())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }

    @Override
    public void displayStack() {
        // TODO Auto-generated method stub

        if(underflow())
        {
            System.out.println("Stack is empty");
        }
        for(int i = 0; i <= top; i++)
        {
            System.out.println(stack[i]);
        }

    }

    @Override
    public boolean overflow() {
        // TODO Auto-generated method stub
        return top == (stack.length - 1);
    }

    @Override
    public boolean underflow() {
        // TODO Auto-generated method stub

        return top == -1;

    }



}
