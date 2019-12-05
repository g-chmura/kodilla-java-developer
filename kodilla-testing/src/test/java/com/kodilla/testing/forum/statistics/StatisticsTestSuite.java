package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void statisticsTest0Users0Posts0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics fs = new ForumStatistics();
        fs.calculateAdvStatistics(statisticsMock);

        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        //When
        int quantityOfUsers = statisticsMock.usersNames().size();
        int quantityOfPosts = fs.postsCount();
        int quantityOfComments = fs.commentsCount();
        //Then
        Assert.assertEquals(0, quantityOfUsers);
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("0 USERS and 0 POSTS and 0 COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void statisticsTest100Users0Posts0Comments() {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();
        fs.calculateAdvStatistics(sMock);

        ArrayList<String> users = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        fs.setQuantityOfUsers(100);
        when(sMock.usersNames()).thenReturn(users);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("100 USERS and 0 POSTS and 0 COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void statisticsTest100Users1000Posts0Comments() {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        fs.calculateAdvStatistics(sMock);
        fs.setQuantityOfUsers(100);
        fs.setQuantityOfPosts(1000);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);

        System.out.println("100 USERS and 1000 POSTS and 0 COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void statisticsTest100UsersAndPostsMoreThanComments() {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        when(sMock.commentsCount()).thenReturn(100);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(100, quantityOfComments);

        System.out.println("100 USERS and MORE POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void statisticsTest100UsersAndPostsLessThanComments() {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            users.add("User nr: "+i);
        }
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(100);
        when(sMock.commentsCount()).thenReturn(1000);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(1000, quantityOfComments);

        System.out.println("100 USERS and LESS POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void statisticsTest0UsersAndPostsMoreThanComments() {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(1000);
        when(sMock.commentsCount()).thenReturn(100);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals( 0, quantityOfUsers);
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(100, quantityOfComments);

        System.out.println("0 USERS and MORE POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
    @Test
    public void statisticsTest0UsersAndPostsLessThanComments() {
        //Given
        Statistics sMock = mock(Statistics.class);
        ForumStatistics fs=new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(sMock.usersNames()).thenReturn(users);
        when(sMock.postsCount()).thenReturn(100);
        when(sMock.commentsCount()).thenReturn(1000);
        fs.calculateAdvStatistics(sMock);
        //When
        int quantityOfUsers= sMock.usersNames().size();
        int quantityOfPosts=fs.postsCount();
        int quantityOfComments=fs.commentsCount();
        //Then
        Assert.assertEquals( 0, quantityOfUsers);
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(1000, quantityOfComments);

        System.out.println("0 USERS and LESS POSTS THAN COMMENTS:");
        fs.show();
        System.out.println(" ");
    }
}
