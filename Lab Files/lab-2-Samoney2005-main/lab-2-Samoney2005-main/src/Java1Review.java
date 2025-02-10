public class Java1Review {
	public static void main(String[] args) {
		
	}
	// Method to divide two floating-point numbers and return the result as a double
	public static double divide(double a, double b) {
		return a / b;
	}
	
	// Overloaded divide method that takes two integers and returns a double result
	public static double divide(int a, int b) {
		return a / b;
	}
	
	// Method to check if a given integer is divisible by 7
	// Returns true if divisible, false otherwise
	public static boolean isDivisibleBy7(int val) {
		return val % 7 == 0;
	}
	
	// Overloaded main method that takes a string and returns a formatted message
	public static String main(String str) {
		return "Overloaded main method was passed \"" + str + "\".";
	} 
	
	// Method to find the minimum value among three integers
	public static int findMin(int i, int j, int k) {
		if (i < j && i < k) {
			return i;
		} else if (j < i && j < k) {
			return j;
		} else {
			return k;
		}
	}
	
	// Overloaded method to find the minimum value in an integer array
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	// Method to calculate the average of an integer array
	public static double average(int[] array) {
		double sum = 0;
		for (int i : array) {
			sum += i;
		}
		return divide(sum, array.length); // Uses the divide method
	}
	
	// Method to convert all strings in an array to lowercase (modifies the original array)
	public static void toLowerCase(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].toLowerCase();
		}
	}
	
	// Method to create and return a new array where all strings are converted to lowercase
	public static String[] toLowerCaseCopy(String[] strings) {
		String[] result = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			result[i] = strings[i].toLowerCase();
		}
		return result;
	}
	
	// Method to remove duplicate values from an integer array by setting duplicates to 0
	public static void removeDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					array[j] = 0;
					flag = true;
				}
			}
			if (flag) {
				array[i] = 0;
			}
		}
	}
}

	