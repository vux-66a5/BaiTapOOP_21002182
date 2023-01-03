package lab08.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map.containsKey(key)) {
            if (map.containsValue(value)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();

    }

    public static Set<Integer> values(Map<Integer, Integer> map) {
        return (Set<Integer>) map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "black");
        colors.put(1, "white");
        colors.put(2, "red");
        return colors.get(value);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> data = new HashMap<>();
        data.put(1, 3);
        data.put(2, 4);
        data.put(3, 8);
        System.out.println(contains(data, 2));
        System.out.println(getColor(0));
    }
}
