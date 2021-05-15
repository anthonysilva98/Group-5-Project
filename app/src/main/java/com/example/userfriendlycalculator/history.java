package com.example.userfriendlycalculator;
import java.util.*;
//by Edgar

public class history extends MainActivity {
    Stack<Integer> stack = new Stack<Integer>();

    //push result into stack
    public void writeResult(int n) {
        stack.push(n);
    }

    //i want this to pop into a result screen, but I don't know how to do that
    //maybe create an array of exactly the size of the stack? probably redundant
    public int[] readResult() {
        int count = stack.size();
        int[] array = new int[count];

        for(int i = 0; i < count; i++){
            array[i] = stack.pop();
        }

        return array;
    }

}
