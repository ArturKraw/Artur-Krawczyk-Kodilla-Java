package com.kodilla.testing.library;

public class Book {
    String title;
    String author;
    int publicatonYear;

    public Book (String title, String author, int publicatonYear) {
        this.title = title;
        this.author = author;
        this.publicatonYear = publicatonYear;
    }

    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

    public int getPublicatonYear () {
        return publicatonYear;
    }

    @Override
    public String toString () {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicatonYear=" + publicatonYear +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getPublicatonYear() != book.getPublicatonYear()) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode () {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + getPublicatonYear();
        return result;
    }
}
