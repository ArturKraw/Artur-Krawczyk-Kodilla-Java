package com.kodilla.testing.forum.statistics.mock;

        import com.kodilla.testing.forum.statistics.Statistics;
        import com.kodilla.testing.forum.statistics.StatisticsCounter;
        import org.junit.*;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

        import static org.mockito.Mockito.doReturn;
        import static org.mockito.Mockito.mock;
        import static org.mockito.Mockito.when;


public class StatisticCounterTestSuite {
    private static int testCounter = 0;

    @Before
    public void before()    {
        testCounter++;
        System.out.println("\n" + "Preparing to execute test #" + testCounter);
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testcalculateAdvStatisticsWhenZeroUsers () {
       //Given
        System.out.println("To check: Users = 0" );
        Statistics statisticsMock = mock(Statistics.class);

        List<String> users = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int quantityOfUsers1 = statisticsCounter.getQuantityOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfUsers1);
        statisticsCounter.showStatistics();

    }

    @Test
    public void testcalculateAdvStatisticsWhenZeroPosts () {
        //Given
        System.out.println("To check: Posts = 0" );
        Statistics statisticsMock = mock(Statistics.class);

        int usersNr = 2;
        String name = null;
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersNr; i++) {
            name = "Name" + Integer.toString(i + 1);
            users.add(name);
        }
        int postsQuantity = 0;
        int commentsQuantity = 0;


        //Calculating average statistics using input dat
        double avCommentsQperPostsQ = 0.0;
        double avCommentsQperUsersQ = 0.0;
        double avPostsQperUsers = 0.0;
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            avCommentsQperPostsQ = (double) commentsQuantity/postsQuantity;
            avCommentsQperUsersQ = (double) commentsQuantity/usersNr;
            avPostsQperUsers = (double) postsQuantity/usersNr;;
        } else {
            System.out.println("Not possible to divide by zero !");
        }

        //when(statisticsMock.usersNames()).thenReturn(users);
        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();

        double average1 = statisticsCounter.getAverageComPerUsers ();
        double average2 = statisticsCounter.getAveragePostsPerUsers ();
        double average3 = statisticsCounter.getAverageComPerPosts ();

        //Then
        Assert.assertEquals(0, postsCount);
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            Assert.assertEquals(avCommentsQperUsersQ, average1, 0.001 );
            Assert.assertEquals(avPostsQperUsers, average2, 0.001);
            Assert.assertEquals(avCommentsQperPostsQ, average3, 0.001);
        }
        statisticsCounter.showStatistics();

    }

    @Test
    public void testcalculateAdvStatisticsWhen1000Posts () {
        //Given
        System.out.println("To check: Posts = 1000" );
        Statistics statisticsMock = mock(Statistics.class);

        int usersNr = 10;
        String name = null;
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersNr; i++) {
            name = "Name"+Integer.toString(i+1);
            users.add(name);
        }
        int postsQuantity = 1000;
        int commentsQuantity = 0;

        //Calculating average statistics using input dat
        double avCommentsQperPostsQ = 0.0;
        double avCommentsQperUsersQ = 0.0;
        double avPostsQperUsers = 0.0;
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            avCommentsQperPostsQ = (double) commentsQuantity/postsQuantity;
            avCommentsQperUsersQ = (double) commentsQuantity/usersNr;
            avPostsQperUsers = (double) postsQuantity/usersNr;;
        } else {
            System.out.println("Not possible to divide by zero !");
        }

        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();

        double average1 = statisticsCounter.getAverageComPerUsers ();
        double average2 = statisticsCounter.getAveragePostsPerUsers ();
        double average3 = statisticsCounter.getAverageComPerPosts ();

        //Then
        Assert.assertEquals(1000, postsCount);
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            Assert.assertEquals(avCommentsQperUsersQ, average1, 0.001 );
            Assert.assertEquals(avPostsQperUsers, average2, 0.001);
            Assert.assertEquals(avCommentsQperPostsQ, average3, 0.001);
        }
        statisticsCounter.showStatistics();
    }

    @Test
    public void testcalculateAdvStatisticsWhenZeroComments () {
        //Given
        System.out.println("To check: Comments = 0" );
        Statistics statisticsMock = mock(Statistics.class);

        int usersNr = 10;
        String name = null;
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersNr; i++) {
            name = "Name"+Integer.toString(i+1);
            users.add(name);
        }
        int postsQuantity = 10;
        int commentsQuantity = 0;

        //Calculating average statistics using input dat
        double avCommentsQperPostsQ = 0.0;
        double avCommentsQperUsersQ = 0.0;
        double avPostsQperUsers = 0.0;
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            avCommentsQperPostsQ = (double) commentsQuantity/postsQuantity;
            avCommentsQperUsersQ = (double) commentsQuantity/usersNr;
            avPostsQperUsers = (double) postsQuantity/usersNr;;
        } else {
            System.out.println("Not possible to divide by zero !");
        }

        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int commentsCount = statisticsCounter.getCommentsCount();

        double average1 = statisticsCounter.getAverageComPerUsers ();
        double average2 = statisticsCounter.getAveragePostsPerUsers ();
        double average3 = statisticsCounter.getAverageComPerPosts ();

        //Then
        Assert.assertEquals(0, commentsCount);
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            Assert.assertEquals(avCommentsQperUsersQ, average1, 0.001 );
            Assert.assertEquals(avPostsQperUsers, average2, 0.001);
            Assert.assertEquals(avCommentsQperPostsQ, average3, 0.001);
        }
        statisticsCounter.showStatistics();
    }

    @Test
    public void testcalculateAdvStatisticsWhen100Users () {
        //Given
        System.out.println("To check: Users = 1000" );
        Statistics statisticsMock = mock(Statistics.class);

        int usersNr = 1000;
        String name = null;
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersNr; i++) {
            name = "Name"+Integer.toString(i+1);
            users.add(name);
        }
        int postsQuantity = 300;
        int commentsQuantity = 1500;

        //Calculating average statistics using input dat
        double avCommentsQperPostsQ = 0.0;
        double avCommentsQperUsersQ = 0.0;
        double avPostsQperUsers = 0.0;
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            avCommentsQperPostsQ = (double) commentsQuantity/postsQuantity;
            avCommentsQperUsersQ = (double) commentsQuantity/usersNr;
            avPostsQperUsers = (double) postsQuantity/usersNr;;
        } else {
            System.out.println("Not possible to divide by zero !");
        }

        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCounter.getQuantityOfUsers();
        int postsCount = statisticsCounter.getPostsCount();
        int commentsCount = statisticsCounter.getCommentsCount();
        double average1 = statisticsCounter.getAverageComPerUsers ();
        double average2 = statisticsCounter.getAveragePostsPerUsers ();
        double average3 = statisticsCounter.getAverageComPerPosts ();

        //Then
        Assert.assertEquals(1000, usersCount);
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            Assert.assertEquals(avCommentsQperUsersQ, average1, 0.001 );
            Assert.assertEquals(avPostsQperUsers, average2, 0.001);
            Assert.assertEquals(avCommentsQperPostsQ, average3, 0.001);
        }
        statisticsCounter.showStatistics();

    }

    @Test //done
    public void testcalculateAdvStatisticsWhenPostsLessThanComments () {
        //Given
        System.out.println("To check: Posts < Comments" );
        Statistics statisticsMock = mock(Statistics.class);

        int usersNr = 10;
        String name = null;
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersNr; i++) {
            name = "Name"+Integer.toString(i+1);
            users.add(name);
        }
        int postsQuantity = 100;
        int commentsQuantity = 2000;

        //Calculating average statistics using input dat
        double avCommentsQperPostsQ = 0.0;
        double avCommentsQperUsersQ = 0.0;
        double avPostsQperUsers = 0.0;
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            avCommentsQperPostsQ = (double) commentsQuantity/postsQuantity;
            avCommentsQperUsersQ = (double) commentsQuantity/usersNr;
            avPostsQperUsers = (double) postsQuantity/usersNr;;
        } else {
            System.out.println("Not possible to divide by zero !");
        }

        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();
        int commentsCount = statisticsCounter.getCommentsCount();

        double average1 = statisticsCounter.getAverageComPerUsers ();
        double average2 = statisticsCounter.getAveragePostsPerUsers ();
        double average3 = statisticsCounter.getAverageComPerPosts ();

        //Then
        Assert.assertTrue(commentsCount > postsCount );
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            Assert.assertEquals(avCommentsQperUsersQ, average1, 0.001 );
            Assert.assertEquals(avPostsQperUsers, average2, 0.001);
            Assert.assertEquals(avCommentsQperPostsQ, average3, 0.001);
        }
        statisticsCounter.showStatistics();
    }

    @Test // done
    public void testcalculateAdvStatisticsWhenCommentsLessThanPosts () {
        //Given
        System.out.println("To check: Posts > Comments" );
        Statistics statisticsMock = mock(Statistics.class);

        int usersNr = 10;
        String name = null;
        List<String> users = new ArrayList<>();
        for (int i=0; i < usersNr; i++) {
            name = "Name"+Integer.toString(i+1);
            users.add(name);
        }
        int postsQuantity = 100;
        int commentsQuantity = 80;

        //Calculating average statistics using input dat
        double avCommentsQperPostsQ = 0.0;
        double avCommentsQperUsersQ = 0.0;
        double avPostsQperUsers = 0.0;
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            avCommentsQperPostsQ = (double) commentsQuantity/postsQuantity;
            avCommentsQperUsersQ = (double) commentsQuantity/usersNr;
            avPostsQperUsers = (double) postsQuantity/usersNr;;
        } else {
            System.out.println("Not possible to divide by zero !");
        }

        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();
        int commentsCount = statisticsCounter.getCommentsCount();

        double average1 = statisticsCounter.getAverageComPerUsers ();
        double average2 = statisticsCounter.getAveragePostsPerUsers ();
        double average3 = statisticsCounter.getAverageComPerPosts ();

        //Then
        Assert.assertTrue(commentsCount < postsCount );
        if ((postsQuantity!=0)&&(usersNr!=0)) {
            Assert.assertEquals(avCommentsQperUsersQ, average1, 0.001 );
            Assert.assertEquals(avPostsQperUsers, average2, 0.001);
            Assert.assertEquals(avCommentsQperPostsQ, average3, 0.001);
        }
        statisticsCounter.showStatistics();
    }

}