class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List <Integer> firstIndex = new ArrayList<>();
        firstIndex.add(1);
        result.add(firstIndex);
        for (int i = 1; i<numRows; i++) {
            int l = 0;
            int r = 1;
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            while (r < i) {
                curr.add(result.get(i-1).get(l) + result.get(i-1).get(r));
                l++;
                r++;
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}
