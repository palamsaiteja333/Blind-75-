class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int[] key = new int[26];

            for(char c: s.toCharArray()){
                key[c - 'a']++;
            }

            String keyString = Arrays.toString(key);

            map.putIfAbsent(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}