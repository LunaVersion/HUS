package hus.oop.lab9.phonebook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();

        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByLastname("Poppi"));
        System.out.println(pb.searchByNumber("1111"));
        System.out.println(pb);

        pb.deleteByNumber("24564");
        System.out.println(pb.searchByLastname("Poppi"));

        System.out.println();

        PhoneBook phoneBookList = new PhoneBookList();
        phoneBookList.addPerson(new Student("Luna","Lee","0354979586",4.4));
        phoneBookList.addPerson(new Student("MiniK", "Lee", "0876669799",4.0));
        phoneBookList.addPerson(new Student("Mico","Jackson","064926473", 4.0));

        System.out.println("Search by name (Luna)");
        System.out.println(phoneBookList.searchByName("Luna"));
        System.out.println(phoneBookList);
        System.out.println("Delete by phone (064926473)");
        phoneBookList.deleteByNumber("064926473");
        System.out.println("Person has last name Jackson is: ");
        System.out.println(phoneBookList.searchByLastname("Jackson"));
    }
}

