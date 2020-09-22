package academy.pocu.comp2500.lab3;

import java.util.ArrayList;

public class ListItem {
    private String text;
    private final ArrayList<ListItem> sublistItems;
    private char bulletStyle;

    public ListItem(String text) {
        this(text, '*');
    }

    public ListItem(String text, char bulletStyle) {
        this.text = text;
        this.bulletStyle = bulletStyle;
        sublistItems = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getBulletStyle() {
        return bulletStyle;
    }

    public void setBulletStyle(char bulletStyle) {
        this.bulletStyle = bulletStyle;
    }

    public ListItem getSublistItem(int index) {
        return sublistItems.get(index);
    }

    public void addSublistItem(ListItem item) {
        sublistItems.add(item);
    }

    public void removeSublistItem(int index) {
        sublistItems.remove(index);
    }

    public String toString() {
        String result = bulletStyle + " " + text;
        for (ListItem item : sublistItems) {
            result += "\n";
            result += item.toString();
        }

        return result;
    }
}
