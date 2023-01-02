package lab10.mymap;

public class MyHashMap implements MyMap{
    final static int INITIAL_SIZE = 8;
    MyHashMapEntry[] table;
    int size = 0;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    public Object key(Object key) {
        int bucket = getBucket(key);
        if(table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    @Override
    public Object get(Object key) {
        return table[getBucket(key)];
    }

    public void put(Object key, Object value) {
        if(capacityRatio() > 0.6) {
            enlarge();
        }
        int bucket = getBucket(key);
        if(table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key,value);
            size++;
        }
    }
    @Override
    public void remove(Object key) {
        int idx = 0;
        for(int i = 0; i < table.length; i++) {
            if( table[i] != null && table[i].getKey() == key ) {
                idx = i;

            }
        }
        for(int i = idx; i < table.length-1; i++) {
            table[i] = table[i+1];
        }
    }
    public boolean contains(Object o) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getKey() == o) {
                return true;
            }
        }
        return false;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < table.length; i++) {
            if(table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s,%s)\n", i,table[i].getKey(),table[i].getValue()));
            }
        }
        return sb.toString();
    }
    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }
    double capacityRatio() {
        return size/ (double)table.length;
    }
    void enlarge() {
        MyHashMapEntry[] tmp = new MyHashMapEntry[table.length*2];
        System.arraycopy(table,0,tmp,0,table.length);
        table = tmp;
    }
}
