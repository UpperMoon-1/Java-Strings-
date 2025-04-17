package cp213;

/**
 * Sample string methods.
 *
 * @author Giuseppe Akbari, 169057752, akba7752@mylaurier.ca
 * @version 2024-09-17
 */
public class StringMethods {
	// Constants
	/**
	 * String of vowels.
	 */
	public static final String VOWELS = "aeiouAEIOU";

	/**
	 * Counts the number of vowels in a string. Does not include 'y'.
	 *
	 * @param string A string.
	 * @return Number of vowels in string.
	 */
	public static int vowelCount(final String string) {
		int count = 0;

		// your code here
		for (int i = 0; i < string.length(); i++) {
			switch (string.charAt(i)) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			case 'A':
				count++;
				break;
			case 'E':
				count++;
				break;
			case 'I':
				count++;
				break;
			case 'O':
				count++;
				break;
			case 'U':
				count++;
				break;
			default:
				break;
			}

			// System.out.println(string.charAt(i));
		}

		return count;
	}

	/**
	 * Counts the number of digits in a string.
	 *
	 * @param string A string.
	 * @return Number of digits in string.
	 */
	public static int digitCount(final String string) {
		int count = 0;
		// your code here
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Totals the individual digits in a string.
	 *
	 * @param string A string.
	 * @return The integer total of all individuals digits in string.
	 */
	public static int totalDigits(final String string) {
		int total = 0;
		// your code here
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				// int num = Character.getNumericValue(string.charAt(i));
				total += Character.getNumericValue(string.charAt(i));
			}
		}

		return total;
	}

	/**
	 * Compares string1 and string2 and returns a comma-delimited concatenated
	 * string consisting of the string that is first lexically followed by the
	 * string that is second lexically. If the strings are equal, then only string1
	 * is returned.
	 *
	 * @param string1 String to compare against string2.
	 * @param string2 String to compare against string1.
	 * @return A concatenation of string1 and string2 in order.
	 */
	public static String pairs(String string1, String string2) {
		String line = null;
		// your code here
		int num = string1.compareTo(string2);
		if (num > 0) {
			line = string2;
			line = line + ',';
			line = line + string1;
		} else if (num < 0) {
			line = string1;
			line = line + ',';
			line = line + string2;

		} else {
			line = string1;
		}
		// System.out.println("line: " + line + " num: " + num);

		return line;
	}

	/**
	 * Finds the distance between the s1 and s2. The distance between two strings of
	 * the same length is the number of positions in the strings at which their
	 * characters are different. If two strings are not the same length, the
	 * distance is unknown (-1). If the distance is zero, then two strings are
	 * equal.
	 *
	 * @param string1 String to compare against string2.
	 * @param string2 String to compare against string1.
	 * @return The distance between string1 and string2.
	 */
	public static int stringDistance(String string1, String string2) {
		int distance = 0;

		// your code here
		if (string1.length() == string2.length()) {
			for (int i = 0; i < string1.length(); i++) {
				if (!(string1.charAt(i) == string2.charAt(i))) {
					distance++;
				}
			}
		} else {
			distance = -1;
		}

		return distance;
	}
}
