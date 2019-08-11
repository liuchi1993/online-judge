package string;

/**
 * @Author: liuchi
 * @Date: 2019/6/7 8:47
 */
public class AddString {
    public static void main(String[] args) {
        String str1 = "123123";
        String str2 = "456456";
        String result = addString(str1,str2);
        System.out.println(result);
    }

    private static String addString(String str1, String str2) {
        if (str1 == null || str1.length() <= 0){
            return str2;
        }
        if (str2 == null || str2.length() <= 0){
            return str1;
        }
        StringBuilder sb = new StringBuilder();
        int c = 0;
        int i,j;
        int index1 = str1.length() - 1;
        int index2 = str2.length() - 1;
        while(index1 >= 0 || index2 >= 0){
            i = 0;
            j = 0;
            if (index1 >= 0){
                i = str1.charAt(index1--) - '0';
            }
            if (index2 >= 0){
                j = str2.charAt(index2--) - '0';
            }
            sb.append((i+j+c)%10);
            c = (i+j+c)/10;
        }
        if (c > 0){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
