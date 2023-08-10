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
        
        System.out.println(a + " | " +  b);
        String result = "";
        boolean carry = false;
        for (int i = 0; i<a.length(); i++) {
            char currA = a.charAt(a.length()-1-i);
            char currB = b.charAt(b.length()-1-i);
            
            if (currA == '0' && currB == '0' && !carry) {
                System.out.println(1);
                result = "0" + result;
                carry = false;
            }
            else if ((currA == '0' && currB == '1' || currA == '1' && currB == '0')  && !carry) {
                 System.out.println(2);
                result = "1" + result;
                carry = false;
            }
            else if(currA == '1' && currB == '1' && !carry) {
                 System.out.println(3);
                result = "0" + result;
                carry = true;
            }
            
            else if(currA == '0' && currB == '0' && carry) {
                 System.out.println(4);
                result = "1" + result;
                carry = false;
            }
            else if ((currA == '0' && currB == '1' || currA == '1' && currB == '0')  && carry) {
                 System.out.println(5);
                result = "0" + result;
                carry = true;
            }
            else if (currA == '1' && currB == '1' && carry) {
                 System.out.println(6);
                result = "1" + result;
                carry = true;
            }
        }
        if (carry) {
            result = "1" + result;
        }
        
        return result;
        
        
    }   
    
}
// 00000000 -> 0
// 00000001 -> 1
// 00000010 -> 2
// 00000011 -> 3
// 00000100 -> 4
// 00000101 -> 5
// 00000110 -> 6
// 00000111 -> 7
// 00001000 -> 8
// 00001001 -> 9
// 00001010 -> 10
// 00001011 -> 11
// 00001100 -> 12

// 00000001 -> 1
// 00000011 -> 3
// 00000000
// 00000000
// 00000100


//  11
//  11
//   0 1 + 1 = 1 0 carry = true
//  1  1 + 1 + 1 = 11 carry = true
// 110


//  11
//  11
//   0 1 + 1 = 1 0 carry = true
//  1  1 + 1 + 1 = 11 carry = true
// 110