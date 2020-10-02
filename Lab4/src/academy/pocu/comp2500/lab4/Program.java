package academy.pocu.comp2500.lab4;

import static org.junit.Assert.assertEquals;

public class Program {

    public static void main(String[] args) {
        {
            MemoryCache.clear();
            MemoryCache.setMaxInstanceCount(5);

            MemoryCache memCacheA = MemoryCache.getInstance("A");
            MemoryCache memCacheB = MemoryCache.getInstance("B");
            MemoryCache memCacheC = MemoryCache.getInstance("C");
            MemoryCache memCacheD = MemoryCache.getInstance("D");
            MemoryCache memCacheE = MemoryCache.getInstance("E");


            assert memCacheA != null;
            assert memCacheB != null;
            assert memCacheC != null;
            assert memCacheD != null;
            assert memCacheE != null;

            assert memCacheA == MemoryCache.getInstance("A");
            assert memCacheB == MemoryCache.getInstance("B");
            assert memCacheC == MemoryCache.getInstance("C");
            assert memCacheD == MemoryCache.getInstance("D");
            assert memCacheE == MemoryCache.getInstance("E");


            memCacheA.addEntry("test", "test");
            assert memCacheA.getEntryOrNull("test").equals("test");
            memCacheB.addEntry("test", "test");
            assert memCacheB.getEntryOrNull("test").equals("test");

            MemoryCache.setMaxInstanceCount(3);

            assert memCacheC == MemoryCache.getInstance("C");
            assert memCacheD == MemoryCache.getInstance("D");
            assert memCacheE == MemoryCache.getInstance("E");
            assert memCacheA != MemoryCache.getInstance("A");
            assert memCacheB != MemoryCache.getInstance("B");

            // A, B는 삭제후 새로 생성된 instance이니 위에서 추가했던 entry가 없을것임
            memCacheA = MemoryCache.getInstance("A");
            memCacheB = MemoryCache.getInstance("B");
            assert memCacheA.getEntryOrNull("test") == null;
            assert memCacheB.getEntryOrNull("test") == null;

            MemoryCache.clear();
        }
    }

}
