/**
 * @Author: liuchi
 * @Date: 2019/8/13 23:37
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() > t.length()) {
            return false;
        }
        int si = 0, ti = 0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)){
                si++;
                ti++;
            }else {
                ti++;
            }
        }
        return si == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        String s1 = "abc",t1= "ahbgdc";
        String s2 = "axc",t2= "ahbgdc";
        System.out.println(isSubsequence.isSubsequence(s1,t1));
        System.out.println(isSubsequence.isSubsequence(s2,t2));
    }
}
