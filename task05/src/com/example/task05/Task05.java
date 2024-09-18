package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String xStr = String.valueOf(x);
        for (int i = 0; i < xStr.length(); i++)
        {
            if (Integer.parseInt(xStr.substring(i,i+1))%2==1)
            {return "FALSE";}
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(2244);
        System.out.println(result);

    }

}
