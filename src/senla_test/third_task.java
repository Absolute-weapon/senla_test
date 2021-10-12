package senla_test; // подсчет количества гласных, сортировка по убыванию гласных, первая гласная заглавная

import java.util.HashMap;
import java.util.Scanner;

public class third_task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String vowels = "аеёиоуэюя";
        int countVow = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            for (Character charBox : word.toLowerCase().toCharArray()) {
                if (vowels.contains(charBox.toString())) {
                    if (countVow == 0) {
                        word = word.replaceFirst(charBox.toString(), charBox.toString().toUpperCase());//считаем гласные переводим первую в апперкейс
                    }
                    countVow++;
                }
            }
            map.put(word, countVow);// создаем словарь
            countVow = 0;
        }
        map.entrySet().stream()
                .sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed())// сортировка по количеству гласных
                .forEach(System.out::println);
    }
} // third task done