class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int dif = aLen - bLen;
        if (dif < 0) {
            while (dif != 0) {
                a = "0" + a;
                dif++;
            }
        }
        else {
            while (dif != 0) {
                b = "0" + b;
                dif--;
            }
        }
        
        StringBuilder result = new StringBuilder();
        boolean carry = false;
        for (int i = 0; i<a.length(); i++) {
            char currA = a.charAt(a.length()-1-i);
            char currB = b.charAt(b.length()-1-i);
            
            if (currA == '0' && currB == '0' && !carry) {
                result.insert(0, "0");
                carry = false;
            }
            else if ((currA == '0' && currB == '1' || currA == '1' && currB == '0')  && !carry) {
                 result.insert(0, "1");
                carry = false;
            }
            else if(currA == '1' && currB == '1' && !carry) {
                 result.insert(0, "0");
                carry = true;
            }
            
            else if(currA == '0' && currB == '0' && carry) {
                 result.insert(0, "1");
                carry = false;
            }
            else if ((currA == '0' && currB == '1' || currA == '1' && currB == '0')  && carry) {
                 result.insert(0, "0");
                carry = true;
            }
            else if (currA == '1' && currB == '1' && carry) {
                 result.insert(0, "1");
                carry = true;
            }
        }
        if (carry) {
             result.insert(0, "1");
        }
        return result.toString();
                
    }   
    
}