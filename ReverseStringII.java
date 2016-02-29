/**
 * Created by ZihanCong on 16/2/29.
 */
public class ReverseStringII {
    public String reverseWords(char[] s) {
        //O(n) runtime, O(1) space – In-place reverse:
        // 首先把全部字符串reverse一次,保证它的序列是从后往前
        reverse(s,0,s.length-1);
        //记录HEAD TAIL
        int head = 0;
        int tail = 0;
        for(int i=0;i<=s.length;i++) {
            if (i == s.length||s[i] == ' '  ) {
                tail = i;
                reverse(s, head, tail-1);
                head = tail + 1;
            }
        }
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
