package hus.oop.lab4.yourturn;

public class Author {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
