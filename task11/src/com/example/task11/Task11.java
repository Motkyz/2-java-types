package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {
        sum = sum / 100;
        // TODO исправьте функцию, чтобы избежать накопления ошибки
        float[] sums = new float[12];
        // Считаем проценты за год
        for (int i = 1; i <= 12; i++) {
            sum += sum * percent;
            sums[i-1] = sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
