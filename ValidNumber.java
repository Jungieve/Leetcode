/**
 * Created by ZihanCong on 16/3/1.
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        int i = 0, n = s.length();
        boolean isNumber = false;
        int sign = 1;
        while (i < n && Character.isWhitespace(s.charAt(i)))
            i++;
        if (i < n &&( s.charAt(i) == '+' || s.charAt(i) == '-'))
        i++;
        while (i < n && Character.isDigit(s.charAt(i))) {
            i++;

            isNumber = true;
        }
        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNumber = true;
            }
        }
        if (isNumber && i < n && s.charAt(i) == 'e') {
            i++;
            isNumber = false;
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                isNumber = true;
            }
        }
        while (i < n && Character.isWhitespace(s.charAt(i)))
            i++;
        return isNumber && i == n;

    }
}
