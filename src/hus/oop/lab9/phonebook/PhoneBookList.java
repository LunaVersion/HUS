package hus.oop.lab9.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBookList implements PhoneBook{
    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<Student>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student s : phoneBook) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student s : phoneBook) {
            if (s.getLastName().equals(lastname)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student s : phoneBook) {
            if (Objects.equals(s.getPhone(), phone)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "PhoneBookList{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.removeIf(s -> Objects.equals(s.getPhone(), phone));
    }
}
