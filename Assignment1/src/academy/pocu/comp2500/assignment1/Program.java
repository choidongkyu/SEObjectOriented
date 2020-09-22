package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.Thread.sleep;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Blog b1 = new Blog();
        Post p1 = new Post("p1","body","a1");
        Post p2 = new Post("p2","body","a1");
        Post p3 = new Post("p3","body","a2");
        Post p4 = new Post("p4","body","a2");

        p1.addTag("t1", "a1");
        p2.addTag("t2","a1");
        p3.addTag("t1","a2");
        p4.addTag("t2","a2");
        b1.addPost(p1);
        b1.addPost(p2);
        b1.addPost(p3);
        b1.addPost(p4);
        List tag = new ArrayList();
        tag.add("t1");
        b1.setTagFilter(tag);
        b1.setUserFilter("a2");


        b1.getPost();
    }
}
