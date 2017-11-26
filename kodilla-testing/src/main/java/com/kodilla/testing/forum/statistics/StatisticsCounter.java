package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsCounter implements Statistics {


    private int postsCount;
    private int commentsCount;
    private List<String> usersNames;
    public int usersQuantity = 3;


    public StatisticsCounter (Statistics statistics) {
        this.statistics = statistics;
    }

    //Statistics < ArrayList<String> usersNames, int postsCount, int commentsCount> statistics;
    Statistics statistics = new Statistics<ArrayList<String> usersNames, Integer postsCount, Integer commentsCount>();

    @Override
    public List<String> usersNames () {
        return new ArrayList<String>(usersNames);
    }

    @Override
    public int postsCount () {
        return Integer.valueOf(postsCount);
    }

    @Override
    public Integer commentsCount () {
        return Integer.valueOf(commentsCount);
    }

    //Statistics statistics = new Statistics<ArrayList<String> usersNames, Integer postsCount1, Integer commentsCount>();

}
    public HashMap<Integer, Double> calculateAdvStatistics() {
        HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for (Map.Entry<Integer, Double> statistics:
                statistics.getStatistics().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast

            resultMap.put(statistics.getKey(), statistics.getValue()+1);
        }
        return resultMap;
    }


        //this.postsCount = postsCount;
        //this.commentsCount = commentsCount;
        //this.usersNames = usersNames;

/*
    Statistics<ArrayList<String>, ArrayList<int, int>> statistics = new Statistics<<List<String>, ArayList<int, int>> () {
        @Override
        public List<String> getUsersNames() {

            return usersNames;
        }

        @Override
        public int postsCount () {
            return 0;
        }

        @Override
        public int commentsCount () {
            return 0;
        }
    }
*/
        //
        // Integer.valueof(R.drawable.bg1)

           // public ArrayList<Integer, Double, Double> statistics() {
/*
            List<String> users = new ArrayList<String>();
            List<Integer, Integer> countData = new ArrayList<Integer, Integer>();

            for (Map.Entry<Integer, ArrayList<Integer, Integer > statistics:
                    statistics.getStatistics().entrySet()) {

                public HashMap<Integer, Double> calculateForecast() {
                    HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

                    for (Map.Entry<Integer, Double> temperature:
                            temperatures.getTemperatures().entrySet()) {
                // adding 1 celsius degree to current value
                // as a temporary weather forecast

                resultMap.put(statistics.getKey(), statistics.getValue());
            }
            return resultMap;
        }

*/

    }


        //oblicza podane powyżej wartości i zapamięta je we właściwościach (polach) klasy.

        int quantityOfUsers = usersNames.size();

        int quantityOfPosts = getPostsCount();

        int quantityOfComments = getCommentsCount();

        double averageNrOfPostsPerUser = quantityOfPosts / quantityOfUsers;

        double averageNrOfCommentsPerUser = quantityOfComments / quantityOfUsers;

        double averageNrOfCommentsPerPost = quantityOfComments / quantityOfPosts;

        //klasa oblicza nst. statystyki:
        //   Ilość użytkowników
        //   Ilość postów
        //  Ilość komentarzy
        //   Średnia ilość postów na użytkownika
        //  Średnia ilość komentarzy na użytkownika
        //  Średnia ilość komentarzy na post



        return statistics;
    }

    public ShowStatistics () {
        // wyświetla zapamiętane we właściwościach statystyki.

        return statistics;
    }

}





