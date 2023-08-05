class Solution {
    public int lengthOfLastWord(String s) {
        
        boolean inWord = false;
        int start = 0;
        int end = s.length();
        
        for (int i = s.length()-1; i>= 0; i--){
           System.out.println("i " + i + " | " + "start : " + start + " | " + "end : " + end + " | " + "in word : " + inWord);
            if (s.charAt(i) != ' ' && !inWord) {
                inWord = true;
                end = i+1;
            }
            else if (s.charAt(i) == ' ' && inWord) {
                 //System.out.println(i);
                start = i+1;
                
                break;
            }
            
        }
        return s.substring(start, end).length();
        //return 0;
              
    }
}
// first determine if you are in the last word
// check that by finding a char that is not a space
// once that is found we set the end value and leave