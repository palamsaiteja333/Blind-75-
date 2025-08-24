class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        
        result[0]= 1;
        for(int i=1; i<nums.length; i++){
            result[i]= result[i-1]*nums[i-1];
        }
// nums = [1, 2, 3, 4]
// result = [1, 1, 2, 6]

int pos =1;
for(int i=n-1; i>=0; i--){
    result[i]= result[i] * pos;
    pos *= nums[i];

}

        // int[] right = new int[n];
        // right[n-1] = 1;
        // for(int j=n-2; j>=0; j--){
        //     right[j]= right[j+1] * nums[j+1];
        // }
        // int[] result = new int[n];

        // for( int i  =0; i<n; i++){
        //     result[i]= left[i]*right[i];
        // }

        return result;
    }
}