class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int i = 0 ; i < s.length() ; i++){
            while(ans.contains(s.charAt(i))){
                ans.remove(s.charAt(left));
                left++;
            }
            ans.add(s.charAt(i));
            max = Math.max(max , i - left+1);
        }
    return max;
        
    }
}