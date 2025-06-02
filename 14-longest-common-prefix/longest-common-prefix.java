class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        int len=strs.length;
        String last=strs[len-1];
        int min_len=Math.min(first.length(),last.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<min_len;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return sb.toString();
            }
            sb=sb.append(first.charAt(i));

        }
        return sb.toString();

        
    }
}