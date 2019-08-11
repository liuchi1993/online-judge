package string;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="liuchi";
		String s1=reverseString(s);
		System.out.println(s1);
	}
	
	public static String reverseString(String s){
		StringBuilder sb=new StringBuilder();
		for (int i = s.length()-1; i >=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

}
