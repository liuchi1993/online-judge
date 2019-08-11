package string;

/**
 * @Author: liuchi
 * @Date: 2019/6/5 23:24
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String str = "LiuChi";
        String result = toLowerCase(str);
        System.out.println(result);
    }

    private static String toLowerCase(String src){
        if (src == null || src.length() <= 0){
            return null;
        }
        char diff = 'a' - 'A';
        char[] chars = src.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars){
            if (ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch + diff));
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
