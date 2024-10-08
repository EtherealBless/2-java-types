package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        int res = 0;
        if (value < 0) {
            value = value * -1;
        }
        while (value > 0) {
            res = res * 10 + value % 10;
            value = value / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
