package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    public int getQuantityOfUsers()
    {
        return quantityOfUsers;
    }
    public void setQuantityOfUsers(int quantityOfUsers)
    {
        this.quantityOfUsers = quantityOfUsers;
    }
    public void setQuantityOfPosts(int quantityOfPosts)
    {
        this.quantityOfPosts = quantityOfPosts;
    }

    public void setQuantityOfComments(int quantityOfComments)
    {
        this.quantityOfComments = quantityOfComments;
    }
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double averageQuantityOfPostsOnOneUser;
    private double averageQuantityOfCommentsOnOneUser;
    private double averageQuantityOfCommentsOnOnePost;


    public int postsCount() {

        return quantityOfPosts;
    }

    public int commentsCount() {

        return quantityOfComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.quantityOfUsers = statistics.usersNames().size();
        this.quantityOfPosts = statistics.postsCount();
        this.quantityOfComments = statistics.commentsCount();
        if (quantityOfUsers != 0) {
            this.averageQuantityOfPostsOnOneUser = quantityOfPosts / quantityOfUsers;
            this.averageQuantityOfCommentsOnOneUser = quantityOfComments / quantityOfUsers;
        }
        if (quantityOfPosts != 0) {
            this.averageQuantityOfCommentsOnOnePost = quantityOfComments / quantityOfPosts;
        }

    }

    public void show() {
        System.out.println("Quantity of users is: " + quantityOfUsers);
        System.out.println("Quantity of posts is: " + quantityOfPosts);
        System.out.println("Quantity of comments is: " + quantityOfComments);
        System.out.println(" Average quantity of posts per one user is: " + averageQuantityOfPostsOnOneUser);
        System.out.println(" Average quantity of comments per one user is: " + averageQuantityOfCommentsOnOneUser);
        System.out.println(" Average quantity of comments per one post is: " + averageQuantityOfCommentsOnOnePost);
    }
}
