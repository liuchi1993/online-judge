package string;

/**
 * @Author: liuchi
 * @Date: 2019/6/5 23:47
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "a";
        int result = lengthOfLastWord(str);
        System.out.println(result);
    }


    private static int lengthOfLastWord(String str) {
        if (str == null || str.length() <= 0){
            return 0;
        }
        String[] ss = str.split(" ");
        if (ss.length <= 0){
            return 0;
        }
        return ss[ss.length-1].length();
    }

}
