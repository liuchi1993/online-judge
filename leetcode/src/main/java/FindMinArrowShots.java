import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: liuchi
 * @Date: 2019/8/13 22:35
 */
public class FindMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length <= 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int count = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;
            }
            end = points[i][1];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        FindMinArrowShots findMinArrowShots = new FindMinArrowShots();
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        System.out.println(findMinArrowShots.findMinArrowShots(intervals1));
        System.out.println(findMinArrowShots.findMinArrowShots(intervals2));
    }
}
