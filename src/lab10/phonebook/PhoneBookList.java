package lab10.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;
    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }
    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student: phoneBook
             ) { if (student.getLastname().equals(lastname)) {
                 return student;
        }

        }
        return null;
    }

    @Override
    public Student searchByName(String name) {
        for (Student student: phoneBook
        ) { if (student.getName().equals(name)) {
            return student;
        }

        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student: phoneBook
        ) { if (student.getPhone().equals(phone)) {
            return student;
        }

        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                phoneBook.remove(i);
            }
        }
    }
}
