package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;

public class Blog {
    private final ArrayList<Post> postList;
    private final ArrayList<String> tagFilter;
    private String authorFilter;
    private int sortingType;

    public Blog() {
        this.postList = new ArrayList<>();
        this.tagFilter = new ArrayList<>();
        this.authorFilter = "null";
        this.sortingType = -1;
    }

    public void setTagFilter(String tag) {
        this.tagFilter.add(tag);
    }

    public ArrayList<String> getTagFilter() {
        return this.tagFilter;
    }

    public void unsetTagFilter(String tag) {
        tagFilter.remove(tag);
    }

    public String getAuthorFilter() {
        return authorFilter;
    }

    public void setAuthorFilter(String authorFilter) {
        this.authorFilter = authorFilter;
    }

    public void unsetAuthorFilter() {
        this.authorFilter = "null";
    }

    public int getSortingType() {
        return sortingType;
    }

    public void setSortingType(int sortingType) {
        this.sortingType = sortingType;
    }

    public ArrayList<Post> getPostList() {
        //TODO
        return postList;
    }

    public void addPostList(Post post) {
        this.postList.add(post);
    }
}
