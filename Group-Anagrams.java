class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int[] charArray = new int[26];
            for(int i=0; i<s.length(); i++){
                charArray[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(charArray);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(s);

        }

        return new ArrayList<>(map.values());
        
    }
}