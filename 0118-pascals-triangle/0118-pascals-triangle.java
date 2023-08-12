class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List <Integer> firstIndex = new ArrayList<>();
        firstIndex.add(1);
        result.add(firstIndex);
        for (int i = 1; i<numRows; i++) {
            System.out.println("i: " + i);
            int l = 0;
            int r = 1;
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            while (r < i) {
                System.out.println("l: " + l + " | r:" + r);
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

//    121
// 1 12 21 1 

//  1 3 3 1
// 1 4 6 4 1
       
// // number of pairs = numRows - 1
       
// 1 3 3 1
// l = 0
// r = 1
// l + r
// l = 1
// r = 2
// l = 2
// r = 3
