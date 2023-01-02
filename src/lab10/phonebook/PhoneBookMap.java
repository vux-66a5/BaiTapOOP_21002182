package lab10.phonebook;

import java.util.HashMap;
import java.util.Set;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByLastName(String lastname) {
        Set<String> keySet = phoneBook.keySet();
        for (String key : keySet
        ) {
            if (phoneBook.get(key).getLastname().equals(lastname)) {
                return phoneBook.get(key);
            }
        }
        return null;
    }

    @Override
    public Student searchByName(String name) {
        Set<String> keySet = phoneBook.keySet();
        for (String key : keySet
        ) {
            if (phoneBook.get(key).getName().equals(name)) {
                return phoneBook.get(key);
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        Set<String> keySet = phoneBook.keySet();
        for (String key : keySet
        ) {
            if (phoneBook.get(key).getPhone().equals(phone)) {
                return phoneBook.get(key);
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        Set<String> keySet = phoneBook.keySet();
        for (String key : keySet
        ) {
            if (phoneBook.get(key).getPhone().equals(phone)) {
                phoneBook.remove(key);
            }
        }
    }
}
