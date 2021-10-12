package senla_test.fourth; // цифры в ascii

import java.util.*;

public class fourth_task {
    private static final Scanner scanner = new Scanner(System.in);
    public static final StringBuilder output = new StringBuilder();

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        String input = scanner.nextLine();
        char[] digits = input.toCharArray();
        List<Integer> keys = new ArrayList<>();
        for (char c : digits) {
            keys.add(Character.getNumericValue(c));
        }

        Map<Integer, String> first = new HashMap<>();
        first.put(0, "**** ");
        first.put(1, "   * ");
        first.put(2, " **  ");
        first.put(3, "**** ");
        first.put(4, "*  * ");
        first.put(5, "**** ");
        first.put(6, "**** ");
        first.put(7, "**** ");
        first.put(8, "**** ");
        first.put(9, "**** ");
        Map<Integer, String> second = new HashMap<>();
        second.put(0, "*  * ");
        second.put(1, "   * ");
        second.put(2, "*  * ");
        second.put(3, "   * ");
        second.put(4, "*  * ");
        second.put(5, "*    ");
        second.put(6, "*    ");
        second.put(7, "   * ");
        second.put(8, "*  * ");
        second.put(9, "*  * ");
        Map<Integer, String> third = new HashMap<>();
        third.put(0, "*  * ");
        third.put(1, "   * ");
        third.put(2, "  *  ");
        third.put(3, "**** ");
        third.put(4, "**** ");
        third.put(5, "**** ");
        third.put(6, "**** ");
        third.put(7, "   * ");
        third.put(8, "**** ");
        third.put(9, "**** ");
        Map<Integer, String> fourth = new HashMap<>();
        fourth.put(0, "*  * ");
        fourth.put(1, "   * ");
        fourth.put(2, " *   ");
        fourth.put(3, "   * ");
        fourth.put(4, "   * ");
        fourth.put(5, "   * ");
        fourth.put(6, "*  * ");
        fourth.put(7, "   * ");
        fourth.put(8, "*  * ");
        fourth.put(9, "   * ");
        Map<Integer, String> fifth = new HashMap<>();
        fifth.put(0, "**** ");
        fifth.put(1, "   * ");
        fifth.put(2, "**** ");
        fifth.put(3, "**** ");
        fifth.put(4, "   * ");
        fifth.put(5, "**** ");
        fifth.put(6, "**** ");
        fifth.put(7, "   * ");
        fifth.put(8, "**** ");
        fifth.put(9, "**** ");

        List<Map<Integer, String>> maps = new ArrayList<>();
        maps.add(first);
        maps.add(second);
        maps.add(third);
        maps.add(fourth);
        maps.add(fifth);

        int maxDig = Collections.max(keys);

        for (Map<Integer, String> map : maps) {
            for (Integer key : keys) {
                if (key == maxDig) {
                    output.append(map.get(key).replaceAll("\\*", key.toString())).append(" ");
                } else {
                    output.append(map.get(key)).append(" ");
                }
            }
            output.append("\n");
        }
        System.out.println(output);
    }
}
// fourth task done