package com.code.challenge;

import org.junit.Test;

public class SolveCodeChallengeWithJUnit {
	String sentence = "This cow jumped over the moon";
	public String findLargestWordAndLength(String sentence) {

		String[] word = sentence.split(" ");

		String max = word[0];
		for (int i = 1; i < word.length; i++) {
			if (word[i].length() > max.length()) {
				max = word[i];
			}
		}
		return "The longest word of the sentence is : " + max + "  --And the length of the word is : " + max.length();
	}

	@Test
	public void execute() {
		findLargestWordAndLength(sentence);
		System.out.println(findLargestWordAndLength(sentence));
	}

}
