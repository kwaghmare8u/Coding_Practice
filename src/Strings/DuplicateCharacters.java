package Strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "test string";
        printDups(str);
    }

    private static void printDups(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() > 1) {
                System.out.println("Key " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
