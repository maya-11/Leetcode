class Trie {

    // Node class for representing each character in the Trie
    class TrieNode {
        // Each node has a map of children and a boolean flag to mark end of word
        Map<Character, TrieNode> children;
        boolean isEndOfWord;
        
        public TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();  // Initialize the root node
    }

    // Inserts the string word into the trie
    public void insert(String word) {
        TrieNode node = root;
        
        for (char c : word.toCharArray()) {
            // If the current character is not present in the map, create a new node
            if (!node.children.containsKey(c)) {
                node.children.put(c, new TrieNode());
            }
            node = node.children.get(c);  // Move to the next node
        }
        node.isEndOfWord = true;  // Mark the end of the word
    }

    // Returns true if the string word is in the trie
    public boolean search(String word) {
        TrieNode node = root;
        
        for (char c : word.toCharArray()) {
            // If the character is not found, return false
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);  // Move to the next node
        }
        
        // Return true only if we reached the end of the word and it's marked as the end of a word
        return node.isEndOfWord;
    }

    // Returns true if there is a word in the trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        
        for (char c : prefix.toCharArray()) {
            // If the character is not found, return false
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);  // Move to the next node
        }
        
        return true;  // If we finished traversing the prefix, return true
    }
}
