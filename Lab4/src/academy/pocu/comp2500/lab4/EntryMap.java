package academy.pocu.comp2500.lab4;

public class EntryMap {
    private static int CACHEENTRY = 0;
    String key;
    String value;
    int lruNumber;

    public EntryMap(String key, String value) {
        lruNumber = CACHEENTRY;
        this.key = key;
        this.value = value;
        ++CACHEENTRY;
    }

    public String getValue(String key) {
        ++CACHEENTRY;
        lruNumber = CACHEENTRY;
        return value;
    }

    public void setValue(String value) {
        ++CACHEENTRY;
        lruNumber = CACHEENTRY;
        this.value = value;
    }

    public String getValue() {
        ++CACHEENTRY;
        lruNumber = CACHEENTRY;
        return value;
    }

    public String getKey() {
        return key;
    }

    public int getLruNumber() {
        return lruNumber;
    }
}
