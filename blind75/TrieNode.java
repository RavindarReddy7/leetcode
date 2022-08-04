package com.blind75;

public class TrieNode {

	char c;
	boolean isWord;
	TrieNode[] children;

	public TrieNode(char d) {
		isWord = false;
		children = new TrieNode[26];

	}
}
