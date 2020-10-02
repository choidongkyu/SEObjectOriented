package academy.pocu.comp2500.lab4;

public class EntryMap {
    private static int cacheNum = 0;
    String key;
    String value;
    int lruNumber;

    public EntryMap(String key, String value) {
        lruNumber = cacheNum;
        this.key = key;
        this.value = value;
        ++cacheNum;
    }

    public String getValue(String key) {
        ++cacheNum;
        lruNumber = cacheNum;
        return value;
    }

    public void setValue(String value) {
        ++cacheNum;
        lruNumber = cacheNum;
        this.value = value;
    }

    public String getValue() {
        ++cacheNum;
        lruNumber = cacheNum;
        return value;
    }

    public String getKey() {
        return key;
    }

    public int getLruNumber() {
        return lruNumber;
    }
}
