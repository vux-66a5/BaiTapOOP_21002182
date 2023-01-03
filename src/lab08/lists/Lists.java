package lab08.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        //list.add(0,value);
        for (int i = 0; i <= list.size(); i++) {
            list.set(i + 1, list.get(i));
        }
        list.set(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size() - 1, value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.remove(list.indexOf(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> squareList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squareList.add(i * i);
        }
        return squareList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        int leftIdx = 0;
        int rightIdx = list.size() - 1;
        while (leftIdx < rightIdx) {
            int temp = list.get(leftIdx);
            list.set(leftIdx, list.get(rightIdx));
            list.set(rightIdx, temp);
            leftIdx++;
            rightIdx--;
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(3);
        arrlist.add(7);
        arrlist.add(2);
        arrlist.add(4);
        arrlist.add(1);
        arrlist.add(666);

        ArrayList<Integer> arrlist1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        LinkedList<Integer> arrlist2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        insertBeginningEnd(arrlist2, 7);
        System.out.println(arrlist2);
        //copy(arrlist,arrlist1);
        //System.out.println(arrlist1);

        System.out.println(arrlist);
        reverseManual(arrlist);
        System.out.println(arrlist);
        removeEvil(arrlist);
        System.out.println(arrlist);


    }
}
