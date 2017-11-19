package com.kodilla.testing.forum;

import org.junit.*;

@Ignore
    public class ForumTestSuite {
    private static int testCounter = 0;


    @BeforeClass
    public static void beforeAllTests()     {
        System.out.println("This is the begining fo tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith", "Hello everyone, this mu first contribution here!");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first contribution here!", "mrsmith");
        //When
        forumUser.addComment(thePost,"mrsmith", "Thank you for all good words!");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone," + "this is my first contribution here!", "mrsmith");
        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost();
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

}
