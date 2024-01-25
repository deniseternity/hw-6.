package pro.Sky.Skypro;
import java.util.*;

class Main {
    public static void main(String[] args) {
        {

            System.out.println("задание 1");

        List<Integer> nums = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

        System.out.println("задание 2");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new HashSet<>(nums);
        for(Integer i : set) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("задание 3");

        List<String> myList = List.of("один", "два", "два", "три", "три");
        Set<String> set1 = new HashSet<>(myList);
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("задане 4");

        List<String> strings = List.of("один", "два","два", "три", "три", "три");
        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            map.get(word);
            var num = map.get(word);
            if (num == null) {
                map.put(word, 1);
            } else {
                map.put(word, num + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}