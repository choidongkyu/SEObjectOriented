package academy.pocu.comp2500.lab4;

import java.util.ArrayList;
import java.util.HashMap;

public class MemoryCache {
    private static final HashMap<String, MemoryCache> INSTANCE = new HashMap<String, MemoryCache>();
    private static int CACHEINSTANCE = 0;
    private static int MAXCOUNT = 0;
    private final ArrayList<EntryMap> entryMaps;
    private int lruNumber;
    private EvictionPolicy evictionPolicy;
    private int entryMaxCount;

    private MemoryCache() {
        lruNumber = CACHEINSTANCE;
        entryMaps = new ArrayList<>();
        evictionPolicy = EvictionPolicy.LEAST_RECENTLY_USED;
        entryMaxCount = 0;
    }

    public static MemoryCache getInstance(String data) {
        if (INSTANCE.size() >= MAXCOUNT && MAXCOUNT > 0) {
            int min = Integer.MAX_VALUE;
            String minkey = null;
            for (String key : INSTANCE.keySet()) {
                if (INSTANCE.get(key).getLruNumber() < min) {
                    min = INSTANCE.get(key).getLruNumber();
                    minkey = key;
                }
            }
            INSTANCE.remove(minkey);
        }

        if (INSTANCE.get(data) == null) {
            ++CACHEINSTANCE;
            INSTANCE.put(data, new MemoryCache());
            return INSTANCE.get(data);
        }

        INSTANCE.get(data).setLruNumber(++CACHEINSTANCE);
        return INSTANCE.get(data);
    }

    private void setLruNumber(int lruNumber) {
        this.lruNumber = lruNumber;
    }

    private int getLruNumber() {
        return this.lruNumber;
    }

    public static void setMaxInstanceCount(int count) {
        MAXCOUNT = count;
    }

    public static void clear() {
        INSTANCE.clear();
    }

    public void setEvictionPolicy(EvictionPolicy evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
    }

    public void addEntry(String key, String value) {

        for (int i = 0; i < entryMaps.size(); ++i) {
            if (entryMaps.get(i).getKey().equals(key)) {
                entryMaps.get(i).setValue(value);
                return;
            }
        }

        if (entryMaps.size() >= entryMaxCount && entryMaxCount > 0) {
            if (evictionPolicy == EvictionPolicy.LEAST_RECENTLY_USED) {
                int min = Integer.MAX_VALUE;
                EntryMap minEntry = null;
                for (EntryMap map : entryMaps) {
                    if (map.getLruNumber() < min) {
                        min = map.getLruNumber();
                        minEntry = map;
                    }
                }
                entryMaps.remove(minEntry);
            } else if (evictionPolicy == EvictionPolicy.FIRST_IN_FIRST_OUT) {
                entryMaps.remove(0);
            } else if (evictionPolicy == EvictionPolicy.LAST_IN_FIRST_OUT) {
                entryMaps.remove(entryMaps.size() - 1);
            }
        }

        entryMaps.add(new EntryMap(key, value));
    }

    public String getEntryOrNull(String key) {
        for (int i = 0; i < entryMaps.size(); ++i) {
            if (entryMaps.get(i).getKey().equals(key)) {
                return entryMaps.get(i).getValue();
            }
        }
        return null;
    }

    public void setMaxEntryCount(int count) {
        entryMaxCount = count;
        while (entryMaps.size() > entryMaxCount) {
            if (evictionPolicy == EvictionPolicy.LEAST_RECENTLY_USED) {
                int min = Integer.MAX_VALUE;
                EntryMap minEntry = null;
                for (EntryMap map : entryMaps) {
                    if (map.getLruNumber() < min) {
                        min = map.getLruNumber();
                        minEntry = map;
                    }
                }
                entryMaps.remove(minEntry);
            } else if (evictionPolicy == EvictionPolicy.FIRST_IN_FIRST_OUT) {
                entryMaps.remove(0);
            } else if (evictionPolicy == EvictionPolicy.LAST_IN_FIRST_OUT) {
                entryMaps.remove(entryMaps.size() - 1);
            }
        }

    }
}
