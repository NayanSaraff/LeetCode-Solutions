class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        String[] temp = strs.clone();

        List<List<String>> output = new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length;i++)
        {
            char[] ch = temp[i].toCharArray();
            Arrays.sort(ch);
            temp[i] = new String(ch);
        }

        for(int i = 0; i<temp.length; i++)
        {
            map.computeIfAbsent(temp[i],k->new ArrayList<>()).add(strs[i]);
        }

        for(ArrayList<String> list: map.values())
        {
            output.add(list);
        }
        return output;
    }
}
