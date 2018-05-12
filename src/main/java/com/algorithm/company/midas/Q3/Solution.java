package com.algorithm.company.midas.Q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    // Testcase
    static int T;

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());

        Node[] connected = new Node[T];
        int[] times = new int[T];
        for (int i = 0; i < T - 1; i++) {
            String[] input = bf.readLine().split(",");
            connected[i] = new Node(input[0], input[1]);
        }

        String goal = bf.readLine();
        Stack<Node> stack = new Stack<>();
        stack.add(connected[0]);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.toString());
            for (int i = 0; i < connected.length; i++) {
                if(node.value.equals(connected[i].next)) {
                    times[i] = times[i] + 1 < times[i] ? times[i] + 1  : times[i] + 1 ;
                    stack.add(connected[i]);
                }
            }
        }

        System.out.println(times[connected.length - 1]);
    }

    static class Node {
        String value;
        String next;

        Node(String value, String next) {
            this.value = value;
            this.next = next;
        }
    }
}
