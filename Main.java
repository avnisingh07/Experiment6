package assignment6;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        int[] stack = new int[5];
        int t = -1;
        ArrayList<Integer> stackArray = new ArrayList<Integer>();
        //Interface_STK fixed_stk = new Fixed_stk(stack, t);

        Growable_stk grow_stk = new Growable_stk();

        grow_stk.push(1);
        grow_stk.push(2);
        grow_stk.push(3);
        grow_stk.push(4);
        grow_stk.push(5);
        grow_stk.push(6);
        grow_stk.displayStack();
    }


}
