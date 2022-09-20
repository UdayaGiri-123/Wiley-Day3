import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunctions {
	// Reversing a string
	static String reverseString(String S) {
		if (S.length() == 0)
			return "";
		else
			return S.substring(S.length() - 1) + reverseString(S.substring(0, S.length() - 1));
	}

	// Count occurrence of a character in a string
	static int countFrequency(String s, char a) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == a)
				count++;
		}
		return count;
	}

	// Check if first and last elements of array
	static boolean checkFirstnLast(int arr[]) {
		if (arr[0] == arr[arr.length - 1])
			return true;
		else
			return false;
	}

	// Check if two strings are anagrams
	static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			char str1[] = s1.toCharArray();
			char str2[] = s2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			for (int i = 0; i < str1.length; i++) {
				if (str1[i] != str2[i])
					return false;
			}
		}
		return true;
	}
	//check if enter email is valid
	static void isValid(String email) {
		String regex ="^[A-Za-z0-9+-._]+@+[a-z0-9]+(.)+[a-z]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
			System.out.println("Valid email address");
		else
			System.out.println("Entered email is not valid");
	}
}
