class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        ArrayList<Character> word = new ArrayList<>();
        int max = 0;

        for(int i=0;i<s.length();i++)
        {
            if(word.contains(s.charAt(i)))
            {
                while(word.contains(s.charAt(i)))
                {
                    word.remove(0);
                }
            }

            word.add(s.charAt(i));
            max = Math.max(max,word.size());
        }
        return max;
    }
}
