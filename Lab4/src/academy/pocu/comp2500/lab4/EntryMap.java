package academy.pocu.comp2500.lab4;

public class EntryMap {
    private static int CACHE_ENTRY = 0;
    String key;
    String value;
    int lruNumber;

    public EntryMap(String key, String value) {
        lruNumber = CACHE_ENTRY;
        this.key = key;
        this.value = value;
        ++CACHE_ENTRY;
    }

    public String getValue(String key) {
        ++CACHE_ENTRY;
        lruNumber = CACHE_ENTRY;
        return value;
    }

    public void setValue(String value) {
        ++CACHE_ENTRY;
        lruNumber = CACHE_ENTRY;
        this.value = value;
    }

    public String getValue() {
        ++CACHE_ENTRY;
        lruNumber = CACHE_ENTRY;
        return value;
    }

    public String getKey() {
        return key;
    }

    public int getLruNumber() {
        return lruNumber;
    }
}
