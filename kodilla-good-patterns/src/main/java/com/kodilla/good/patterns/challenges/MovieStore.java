package com.kodilla.good.patterns.challenges;
//Wykorzystując poznane już Streamy
// wykonaj iterację po poniższej mapie tytułów
// i wyświetl wszystkie tytuły w jednym ciągu separując je wykrzyknikiem:


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    public Map <String, List <String>> getMovies () {

        List <String> ironManTranslations = new ArrayList <>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List <String> avengersTranslations = new ArrayList <>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List <String> flashTranslations = new ArrayList <>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map <String, List <String>> booksTitlesWithTranslations = new HashMap <>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    BookDirectory theBookDirectory = new BookDirectory();
    String theResultStringOfBooks = theBookDirectory.getList().stream()
            .filter(book -> book.getYearOfPublication() > 2005)
            .map(Book::toString)
            .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);


}