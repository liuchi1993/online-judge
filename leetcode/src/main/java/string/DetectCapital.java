package string;

/**
 * @Author: liuchi
 * @Date: 2019/6/7 9:04
 */
public class DetectCapital {
    public static void main(String[] args) {
        String str = "TEst";
        String result = detectCapitalUse(str);
        System.out.println(result);
    }

    private static String detectCapitalUse(String str) {
        String TRUE = "True";
        String FALSE = "False";
        if (str == null || str.length() <= 0){
            return FALSE;
        }
        if (str.toLowerCase().equals(str)){
            return TRUE;
        }
        if (str.toUpperCase().equals(str)){
            return TRUE;
        }
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
            if (str.substring(1).toLowerCase().equals(str.substring(1))){
                return TRUE;
            }
        }
        return FALSE;
    }
}
