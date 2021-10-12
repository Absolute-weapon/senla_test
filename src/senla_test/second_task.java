package senla_test; // факторизация простыми числами

import java.util.InputMismatchException;
import java.util.Scanner;

public class second_task {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число: ");
            long num = scanner.nextLong();
            StringBuilder string = new StringBuilder();
            long div = 2;
            while (div <= Math.sqrt(num)) { // корень для увеличения производительности
                if (isPrime(div) && num % div == 0)  {
                    string.append(div).append(" ");
                    num = num / div;
                    div = 2;
                } else {
                    div++;
                }
            } string.append(num).append(" "); // вывод если num простое число
            System.out.println(string);
        } catch (InputMismatchException e) {
            System.out.println("вы ввели не целое число!");
        }
    }
    public static boolean isPrime(long n) { // proverka na prostotu
        if (n <= 1) {
            return false;
        }
        for (int div = 2; div <= Math.sqrt(n); div++) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;
    }
}
// 2nd task done