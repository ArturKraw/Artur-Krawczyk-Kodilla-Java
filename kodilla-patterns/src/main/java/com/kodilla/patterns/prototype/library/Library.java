package com.kodilla.patterns.prototype.library;


    import com.kodilla.patterns.com.kodilla.patterns.prototype.Prototype;

    import java.util.HashSet;
    import java.util.Set;
    import java.util.stream.IntStream;

public final class Library extends Prototype {
        String name;
        Set<Book> books = new HashSet<>();

        public Library(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Set<Book> getBooks() {
            return books;
        }

        @Override
        public String toString () {
            return "Library [name= '" + name + "']" + "\n" + books ;
        }

        public Library shallowCopy() throws CloneNotSupportedException {
            return (Library)super.clone();
        }
        public Library deepCopy() throws CloneNotSupportedException {
            Library clonedLibrary = (Library)super.clone();
            clonedLibrary.books = new HashSet<>();
            for(Book theBook : books) {
                Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(),
                        theBook.getPublicationDate() );
                clonedLibrary.getBooks().add(clonedBook);
            }
            return clonedLibrary;
        }

    }
