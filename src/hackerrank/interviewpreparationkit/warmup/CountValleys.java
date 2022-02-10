package hackerrank.interviewpreparationkit.warmup;

public class CountValleys {

	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUU"));
		System.out.println(countingValleys(8, "DDUUUUDD"));
		System.out.println(countingValleys(16, "DDUUUUDDDDUUDDUU"));
	}

	public static int countingValleys(int steps, String path) {
		char start = path.charAt(0);
		char end;
		int valleyCount = 0;
		int tracePath = 0;
		
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				++tracePath;
			} else if (path.charAt(i) == 'D') {
				--tracePath;
			} else {
				// do nothing
			}
			
			/*
			 * Use condition "i > 0" to skip first loop for checking
			 */
			if (i > 0 && tracePath == 0) {
				end = path.charAt(i);
				/*
				 * Mountain = start 'U', end 'D'
				 * Valley: start 'D', end 'U'
				 */
				if (start == 'D' && end == 'U') {
					++valleyCount;
				}
				// To avoid ArrayIndexOutOfBoundException
				if (i < steps-1) {
					start = path.charAt(i+1);
				}
			}
		}
		return valleyCount;
	}

}
