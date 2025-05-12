class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);

        }


        // now, et's crate a list where the indexes will be 
List<Integer>[] bucket = new List[nums.length + 1];
        for(int key: frequencyMap.keySet()){
            int frequency = frequencyMap.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
            
        }
        int[] result = new int[k];
int counter =0;
        for(int i=bucket.length-1; i>=0 && counter<k; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[counter++]=num;
                }
                
            }
        }

        return result;

        
    }
}