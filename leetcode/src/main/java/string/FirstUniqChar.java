package string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: liuchi
 * @Date: 2019/6/6 21:42
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        String str = "leetcode";
        int result = firstUniqChar_1(str);
        System.out.println(result);
    }

    private static int firstUniqChar(String str) {
        if (str == null || str.length() <=0){
            return -1;
        }
        if (str.length() == 1){
            return 0;
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++){
            map.merge(str.charAt(i),1,Math::addExact);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return str.indexOf(entry.getKey());
            }
        }
        return -1;
    }

    private static int firstUniqChar_1(String str){
        for (int i=0; i<str.length(); i++){
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
