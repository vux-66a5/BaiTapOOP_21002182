package lab05.authorandbookclassesyourturn;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        String description = "Author" +
                "[" +
                "name = " +
                this.name +
                ", email = " +
                this.email +
                ", gender = " +
                gender +
                "]";

        return description;
    }

}
