package hackerrank.interviewpreparationkit.arrays;

import java.util.ArrayList;
import java.util.List;

public class HourglassSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hourglassSum(List<List<Integer>> arr) {
		List<Integer> result = new ArrayList<Integer>();
		int rowCount = arr.size()-2;
		for (int row = 0; row < rowCount; row++) {
			int colCount = arr.get(row).size()-2;
			for (int col = 0; col < colCount; col++) {
				result.add(arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2) + // sum of 1st row
						arr.get(row+1).get(col+1) + // sum of 2nd row
						arr.get(row+2).get(col) + arr.get(row+2).get(col+1) + arr.get(row+2).get(col+2)); // sum of 3rd row
			}
		}
		return result.stream().max(Integer::compare).get();
	}

}
