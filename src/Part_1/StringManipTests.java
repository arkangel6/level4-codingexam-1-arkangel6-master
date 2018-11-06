package Part_1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class StringManipTests {

	@Test
	void test() {
		String letters = "These are the letters with which I would like to use in order to compose my message";
		String message = "This is the message I want to write.";
		assertTrue(checkRansomNote(letters, message));
		
		letters = "some words";
		message = "Can I write this message";
		assertFalse(checkRansomNote(letters, message));
		
	}
	
	
	/*
	 * Complete the checkRansomNote method below. The method takes two strings. 
	 * The first string is all the available letters that can be used to compose a
	 * message. The second String is the actual message that needs to be composed.
	 * The method should check to see if the message can be composed with the available
	 * letters and return true. Otherwise, it should return false.
	 * 
	 */
	public boolean checkRansomNote(String letters, String message) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] let = letters.toCharArray();
		
		for(int i = 0; i < let.length; i++) {
			if(!map.containsValue(let[i])) {
				map.put(let[i], 1);
			}else {
				map.put(let[i], map.get(let[i]).intValue()+1);
			}
			
		}
		
		System.out.println(map.entrySet() + " " + map.keySet());
		
		
	
		
		
		
		return false;
	}
	
	

}
