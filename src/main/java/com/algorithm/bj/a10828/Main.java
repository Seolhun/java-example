package com.algorithm.bj.a10828;

/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/10828
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Testcase
    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());

        Stack stack = new Stack();
        for (int i = 0; i < T; i++) {
            String Q = bf.readLine();
            getResult(stack, Q);
        }
    }

    static void getResult(Stack stack, String q) {
        if (q.startsWith("push")) {
            stack.push(Integer.parseInt(q.split(" ")[1]));
        } else if (q.startsWith("pop")) {
            System.out.println(stack.pop());
        } else if (q.startsWith("size")) {
            System.out.println(stack.size());
        } else if (q.startsWith("empty")) {
            System.out.println(stack.empty());
        } else if (q.startsWith("top")) {
            System.out.println(stack.top());
        }
    }
}

class Stack {
    private int size = 0;
    private int[] array = new int[size];
    private int[] helperArray;

    private int[] addElement(int value) {
        size++;
        helperArray = new int[size];
        System.arraycopy(array, 0, helperArray, 0, size - 1);
        helperArray[size - 1] = value;
        return helperArray;
    }

    private int[] removeElement() {
        size--;
        helperArray = new int[size];
        System.arraycopy(array, 0, helperArray, 0, size);
        return helperArray;
    }

    void push(int value) {
        array = addElement(value);
    }

    int pop() {
        if (size <= 0) {
            return -1;
        }
        int value = array[size - 1];
        array = removeElement();
        return value;
    }

    int size() {
        return size;
    }

    int empty() {
        return size <= 0 ? 1 : 0;
    }

    int top() {
        if (size <= 0) {
            return -1;
        }
        return array[size - 1];
    }
}
