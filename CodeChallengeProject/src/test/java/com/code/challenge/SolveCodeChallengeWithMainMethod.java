package com.code.challenge;

public class SolveCodeChallengeWithMainMethod {
	static String sentence = "This cow jumped over the moon"; // ==Given Sentence string.

	public static String findLargestWordAndLength(String sentence) {
		String[] word = sentence.split(" "); // ==splitting the sentence and stored words in a string Array.

		String max = word[0]; // ==Declared max var with value assigned of first index of word array.

		// ==for loop to find the longest word and length of the word as well.

		for (int i = 1; i < word.length; i++) {
			if (word[i].length() > max.length()) {
				max = word[i];
			}
		}
		return "The longest word of the sentence is : " + max + "  --And the length of the word is : " + max.length();
	}

	public static void main(String[] args) {
		findLargestWordAndLength(sentence); // == calling the method.

		System.out.println(findLargestWordAndLength(sentence)); // ==printing the result on console
	}

}
