package A;

public class ConditionalStatements {


    public static void main(String [] args) {
        int a = 5;
        int b = 2;

        if (a % 2 == 0)
            System.out.println(a * b);
        else
            System.out.println(a + b);

        //Определить какой четверти принадлежит точка с координатами (х,у); 1 четверть - x>0, y>0, 2 четверть - x<0, y>0,
        // 3 четверть - x<0, y<0, 4 четверть - x>0, y<0, точка 0
        float x, y;
        x = 0;
        y = 1;

        if (x > 0) {
            if (y > 0) {
                System.out.println("1 четверть");
            } else {
                System.out.println("4 четверть");
            }
        }
        if (x < 0) {
            if (y < 0) {
                System.out.println("3 четверть");
            } else {
                System.out.println("2 четверть");
            }
        } else {
            System.out.println("Координата 0");
        }

       ConditionalStatements getSum = new ConditionalStatements();
       int result = getSum.getSumOfPositiveNumbers(10,-15,5);
        System.out.println("Поехали!!!" + result);

        int resultTwo = getSum.MaxSummery(6,7,8);
        System.out.println("Астанавитесь!!!" + resultTwo);

        String resultThree = getSum.StudentsRating(25);
        System.out.println("Вечный студент!!!" + resultThree);

    }



//Найти суммы только положительных из трех чисел

    public int getSumOfPositiveNumbers(int One, int Two, int Three) {
        int sum = 0;

        if (One > 0) {
            sum = sum + One;
        }
        if (Two > 0) {
            sum = sum + Two;
        }
        if (Three > 0) {
            sum = sum + Three;
        }

        return sum;

    }





    //Посчитать выражение (макс(а*б*с, а+б+с))+3

    public int MaxSummery(int c, int d, int e) {
        int sum = 0;
        if (c + d + e > c * d * e) {
            sum = c + d + e + 3;
        } else if (c + d + e < c * d * e) {
            sum = (c * d * e) + 3;
        } else if (c + d + e == c * d * e) {
            sum = c + d + e + 3;
            System.out.print("Оба значения одинаковы");
        }
        return sum;
    }

    //Написать программу определения оценки студента по его рейтингу, на основе следующих правил
    // Рейтинг 0-19 - F; 20-39 - E; 40-59 - D; 60-74 - C; 75-89 - B; 90-100 - A

    public String StudentsRating(int j) {
        String grade = null;
//        j = 0;
        if (j >= 0 & j <= 19) {
            grade = "F";
        } else if (j >= 20 & j <= 39) {
            grade = "E";
        } else if (j >= 40 & j <= 59) {
            grade = "D";
        } else if (j >= 60 & j <= 74) {
            grade = "C";
        } else if (j >= 75 & j <= 89) {
            grade = "B";
        } else if (j >= 90 & j <= 100) {
            grade = "A";
        } else if (j > 100 || j <-1) {
            grade = "Non-existent assessment";
            System.out.print(grade);
        }
       return grade;

    }
}





















