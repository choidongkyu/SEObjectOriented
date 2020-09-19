package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comment implements Comparable<Comment> {
    private ArrayList<SubComment> subCommentList;
    private final String user;
    private String commentText;
    private final ArrayList<String> doubleVotingList;
    private int good;
    private int bad;

    public Comment(String user, String commentText) {
        this.subCommentList = new ArrayList<>();
        this.user = user;
        this.commentText = commentText;
        this.good = 0;
        this.bad = 0;
        this.doubleVotingList = new ArrayList<>();
    }

    public String getUser() {
        return user;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText, String user) {
        if (user.equals(this.user)) {
            this.commentText = commentText;
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

    public void addSubComment(SubComment subComment) {
        this.subCommentList.add(subComment);
    }

    public ArrayList<SubComment> getSubCommentList() {
        Collections.sort(subCommentList);
        /*for(SubComment comment : subCommentList) {
            System.out.println("대댓글 user : "+ comment.getUser()+"\n"+
                    "text : "+comment.getSubCommentText());
        }*/
        return subCommentList;
    }

    @Override
    public int compareTo(Comment o) {
        if ((this.good - this.bad) > (o.good - o.bad)) {
            return -1;
        } else if ((this.good - this.bad) < (o.good - o.bad)) {
            return 1;
        }
        return 0;
    }
}
