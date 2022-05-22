package com.company;

public class Book {
    String titel;
    int price;
    int yearprint;
    Author name;

    public Book(String titel, int price, int yearprint, Author name) {
        this.titel = titel;
        this.price = price;
        this.yearprint=yearprint;
        this.name = name;
    }
    public void print(){
        System.out.println("Book: "+ titel+". Author is: "+ name.toString()+". Print in "+ yearprint+". Price is: "+price);
    }
    public String toString(){
        return "Book: "+ titel+". Author is: "+ name.toString()+". Print in"+ yearprint;
    }
}
