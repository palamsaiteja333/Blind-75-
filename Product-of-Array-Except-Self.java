class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i=1; i<nums.length; i++){

            result[i]= nums[i-1]*result[i-1];
        }

        // for(int i=nums.length-2; i>=0; i--){
        //     right[i]= right[i+1] * nums[i+1];
        // }

        // int result[] = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     result[i] = left[i]* right[i];
        // }

        int position =1;

        for(int i=nums.length-1;i>=0; i--){
            result[i] *= position;
            position *= nums[i];
        }

        return result;
        
    }
}