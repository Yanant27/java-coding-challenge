package hackerrank.interviewpreparationkit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(rotLeft(list, 5));
	}

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		List<Integer> resultList = new ArrayList<Integer>();
		// fromIndex (inclusive) and toIndex (exclusive)
		List<Integer> subList = a.subList(d, a.size());
		resultList.addAll(subList);
		
		subList = a.subList(0, d);
		resultList.addAll(subList);
		
		return resultList;
	}

}
