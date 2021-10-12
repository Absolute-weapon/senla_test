package senla_test.first; // вывод суммы цифр в строке

import java.util.Scanner;

public class first_task {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввод: ");
            String str = scanner.nextLine();
            int sum = 0;
            for (char c : str.toCharArray()) {
                if(Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }
            System.out.println(sum);
        }
}
// 1st task done