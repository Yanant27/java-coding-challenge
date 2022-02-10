package hackerrank.interviewpreparationkit.warmup;

import java.util.Arrays;
import java.util.List;


public class JumpingOnCloud {

	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0)));
		System.out.println(jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 0, 0, 1, 0, 0)));
	}

	public static int jumpingOnClouds(List<Integer> c) {
		int totalJump = 0;
		int count = 0; // at most 2 jumps
		for (Integer integer : c) {
			if (integer == 0) {
				++count;
			}
			if (integer == 1 || count == 2) {
				count = 0; // Reset count
				++totalJump;
			}
		}
		return totalJump;
	}
}
