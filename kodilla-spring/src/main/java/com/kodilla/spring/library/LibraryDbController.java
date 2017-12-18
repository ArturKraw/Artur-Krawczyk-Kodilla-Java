package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {

        public void saveData() {
            System.out.println("\n" + "Saving data to the database." + "\n" );
        }

        public void loadData() {
            System.out.println("\n" + "Loading data from the database" + "\n");
        }
}
