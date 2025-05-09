class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // let's first make a hashmap with values of the array it's frequency

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        // now create a bucket, with frequency as index and array values in it

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }

        // now, the bucket has values against the index which is nothing but the frequency

        int[] result = new int[k];
        int counter = 0;

        for (int i = bucket.length - 1; i > 0 && counter < k; i--) {

            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    result[counter++] = n;

                }

            }

        }

        return result;

    }
}