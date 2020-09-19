package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Post {
    private final ArrayList<Comment> commentList;
    private final ArrayList<String> tagList;
    private String title;
    private String body;
    private final String user;
    private final OffsetDateTime createdDateTime;
    private OffsetDateTime modifiedDateTime;
    private int great;
    private int sad;
    private int angry;
    private int love;

    public Post(String title, String body, String user) {
        this.title = title;
        this.body = body;
        this.user = user;
        this.commentList = new ArrayList<>();
        this.tagList = new ArrayList<>();
        this.createdDateTime = OffsetDateTime.now();
        this.modifiedDateTime = OffsetDateTime.now();
        this.great = 0;
        this.sad = 0;
        this.angry = 0;
        this.love = 0;
    }

    public String getUser() {
        return user;
    }

    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title, String user) {
        if (this.user.equals(user)) {
            this.title = title;
            modifiedDateTime = OffsetDateTime.now();
        }
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body, String user) {
        if (this.user.equals(user)) {
            this.body = body;
            modifiedDateTime = OffsetDateTime.now();
        }
    }

    public void addTag(String tag, String user) {
        if (this.user.equals(user)) {
            if (!this.tagList.contains(tag)) {
                this.tagList.add(tag);
            }
        }
    }

    public ArrayList<String> getTagList() {
        return this.tagList;
    }

    public void addComment(Comment comment) {
        this.commentList.add(comment);
    }

    public ArrayList<Comment> getComment() {
        Collections.sort(commentList);
        /*for(Comment comment : commentList) {
            System.out.println("댓글 user : "+ comment.getUser()+"\n"+
                               "text : "+comment.getCommentText());
            comment.getSubCommentList();
        }*/
        return this.commentList;
    }

    public void addReaction(String reactionType) {
        switch (reactionType) {
            case "great":
                ++great;
                break;
            case "sad":
                ++sad;
                break;
            case "angry":
                ++angry;
                break;
            case "love":
                ++love;
                break;
            default:
        }
    }

    public void removeReaction(String reactionType) {
        switch (reactionType) {
            case "great":
                --great;
                break;
            case "sad":
                --sad;
                break;
            case "angry":
                --angry;
                break;
            case "love":
                --love;
                break;
            default:
        }
    }

    public int getReaction(String reactionType) {
        switch (reactionType) {
            case "great":
                return great;
            case "sad":
                return sad;
            case "angry":
                return angry;
            case "love":
                return love;
            default:
        }
        return Integer.MIN_VALUE;
    }
}