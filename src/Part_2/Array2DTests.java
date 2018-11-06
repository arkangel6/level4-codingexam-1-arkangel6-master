package Part_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2DTests {

	@Test
	void test() {
		Integer[][] nums = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8}
			};
		Integer[] t1 = {8, 7, 6};
		Integer[] t2 = {5, 4, 3};
		Integer[] t3 = {2, 1, 0};	
		reverseMatrix(nums);
		
		assertArrayEquals(t1, nums[0]);
		assertArrayEquals(t2, nums[1]);
		assertArrayEquals(t3, nums[2]);
		
		String[][] words = {
				{"A", "B", "C", "D"}, 
				{"E", "F", "G", "H"}, 
				{"I", "J", "K", "L"}, 
				{"M", "N", "O", "P"}
			};
		
		String[] s1 = {"P", "O", "N", "M"};
		String[] s2 = {"L", "K", "J", "I"};
		String[] s3 = {"H", "G", "F", "E"};
		String[] s4 = {"D", "C", "B", "A"};
		
		reverseMatrix(words);
		
		assertArrayEquals(s1, words[0]);
		assertArrayEquals(s2, words[1]);
		assertArrayEquals(s3, words[2]);
		assertArrayEquals(s4, words[3]);
	}
	
	/*
	 * Complete the reverseMatrix method so that the 2D array arr gets
	 * all of its rows and columns reversed. Remember that a 2D array is an 
	 * array of arrays. You can make helper methods if needed.
	 */
	public <T> void reverseMatrix(T[][] arr) {
		T t;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length/2; j++) {
				t = arr[i][j];
				arr[i][j] = arr[i][arr[j].length-1-j];
				arr[i][arr[j].length-1-j] = t;
			//	System.out.println(arr[i][arr[j].length-1-j].toString());
				//System.out.println(arr[i][j].toString());
			}
			
		}
		T[] t2;
		for(int i = 0; i < arr.length/2; i++) {
			t2 = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = t2;
		}
		
		
	}
}
