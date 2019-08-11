package string;

/**
 * @Author: liuchi
 * @Date: 2019/6/6 19:49
 */
public class AddBinary {

    public static void main(String[] args) {
        String str1 = "11111111111111";
        String str2 = "1";
        String result = addBinary(str1,str2);
        System.out.println(result);
    }

    private static String addBinary(String str1, String str2) {
        if (str1 == null || str1.length() <= 0){
            return str2;
        }
        if (str2 == null || str2.length() <= 0){
            return str1;
        }
        StringBuilder sb = new StringBuilder();
        int index1 = str1.length() - 1;
        int index2 = str2.length() - 1;
        char c = '0';
        char ZERO = '0';
        int i,j,k;
        while (index1 >= 0 || index2 >= 0){
            i = 0;
            j = 0;
            if (index1 >= 0){
                i = str1.charAt(index1--) - ZERO;
            }
            if (index2 >= 0){
                j = str2.charAt(index2--) - ZERO;
            }
            k = c - ZERO;
            c = (char)((i+j+k)/2 + ZERO);
            sb.append((char)((i+j+k)%2 + ZERO));
        }
        if (c == '1'){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
