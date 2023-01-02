package lab10.library;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    String lastname;
    String phone;
    double average;
    String id;
    public Student(String id, String name, String lastname, String phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }
    public Student(String id, String name, String lastname, double average) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }
    public Student(String id, String name, String lastname, String phone, double average) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }
    @Override
    public int compareTo(Student s) {
        return 0;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }

        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Double.compare(student.average, this.average) == 0
                && Objects.equals(name, student.name)
                && Objects.equals(lastname, student.lastname)
                && Objects.equals(phone, student.phone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }
    @Override
    public String toString() {
        return "Student[" + "name=" + name + ", lastname=" + lastname + ", phone=" + phone + ", average=" + average + "]";
    }
}
