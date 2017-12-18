package com.kodilla.spring.com.kodilla.spring.forum;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ForumUserTestSuite {


    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        //ForumUser forumUser1 = ;
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String name = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", name);
        System.out.println("name: " + name);
    }
}
