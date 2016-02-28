/**
 * Created by ZihanCong on 16/2/28.
 */
// TODO: 16/2/28 下午3:39 By Jungieve<Zihan.cong@gmail.com> Difficulty: Easy, Frequency: High
// TODO: 16/2/28 下午3:40 By Jungieve<Zihan.cong@gmail.com> Code it now: https://oj.leetcode.com/problems/implement-strstr/
public class Strstr {
    //O(nm) runtime, O(1) space – Brute force:
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0)
            return -1;
        int index = 0;
        int needindex = 0;
        while (index < haystack.length()) {
            if (haystack.charAt(index) == needle.charAt(needindex)) {
                // 说明needle匹配到了最后一个
                if (needindex == needle.length() - 1) {
                    //  返回haystack的索引值
                    return index - needindex;
                }
                //否则继续尝试匹配
                index++;
                needindex++;
                continue;
            }
            //如果匹配不到且匹配完成,回退到之前的index并增长1
            else {
                index = index - needindex + 1;
                //重置needle的索引
                needindex = 0;
            }

        }
        return -1;
    }

    public int BestStr(String haystack, String needle){
        //这是在leetcode上面的很简练的解法,这道题需要考虑一下情况:
        //1.如果haystack为空或者needle为空的情况
        //2.当needle字符串小于haystack情况(显然是-1,如果还要M*N次计算,考虑到一个非常大的haystack或needle,有可能出现time exceed
        for(int i = 0; i< haystack.length();i++)
            for(int j = 0; j<haystack.length();j++)
    }
}
