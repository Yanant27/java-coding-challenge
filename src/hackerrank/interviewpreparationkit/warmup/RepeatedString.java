package hackerrank.interviewpreparationkit.warmup;

public class RepeatedString {

	public static void main(String[] args) {
		System.out.println(repeatedString("aaa",500000000000L));
	}

	public static long repeatedString(String s, long n) {
		// String size
		long size = s.length();
		
		// Checking the constraints
		if (size < 1 || size >= 101 || n < 1 || n >= 1000000000001L) {
			return 0;
		}
		
		// Finding number of 'a' in String s
		long countOfA = getNumberOfA(s);
		
		/*
		 * 1st part: Finding number of 'a' in repeated String
		 * 2nd part: Finding number of 'a' in remaining sub string
		 */
		return (n/size) * countOfA +
				getNumberOfA(s.substring(0, (int) (n%size)));		
	}
	
	private static long getNumberOfA(String str) {
		return str.chars()
				.filter(c -> c == 'a')
				.count();
	}
}
