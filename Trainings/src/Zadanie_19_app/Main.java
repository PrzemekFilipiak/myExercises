package Zadanie_19_app;

public class Main<arrAuthor> {
//    Napisz program, składający się z kilku klas:
//    a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
//    b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)
//    c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
//    i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
//    ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)

    public static void main(String[] args) {
//        Poem p1 = new Poem(new Author("Sapkowski", "Polish"), 50);
//        Poem p2 = new Poem(new Author("Dukaj", "Polish"), 15);
//        Poem p3 = new Poem(new Author("Lem", "Polish"), 70);
//        Poem[] arrAuthor = {p1, p2, p3};
        Poem[] arrAuthor = new Poem[]{
                new Poem(new Author("Sapkowski", "Polish"), 500),
                new Poem(new Author("Dukaj", "Polish"), 850),
                new Poem(new Author("Lem", "Polish"), 700)
        };

        getAuthorWithMaxStrophes(arrAuthor);
    }

        private static void getAuthorWithMaxStrophes(Poem[] arrAuthor) {
        // dwa razy dluzej, do optymalizacji
            int maxStropheNumbers = arrAuthor[0].getStropheNumbers();
//             Poem longestPoem = null;
            for (int i = 1; i < arrAuthor.length; i++) {
                if (arrAuthor[i].getStropheNumbers() > maxStropheNumbers) {
                    maxStropheNumbers = arrAuthor[i].getStropheNumbers();
                }
            }

            for (Poem poem : arrAuthor) {
                if (maxStropheNumbers == poem.getStropheNumbers()) {
                    System.out.println(poem.getCreator().getSurname());
                }
            }
//            System.out.println(maks);
        }
}