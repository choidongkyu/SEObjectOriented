package academy.pocu.comp2500.assignment1;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Blog {
    private ArrayList<Post> postList;
    private final List<String> tagFilter;
    private String authorFilter;
    private Order sortingType;

    public Blog() {
        this.postList = new ArrayList<>();
        this.tagFilter = new ArrayList<>();
        this.authorFilter = "";
        this.sortingType = Order.CREATED_ASC;
    }

    public void setTagFilter(List<String> tags) {
        if (tags == null || tags.isEmpty()) {
            tagFilter.clear();
            return;
        }
        tagFilter.addAll(tags);
        /*for (String s : tags) {
            if (!tagFilter.contains(s)) {
                tagFilter.add(s);
            }
        }*/
    }


    public String getUserFilter() {
        return authorFilter;
    }

    public void setUserFilter(String authorOrNull) {
        this.authorFilter = authorOrNull;
    }


    public void setSortingType(Order sortingType) {
        this.sortingType = sortingType;
    }

    public ArrayList<Post> getPost() {
        //TODO
        ArrayList<Post> result = new ArrayList<>(postList);
        result = filteringByTag(result);
        result = filteringByUser(result);
        sortPostList(result);
        for (Post post : result) {
            System.out.println("Post 제목 : " + post.getTitle() + "\n" +
                    "내용 : " + post.getBody() + "\n" +
                    "user : " + post.getUser() + "\n" +
                    "생성날짜 : " + post.getCreatedDateTime().toString() + "\n" +
                    "수정날짜 : " + post.getModifiedDateTime().toString() + "\n" +
                    "태그 - ");
            for (String tag : post.getTagList()) {
                System.out.println(tag);
            }
        }
        return result;
    }

    public void addPost(Post post) {
        this.postList.add(post);
    }

    private ArrayList<Post> filteringByUser(ArrayList<Post> list) {
        if (authorFilter == null || authorFilter.equals("")) {
            return list;
        }
        ArrayList<Post> result = new ArrayList<>();
        for (Post post : list) {
            if (post.getUser().equals(authorFilter)) {
                result.add(post);
            }
        }
        return result;
    }

    private ArrayList<Post> filteringByTag(ArrayList<Post> list) {
        if (tagFilter.isEmpty()) {
            return list;
        }
        ArrayList<Post> result = new ArrayList<>();
        for (Post post : list) {
            for (String s : post.getTagList()) {
                if (tagFilter.contains(s)) {
                    result.add(post);
                    break;
                }
            }
        }
        return result;
    }

    private ArrayList<Post> sortPostList(ArrayList<Post> list) {
        if (sortingType == Order.CREATED_ASC) {
            list.sort((a, b) -> compareTo(a, b));
        } else if (sortingType == Order.CREATED_DEC) {
            list.sort((a, b) -> compareTo(b, a));
        } else if (sortingType == Order.MODIFIED_ASC) {
            list.sort((a, b) -> compareTo(a, b));
        } else if (sortingType == Order.MODIFIED_DEC) {
            list.sort((a, b) -> compareTo(b, a));
        } else if (sortingType == Order.DICTIONARY_ORDER) {
            list.sort((a, b) -> a.getTitle().compareTo(b.getTitle()));
        }
        return list;
    }

    private int compareTo(Post a, Post b) {
        if (a.getModifiedDateTime().isBefore(b.getModifiedDateTime())) {
            return -1;
        } else if (a.getModifiedDateTime().isAfter(b.getModifiedDateTime())) {
            return 1;
        }
        return 0;
    }
}
