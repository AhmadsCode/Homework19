/*
  Author: Ahmad
  CSC 201-004N
  Assignment 19
  Problem 19.10
  (Largest element in ArrayList)
  Write the following method that returns the largest element in an ArrayList:
 */

import java.util.ArrayList;

public class Homework19 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(max(list));

    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E largest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(largest) > 0) {
                largest = list.get(i);
            }
        }

        return largest;
    }
}