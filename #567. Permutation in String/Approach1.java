class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n1 = s1.length();
        int n2 = s2.length();

        char[] original = s1.toCharArray();
        Arrays.sort(original);
        s1 = new String(original);

        for(int i=0;i<=n2-n1;i++)
        {
            String sub = s2.substring(i,i+n1);

            char[] array = sub.toCharArray();
            Arrays.sort(array);
            sub = new String(array);

            if(sub.equals(s1))
            return true;
        }
        return false;
    }
}
