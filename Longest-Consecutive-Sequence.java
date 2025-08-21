// class Solution {
//     public int longestConsecutive(int[] nums) {

//         Set<Integer> set = new HashSet<>();

//         for(int n: nums){
//             set.add(n);
//         }

//         int result =0;

//         for(int n: nums){
//             if(!set.contains(n-1)){
//                 int length=1;

//                 while(set.contains(n + length)){
//                     length++;
//                 }

//                 result = Math.max(result, length);
//             }
//         }

//         return result;
        
//     }
// }



public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}