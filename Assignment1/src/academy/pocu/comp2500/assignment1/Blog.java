package academy.pocu.comp2500.assignment1;

import java.util.ArrayList;
import java.util.Comparator;

public class Blog {
    private static final int CREATED_ASC = 0;
    private static final int CREATED_DEC = 1;
    private static final int MODIFIED_ASC = 2;
    private static final int MODIFIED_DEC = 3;
    private static final int DICTIONARY_ORDER = 4;
    private ArrayList<Post> postList;
    private final ArrayList<String> tagFilter;
    private String authorFilter;
    private int sortingType;

    public Blog() {
        this.postList = new ArrayList<>();
        this.tagFilter = new ArrayList<>();
        this.authorFilter = "";
        this.sortingType = CREATED_ASC;
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

    public String getUserFilter() {
        return authorFilter;
    }

    public void setUserFilter(String authorOrNull) {
        this.authorFilter = authorOrNull;
    }

    public void unsetUserFilter() {
        this.authorFilter = null;
    }

    public int getSortingType() {
        return sortingType;
    }

    public void setSortingType(int sortingType) {
        this.sortingType = sortingType;
    }

    public ArrayList<Post> getPost() {
        //TODO
        postList = sortPostList(postList);
        postList = filteringByUser(postList);
        postList = filteringByTag(postList);
        /*for (Post post : postList) {
            System.out.println("Post 제목 : " + post.getTitle() + "\n" +
                    "내용 : " + post.getBody() + "\n" +
                    "user : " + post.getUser() + "\n" +
                    "생성날짜 : " + post.getCreatedDateTime().toString() + "\n" +
                    "수정날짜 : " + post.getModifiedDateTime().toString() + "\n" +
                    "태그 - ");
            for (String tag : post.getTagList()) {
                System.out.println(tag);
            }
            post.getComment();
        }*/
        return postList;
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
        if (tagFilter.size() == 0) {
            return list;
        }
        ArrayList<Post> result = new ArrayList<>();
        for (Post post : list) {
            for (String s : tagFilter) {
                if (post.getTagList().contains(s)) {
                    result.add(post);
                }
            }

        }
        return result;
    }

    private ArrayList<Post> sortPostList(ArrayList<Post> list) {
        if (sortingType == CREATED_ASC) {
            list.sort(new Comparator<Post>() {
                @Override
                public int compare(Post o1, Post o2) {
                    if (o1.getCreatedDateTime().isBefore(o2.getCreatedDateTime())) {
                        return -1;
                    } else if (o1.getCreatedDateTime().isAfter(o2.getCreatedDateTime())) {
                        return 1;
                    }
                    return 0;
                }
            });
        } else if (sortingType == CREATED_DEC) {
            list.sort(new Comparator<Post>() {
                @Override
                public int compare(Post o1, Post o2) {
                    if (o1.getCreatedDateTime().isAfter(o2.getCreatedDateTime())) {
                        return -1;
                    } else if (o1.getCreatedDateTime().isBefore(o2.getCreatedDateTime())) {
                        return 1;
                    }
                    return 0;
                }
            });
        } else if (sortingType == MODIFIED_ASC) {
            list.sort(new Comparator<Post>() {
                @Override
                public int compare(Post o1, Post o2) {
                    if (o1.getModifiedDateTime().isBefore(o2.getModifiedDateTime())) {
                        return -1;
                    } else if (o1.getModifiedDateTime().isAfter(o2.getModifiedDateTime())) {
                        return 1;
                    }
                    return 0;
                }
            });
        } else if (sortingType == MODIFIED_DEC) {
            list.sort(new Comparator<Post>() {
                @Override
                public int compare(Post o1, Post o2) {
                    if (o1.getModifiedDateTime().isAfter(o2.getModifiedDateTime())) {
                        return -1;
                    } else if (o1.getModifiedDateTime().isBefore(o2.getModifiedDateTime())) {
                        return 1;
                    }
                    return 0;
                }
            });
        } else if (sortingType == DICTIONARY_ORDER) {
            list.sort(new Comparator<Post>() {
                @Override
                public int compare(Post o1, Post o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
        }
        return list;
    }
}
