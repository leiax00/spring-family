import org.junit.Test;

import java.util.HashSet;

public class TestAlgorithm1 {
    @Test
    public void tes1() {
        String a = new StringBuilder("计算机").append("技术").toString();
        System.out.println(a.intern() == a);
        String aa = new StringBuilder("ja").append("va").toString();
        System.out.println(aa.intern() == aa);
    }

    @Test
    public void getDistinctValueFromArray() {
        String[] aa = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "yes"};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int originalLen = 0;
        StringBuilder builder = new StringBuilder();
        do {
            int seed = (int) (Math.random() * 10);
            hashSet.add(seed);
            if (originalLen != hashSet.size()) {
                builder.append(aa[seed]);
                originalLen = hashSet.size();
            }
        } while (hashSet.size() < 10);
        System.out.println(builder.toString());
        System.out.println(builder.toString().length());
    }
}
