class Solution {
    public boolean isPalindrome(String s) {
        String output = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(output).reverse().toString();

        if(rev.equals(output))
        return true;

        else
        return false;
    }
}
