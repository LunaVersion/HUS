package hus.oop.lab6.SuperClassPerson;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Luna", "Ha Noi");
        System.out.println(person.toString());

        Student student = new Student("Luna","Ha Noi","K66",2003,100);
        System.out.println(student.toString());

        Staff staff = new Staff("MiniK", "Ha Noi","VNU",400000000);
        System.out.println(staff.toString());

        Person student1 = new Student("Luna", "Thanh Hoa","MiniK",2024,726);
        System.out.println(student1.toString());
    }
}
