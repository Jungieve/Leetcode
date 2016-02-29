/**
 * Created by ZihanCong on 16/2/28.
 */
public class ReverseString {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = s.length();
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) == ' ')
                index = i;
            else if ( i == 0||s.charAt(i - 1) == ' ' ) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(' ');
                }
                stringBuilder.append(s.substring(i, index));
            }
        }
        return stringBuilder.toString();
    }

}
