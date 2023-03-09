class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> dict = new HashMap<Character, Integer>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        
        int sum = 0;
        for (int i =0; i<s.length()-1; i++) {
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            if (dict.get(curr) == 0) {
                continue;
            }
            else if (dict.get(curr) >= dict.get(next)) {
                sum += dict.get(curr);
            }
            else {
                sum += ((dict.get(next)-dict.get(curr)));
                dict.replace(next, 0);
            }
            System.out.println("curr: " + curr + " " + "next: "+ next + " " + sum + " " + dict.toString());
        }
        sum += dict.get(s.charAt(s.length()-1));
        
        return sum;
    }
}

// plan
// make dictonary of numerals and equivlenet numbers
// make sum variable
// iterate through list
// compare curr to next
// if curr < next then (sum = next - curr)
// then add the last element to sum

// M CM XC IV

// 1000 100 1000 10 100 1 5
// 1000
// 900
// 90
// 4

// MCMXCIV
// 1000 100 1000 10 100 1 5
// 1000
// 1900
// IIV
