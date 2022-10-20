package PracticeForGitHUB;

public class DemoForGIT {
	public static void reverseEachWordInString(String StrGiven) {
		System.out.println("The given string is: " + StrGiven);
		String[] each_words = StrGiven.split(" ");
		String revString = "";
		for (int i = 0; i < each_words.length; i++) {
			String word = each_words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			revString = revString + reverseWord + " ";
		}
		System.out.println("The string reversed word by word is: "+revString);
	}
	public static void main(String[] args) {
		reverseEachWordInString("This is a test string");
	}
}
