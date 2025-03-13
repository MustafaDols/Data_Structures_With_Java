package Deque;

import java.util.Deque;
import java.util.LinkedList;

    class Main {
        public static void main(String[] args) {

            Deque<Integer> numbers = new LinkedList<>();


            numbers.addFirst(1);
            numbers.addLast(10);
            numbers.addFirst(2);
            numbers.addLast(11);


            System.out.println("Deque: " + numbers);


            numbers.removeFirst();
            numbers.removeLast();


            System.out.println("Deque after removing elements: " + numbers);
        }
    }
