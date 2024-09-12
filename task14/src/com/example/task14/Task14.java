package com.example.task14;

public class Task14 {


    public static int reverse(int value) {
        String strNum = Integer.toString(value);

        if (strNum.length() > 0) {
            return Integer.parseInt(new StringBuilder(strNum).reverse().toString());
        }

        return 0;
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
