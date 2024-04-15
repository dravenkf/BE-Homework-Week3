//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] intArray = new int[] {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
			System.out.println(intArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println(intArray[intArray.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
			//	System.out.println(intArray[6]);
			// - Out of bounds since array lists start at position 0
			
		// 5. Print out the element in the array at position -1, what happens?
			//System.out.println(intArray[-1]);
			// - Out of bounds since array lists start at position 0
			
		// 6. Write a traditional for loop that prints out each element in the array
			for (int i = 0; i < intArray.length; i++) {
				System.out.println(intArray[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array
			for (int integer : intArray) {
				System.out.println(integer);
			}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			int sum = 0;
			for (int integer : intArray) {
				sum = sum + integer;
			}
			System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
			double average = sum / intArray.length;
			System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			for (int integer : intArray) {
				if (integer%2 != 0){
					System.out.println(integer);
				}
			}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] stringArray = new String[] {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
			int letterSum = 0;
			for (String string : stringArray) {
				letterSum += string.length();
			}
			System.out.println(letterSum);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		String name = "Draven";
		greeting(name);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greetingString(name));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(stringGreaterThanInt("hello", 4));
		System.out.println(stringGreaterThanInt("hello", 6));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] stringArray2 = new String[] {"Test1", "Test2", "Test3"};
		System.out.println(isStringInArray(stringArray2, "Test1"));
		System.out.println(isStringInArray(stringArray2, "Test4"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] intArray2 = new int[] {7, 10, 5, 3, 1};
		System.out.println(smallestNumber(intArray2));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubleArray = new double[] {7.25, 8.50, 9.75, 6.50};
		System.out.println(doubleAverage(doubleArray));
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String[] stringArray3 = new String[] {"Hi", "Hello", "Goodbye"};		
		for (int i = 0; i < wordArrayToLengthArray(stringArray3).length; i++) {
			System.out.println(wordArrayToLengthArray(stringArray3)[i]);
		}
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String[] stringArray4 = new String[] {"These", "Are", "Some", "Random", "Words"};
		System.out.println(moreEvenLetters(stringArray4));
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		String palindromeTest1 = "tacocat";
		String palindromeTest2 = "random";
		System.out.println(isPalindrome(palindromeTest1));
		System.out.println(isPalindrome(palindromeTest2));
	}
	

	
	// Method 13:
	public static void greeting (String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greetingString (String name) {
		String greeting = "Hello, " + name + "!";
		return greeting;
	}

	
	// Method 15:
	public static boolean stringGreaterThanInt (String word, int num) {
		if (word.length() > num) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method 16:
	public static boolean isStringInArray (String[] strings, String searchString) {
		for (String string : strings) {
			if (searchString == string) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	public static int smallestNumber (int[] ints) {
		int min = ints[0];
		for (int integer : ints) {
			if (min > integer) {
				min = integer;
			}
		}
		return min;
	}
	
	// Method 18:
	public static double doubleAverage (double[] doubs) {
		double sum = 0;
		for (double doub : doubs) {
			sum += doub;
		}
		return sum/doubs.length;
	}
	
	// Method 19:
	public static int[] wordArrayToLengthArray (String[] strings) {
		int[] wordLength = new int[strings.length];
		for (int i = 0; i < strings.length; ++i) {
			wordLength[i] = strings[i].length();
		}
		return wordLength;
	}
	
	// Method 20:
	public static boolean moreEvenLetters (String [] strings) {
		int sumEven = 0;
		int sumOdd = 0;
		for (String string : strings) {
			if (string.length() % 2 == 0) {
				sumEven += string.length();
			} else {
				sumOdd += string.length();
			}
		}
		if (sumEven > sumOdd) {
			return true;
		}
		return false;
	}
	
	// Method 21:
	public static boolean isPalindrome (String string) {
		int i = 0;
		int j = string.length() - 1;
		while (i < j) {
			if (string.charAt(i) != string.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
 	}

}