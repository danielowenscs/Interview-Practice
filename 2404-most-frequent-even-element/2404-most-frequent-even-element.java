class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and populate the frequency map
        for (int num : nums) {
            if (num % 2 == 0) { // Check if the number is even
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        int mostFrequentEvenElement = -1;
        int maxFrequency = 0;

        // Iterate through the frequency map to find the most frequent even element
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();
            int currentElement = entry.getKey();

            // Update the result if a more frequent even element is found
            if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && currentElement < mostFrequentEvenElement)) {
                mostFrequentEvenElement = currentElement;
                maxFrequency = currentFrequency;
            }
        }

        return mostFrequentEvenElement;
    }
}
    