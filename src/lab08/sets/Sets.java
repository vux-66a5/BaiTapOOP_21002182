package lab08.sets;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersec = new HashSet<>();
        for (int f : first) {
            for (int s : second) {
                if (f == s) {
                    intersec.add(f);
                    //intersec.add(s)
                }
            }
        }
        return intersec;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersec = new HashSet<>(first);
        intersec.retainAll(second);
        return intersec;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>(first);
        unionSet.addAll(second);
        return unionSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>(first);
        for (int f : first) {
            for (int s : second) {
                if (f != s) {
                    unionSet.add(s);
                }
            }
        }
        return unionSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        //one-line solutionList<Integer> listVal = new ArrayList<>(source);
        List<Integer> listVal = new ArrayList<>();
        for (int i : source)
            listVal.add(i);
        return listVal;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> sourceSet = new LinkedHashSet<>(source); //If we need to preserve the order, we can use LinkedHashSet
        List<Integer> sourceList = new ArrayList<>(sourceSet);
        //one-line solution: List<Integer> sourceList = new ArrayList<>(new LinkedHashSet<>(source));
        return sourceList;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        ArrayList<Integer> noDuplicate = new ArrayList<Integer>();
        for (int element : source) {
            if (!noDuplicate.contains(element)) {
                noDuplicate.add(element);
            }
        }

        return noDuplicate;
    }

    public static String firstRecurringCharacter(String s) {
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (strSet.contains(Character.toString(s.charAt(i)))) {
                return Character.toString(s.charAt(i));
            } else {
                strSet.add(Character.toString(s.charAt(i)));
            }
        }
        return "None";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> charsRes = new LinkedHashSet<>();
        Set<Character> noDuplicateChars = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (noDuplicateChars.contains(s.charAt(i))) {
                charsRes.add(s.charAt(i));
            } else {
                noDuplicateChars.add(s.charAt(i));
            }
        }
        return charsRes;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] res = new Integer[source.size()];
        int i = 0;
        for (int element : source) {
            res[i++] = element;
        }
        return res;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

    public static void main(String[] args) {
        Set<Integer> data = new LinkedHashSet<Integer>(); //read line 52
        data.add(0);
        data.add(1);
        data.add(3);
        data.add(2);
        data.add(4);

        Set<Integer> data2 = new HashSet<Integer>();
        data2.add(0);
        data2.add(1);
        data2.add(5);
        data2.add(7);
        data2.add(2);
        data2.add(3);
        data2.add(4);

        TreeSet<Integer> data3 = new TreeSet<Integer>(Arrays.asList(0, 3, 4, 2, 1));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 3, 3, 2));

        System.out.println("data: " + data);
        System.out.println("data2: " + data2);
        System.out.println("data3: " + data3);
        System.out.println("list: " + list);
        System.out.println();
        System.out.println("Test intersection()");
        System.out.println("Intersection of data vs data2: " + intersection(data, data2));
        System.out.println(intersectionManual(data, data2));
        System.out.println();
        System.out.println("Test union()");
        System.out.println("Union of data vs data2: " + union(data, data2));
        System.out.println(unionManual(data, data2));
        System.out.println();
        System.out.println("Test removeDuplicates()");
        System.out.println("list after remove duplicated: " + removeDuplicates(list));
        System.out.println(removeDuplicatesManual(list));
        System.out.println();
        System.out.println("Test toList()");
        System.out.println(toList(data));
        System.out.println();
        System.out.println("Test Recurring()");
        System.out.println(firstRecurringCharacter("abcd"));
        System.out.println(firstRecurringCharacter("abag"));
        System.out.println(allRecurringChars("mamma"));
        System.out.println();
        System.out.println("Test toArray");
        System.out.println("data: " + Arrays.toString(toArray(data)));
        System.out.println();
        System.out.println("Test TreeSet");
        System.out.println("Tree set: " + data3);
        System.out.println("First of treeset: " + getFirst(data3));
        System.out.println("Last of treeset: " + getLast(data3));
        System.out.println("first elements > 2: " + getGreater(data3, 2));
    }
}
