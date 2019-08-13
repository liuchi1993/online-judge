import java.util.*;

/**
 * @Author: liuchi
 * @Date: 2019/8/13 19:43
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        Map<Integer, Integer> frequencies = new HashMap<>(16);
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (Integer num : frequencies.keySet()){
            Integer frequency = frequencies.get(num);
            if (buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }
        List<Integer> elements = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && elements.size() <= k; i--){
            if (buckets[i] == null){
                continue;
            }
            if (buckets[i].size() <= k - elements.size()){
                elements.addAll(buckets[i]);
            }else {
                elements.addAll(buckets[i].subList(0,k - elements.size()));
            }
        }
        return elements;
    }
}
