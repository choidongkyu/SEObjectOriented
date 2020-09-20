package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

import java.util.Collection;

import static java.lang.Thread.sleep;

public class Program {

    public static void main(String[] args) throws InterruptedException {
	    // write your code here
       Blog b1 = new Blog();
       Post p1 = new Post("다","테스트","최동규");
       sleep(1);
       p1.addTag("코딩","최동규");
       Comment comment = new Comment("2","사랑해요");
       Comment comment2 = new Comment("1","사랑해요");
       Comment comment3 = new Comment("3","사랑해요");
       comment.addSubComment(new Comment("식충이","냐옹"));
       comment3.addSubComment(new Comment("qqq","qqq"));
       comment3.upVoter("wer");
       comment3.upVoter("we1r");
       comment.downVoter("werqq");
       p1.addComment(comment);
       p1.addComment(comment2);
       p1.addComment(comment3);
       Post p2 = new Post("나","테스트","채혜인");
       sleep(1);
       p2.addTag("요리","채혜인");
       Post p3 = new Post("차","테스트","오맹");
       sleep(1);
       b1.addPost(p1);
       b1.setSortingType(Blog.DICTIONARY_ORDER);
       //b1.getPost().get(0).setBody("수정함","최동규");
       b1.getPost();
    }
}
