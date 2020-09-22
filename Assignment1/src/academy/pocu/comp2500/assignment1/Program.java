package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.Collection;

import static java.lang.Thread.sleep;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Blog b1 = new Blog();
        Post p1 = new Post("p1","body","최동규");
        Post p2 = new Post("p2","body","채혜인");
        Post p3 = new Post("p3","body","채혜인");
        Post p4 = new Post("p4","body","오맹");
        b1.addPost(p1);
        b1.addPost(p2);
        b1.addPost(p3);
        b1.addPost(p4);
        p1.addTag("사랑","최동규");
        p1.addTag("용기","최동규");
        p1.addTag("밥","최동규");
        p2.addTag("요리","채혜인");
        p3.addTag("샤워","채혜인");
        p3.addTag("우정","채혜인");
        p4.addTag("게임","오맹");
        //b1.setTagFilter("게임");
        b1.setTagFilter("t1");
        //b1.setTagFilter("t2");
        //b1.setTagFilter("t6");
        //b1.setTagFilter("t7");
        //b1.setTagFilter("t3");
        b1.setTagFilter("");
        b1.getPost();
    }
}
