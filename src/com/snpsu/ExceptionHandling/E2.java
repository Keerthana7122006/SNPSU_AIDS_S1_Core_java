package com.snpsu.ExceptionHandling;

public class E2 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[1]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done Sucessfully");
        }
        System.out.println("Hello");
    }
}
