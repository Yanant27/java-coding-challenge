package hackerrank.interviewpreparationkit.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchSocks {

	private static int sockMerchant(int n, List<Integer> ar) {
		// Sort list for easy counting pairs
		Collections.sort(ar);
		System.out.println(ar);
		int count = 0;
		int pairs = 0;
		Integer pointer = ar.get(0);
		if (n >= 1 && n <= 100) {
			for (int i = 0; i < n; i++) {
				if (pointer.equals(ar.get(i))) {
					count ++;
				} else {
					pointer = ar.get(i);
					pairs = pairs + (count / 2);
					count = 1; // add count for above pointer element.
				}
			}
			
			// calculating pairs for last index element
			pairs = pairs + (count / 2);
		}
		return pairs;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(60);
		list.add(60);
		list.add(20);
		list.add(60);
		System.out.println(list.size());
		System.out.println(sockMerchant(list.size(), list));
	}

}

// Java 8
//public class MatchSocks {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int result = Result.sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

// Java 7
//public class MatchSocks {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> ar = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arTemp[i]);
//            ar.add(arItem);
//        }
//
//        int result = Result.sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
