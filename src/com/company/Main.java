package com.company;

public class Main {

    public static void main(String[] args) {

        Author a1 = new Author("Stephen", "King", 1947);
        Author a2 = new Author("Jack", "London", 1876);
        Author a3 = new Author("Liane", "Moriarty", 1966);

        Book b1 = new Book("It", 600, 1995, a1);
        Book b2 = new Book("Martin Iden", 830, 2000, a2);
        Book b3 = new Book("Big little lies", 1000, 2019, a3);

        Book[] allbook = {b1, b2, b3};
        for (int i = 0; i < allbook.length; i++) {
            allbook[i].print();
        }

    }
}
