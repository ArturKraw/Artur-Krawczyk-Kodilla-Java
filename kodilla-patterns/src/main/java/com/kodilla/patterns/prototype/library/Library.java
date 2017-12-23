package com.kodilla.patterns.prototype.library;


    import java.util.HashSet;
    import java.util.Set;
    import java.util.stream.IntStream;

public final class Library {
        final String name;
        final Set<Book> books = new HashSet<>();

        public Library(final String name) {
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
    }
