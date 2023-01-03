package lab10.mylist;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        for (int i = INITIAL_SIZE - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = o;
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    //    @Override
//    public void remove(int index) {
//        for(int i = index; i < INITIAL_SIZE - 1; i++) {
//            elements[i] = elements[i+1];
//        }
//        size--;
//
//    }
    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        /* move array elements into memory */
        System.arraycopy(elements, index + 1, elements, index, size - index);
        elements[size--] = null;
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
