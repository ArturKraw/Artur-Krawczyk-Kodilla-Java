package com.kodilla.testing.forum;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.LinkedList;

@Ignore public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        //do nothing
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        //do nothing
    }

    public int getPostsQuantity() {
        //return 100 temporarily
        return 100;
    }

    public int getCommentsQuantity() {
        //return 100 temporarily
        return 100;
    }

    public ForumPost getPost(int postNumber) {
        // returning null means that the operation was unsuccesful
        return null;
    }

    public ForumComment getComment(int commentNumber) {
        // returning null means that the operation was unsuccesful
        return null;
    }

    public boolean removePost(ForumPost thePost) {
        // return temporarrily
        return true;
    }

    public boolean removeComment(ForumComment theComment) {
        // return temporarrily
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
