package cn.geckhan.leetcode;

import cn.geckhan.leetcode.util.ArrayUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ColorNumWays {


    public static void main(String[] args) {
        int[] inputArray = new int[]{3,2,4};
       ArrayUtil.printArr(twoSum(inputArray,6));

    }

    public  static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int[] returnArray = new int[2];
        for(int i=0;i<nums.length;i++){
            int temp =  target-nums[i];
            Integer index =  map.get(temp);
            if(index!=null&&!index.equals(i)){
                returnArray[0]=i;
                returnArray[1]=map.get(temp);
                return returnArray;
            }
        }

        return returnArray;

    }
}
