package com.kodilla.testing.forum.statistics;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeMath.round;


public class StatisticsCounter {
    private List<String> users;
    private int postsCount;
    private int commentsCount;
    private int quantityOfUsers;
    private double averageCommentsPerUser;
    private double averagePostsPerUser;
    private double averageCommentsPerPosts;

    public int getPostsCount () {
        return postsCount;
    }

    public List<String> getUsersNames () {
        return users;
    }
    public int getCommentsCount () {
        return commentsCount;
    }
    public int getQuantityOfUsers () {
        return quantityOfUsers;
    }


    public void calculateAdvStatistics (Statistics statistics) {
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        users = statistics.usersNames();

        quantityOfUsers = users.size();
        if ((quantityOfUsers != 0) && (postsCount != 0.0)) {
            double commentsCount1 = (double) commentsCount;
            double quantityOfUsers1 = (double) quantityOfUsers;
            double postsCount1 = (double) postsCount;
            averageCommentsPerUser = commentsCount1 / quantityOfUsers1;
            averagePostsPerUser = postsCount1 / quantityOfUsers1;
            averageCommentsPerPosts = commentsCount1 / postsCount1;
        }
    }

    public void showStatistics () {
          System.out.println("Entry data: ");
          System.out.print("List of users: users" + "   ");
          System.out.print("Posts: " + postsCount + "   ");
          System.out.println("Comments: " + commentsCount);
          System.out.println("Statistics data: ");
          System.out.println("Quantity of users: " + quantityOfUsers);
          System.out.print("Posts/User: ");
          System.out.printf("%.2f%n", averagePostsPerUser);
          System.out.print("Comments/User: ");
          System.out.printf("%.2f%n", averageCommentsPerUser);
          System.out.print("Comments/Post: ");
          System.out.printf("%.2f%n", averageCommentsPerPosts);
    }
}



