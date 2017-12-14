package com.kodilla.good.patterns.challenges.MovieStorePack;

import java.util.stream.Collectors;

//Wykorzystując poznane już Streamy
// wykonaj iterację po poniższej mapie tytułów
// i wyświetl wszystkie tytuły w jednym ciągu separując je wykrzyknikiem:
public class MovieStoreExecutor {

    public static void main (String args[]) {

        MovieStore movieStore = new MovieStore();

        System.out.println("\n" + "In main: " + "\n" + movieStore.getMovies()
                .entrySet().stream()
                .flatMap(p -> p.getValue().stream())
                .collect(Collectors.joining(" ! ", "[", "]"))
        );
    }
}
