package Exercises.compositionEnumeration.exercise2.utility;


import Exercises.compositionEnumeration.exercise2.entity.Comment;
import Exercises.compositionEnumeration.exercise2.entity.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comen1 = new Comment("Safe travels");
        Comment comen2 = new Comment("Wow that's amazing!");

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Travelling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post.addComments(comen1);
        post.addComments(comen2);

        Comment comen3 = new Comment("Good night");
        Comment comen4 = new Comment("May the Force be with you");

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night, guys!",
                "See you tomorrow!",
                5);

        post2.addComments(comen3);
        post2.addComments(comen4);

        System.out.println(post);
        System.out.println(post2);

    }
}
