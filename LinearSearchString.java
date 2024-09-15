package com.anonymous.p1;
import java.util.*;

/**
 *   This class implements a simple Linear Search algorithm.
 *   The purpose of this class is to demonstrate how to search for a target element
 *   in an array by checking each element sequentially.
 *
 * @author DIPESH
 * @date 9/14/2024
 */
public class LinearSearchString {
    public static int linearSearchString(String fruits[], String  key) {
        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the fruits name");
//        sc.nextLine();
        String fruits[] = {"apples", "mango", "Guava", "litchi", "strawberry"};
        String key = "Guava";
        int index = linearSearchString(fruits, (key));
        if(index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Key found at : " + index);
        }
    }
}
