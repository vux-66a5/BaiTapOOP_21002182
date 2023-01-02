package lab10.phonebook;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByLastName(String lastname);

    Student searchByName(String name);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
