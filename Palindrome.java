/**
 * Created by ZihanCong on 16/2/28.
 */
// TODO: 16/2/28 下午1:04 By Jungieve<Zihan.cong@gmail.com> Difficulty: Easy, Frequency: Medium
// TODO: 16/2/28 下午1:05 By Jungieve<Zihan.cong@gmail.com> Code it now: https://oj.leetcode.com/problems/valid-palindrome/

public class Palindrome {
    //O(n) runtime, O(1) space:最简单的方法,利用首位的字符对比
    public boolean isPalindrome(String s) {
        int leftindex = 0;
        int rightindex = s.length()-1;
        while(leftindex<rightindex) {
            if(Character.isLetterOrDigit(s.charAt(leftindex))==false) {
                leftindex++;
                continue;
            }
            if(Character.isLetterOrDigit(s.charAt(rightindex))==false) {
                rightindex--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(leftindex))==Character.toLowerCase(s.charAt(rightindex)))
            {
                leftindex++;
                rightindex--;
                continue;
            }
            else
            return false;
        }
        return true;
    }
}
