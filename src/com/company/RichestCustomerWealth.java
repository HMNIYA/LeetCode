package com.company;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        int maxSum = 0;
        for(int[] client : accounts){
            int sum = 0;
            for(int amount : client){
                sum += amount;
                if(sum > maxSum) maxSum = sum;
            }
        }
        //return maxSum;
    }
}
