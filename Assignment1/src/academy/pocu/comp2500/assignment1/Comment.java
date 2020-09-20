package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Comparator;

public class Comment {
    private ArrayList<Comment> subCommentList;
    private final String user;
    private String text;
    private final ArrayList<String> doubleVotingList;
    private int good;
    private int bad;

    public Comment(String user, String text) {
        this.subCommentList = new ArrayList<>();
        this.user = user;
        this.text = text;
        this.good = 0;
        this.bad = 0;
        this.doubleVotingList = new ArrayList<>();
    }

    public int getGood() {
        return good;
    }

    public int getBad() {
        return bad;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text, String user) {
        if (user.equals(this.user)) {
            this.text = text;
        }
    }

    public void downVoter(String user) {
        if (!doubleVotingList.contains(user)) {
            ++bad;
            doubleVotingList.add(user);
        }
    }

    public void upVoter(String user) {
        if (!doubleVotingList.contains(user)) {
            ++good;
            doubleVotingList.add(user);
        }
    }

    public void addSubComment(Comment subcomment) {
        this.subCommentList.add(subcomment);
    }

    public ArrayList<Comment> getSubCommentList() {
        subCommentList.sort((o1, o2) -> compareTo((o1.good - o1.bad), (o2.good - o2.bad)));
        for (Comment comment : subCommentList) {
            System.out.println("대댓글 user : " + comment.getUser() + "\n" +
                    "text : " + comment.getText());
        }
        return subCommentList;
    }

    private int compareTo(int a, int b) {
        if (a > b) {
            return -1;
        } else if (a < b) {
            return 1;
        }
        return 0;
    }
}
