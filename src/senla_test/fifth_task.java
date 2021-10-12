package senla_test; // задача о сейфе

import java.util.Scanner;

public class fifth_task {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Вводите только целые числа \n Укажите объем сейфа");
        int safeVolume = scanner.nextInt();
        System.out.println("Введите количество предметов");
        int n = scanner.nextInt();
        int[] value = new int[n];
        System.out.println("Вводите цены предметов:");
        for (int i = 0; i < n; i++) {
            value[i] = scanner.nextInt();
        }
        int[] volume = new int[n];
        System.out.println("Вводите объем предметов");
        for (int i = 0; i < n; i++) {
            volume[i] = scanner.nextInt();
        }

        int[] safeValue = new int[safeVolume + 1];

        for (int i = 0; i <= safeVolume; i++) {
            for (int j = 0; j < n; j++) {
                if (volume[j] <= i) {
                    safeValue[i] = Math.max(safeValue[i], safeValue[i - volume[j]] +
                            value[j]);
                }
            }
        }
        System.out.println(safeValue[safeVolume]);
    }
}// fifth task done