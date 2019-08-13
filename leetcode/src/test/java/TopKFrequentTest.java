import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: liuchi
 * @Date: 2019/8/13 20:00
 */
public class TopKFrequentTest {

    @org.junit.Test
    public void topKFrequent() {
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> result = topKFrequent.topKFrequent(nums,k);
        assertEquals(Arrays.asList(1,2), result);

    }
}