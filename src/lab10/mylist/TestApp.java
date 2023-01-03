package lab10.mylist;

public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a", 0);
        l.add("b");
        l.add("c", 0);
        l.add("c", 3);
        l.remove(3);
        System.out.println(l.size());
        System.out.println(l);

//        MyLinkedList l1 = new MyLinkedList();
//        l1.add("x",0);
//        l1.add("y");
//        System.out.println(l1.size());
//        System.out.println(l1);
    }
}
