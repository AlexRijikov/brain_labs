package ua.zp.brain.labs.oop.basics.alex_rijikov;

public class Book  {

    public  String nameBook;
    public String authorBook;
    public int year;

    Book() {
        this.nameBook = "неизвестно";
        this.authorBook = "неизвестно";
        this.year = 0;
    }

    Book(String name, String author, int year) {

        this.nameBook = name;
        this.authorBook = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", year=" + year +
                '}';
    }
    public void Info() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", nameBook, authorBook, year);


    }


}
