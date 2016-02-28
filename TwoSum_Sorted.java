// TODO: 16/2/27 下午8:00 By Jungieve<Zihan.cong@gmail.com> Difficulty: Medium, Frequency: N/A
// TODO: 16/2/27 下午8:00 By Jungieve<Zihan.cong@gmail.com> Code it now: Coming soon!
public class TwoSum_Sorted {
    //O(n) runtime, O(1) space – Two pointers:
    public int[] TwoPointers(int[] nums, int target) {
        //主要思想就是针对已经排序过的数,从第一个和最后一个数之和与target比较,不断更改pointer的位置,这样最坏时间为N
        int leftindex = 0;
        int rightindex = nums.length - 1;
        while (leftindex < rightindex) {
            if (nums[leftindex] + nums[rightindex] > target)
                rightindex--;
            else if (nums[leftindex] + nums[rightindex] < target)
                leftindex++;
            else if (nums[leftindex] + nums[rightindex] == target)
                return new int[]{leftindex, rightindex};

        }
        throw new IllegalArgumentException("No two sum solution");


    }

    //O(nlog(n)) runtime, O(1) space – Two pointers:
    public int[] TwoPointersII(int[] nums, int target) {
        //主要思想就是针对已经排序过的数,从第一个和最后一个数之和与target比较,不断更改pointer的位置,这样最坏时间为N
        for (int index = 0; index < nums.length; index++) {
            int returnindex = binearSearch(nums, target - nums[index], 0, nums.length - 1);
            if (returnindex != -1)
                return new int[]{index, returnindex};
        }
        throw new IllegalArgumentException("No two sum solution");


    }

    public int binearSearch(int[] nums, int target, int leftindex, int rightindex) {
        //主要思想是用二分查找法遍历查询target-n,其中二份查找时间消耗为logn,共N个数字需要遍历
        if(leftindex>rightindex)
            return -1;
        int mediaindex = (leftindex + rightindex) / 2;
        if (nums[mediaindex] == target)
            return mediaindex;
        if (nums[mediaindex] > target)
            return binearSearch(nums, target, leftindex, mediaindex);
        else
            return binearSearch(nums, target, mediaindex + 1, rightindex);
    }
    //手写一个binearSearch算法

}

