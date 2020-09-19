package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Comparator;

public class Comment {
    private ArrayList<SubComment> subCommentList;
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

    public void addSubComment(SubComment subcomment) {
        this.subCommentList.add(subcomment);
    }

    public ArrayList<SubComment> getSubCommentList() {
        subCommentList.sort(new Comparator<SubComment>() {
            @Override
            public int compare(SubComment o1, SubComment o2) {
                if ((o1.getGood() - o1.getBad()) > (o2.getGood() - o2.getBad())) {
                    return -1;
                } else if ((o1.getGood() - o1.getBad()) < (o2.getGood() - o2.getBad())) {
                    return 1;
                }
                return 0;
            }
        });
        /*for(SubComment comment : subCommentList) {
            System.out.println("대댓글 user : "+ comment.getUser()+"\n"+
                    "text : "+comment.getSubCommentText());
        }*/
        return subCommentList;
    }

}
