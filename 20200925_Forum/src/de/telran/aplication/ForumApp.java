package de.telran.aplication;


import de.telran.dao.Forum;
import de.telran.data.Post;
import de.telran.data.User;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class ForumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Vasya", 28);
        User user2 = new User("Masha", 24);
        UserAdmin admin = new UserAdmin("Max", 32, "space");

        Post post1 = new Post(user1, "Hallo", "Today is beautiful day!");
        Post post2 = new Post(user2, "Woou!", "Great day!");
        Post post3 = new Post(admin, "Dream", "Blablabla bla");
        Post post4 = new Post(user2, "Nice", "to meet you");
        Post post5 = new Post(user1, "Never", "say me tomorrow");
        Post post6 = new Post(user1, "Good bye", "see you letter");

        Forum forum = new Forum(100);
        forum.addPost(post1);
        forum.addPost(post2);
        forum.addPost(post3);
        forum.addPost(post4);
        forum.addPost(post5);
        forum.addPost(post6);

        System.out.println(post1.getLikes());
        post1.addLike();
        post1.addLike();
        post1.addLike();
        System.out.println(post1.getLikes());

        //  forum.updatePostByAdmin(post1.getPostID(), scanner);
        // System.out.println(post1.getContent());

        ///////
        //number of posts
        System.out.println(forum.getSize()); // now 6 posts
        for (Post post : forum.getNotNullablePosts()) {
            System.out.println(post);
        }
        forum.removePost(post5, scanner);
        System.out.println(forum.getSize());//now should be 5

        for (Post post : forum.getNotNullablePosts()) {
            System.out.println(post);
        }
        scanner.close();
    }
}

