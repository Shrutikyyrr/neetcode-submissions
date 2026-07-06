class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char a : s.toCharArray()){
            if (map.containsKey(a)){
                map.put(a, map.get(a)+1);
            } else{
                map.put(a, 1);
            }
        }
        for (char b : t.toCharArray()){
            if (map.containsKey(b) && map.get(b) > 0){
                map.put(b, map.get(b) - 1);
            } else{
                return false;
            }   
        }
        return true;
    }
}
