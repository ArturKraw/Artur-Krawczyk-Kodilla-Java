package com.kodilla.spring.forum;


import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username ;

    public ForumUser () {
        this.username = "John Smith";
    }

    public String getUsername () {
        return username;
    }

    @Override
    public String toString () {
        return "ForumUser{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        return getUsername() != null ? getUsername().equals(forumUser.getUsername()) : forumUser.getUsername() == null;
    }

    @Override
    public int hashCode () {
        return getUsername() != null ? getUsername().hashCode() : 0;
    }
}
