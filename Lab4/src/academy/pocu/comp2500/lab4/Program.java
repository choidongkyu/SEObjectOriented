package academy.pocu.comp2500.lab4;

import static org.junit.Assert.assertEquals;

public class Program {

    public static void main(String[] args) {
        MemoryCache memCacheA = MemoryCache.getInstance("A");
        MemoryCache memCacheB = MemoryCache.getInstance("B");
        MemoryCache memCacheC = MemoryCache.getInstance("C");
        MemoryCache.setMaxInstanceCount(3);
        MemoryCache memCacheD = MemoryCache.getInstance("D"); // memCacheA가 제거됨
        //memCacheA = null;
        assertEquals(null, memCacheA);
    }

}
