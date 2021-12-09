package A;

import java.util.Scanner;

public class Cycles<Public> {
    public static int a;
    public int sum;
    public int number;
    public String result;

//Найти сумму четных чисел и их количество в диапазоне от 1 до 99


    public String SummaChutney() {
        int sum = 0;
        int number = 0;
        String result = null;

        for (int a = 1; a < 100; a++) {
            if (a % 2 == 0) {
                number++;
            }
            if (a % 2 == 0) {
                sum += a;
            }
        }

        result = "Сумма четных чисел:" + sum + "Сумма четных чисел в диапазоне от 1 до 99:" + number;
        return result;
    }


    //Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)

  //  public void ProstoeChislo() {
        Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // if (a / a == 0) {
    //     System.out.println("Простое число");
    // }

    //

}






//Найти корень натурального числа с точностью до целого (рассмотреть вариант последовательного подбора и метод бинарного поиска)
//Вычислить факториал числа n. n! = 1*2*…*n-1*n;
//Посчитать сумму цифр заданного числа
//Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.