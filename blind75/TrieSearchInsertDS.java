package com.blind75;

public class TrieSearchInsertDS {

	public TrieNode root;

	public TrieSearchInsertDS() {

		root = new TrieNode('\0');
	}

	public static void main(String[] args) {

			 
	}

	
	
	public void insert(String word) {

		TrieNode curr = root;
		for (char c : word.toCharArray()) {

			if (curr.children[c - 'a'] == null) {
				curr.children[c - 'a'] = new TrieNode(c);
			}
			curr = curr.children[c - 'a'];
		}
		curr.isWord = true;
	}
	
	public boolean search(String word) {
		
		TrieNode node = getNode(word);
		
		return node!=null && node.isWord;
	}

	private TrieNode getNode(String word) {
		
		TrieNode curr = root;
		
		for(char c: word.toCharArray()) {
			if(curr.children[c-'a']==null) {
				
				return null;
			}
			curr = curr.children[c-'a'];
		}
		return curr;
	}
	
	public boolean startsWith(String prefix) {
		return getNode(prefix)!=null;
	}
}
