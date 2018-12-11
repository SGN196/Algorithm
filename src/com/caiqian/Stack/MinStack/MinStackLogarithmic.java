package com.caiqian.Stack.MinStack;

public class MinStackLogarithmic {






    public static void generateRandomInt(MinStack minStack){
        generateRandomInt(minStack, 20, 50);

    }

    public static void generateRandomInt(MinStack minStack, int size, int value){
        int[] a = new int[(int)(Math.random() * (size + 1))];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * (value + 1) - Math.random() * (value + 1));
        }

    }

    public static void isOk(){

        MinStack minStack = new MinStack();
        generateRandomInt(minStack);

    }


    public static void main(String[] args) {

        isOk();
    }
}
