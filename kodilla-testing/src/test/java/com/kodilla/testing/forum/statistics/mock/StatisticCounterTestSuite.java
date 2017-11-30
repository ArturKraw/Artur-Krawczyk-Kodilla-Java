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

        List<String> users = new ArrayList<>();
        users.add("name1");
        users.add("name2");

        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();

        //Then
        Assert.assertEquals(0, postsCount);
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

        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();

        //Then
        Assert.assertEquals(1000, postsCount);
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

        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int commentsCount = statisticsCounter.getCommentsCount();

        //Then
        Assert.assertEquals(0, commentsCount);
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

        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCounter.getQuantityOfUsers();

        //Then
        Assert.assertEquals(1000, usersCount);
        statisticsCounter.showStatistics();

    }

    @Test
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

        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();
        int commentsCount = statisticsCounter.getCommentsCount();

        //Then
        Assert.assertTrue(commentsCount > postsCount );
        statisticsCounter.showStatistics();
    }

    @Test
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

        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCounter.getPostsCount();
        int commentsCount = statisticsCounter.getCommentsCount();

        //Then
        Assert.assertTrue(commentsCount < postsCount );
        statisticsCounter.showStatistics();
    }

}