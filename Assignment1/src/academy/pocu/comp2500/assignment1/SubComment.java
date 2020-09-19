package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class SubComment implements Comparable<SubComment> {
    private final ArrayList<SubComment> subCommentList;
    private final String user;
    private String subCommentText;
    private final ArrayList<String> doubleVotingList;
    private int good;
    private int bad;

    public SubComment(String user, String subCommentText) {
        this.subCommentList = new ArrayList<>();
        this.user = user;
        this.subCommentText = subCommentText;
        this.good = 0;
        this.bad = 0;
        this.doubleVotingList = new ArrayList<>();
    }

    public String getUser() {
        return user;
    }

    public String getSubCommentText() {
        return subCommentText;
    }

    public void setSubCommentText(String commentText, String user) {
        if (user.equals(this.user)) {
            this.subCommentText = commentText;
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
    public int compareTo(SubComment subcomment) {
        if ((this.good - this.bad) > (subcomment.good - subcomment.bad)) {
            return -1;
        } else if ((this.good - this.bad) < (subcomment.good - subcomment.bad)) {
            return 1;
        }
        return 0;
    }
}
