package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        int result = Integer.valueOf(new StringBuilder(String.valueOf(value)).reverse().toString());
        return result;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
