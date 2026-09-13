class PrefixTree {

    class TrieNode{
        TrieNode[] children;
        boolean isEndOfWord;
       
        public TrieNode(){
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    TrieNode root;

    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        char[] wordArray = word.toCharArray();
        TrieNode curr = root;
        for(char c : wordArray){
            int index = c - 'a';
            if(curr.children[index] == null){
            curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }

        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        char[] wordArray = word.toCharArray();
        TrieNode curr = root;
        for(char c : wordArray){
            int index = c - 'a';
            if(curr.children[index] == null){
                return false;
            }else{
                curr = curr.children[index];
            }
        }

        return curr.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        char[] prefixArray = prefix.toCharArray();
        TrieNode curr = root;
        for(char c : prefixArray){
            int index = c - 'a';
            if(curr.children[index] == null){
                return false;
            }else{
                curr = curr.children[index];
            }
        }

        return true;
    }
}
