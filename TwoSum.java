// TODO: 16/2/27 下午5:20 By Jungieve<Zihan.cong@gmail.com> Difficulty: Easy, Frequency: High
// TODO: 16/2/27 下午7:59 By Jungieve<Zihan.cong@gmail.com> Code it now: https://oj.leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //O(n) runtime, O(n) space – Hash table:
    public int[] HashTable(int[] nums, int target) {
        //用来存储nums的临时值
        Map<Integer, Integer> map = new HashMap<>();
        //对nums进行遍历,length代表数组长度
        for (int index = 0; index < nums.length; index++) {
            //如果在map中能找到合适的值
            if (map.containsKey(target - nums[index])) {
                //返回新的数组,其中前者为map中的nums键值,index为目前的索引.可以肯定的是index一定是较大值
                return new int[]{map.get(target - nums[index]), index};
            } else
                //将nums中的值-键写入到map中,之所以要这样写入是因为hashmap的get方法是获取值,而没有getkeys方法.如果按键-值写入则return
                //中需要迭代找到key,耗费时间.
                map.put(nums[index], index);

        }
        return nums;
    }
}

