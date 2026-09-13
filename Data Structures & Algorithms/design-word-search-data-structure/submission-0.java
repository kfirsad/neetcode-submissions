class WordDictionary {

    class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }

    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        char[] wordArray = word.toCharArray();
        TrieNode curr = root;
        
        for(char s : wordArray){
            int index = s - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.isEndOfWord = true;
    }

    public boolean search(String word){
        return searchHelper(root, word, 0);
    }

    public boolean searchHelper(TrieNode node, String word, int index){
        if(index == word.length()){
            return node.isEndOfWord;
        }

        char c = word.charAt(index);

        if(c != '.'){
            int charIndex = c - 'a';
            if (node.children[charIndex] != null){
                return searchHelper(node.children[charIndex], word, index+1);
            }else{
                return false;
            }
        }else{
            for(int i = 0; i <= 25; i++){
                if(node.children[i] != null){
                    if(searchHelper(node.children[i], word, index+1)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
