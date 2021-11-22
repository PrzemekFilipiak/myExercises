package Zadanie_19_app;

public class Author {

    private String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;                // this.surname odwouje sie do pola private String surname;
                                                // i przypisuje "surname" - parametr konstruktora
                                                //  public Author(String surname,
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
