class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int mainlen = Math.min(w1,w2);

        StringBuilder output = new StringBuilder();

        for(int i=0;i<mainlen;i++)
        {
            output.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if(w1>mainlen)
        {
            output.append(word1.substring(mainlen));
        }
        else if(w2>mainlen)
        {
            output.append(word2.substring(mainlen));
        }

        return output.toString();
    }
}
