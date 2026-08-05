

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Key = Sorted word
        // Value = List of original words
        HashMap<String, List<String>> map = new HashMap<>();

        // Traverse every word
        for (String word : strs) {

            // Convert word to character array
            char[] arr = word.toCharArray();

            // Sort the characters
            Arrays.sort(arr);

            // Convert back to String
            String key = new String(arr);

            // If key doesn't exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original word to the list
            map.get(key).add(word);
        }

        // Return all the groups
        return new ArrayList<>(map.values());
    }
}