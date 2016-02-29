import java.util.ArrayList;

/**
 * Created by ZihanCong on 16/2/29.
 */
public class RotateStr {
    public String rotate(char[] s,int k){
        k = k%s.length;
        reverse(s,0,s.length-1);
        reverse(s,0,k-1);
        reverse(s,k,s.length-1);
        return new String(s);
    }
    public void reverse(char[] s,int begin, int end){
        int middle = (begin+end)/2;
        for(int i= begin;i<=middle;i++)
        {
            char temp = s[i];
            s[i] = s[end+begin-i];
            s[end+begin-i]=temp;
        }

    }
}
