package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final Integer userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int quantityOfPosts;

    public ForumUser (Integer userId, String userName, char userSex, LocalDate userDateOfBirth, int quantityOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.quantityOfPosts = quantityOfPosts;
    }

    public Integer getUserId () {
        return userId;
    }

    public String getUserName () {
        return userName;
    }

    public char getUserSex () {
        return userSex;
    }

    public LocalDate getUserDateOfBirth (){
        //LocalDate userDateOfBirth;
        return userDateOfBirth;
    }

    public int getQuantityOfPosts () {
        return quantityOfPosts;
    }

    @Override
    public String toString () {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}
