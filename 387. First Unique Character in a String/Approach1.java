class Solution {
    public int firstUniqChar(String s) {

    LinkedHashMap<Character, ArrayList<Integer>> map = new LinkedHashMap<>();

    for(int i = 0; i<s.length(); i++)
    {
        char ch = s.charAt(i);
        map.computeIfAbsent(ch,k->new ArrayList<>()).add(i);
    }  

    for(ArrayList<Integer> list: map.values()) 
    {
        if(list.size() == 1)
            return list.get(0);
    }
    return -1;
    }
}
