package com.company.MajorityElement2;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,1,1,3,3};
        List<Integer> ans = new ArrayList<Integer>();
        if(nums.length <= 0) System.out.println(ans);//return ans;
        Arrays.sort(nums);
        int i = 0,len = nums.length,tmp = 0;

        while(i < len - len/3){
            if(nums[i] == nums[i+len/3]){
                tmp = nums[i];
                ans.add(tmp);
                i += len/3;
                while(i < len - len/3 && nums[i] == tmp)i++;
            }else i++;
        }
        System.out.println(ans); //;return ans;
    }
}
