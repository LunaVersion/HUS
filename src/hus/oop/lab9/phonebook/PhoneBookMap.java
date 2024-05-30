package hus.oop.lab9.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {

    private final HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    // We use the phone number as key because it is unique
    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(), s);
    }

    public Student searchByName(String name) {
        for (Student s : phoneBook.values()) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public Student searchByLastname(String lastname) {
        for (Student s : phoneBook.values()) {
            if (s.getLastName().equals(lastname)) {
                return s;
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public String toString() {
        return "PhoneBookMap{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
