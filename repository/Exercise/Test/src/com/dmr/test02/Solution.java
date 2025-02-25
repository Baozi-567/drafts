package com.dmr.test02;

/**
 * 242. 有效的字母异位词 字典解法
 * 时间复杂度O(m+n) 空间复杂度O(1)
 */
public class Solution {
    public static void main(String[] args) {
        int[] n={2,7,11,15};
        int t =9;
        int[] m;
        m=twoSum(n,t);
        for (int i:m) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int[] b={0,0};
            b[0]=i;
            int a=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(a==nums[j]){
                    b[1]=j;
                    return b;
                }
            }
        }
        return null;
    }
}
