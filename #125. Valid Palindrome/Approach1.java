class Solution {
    public boolean isPalindrome(String s) {
        String output = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = output.length();
        for(int i=0;i<len/2;i++)
        {
            if(output.charAt(i) != output.charAt(len-i-1))
            return false;
        }
        return true;
    }
}
