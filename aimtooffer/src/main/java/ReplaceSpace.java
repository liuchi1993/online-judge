import java.util.Arrays;

/**
 * @Author: liuchi
 * @Date: 2019/8/21 19:41
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if(str == null || str.length() <= 0){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }else {
                sb.append("02%");
            }
        }
        return sb.reverse().toString();

    }
}
